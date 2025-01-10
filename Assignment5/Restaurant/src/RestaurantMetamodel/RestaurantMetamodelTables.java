/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /Restaurant/model/RestaurantMetamodel.ecore
 * using:
 *   /Restaurant/model/RestaurantMetamodel.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package RestaurantMetamodel;

// import RestaurantMetamodel.RestaurantMetamodelPackage;
// import RestaurantMetamodel.RestaurantMetamodelTables;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * RestaurantMetamodelTables provides the dispatch tables for the RestaurantMetamodel for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class RestaurantMetamodelTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(RestaurantMetamodelPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_restaurant_s_RM = IdManager.getNsURIPackageId("https://restaurant/RM", null, RestaurantMetamodelPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Bathroom = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("Bathroom", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_City = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("City", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = RestaurantMetamodelTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Course = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("Course", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Diagram = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("Diagram", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DiagramElement = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("DiagramElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DiningRoom = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("DiningRoom", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Employee = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("Employee", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Menu = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("Menu", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Owner = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("Owner", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Person = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("Person", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Region = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("Region", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Restaurant = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("Restaurant", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_RestaurantArea = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("RestaurantArea", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Table = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getClassId("Table", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = RestaurantMetamodelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EFloat = RestaurantMetamodelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EFloat", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = RestaurantMetamodelTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_CourseType = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getEnumerationId("CourseType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Gender = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getEnumerationId("Gender");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Material = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getEnumerationId("Material");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Role = RestaurantMetamodelTables.PACKid_https_c_s_s_restaurant_s_RM.getEnumerationId("Role");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_City = TypeId.BAG.getSpecializedId(RestaurantMetamodelTables.CLSSid_City, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Person = TypeId.BAG.getSpecializedId(RestaurantMetamodelTables.CLSSid_Person, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Restaurant = TypeId.BAG.getSpecializedId(RestaurantMetamodelTables.CLSSid_Restaurant, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Bathroom = TypeId.ORDERED_SET.getSpecializedId(RestaurantMetamodelTables.CLSSid_Bathroom, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Course = TypeId.ORDERED_SET.getSpecializedId(RestaurantMetamodelTables.CLSSid_Course, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DiagramElement = TypeId.ORDERED_SET.getSpecializedId(RestaurantMetamodelTables.CLSSid_DiagramElement, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Employee = TypeId.ORDERED_SET.getSpecializedId(RestaurantMetamodelTables.CLSSid_Employee, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Menu = TypeId.ORDERED_SET.getSpecializedId(RestaurantMetamodelTables.CLSSid_Menu, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Owner = TypeId.ORDERED_SET.getSpecializedId(RestaurantMetamodelTables.CLSSid_Owner, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_RestaurantArea = TypeId.ORDERED_SET.getSpecializedId(RestaurantMetamodelTables.CLSSid_RestaurantArea, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Table = TypeId.ORDERED_SET.getSpecializedId(RestaurantMetamodelTables.CLSSid_Table, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_DATAid_EFloat = TypeId.SEQUENCE.getSpecializedId(RestaurantMetamodelTables.DATAid_EFloat, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			RestaurantMetamodelTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RestaurantMetamodelTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Bathroom = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.BATHROOM, PACKAGE, 0);
		public static final EcoreExecutorType _City = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.CITY, PACKAGE, 0);
		public static final EcoreExecutorType _Course = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.COURSE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _CourseType = new EcoreExecutorEnumeration(RestaurantMetamodelPackage.Literals.COURSE_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Diagram = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.DIAGRAM, PACKAGE, 0);
		public static final EcoreExecutorType _DiagramElement = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.DIAGRAM_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _DiningRoom = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.DINING_ROOM, PACKAGE, 0);
		public static final EcoreExecutorType _Employee = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.EMPLOYEE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Gender = new EcoreExecutorEnumeration(RestaurantMetamodelPackage.Literals.GENDER, PACKAGE, 0);
		public static final EcoreExecutorType _Kitchen = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.KITCHEN, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Material = new EcoreExecutorEnumeration(RestaurantMetamodelPackage.Literals.MATERIAL, PACKAGE, 0);
		public static final EcoreExecutorType _Menu = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.MENU, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Owner = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.OWNER, PACKAGE, 0);
		public static final EcoreExecutorType _Person = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.PERSON, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Region = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.REGION, PACKAGE, 0);
		public static final EcoreExecutorType _Restaurant = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.RESTAURANT, PACKAGE, 0);
		public static final EcoreExecutorType _RestaurantArea = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.RESTAURANT_AREA, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Role = new EcoreExecutorEnumeration(RestaurantMetamodelPackage.Literals.ROLE, PACKAGE, 0);
		public static final EcoreExecutorType _Table = new EcoreExecutorType(RestaurantMetamodelPackage.Literals.TABLE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Bathroom,
			_City,
			_Course,
			_CourseType,
			_Diagram,
			_DiagramElement,
			_DiningRoom,
			_Employee,
			_Gender,
			_Kitchen,
			_Material,
			_Menu,
			_NamedElement,
			_Owner,
			_Person,
			_Region,
			_Restaurant,
			_RestaurantArea,
			_Role,
			_Table
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RestaurantMetamodelTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Bathroom__Bathroom = new ExecutorFragment(Types._Bathroom, RestaurantMetamodelTables.Types._Bathroom);
		private static final ExecutorFragment _Bathroom__NamedElement = new ExecutorFragment(Types._Bathroom, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Bathroom__OclAny = new ExecutorFragment(Types._Bathroom, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Bathroom__OclElement = new ExecutorFragment(Types._Bathroom, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Bathroom__RestaurantArea = new ExecutorFragment(Types._Bathroom, RestaurantMetamodelTables.Types._RestaurantArea);

		private static final ExecutorFragment _City__City = new ExecutorFragment(Types._City, RestaurantMetamodelTables.Types._City);
		private static final ExecutorFragment _City__DiagramElement = new ExecutorFragment(Types._City, RestaurantMetamodelTables.Types._DiagramElement);
		private static final ExecutorFragment _City__NamedElement = new ExecutorFragment(Types._City, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _City__OclAny = new ExecutorFragment(Types._City, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _City__OclElement = new ExecutorFragment(Types._City, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Course__Course = new ExecutorFragment(Types._Course, RestaurantMetamodelTables.Types._Course);
		private static final ExecutorFragment _Course__NamedElement = new ExecutorFragment(Types._Course, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Course__OclAny = new ExecutorFragment(Types._Course, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Course__OclElement = new ExecutorFragment(Types._Course, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CourseType__CourseType = new ExecutorFragment(Types._CourseType, RestaurantMetamodelTables.Types._CourseType);
		private static final ExecutorFragment _CourseType__OclAny = new ExecutorFragment(Types._CourseType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CourseType__OclElement = new ExecutorFragment(Types._CourseType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CourseType__OclEnumeration = new ExecutorFragment(Types._CourseType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _CourseType__OclType = new ExecutorFragment(Types._CourseType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Diagram__Diagram = new ExecutorFragment(Types._Diagram, RestaurantMetamodelTables.Types._Diagram);
		private static final ExecutorFragment _Diagram__OclAny = new ExecutorFragment(Types._Diagram, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Diagram__OclElement = new ExecutorFragment(Types._Diagram, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DiagramElement__DiagramElement = new ExecutorFragment(Types._DiagramElement, RestaurantMetamodelTables.Types._DiagramElement);
		private static final ExecutorFragment _DiagramElement__NamedElement = new ExecutorFragment(Types._DiagramElement, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _DiagramElement__OclAny = new ExecutorFragment(Types._DiagramElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DiagramElement__OclElement = new ExecutorFragment(Types._DiagramElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DiningRoom__DiningRoom = new ExecutorFragment(Types._DiningRoom, RestaurantMetamodelTables.Types._DiningRoom);
		private static final ExecutorFragment _DiningRoom__NamedElement = new ExecutorFragment(Types._DiningRoom, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _DiningRoom__OclAny = new ExecutorFragment(Types._DiningRoom, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DiningRoom__OclElement = new ExecutorFragment(Types._DiningRoom, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _DiningRoom__RestaurantArea = new ExecutorFragment(Types._DiningRoom, RestaurantMetamodelTables.Types._RestaurantArea);

		private static final ExecutorFragment _Employee__DiagramElement = new ExecutorFragment(Types._Employee, RestaurantMetamodelTables.Types._DiagramElement);
		private static final ExecutorFragment _Employee__Employee = new ExecutorFragment(Types._Employee, RestaurantMetamodelTables.Types._Employee);
		private static final ExecutorFragment _Employee__NamedElement = new ExecutorFragment(Types._Employee, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Employee__OclAny = new ExecutorFragment(Types._Employee, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Employee__OclElement = new ExecutorFragment(Types._Employee, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Employee__Person = new ExecutorFragment(Types._Employee, RestaurantMetamodelTables.Types._Person);

		private static final ExecutorFragment _Gender__Gender = new ExecutorFragment(Types._Gender, RestaurantMetamodelTables.Types._Gender);
		private static final ExecutorFragment _Gender__OclAny = new ExecutorFragment(Types._Gender, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Gender__OclElement = new ExecutorFragment(Types._Gender, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Gender__OclEnumeration = new ExecutorFragment(Types._Gender, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Gender__OclType = new ExecutorFragment(Types._Gender, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Kitchen__Kitchen = new ExecutorFragment(Types._Kitchen, RestaurantMetamodelTables.Types._Kitchen);
		private static final ExecutorFragment _Kitchen__NamedElement = new ExecutorFragment(Types._Kitchen, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Kitchen__OclAny = new ExecutorFragment(Types._Kitchen, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Kitchen__OclElement = new ExecutorFragment(Types._Kitchen, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Kitchen__RestaurantArea = new ExecutorFragment(Types._Kitchen, RestaurantMetamodelTables.Types._RestaurantArea);

		private static final ExecutorFragment _Material__Material = new ExecutorFragment(Types._Material, RestaurantMetamodelTables.Types._Material);
		private static final ExecutorFragment _Material__OclAny = new ExecutorFragment(Types._Material, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Material__OclElement = new ExecutorFragment(Types._Material, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Material__OclEnumeration = new ExecutorFragment(Types._Material, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Material__OclType = new ExecutorFragment(Types._Material, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Menu__Menu = new ExecutorFragment(Types._Menu, RestaurantMetamodelTables.Types._Menu);
		private static final ExecutorFragment _Menu__NamedElement = new ExecutorFragment(Types._Menu, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Menu__OclAny = new ExecutorFragment(Types._Menu, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Menu__OclElement = new ExecutorFragment(Types._Menu, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Owner__DiagramElement = new ExecutorFragment(Types._Owner, RestaurantMetamodelTables.Types._DiagramElement);
		private static final ExecutorFragment _Owner__NamedElement = new ExecutorFragment(Types._Owner, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Owner__OclAny = new ExecutorFragment(Types._Owner, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Owner__OclElement = new ExecutorFragment(Types._Owner, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Owner__Owner = new ExecutorFragment(Types._Owner, RestaurantMetamodelTables.Types._Owner);
		private static final ExecutorFragment _Owner__Person = new ExecutorFragment(Types._Owner, RestaurantMetamodelTables.Types._Person);

		private static final ExecutorFragment _Person__DiagramElement = new ExecutorFragment(Types._Person, RestaurantMetamodelTables.Types._DiagramElement);
		private static final ExecutorFragment _Person__NamedElement = new ExecutorFragment(Types._Person, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Person__OclAny = new ExecutorFragment(Types._Person, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Person__OclElement = new ExecutorFragment(Types._Person, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Person__Person = new ExecutorFragment(Types._Person, RestaurantMetamodelTables.Types._Person);

		private static final ExecutorFragment _Region__DiagramElement = new ExecutorFragment(Types._Region, RestaurantMetamodelTables.Types._DiagramElement);
		private static final ExecutorFragment _Region__NamedElement = new ExecutorFragment(Types._Region, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Region__OclAny = new ExecutorFragment(Types._Region, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Region__OclElement = new ExecutorFragment(Types._Region, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Region__Region = new ExecutorFragment(Types._Region, RestaurantMetamodelTables.Types._Region);

		private static final ExecutorFragment _Restaurant__DiagramElement = new ExecutorFragment(Types._Restaurant, RestaurantMetamodelTables.Types._DiagramElement);
		private static final ExecutorFragment _Restaurant__NamedElement = new ExecutorFragment(Types._Restaurant, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _Restaurant__OclAny = new ExecutorFragment(Types._Restaurant, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Restaurant__OclElement = new ExecutorFragment(Types._Restaurant, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Restaurant__Restaurant = new ExecutorFragment(Types._Restaurant, RestaurantMetamodelTables.Types._Restaurant);

		private static final ExecutorFragment _RestaurantArea__NamedElement = new ExecutorFragment(Types._RestaurantArea, RestaurantMetamodelTables.Types._NamedElement);
		private static final ExecutorFragment _RestaurantArea__OclAny = new ExecutorFragment(Types._RestaurantArea, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _RestaurantArea__OclElement = new ExecutorFragment(Types._RestaurantArea, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _RestaurantArea__RestaurantArea = new ExecutorFragment(Types._RestaurantArea, RestaurantMetamodelTables.Types._RestaurantArea);

		private static final ExecutorFragment _Role__OclAny = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Role__OclElement = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Role__OclEnumeration = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Role__OclType = new ExecutorFragment(Types._Role, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _Role__Role = new ExecutorFragment(Types._Role, RestaurantMetamodelTables.Types._Role);

		private static final ExecutorFragment _Table__OclAny = new ExecutorFragment(Types._Table, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Table__OclElement = new ExecutorFragment(Types._Table, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Table__Table = new ExecutorFragment(Types._Table, RestaurantMetamodelTables.Types._Table);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RestaurantMetamodelTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _CourseType = TypeUtil.createParameterTypes(RestaurantMetamodelTables.Types._CourseType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RestaurantMetamodelTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Menu__hasCourseType = new ExecutorOperation("hasCourseType", Parameters._CourseType, Types._Menu,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Restaurant__hasAccessibleToilets = new ExecutorOperation("hasAccessibleToilets", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Restaurant,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RestaurantMetamodelTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Bathroom__gender = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.BATHROOM__GENDER, Types._Bathroom, 0);
		public static final ExecutorProperty _Bathroom__isAccessible = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.BATHROOM__IS_ACCESSIBLE, Types._Bathroom, 1);
		public static final ExecutorProperty _Bathroom__numberOfToilets = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.BATHROOM__NUMBER_OF_TOILETS, Types._Bathroom, 2);

		public static final ExecutorProperty _City__cap = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.CITY__CAP, Types._City, 0);
		public static final ExecutorProperty _City__region = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.CITY__REGION, Types._City, 1);
		public static final ExecutorProperty _City__Person__birthPlace = new ExecutorPropertyWithImplementation("Person", Types._City, 2, new EcoreLibraryOppositeProperty(RestaurantMetamodelPackage.Literals.PERSON__BIRTH_PLACE));
		public static final ExecutorProperty _City__Restaurant__city = new ExecutorPropertyWithImplementation("Restaurant", Types._City, 3, new EcoreLibraryOppositeProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__CITY));

		public static final ExecutorProperty _Course__numberOfPieces = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.COURSE__NUMBER_OF_PIECES, Types._Course, 0);
		public static final ExecutorProperty _Course__price = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.COURSE__PRICE, Types._Course, 1);
		public static final ExecutorProperty _Course__type = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.COURSE__TYPE, Types._Course, 2);
		public static final ExecutorProperty _Course__Menu__courses = new ExecutorPropertyWithImplementation("Menu", Types._Course, 3, new EcoreLibraryOppositeProperty(RestaurantMetamodelPackage.Literals.MENU__COURSES));

		public static final ExecutorProperty _Diagram__elements = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.DIAGRAM__ELEMENTS, Types._Diagram, 0);
		public static final ExecutorProperty _Diagram__name = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.DIAGRAM__NAME, Types._Diagram, 1);

		public static final ExecutorProperty _DiagramElement__Diagram__elements = new ExecutorPropertyWithImplementation("Diagram", Types._DiagramElement, 0, new EcoreLibraryOppositeProperty(RestaurantMetamodelPackage.Literals.DIAGRAM__ELEMENTS));

		public static final ExecutorProperty _DiningRoom__numberOfTables = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.DINING_ROOM__NUMBER_OF_TABLES, Types._DiningRoom, 0);
		public static final ExecutorProperty _DiningRoom__tables = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.DINING_ROOM__TABLES, Types._DiningRoom, 1);

		public static final ExecutorProperty _Employee__contractExpirationDate = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.EMPLOYEE__CONTRACT_EXPIRATION_DATE, Types._Employee, 0);
		public static final ExecutorProperty _Employee__contractSignDate = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.EMPLOYEE__CONTRACT_SIGN_DATE, Types._Employee, 1);
		public static final ExecutorProperty _Employee__role = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.EMPLOYEE__ROLE, Types._Employee, 2);
		public static final ExecutorProperty _Employee__salary = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.EMPLOYEE__SALARY, Types._Employee, 3);
		public static final ExecutorProperty _Employee__Restaurant__employees = new ExecutorPropertyWithImplementation("Restaurant", Types._Employee, 4, new EcoreLibraryOppositeProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__EMPLOYEES));

		public static final ExecutorProperty _Kitchen__numberOfStoves = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.KITCHEN__NUMBER_OF_STOVES, Types._Kitchen, 0);

		public static final ExecutorProperty _Menu__courses = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.MENU__COURSES, Types._Menu, 0);
		public static final ExecutorProperty _Menu__numberOfCourses = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.MENU__NUMBER_OF_COURSES, Types._Menu, 1);
		public static final ExecutorProperty _Menu__Restaurant__menus = new ExecutorPropertyWithImplementation("Restaurant", Types._Menu, 2, new EcoreLibraryOppositeProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__MENUS));

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Owner__vat = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.OWNER__VAT, Types._Owner, 0);
		public static final ExecutorProperty _Owner__Restaurant__owners = new ExecutorPropertyWithImplementation("Restaurant", Types._Owner, 1, new EcoreLibraryOppositeProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__OWNERS));

		public static final ExecutorProperty _Person__birthDate = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.PERSON__BIRTH_DATE, Types._Person, 0);
		public static final ExecutorProperty _Person__birthPlace = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.PERSON__BIRTH_PLACE, Types._Person, 1);
		public static final ExecutorProperty _Person__fiscalCode = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.PERSON__FISCAL_CODE, Types._Person, 2);
		public static final ExecutorProperty _Person__gender = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.PERSON__GENDER, Types._Person, 3);
		public static final ExecutorProperty _Person__surname = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.PERSON__SURNAME, Types._Person, 4);

		public static final ExecutorProperty _Region__City__region = new ExecutorPropertyWithImplementation("City", Types._Region, 0, new EcoreLibraryOppositeProperty(RestaurantMetamodelPackage.Literals.CITY__REGION));

		public static final ExecutorProperty _Restaurant__city = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__CITY, Types._Restaurant, 0);
		public static final ExecutorProperty _Restaurant__employees = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__EMPLOYEES, Types._Restaurant, 1);
		public static final ExecutorProperty _Restaurant__menus = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__MENUS, Types._Restaurant, 2);
		public static final ExecutorProperty _Restaurant__numberOfEmployes = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__NUMBER_OF_EMPLOYES, Types._Restaurant, 3);
		public static final ExecutorProperty _Restaurant__owners = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__OWNERS, Types._Restaurant, 4);
		public static final ExecutorProperty _Restaurant__rooms = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__ROOMS, Types._Restaurant, 5);
		public static final ExecutorProperty _Restaurant__street = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__STREET, Types._Restaurant, 6);
		public static final ExecutorProperty _Restaurant__telephone = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__TELEPHONE, Types._Restaurant, 7);
		public static final ExecutorProperty _Restaurant__totalArea = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__TOTAL_AREA, Types._Restaurant, 8);

		public static final ExecutorProperty _RestaurantArea__area = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.RESTAURANT_AREA__AREA, Types._RestaurantArea, 0);
		public static final ExecutorProperty _RestaurantArea__perimeter = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.RESTAURANT_AREA__PERIMETER, Types._RestaurantArea, 1);
		public static final ExecutorProperty _RestaurantArea__Restaurant__rooms = new ExecutorPropertyWithImplementation("Restaurant", Types._RestaurantArea, 2, new EcoreLibraryOppositeProperty(RestaurantMetamodelPackage.Literals.RESTAURANT__ROOMS));

		public static final ExecutorProperty _Table__diningRoom = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.TABLE__DINING_ROOM, Types._Table, 0);
		public static final ExecutorProperty _Table__material = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.TABLE__MATERIAL, Types._Table, 1);
		public static final ExecutorProperty _Table__number = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.TABLE__NUMBER, Types._Table, 2);
		public static final ExecutorProperty _Table__numberOfSeats = new EcoreExecutorProperty(RestaurantMetamodelPackage.Literals.TABLE__NUMBER_OF_SEATS, Types._Table, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RestaurantMetamodelTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Bathroom =
			{
				Fragments._Bathroom__OclAny /* 0 */,
				Fragments._Bathroom__OclElement /* 1 */,
				Fragments._Bathroom__NamedElement /* 2 */,
				Fragments._Bathroom__RestaurantArea /* 3 */,
				Fragments._Bathroom__Bathroom /* 4 */
			};
		private static final int /*@NonNull*/ [] __Bathroom = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _City =
			{
				Fragments._City__OclAny /* 0 */,
				Fragments._City__OclElement /* 1 */,
				Fragments._City__NamedElement /* 2 */,
				Fragments._City__DiagramElement /* 3 */,
				Fragments._City__City /* 4 */
			};
		private static final int /*@NonNull*/ [] __City = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Course =
			{
				Fragments._Course__OclAny /* 0 */,
				Fragments._Course__OclElement /* 1 */,
				Fragments._Course__NamedElement /* 2 */,
				Fragments._Course__Course /* 3 */
			};
		private static final int /*@NonNull*/ [] __Course = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CourseType =
			{
				Fragments._CourseType__OclAny /* 0 */,
				Fragments._CourseType__OclElement /* 1 */,
				Fragments._CourseType__OclType /* 2 */,
				Fragments._CourseType__OclEnumeration /* 3 */,
				Fragments._CourseType__CourseType /* 4 */
			};
		private static final int /*@NonNull*/ [] __CourseType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Diagram =
			{
				Fragments._Diagram__OclAny /* 0 */,
				Fragments._Diagram__OclElement /* 1 */,
				Fragments._Diagram__Diagram /* 2 */
			};
		private static final int /*@NonNull*/ [] __Diagram = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DiagramElement =
			{
				Fragments._DiagramElement__OclAny /* 0 */,
				Fragments._DiagramElement__OclElement /* 1 */,
				Fragments._DiagramElement__NamedElement /* 2 */,
				Fragments._DiagramElement__DiagramElement /* 3 */
			};
		private static final int /*@NonNull*/ [] __DiagramElement = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DiningRoom =
			{
				Fragments._DiningRoom__OclAny /* 0 */,
				Fragments._DiningRoom__OclElement /* 1 */,
				Fragments._DiningRoom__NamedElement /* 2 */,
				Fragments._DiningRoom__RestaurantArea /* 3 */,
				Fragments._DiningRoom__DiningRoom /* 4 */
			};
		private static final int /*@NonNull*/ [] __DiningRoom = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Employee =
			{
				Fragments._Employee__OclAny /* 0 */,
				Fragments._Employee__OclElement /* 1 */,
				Fragments._Employee__NamedElement /* 2 */,
				Fragments._Employee__DiagramElement /* 3 */,
				Fragments._Employee__Person /* 4 */,
				Fragments._Employee__Employee /* 5 */
			};
		private static final int /*@NonNull*/ [] __Employee = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Gender =
			{
				Fragments._Gender__OclAny /* 0 */,
				Fragments._Gender__OclElement /* 1 */,
				Fragments._Gender__OclType /* 2 */,
				Fragments._Gender__OclEnumeration /* 3 */,
				Fragments._Gender__Gender /* 4 */
			};
		private static final int /*@NonNull*/ [] __Gender = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Kitchen =
			{
				Fragments._Kitchen__OclAny /* 0 */,
				Fragments._Kitchen__OclElement /* 1 */,
				Fragments._Kitchen__NamedElement /* 2 */,
				Fragments._Kitchen__RestaurantArea /* 3 */,
				Fragments._Kitchen__Kitchen /* 4 */
			};
		private static final int /*@NonNull*/ [] __Kitchen = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Material =
			{
				Fragments._Material__OclAny /* 0 */,
				Fragments._Material__OclElement /* 1 */,
				Fragments._Material__OclType /* 2 */,
				Fragments._Material__OclEnumeration /* 3 */,
				Fragments._Material__Material /* 4 */
			};
		private static final int /*@NonNull*/ [] __Material = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Menu =
			{
				Fragments._Menu__OclAny /* 0 */,
				Fragments._Menu__OclElement /* 1 */,
				Fragments._Menu__NamedElement /* 2 */,
				Fragments._Menu__Menu /* 3 */
			};
		private static final int /*@NonNull*/ [] __Menu = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Owner =
			{
				Fragments._Owner__OclAny /* 0 */,
				Fragments._Owner__OclElement /* 1 */,
				Fragments._Owner__NamedElement /* 2 */,
				Fragments._Owner__DiagramElement /* 3 */,
				Fragments._Owner__Person /* 4 */,
				Fragments._Owner__Owner /* 5 */
			};
		private static final int /*@NonNull*/ [] __Owner = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Person =
			{
				Fragments._Person__OclAny /* 0 */,
				Fragments._Person__OclElement /* 1 */,
				Fragments._Person__NamedElement /* 2 */,
				Fragments._Person__DiagramElement /* 3 */,
				Fragments._Person__Person /* 4 */
			};
		private static final int /*@NonNull*/ [] __Person = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Region =
			{
				Fragments._Region__OclAny /* 0 */,
				Fragments._Region__OclElement /* 1 */,
				Fragments._Region__NamedElement /* 2 */,
				Fragments._Region__DiagramElement /* 3 */,
				Fragments._Region__Region /* 4 */
			};
		private static final int /*@NonNull*/ [] __Region = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Restaurant =
			{
				Fragments._Restaurant__OclAny /* 0 */,
				Fragments._Restaurant__OclElement /* 1 */,
				Fragments._Restaurant__NamedElement /* 2 */,
				Fragments._Restaurant__DiagramElement /* 3 */,
				Fragments._Restaurant__Restaurant /* 4 */
			};
		private static final int /*@NonNull*/ [] __Restaurant = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _RestaurantArea =
			{
				Fragments._RestaurantArea__OclAny /* 0 */,
				Fragments._RestaurantArea__OclElement /* 1 */,
				Fragments._RestaurantArea__NamedElement /* 2 */,
				Fragments._RestaurantArea__RestaurantArea /* 3 */
			};
		private static final int /*@NonNull*/ [] __RestaurantArea = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Role =
			{
				Fragments._Role__OclAny /* 0 */,
				Fragments._Role__OclElement /* 1 */,
				Fragments._Role__OclType /* 2 */,
				Fragments._Role__OclEnumeration /* 3 */,
				Fragments._Role__Role /* 4 */
			};
		private static final int /*@NonNull*/ [] __Role = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Table =
			{
				Fragments._Table__OclAny /* 0 */,
				Fragments._Table__OclElement /* 1 */,
				Fragments._Table__Table /* 2 */
			};
		private static final int /*@NonNull*/ [] __Table = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Bathroom.initFragments(_Bathroom, __Bathroom);
			Types._City.initFragments(_City, __City);
			Types._Course.initFragments(_Course, __Course);
			Types._CourseType.initFragments(_CourseType, __CourseType);
			Types._Diagram.initFragments(_Diagram, __Diagram);
			Types._DiagramElement.initFragments(_DiagramElement, __DiagramElement);
			Types._DiningRoom.initFragments(_DiningRoom, __DiningRoom);
			Types._Employee.initFragments(_Employee, __Employee);
			Types._Gender.initFragments(_Gender, __Gender);
			Types._Kitchen.initFragments(_Kitchen, __Kitchen);
			Types._Material.initFragments(_Material, __Material);
			Types._Menu.initFragments(_Menu, __Menu);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Owner.initFragments(_Owner, __Owner);
			Types._Person.initFragments(_Person, __Person);
			Types._Region.initFragments(_Region, __Region);
			Types._Restaurant.initFragments(_Restaurant, __Restaurant);
			Types._RestaurantArea.initFragments(_RestaurantArea, __RestaurantArea);
			Types._Role.initFragments(_Role, __Role);
			Types._Table.initFragments(_Table, __Table);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RestaurantMetamodelTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Bathroom__Bathroom = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Bathroom__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Bathroom__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Bathroom__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Bathroom__RestaurantArea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _City__City = {};
		private static final ExecutorOperation /*@NonNull*/ [] _City__DiagramElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _City__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _City__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _City__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Course__Course = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Course__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CourseType__CourseType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CourseType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CourseType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CourseType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CourseType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Diagram__Diagram = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Diagram__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Diagram__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DiagramElement__DiagramElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DiagramElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DiagramElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DiagramElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DiningRoom__DiningRoom = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DiningRoom__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DiningRoom__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DiningRoom__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DiningRoom__RestaurantArea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Employee__Employee = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Employee__DiagramElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Employee__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Employee__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Employee__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Employee__Person = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Gender__Gender = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Gender__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Gender__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Gender__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Gender__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Kitchen__Kitchen = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Kitchen__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Kitchen__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Kitchen__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Kitchen__RestaurantArea = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Material__Material = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Material__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Material__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Material__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Material__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Menu__Menu = {
			RestaurantMetamodelTables.Operations._Menu__hasCourseType /* hasCourseType(CourseType[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Menu__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Menu__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Menu__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Owner__Owner = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Owner__DiagramElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Owner__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Owner__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Owner__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Owner__Person = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Person__Person = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__DiagramElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Person__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Region__Region = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Region__DiagramElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Region__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Region__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Region__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Restaurant__Restaurant = {
			RestaurantMetamodelTables.Operations._Restaurant__hasAccessibleToilets /* hasAccessibleToilets() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Restaurant__DiagramElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Restaurant__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Restaurant__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Restaurant__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _RestaurantArea__RestaurantArea = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RestaurantArea__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _RestaurantArea__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _RestaurantArea__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Role__Role = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Role__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Table__Table = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Bathroom__Bathroom.initOperations(_Bathroom__Bathroom);
			Fragments._Bathroom__NamedElement.initOperations(_Bathroom__NamedElement);
			Fragments._Bathroom__OclAny.initOperations(_Bathroom__OclAny);
			Fragments._Bathroom__OclElement.initOperations(_Bathroom__OclElement);
			Fragments._Bathroom__RestaurantArea.initOperations(_Bathroom__RestaurantArea);

			Fragments._City__City.initOperations(_City__City);
			Fragments._City__DiagramElement.initOperations(_City__DiagramElement);
			Fragments._City__NamedElement.initOperations(_City__NamedElement);
			Fragments._City__OclAny.initOperations(_City__OclAny);
			Fragments._City__OclElement.initOperations(_City__OclElement);

			Fragments._Course__Course.initOperations(_Course__Course);
			Fragments._Course__NamedElement.initOperations(_Course__NamedElement);
			Fragments._Course__OclAny.initOperations(_Course__OclAny);
			Fragments._Course__OclElement.initOperations(_Course__OclElement);

			Fragments._CourseType__CourseType.initOperations(_CourseType__CourseType);
			Fragments._CourseType__OclAny.initOperations(_CourseType__OclAny);
			Fragments._CourseType__OclElement.initOperations(_CourseType__OclElement);
			Fragments._CourseType__OclEnumeration.initOperations(_CourseType__OclEnumeration);
			Fragments._CourseType__OclType.initOperations(_CourseType__OclType);

			Fragments._Diagram__Diagram.initOperations(_Diagram__Diagram);
			Fragments._Diagram__OclAny.initOperations(_Diagram__OclAny);
			Fragments._Diagram__OclElement.initOperations(_Diagram__OclElement);

			Fragments._DiagramElement__DiagramElement.initOperations(_DiagramElement__DiagramElement);
			Fragments._DiagramElement__NamedElement.initOperations(_DiagramElement__NamedElement);
			Fragments._DiagramElement__OclAny.initOperations(_DiagramElement__OclAny);
			Fragments._DiagramElement__OclElement.initOperations(_DiagramElement__OclElement);

			Fragments._DiningRoom__DiningRoom.initOperations(_DiningRoom__DiningRoom);
			Fragments._DiningRoom__NamedElement.initOperations(_DiningRoom__NamedElement);
			Fragments._DiningRoom__OclAny.initOperations(_DiningRoom__OclAny);
			Fragments._DiningRoom__OclElement.initOperations(_DiningRoom__OclElement);
			Fragments._DiningRoom__RestaurantArea.initOperations(_DiningRoom__RestaurantArea);

			Fragments._Employee__DiagramElement.initOperations(_Employee__DiagramElement);
			Fragments._Employee__Employee.initOperations(_Employee__Employee);
			Fragments._Employee__NamedElement.initOperations(_Employee__NamedElement);
			Fragments._Employee__OclAny.initOperations(_Employee__OclAny);
			Fragments._Employee__OclElement.initOperations(_Employee__OclElement);
			Fragments._Employee__Person.initOperations(_Employee__Person);

			Fragments._Gender__Gender.initOperations(_Gender__Gender);
			Fragments._Gender__OclAny.initOperations(_Gender__OclAny);
			Fragments._Gender__OclElement.initOperations(_Gender__OclElement);
			Fragments._Gender__OclEnumeration.initOperations(_Gender__OclEnumeration);
			Fragments._Gender__OclType.initOperations(_Gender__OclType);

			Fragments._Kitchen__Kitchen.initOperations(_Kitchen__Kitchen);
			Fragments._Kitchen__NamedElement.initOperations(_Kitchen__NamedElement);
			Fragments._Kitchen__OclAny.initOperations(_Kitchen__OclAny);
			Fragments._Kitchen__OclElement.initOperations(_Kitchen__OclElement);
			Fragments._Kitchen__RestaurantArea.initOperations(_Kitchen__RestaurantArea);

			Fragments._Material__Material.initOperations(_Material__Material);
			Fragments._Material__OclAny.initOperations(_Material__OclAny);
			Fragments._Material__OclElement.initOperations(_Material__OclElement);
			Fragments._Material__OclEnumeration.initOperations(_Material__OclEnumeration);
			Fragments._Material__OclType.initOperations(_Material__OclType);

			Fragments._Menu__Menu.initOperations(_Menu__Menu);
			Fragments._Menu__NamedElement.initOperations(_Menu__NamedElement);
			Fragments._Menu__OclAny.initOperations(_Menu__OclAny);
			Fragments._Menu__OclElement.initOperations(_Menu__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Owner__DiagramElement.initOperations(_Owner__DiagramElement);
			Fragments._Owner__NamedElement.initOperations(_Owner__NamedElement);
			Fragments._Owner__OclAny.initOperations(_Owner__OclAny);
			Fragments._Owner__OclElement.initOperations(_Owner__OclElement);
			Fragments._Owner__Owner.initOperations(_Owner__Owner);
			Fragments._Owner__Person.initOperations(_Owner__Person);

			Fragments._Person__DiagramElement.initOperations(_Person__DiagramElement);
			Fragments._Person__NamedElement.initOperations(_Person__NamedElement);
			Fragments._Person__OclAny.initOperations(_Person__OclAny);
			Fragments._Person__OclElement.initOperations(_Person__OclElement);
			Fragments._Person__Person.initOperations(_Person__Person);

			Fragments._Region__DiagramElement.initOperations(_Region__DiagramElement);
			Fragments._Region__NamedElement.initOperations(_Region__NamedElement);
			Fragments._Region__OclAny.initOperations(_Region__OclAny);
			Fragments._Region__OclElement.initOperations(_Region__OclElement);
			Fragments._Region__Region.initOperations(_Region__Region);

			Fragments._Restaurant__DiagramElement.initOperations(_Restaurant__DiagramElement);
			Fragments._Restaurant__NamedElement.initOperations(_Restaurant__NamedElement);
			Fragments._Restaurant__OclAny.initOperations(_Restaurant__OclAny);
			Fragments._Restaurant__OclElement.initOperations(_Restaurant__OclElement);
			Fragments._Restaurant__Restaurant.initOperations(_Restaurant__Restaurant);

			Fragments._RestaurantArea__NamedElement.initOperations(_RestaurantArea__NamedElement);
			Fragments._RestaurantArea__OclAny.initOperations(_RestaurantArea__OclAny);
			Fragments._RestaurantArea__OclElement.initOperations(_RestaurantArea__OclElement);
			Fragments._RestaurantArea__RestaurantArea.initOperations(_RestaurantArea__RestaurantArea);

			Fragments._Role__OclAny.initOperations(_Role__OclAny);
			Fragments._Role__OclElement.initOperations(_Role__OclElement);
			Fragments._Role__OclEnumeration.initOperations(_Role__OclEnumeration);
			Fragments._Role__OclType.initOperations(_Role__OclType);
			Fragments._Role__Role.initOperations(_Role__Role);

			Fragments._Table__OclAny.initOperations(_Table__OclAny);
			Fragments._Table__OclElement.initOperations(_Table__OclElement);
			Fragments._Table__Table.initOperations(_Table__Table);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RestaurantMetamodelTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Bathroom = {
			RestaurantMetamodelTables.Properties._RestaurantArea__area,
			RestaurantMetamodelTables.Properties._Bathroom__gender,
			RestaurantMetamodelTables.Properties._Bathroom__isAccessible,
			RestaurantMetamodelTables.Properties._NamedElement__name,
			RestaurantMetamodelTables.Properties._Bathroom__numberOfToilets,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RestaurantMetamodelTables.Properties._RestaurantArea__perimeter
		};

		private static final ExecutorProperty /*@NonNull*/ [] _City = {
			RestaurantMetamodelTables.Properties._City__cap,
			RestaurantMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RestaurantMetamodelTables.Properties._City__region
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Course = {
			RestaurantMetamodelTables.Properties._NamedElement__name,
			RestaurantMetamodelTables.Properties._Course__numberOfPieces,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RestaurantMetamodelTables.Properties._Course__price,
			RestaurantMetamodelTables.Properties._Course__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CourseType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Diagram = {
			RestaurantMetamodelTables.Properties._Diagram__elements,
			RestaurantMetamodelTables.Properties._Diagram__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DiagramElement = {
			RestaurantMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DiningRoom = {
			RestaurantMetamodelTables.Properties._RestaurantArea__area,
			RestaurantMetamodelTables.Properties._NamedElement__name,
			RestaurantMetamodelTables.Properties._DiningRoom__numberOfTables,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RestaurantMetamodelTables.Properties._RestaurantArea__perimeter,
			RestaurantMetamodelTables.Properties._DiningRoom__tables
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Employee = {
			RestaurantMetamodelTables.Properties._Person__birthDate,
			RestaurantMetamodelTables.Properties._Person__birthPlace,
			RestaurantMetamodelTables.Properties._Employee__contractExpirationDate,
			RestaurantMetamodelTables.Properties._Employee__contractSignDate,
			RestaurantMetamodelTables.Properties._Person__fiscalCode,
			RestaurantMetamodelTables.Properties._Person__gender,
			RestaurantMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RestaurantMetamodelTables.Properties._Employee__role,
			RestaurantMetamodelTables.Properties._Employee__salary,
			RestaurantMetamodelTables.Properties._Person__surname
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Gender = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Kitchen = {
			RestaurantMetamodelTables.Properties._RestaurantArea__area,
			RestaurantMetamodelTables.Properties._NamedElement__name,
			RestaurantMetamodelTables.Properties._Kitchen__numberOfStoves,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RestaurantMetamodelTables.Properties._RestaurantArea__perimeter
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Material = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Menu = {
			RestaurantMetamodelTables.Properties._Menu__courses,
			RestaurantMetamodelTables.Properties._NamedElement__name,
			RestaurantMetamodelTables.Properties._Menu__numberOfCourses,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			RestaurantMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Owner = {
			RestaurantMetamodelTables.Properties._Person__birthDate,
			RestaurantMetamodelTables.Properties._Person__birthPlace,
			RestaurantMetamodelTables.Properties._Person__fiscalCode,
			RestaurantMetamodelTables.Properties._Person__gender,
			RestaurantMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RestaurantMetamodelTables.Properties._Person__surname,
			RestaurantMetamodelTables.Properties._Owner__vat
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Person = {
			RestaurantMetamodelTables.Properties._Person__birthDate,
			RestaurantMetamodelTables.Properties._Person__birthPlace,
			RestaurantMetamodelTables.Properties._Person__fiscalCode,
			RestaurantMetamodelTables.Properties._Person__gender,
			RestaurantMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RestaurantMetamodelTables.Properties._Person__surname
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Region = {
			RestaurantMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Restaurant = {
			RestaurantMetamodelTables.Properties._Restaurant__city,
			RestaurantMetamodelTables.Properties._Restaurant__employees,
			RestaurantMetamodelTables.Properties._Restaurant__menus,
			RestaurantMetamodelTables.Properties._NamedElement__name,
			RestaurantMetamodelTables.Properties._Restaurant__numberOfEmployes,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RestaurantMetamodelTables.Properties._Restaurant__owners,
			RestaurantMetamodelTables.Properties._Restaurant__rooms,
			RestaurantMetamodelTables.Properties._Restaurant__street,
			RestaurantMetamodelTables.Properties._Restaurant__telephone,
			RestaurantMetamodelTables.Properties._Restaurant__totalArea
		};

		private static final ExecutorProperty /*@NonNull*/ [] _RestaurantArea = {
			RestaurantMetamodelTables.Properties._RestaurantArea__area,
			RestaurantMetamodelTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			RestaurantMetamodelTables.Properties._RestaurantArea__perimeter
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Role = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Table = {
			RestaurantMetamodelTables.Properties._Table__diningRoom,
			RestaurantMetamodelTables.Properties._Table__material,
			RestaurantMetamodelTables.Properties._Table__number,
			RestaurantMetamodelTables.Properties._Table__numberOfSeats,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Bathroom__Bathroom.initProperties(_Bathroom);
			Fragments._City__City.initProperties(_City);
			Fragments._Course__Course.initProperties(_Course);
			Fragments._CourseType__CourseType.initProperties(_CourseType);
			Fragments._Diagram__Diagram.initProperties(_Diagram);
			Fragments._DiagramElement__DiagramElement.initProperties(_DiagramElement);
			Fragments._DiningRoom__DiningRoom.initProperties(_DiningRoom);
			Fragments._Employee__Employee.initProperties(_Employee);
			Fragments._Gender__Gender.initProperties(_Gender);
			Fragments._Kitchen__Kitchen.initProperties(_Kitchen);
			Fragments._Material__Material.initProperties(_Material);
			Fragments._Menu__Menu.initProperties(_Menu);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Owner__Owner.initProperties(_Owner);
			Fragments._Person__Person.initProperties(_Person);
			Fragments._Region__Region.initProperties(_Region);
			Fragments._Restaurant__Restaurant.initProperties(_Restaurant);
			Fragments._RestaurantArea__RestaurantArea.initProperties(_RestaurantArea);
			Fragments._Role__Role.initProperties(_Role);
			Fragments._Table__Table.initProperties(_Table);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RestaurantMetamodelTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _CourseType__Fried = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.COURSE_TYPE.getEEnumLiteral("Fried"), Types._CourseType, 0);
		public static final EcoreExecutorEnumerationLiteral _CourseType__Pizza = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.COURSE_TYPE.getEEnumLiteral("Pizza"), Types._CourseType, 1);
		public static final EcoreExecutorEnumerationLiteral _CourseType__MainDish = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.COURSE_TYPE.getEEnumLiteral("MainDish"), Types._CourseType, 2);
		public static final EcoreExecutorEnumerationLiteral _CourseType__Nigiri = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.COURSE_TYPE.getEEnumLiteral("Nigiri"), Types._CourseType, 3);
		public static final EcoreExecutorEnumerationLiteral _CourseType__Dessert = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.COURSE_TYPE.getEEnumLiteral("Dessert"), Types._CourseType, 4);
		public static final EcoreExecutorEnumerationLiteral _CourseType__Appetizer = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.COURSE_TYPE.getEEnumLiteral("Appetizer"), Types._CourseType, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _CourseType = {
			_CourseType__Fried,
			_CourseType__Pizza,
			_CourseType__MainDish,
			_CourseType__Nigiri,
			_CourseType__Dessert,
			_CourseType__Appetizer
		};

		public static final EcoreExecutorEnumerationLiteral _Gender__Male = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.GENDER.getEEnumLiteral("Male"), Types._Gender, 0);
		public static final EcoreExecutorEnumerationLiteral _Gender__Female = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.GENDER.getEEnumLiteral("Female"), Types._Gender, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Gender = {
			_Gender__Male,
			_Gender__Female
		};

		public static final EcoreExecutorEnumerationLiteral _Material__Wood = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.MATERIAL.getEEnumLiteral("Wood"), Types._Material, 0);
		public static final EcoreExecutorEnumerationLiteral _Material__Plastic = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.MATERIAL.getEEnumLiteral("Plastic"), Types._Material, 1);
		public static final EcoreExecutorEnumerationLiteral _Material__Glass = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.MATERIAL.getEEnumLiteral("Glass"), Types._Material, 2);
		public static final EcoreExecutorEnumerationLiteral _Material__Plexiglass = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.MATERIAL.getEEnumLiteral("Plexiglass"), Types._Material, 3);
		public static final EcoreExecutorEnumerationLiteral _Material__Aluminium = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.MATERIAL.getEEnumLiteral("Aluminium"), Types._Material, 4);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Material = {
			_Material__Wood,
			_Material__Plastic,
			_Material__Glass,
			_Material__Plexiglass,
			_Material__Aluminium
		};

		public static final EcoreExecutorEnumerationLiteral _Role__Chef = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.ROLE.getEEnumLiteral("Chef"), Types._Role, 0);
		public static final EcoreExecutorEnumerationLiteral _Role__SousChef = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.ROLE.getEEnumLiteral("SousChef"), Types._Role, 1);
		public static final EcoreExecutorEnumerationLiteral _Role__Waiter = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.ROLE.getEEnumLiteral("Waiter"), Types._Role, 2);
		public static final EcoreExecutorEnumerationLiteral _Role__Cashier = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.ROLE.getEEnumLiteral("Cashier"), Types._Role, 3);
		public static final EcoreExecutorEnumerationLiteral _Role__HeadWaiter = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.ROLE.getEEnumLiteral("HeadWaiter"), Types._Role, 4);
		public static final EcoreExecutorEnumerationLiteral _Role__HeadChef = new EcoreExecutorEnumerationLiteral(RestaurantMetamodelPackage.Literals.ROLE.getEEnumLiteral("HeadChef"), Types._Role, 5);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Role = {
			_Role__Chef,
			_Role__SousChef,
			_Role__Waiter,
			_Role__Cashier,
			_Role__HeadWaiter,
			_Role__HeadChef
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._CourseType.initLiterals(_CourseType);
			Types._Gender.initLiterals(_Gender);
			Types._Material.initLiterals(_Material);
			Types._Role.initLiterals(_Role);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of RestaurantMetamodelTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new RestaurantMetamodelTables();
	}

	private RestaurantMetamodelTables() {
		super(RestaurantMetamodelPackage.eNS_URI);
	}
}
