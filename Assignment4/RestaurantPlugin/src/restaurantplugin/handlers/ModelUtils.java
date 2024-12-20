package restaurantplugin.handlers;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import RestaurantMetamodel.*;

public class ModelUtils {

	public static City createCity(String name, String cap, Region region) {
		City city = RestaurantMetamodelFactory.eINSTANCE.createCity();
		city.setName(name);
		city.setCap(cap);
		city.setRegion(region);
		return city;
	}

	public static Region createRegion(String name) {
		Region region = RestaurantMetamodelFactory.eINSTANCE.createRegion();
		region.setName(name);
		return region;
	}

	public static Owner createOwner(String name, String surname, String vat, String fiscalCode, Date birthdate, City birthPlace,
			Gender gender) {
		Owner owner = RestaurantMetamodelFactory.eINSTANCE.createOwner();
		owner.setName(name);
		owner.setSurname(surname);
		owner.setVat(vat);
		owner.setFiscalCode(fiscalCode);
		owner.setBirthDate(birthdate);
		owner.setBirthPlace(birthPlace);
		owner.setGender(gender);
		return owner;
	}

	public static Employee createEmployee(String name, String surname, String fiscalCode, Date birthDate,
			City birthPlace, Gender gender, Role role, float salary, Date contractExpirationDate,
			Date contractSignDate) {
		Employee employee = RestaurantMetamodelFactory.eINSTANCE.createEmployee();
		employee.setName(name);
		employee.setSurname(surname);
		employee.setFiscalCode(fiscalCode);
		employee.setBirthDate(birthDate);
		employee.setBirthPlace(birthPlace);
		employee.setGender(gender);
		employee.setRole(role);
		employee.setSalary(salary);
		employee.setContractExpirationDate(contractExpirationDate);
		employee.setContractSignDate(contractSignDate);
		return employee;
	}

	public static Table createTable(int number, int numberOfSeats, Material material) {
		Table table = RestaurantMetamodelFactory.eINSTANCE.createTable();
		table.setNumber(number);
		table.setMaterial(material);
		table.setNumberOfSeats(numberOfSeats);
		return table;
	}

	public static Bathroom createBathroom(String name, int numberOfToilets, Gender targetGender, boolean isAccessible,
			float perimeter, float area) {
		Bathroom bathroom = RestaurantMetamodelFactory.eINSTANCE.createBathroom();
		bathroom.setName(name);
		bathroom.setNumberOfToilets(numberOfToilets);
		bathroom.setGender(targetGender);
		bathroom.setIsAccessible(isAccessible);
		bathroom.setPerimeter(perimeter);
		bathroom.setArea(area);
		return bathroom;
	}

	public static DiningRoom createDiningRoom(String name, float parameter, float area) {
		DiningRoom diningRoom = RestaurantMetamodelFactory.eINSTANCE.createDiningRoom();
		diningRoom.setName(name);
		diningRoom.setArea(area);
		diningRoom.setPerimeter(parameter);
		return diningRoom;
	}

	public static Kitchen createKitchen(String name, int numberOfStoves, float parameter, float area) {
		Kitchen kitchen = RestaurantMetamodelFactory.eINSTANCE.createKitchen();
		kitchen.setName(name);
		kitchen.setNumberOfStoves(numberOfStoves);
		kitchen.setPerimeter(parameter);
		kitchen.setArea(area);
		return kitchen;
	}

	public static Course createCourse(String name, float price, CourseType courseType, int numberOfPieces) {
		Course course = RestaurantMetamodelFactory.eINSTANCE.createCourse();
		course.setName(name);
		course.setType(courseType);
		course.setNumberOfPieces(numberOfPieces);
		course.setPrice(price);
		return course;
	}

	public static Menu createMenu(String name) {
		Menu menu = RestaurantMetamodelFactory.eINSTANCE.createMenu();
		menu.setName(name);
		return menu;
	}

	public static Restaurant createRestaurant(String name, String street, City city, String telephone) {
		Restaurant restaurant = RestaurantMetamodelFactory.eINSTANCE.createRestaurant();
		restaurant.setName(name);
		restaurant.setStreet(street);
		restaurant.setCity(city);
		restaurant.setTelephone(telephone);
		return restaurant;
	}

}
