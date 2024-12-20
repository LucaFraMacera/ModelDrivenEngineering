package restaurantplugin.handlers;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import RestaurantMetamodel.City;
import RestaurantMetamodel.Diagram;
import RestaurantMetamodel.Region;
import RestaurantMetamodel.Restaurant;
import RestaurantMetamodel.RestaurantMetamodelFactory;
import RestaurantMetamodel.RestaurantMetamodelPackage;


public class RestaurantModelUtils {
	
	public final static String SERIALIZED_MODEL_FILENAME = "test.xmi";
	
	
	public static Diagram create(){
		Diagram diagram = RestaurantMetamodelFactory.eINSTANCE.createDiagram();
		City city1 = RestaurantMetamodelFactory.eINSTANCE.createCity();
		Region region = RestaurantMetamodelFactory.eINSTANCE.createRegion();
		Restaurant restaurant = RestaurantMetamodelFactory.eINSTANCE.createRestaurant();
		diagram.setName("Model Test");
		region.setName("Abruzzo");
		city1.setName("Vasto");
		city1.setCap("56054");
		city1.setRegion(region);
		restaurant.setName("Pizzeria Okay");
		diagram.getElements().add(restaurant);
		diagram.getElements().add(region);
		diagram.getElements().add(city1);
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
		System.out.println(diagram);
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
				System.out.println(entity);
			});
		} else {
			System.err.println("The model is Invalid!");
		}
		
		
	}

}
