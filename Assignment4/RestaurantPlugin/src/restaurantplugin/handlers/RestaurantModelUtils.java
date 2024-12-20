package restaurantplugin.handlers;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.AbstractEList;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import RestaurantMetamodel.*;


public class RestaurantModelUtils {
	
	public final static String SERIALIZED_MODEL_FILENAME = "RestaurantModel.xmi";
	
	private static Date getDateFromLocalDate(LocalDate localDate) {
		return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
	
	public static Diagram create(){
		Diagram diagram = RestaurantMetamodelFactory.eINSTANCE.createDiagram();
		Region region = ModelUtils.createRegion("Sicilia");
		Region region1 = ModelUtils.createRegion("Abruzzo");
		City city1 = ModelUtils.createCity("Palma di Montechiaro", "92020", region);
		City city2 = ModelUtils.createCity("Vasto", "56054", region1);
		Owner owner = ModelUtils.createOwner("Giuseppe", "Carlino", "IT111111111111", "CAGIR68D12G48X",getDateFromLocalDate(LocalDate.of(1968, 12, 12)), city1, Gender.MALE);
		Owner king = ModelUtils.createOwner("Michael", "Piccirilli", "IT222222222222", "PICMIC18O02F46K", getDateFromLocalDate(LocalDate.of(2002, 8, 18)), city1, Gender.FEMALE);
		Employee employee = ModelUtils.createEmployee("Mario", "Bianchi", "BNCMRA98L08E37J", getDateFromLocalDate(LocalDate.of(1998, 7, 8)), city2, Gender.MALE, Role.WAITER, 1200.0f, getDateFromLocalDate(LocalDate.of(2025, 1, 16)), getDateFromLocalDate(LocalDate.of(2024, 11, 04)));
		Bathroom bathroom = ModelUtils.createBathroom("Bagno", 1, Gender.MALE, false, 4f, 2f);
		Kitchen kitchen = ModelUtils.createKitchen("Cucina", 1, 14, 12);
		Table table1 = ModelUtils.createTable(1, 4, Material.WOOD);
		Table table2 = ModelUtils.createTable(2, 3, Material.WOOD);
		Table table3 = ModelUtils.createTable(4, 3, Material.WOOD);
		DiningRoom diningRoom = ModelUtils.createDiningRoom("Sala", 18, 24);
		diningRoom.getTables().add(table1);
		diningRoom.getTables().add(table2);
		diningRoom.getTables().add(table3);
		Course course1 = ModelUtils.createCourse("Capricciosa", 9, CourseType.PIZZA, 1);
		Course course2 = ModelUtils.createCourse("Patatine Dippers Grandi", 4, CourseType.FRIED, 1);
		Menu menu = ModelUtils.createMenu("Menu");
		menu.getCourses().add(course1);
		menu.getCourses().add(course2);
		Restaurant restaurant = ModelUtils.createRestaurant("Pizzeria Okay", "Piazza Santa Chiara 51", city2, "33944331038");
		restaurant.getRooms().add(kitchen);
		restaurant.getRooms().add(diningRoom);
		restaurant.getRooms().add(bathroom);
		restaurant.getMenus().add(menu);
		restaurant.getOwners().add(owner);
		restaurant.getOwners().add(king);
		restaurant.getEmployees().add(employee);
		diagram.setName("Model1");
		diagram.getElements().add(restaurant);
		diagram.getElements().add(owner);
		diagram.getElements().add(king);
		diagram.getElements().add(region);
		diagram.getElements().add(employee);
		diagram.getElements().add(region1);
		diagram.getElements().add(city1);
		diagram.getElements().add(city2);
		return diagram;
	}
	
	public static Diagnostic validate(Diagram vm){
		return Diagnostician.INSTANCE.validate(vm);
	}
	
	public static Diagram load(String filename) {
		EPackage.Registry.INSTANCE.put(RestaurantMetamodelPackage.eNS_URI, RestaurantMetamodelPackage.eINSTANCE);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createFileURI(filename), true);
		Diagram diagram = (Diagram) resource.getContents().get(0);
		return diagram;	
	}
	
	public static void serializeModel(Diagram diagram, String filename) {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI(filename));
		resource.getContents().add(diagram);
		try {
			resource.save(Collections.EMPTY_MAP);
		}catch(Exception e) {
			System.err.println("Error while saving Model to file");
		}
	}
	
	public static void main(String[] args) {
		Diagram diagram = create();
		serializeModel(diagram, SERIALIZED_MODEL_FILENAME);
		diagram = load(SERIALIZED_MODEL_FILENAME);
		Diagnostic diagnostic = validate(diagram);
		if((diagnostic.getSeverity() != Diagnostic.ERROR)) {
			System.out.println("Model is valid!");
			System.out.println(diagram.getElements().size());
			diagram.getElements().forEach(entity ->{
				System.out.printf("\t%s\n",entity);
				if(entity instanceof Restaurant) {
					Restaurant r = (Restaurant) entity;
					r.getRooms().forEach(room -> {
						System.out.printf("\t\t%s\n",room);
					});
					r.getMenus().forEach(menu ->{
						System.out.printf("\t\t%s\n",menu);
						menu.getCourses().forEach(course->{System.out.printf("\t\t\t%s\n",course);});
					});
					r.getEmployees().forEach(e ->{
						System.out.printf("\t\t%s\n", e.getName()+", "+e.getSurname());
					});
					r.getOwners().forEach(o ->{
						System.out.printf("\t\t%s\n", o.getName()+", "+o.getSurname());
					});
				}
			});
		} else {
			System.err.println("The model is Invalid!");
		}
		
		
	}

}
