/**
 */
package RestaurantMetamodel.provider;


import RestaurantMetamodel.Restaurant;
import RestaurantMetamodel.RestaurantMetamodelFactory;
import RestaurantMetamodel.RestaurantMetamodelPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link RestaurantMetamodel.Restaurant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RestaurantItemProvider 
	extends DiagramElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addStreetPropertyDescriptor(object);
			addTelephonePropertyDescriptor(object);
			addCityPropertyDescriptor(object);
			addNumberOfEmployesPropertyDescriptor(object);
			addTotalAreaPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Street feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStreetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Restaurant_street_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Restaurant_street_feature", "_UI_Restaurant_type"),
				 RestaurantMetamodelPackage.Literals.RESTAURANT__STREET,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Telephone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTelephonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Restaurant_telephone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Restaurant_telephone_feature", "_UI_Restaurant_type"),
				 RestaurantMetamodelPackage.Literals.RESTAURANT__TELEPHONE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the City feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Restaurant_city_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Restaurant_city_feature", "_UI_Restaurant_type"),
				 RestaurantMetamodelPackage.Literals.RESTAURANT__CITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Employes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfEmployesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Restaurant_numberOfEmployes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Restaurant_numberOfEmployes_feature", "_UI_Restaurant_type"),
				 RestaurantMetamodelPackage.Literals.RESTAURANT__NUMBER_OF_EMPLOYES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Total Area feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalAreaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Restaurant_totalArea_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Restaurant_totalArea_feature", "_UI_Restaurant_type"),
				 RestaurantMetamodelPackage.Literals.RESTAURANT__TOTAL_AREA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RestaurantMetamodelPackage.Literals.RESTAURANT__ROOMS);
			childrenFeatures.add(RestaurantMetamodelPackage.Literals.RESTAURANT__OWNERS);
			childrenFeatures.add(RestaurantMetamodelPackage.Literals.RESTAURANT__EMPLOYEES);
			childrenFeatures.add(RestaurantMetamodelPackage.Literals.RESTAURANT__MENUS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Restaurant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Restaurant"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Restaurant)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Restaurant_type") :
			getString("_UI_Restaurant_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Restaurant.class)) {
			case RestaurantMetamodelPackage.RESTAURANT__STREET:
			case RestaurantMetamodelPackage.RESTAURANT__TELEPHONE:
			case RestaurantMetamodelPackage.RESTAURANT__NUMBER_OF_EMPLOYES:
			case RestaurantMetamodelPackage.RESTAURANT__TOTAL_AREA:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RestaurantMetamodelPackage.RESTAURANT__ROOMS:
			case RestaurantMetamodelPackage.RESTAURANT__OWNERS:
			case RestaurantMetamodelPackage.RESTAURANT__EMPLOYEES:
			case RestaurantMetamodelPackage.RESTAURANT__MENUS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(RestaurantMetamodelPackage.Literals.RESTAURANT__ROOMS,
				 RestaurantMetamodelFactory.eINSTANCE.createRestaurantArea()));

		newChildDescriptors.add
			(createChildParameter
				(RestaurantMetamodelPackage.Literals.RESTAURANT__ROOMS,
				 RestaurantMetamodelFactory.eINSTANCE.createDiningRoom()));

		newChildDescriptors.add
			(createChildParameter
				(RestaurantMetamodelPackage.Literals.RESTAURANT__ROOMS,
				 RestaurantMetamodelFactory.eINSTANCE.createKitchen()));

		newChildDescriptors.add
			(createChildParameter
				(RestaurantMetamodelPackage.Literals.RESTAURANT__ROOMS,
				 RestaurantMetamodelFactory.eINSTANCE.createBathroom()));

		newChildDescriptors.add
			(createChildParameter
				(RestaurantMetamodelPackage.Literals.RESTAURANT__OWNERS,
				 RestaurantMetamodelFactory.eINSTANCE.createOwner()));

		newChildDescriptors.add
			(createChildParameter
				(RestaurantMetamodelPackage.Literals.RESTAURANT__EMPLOYEES,
				 RestaurantMetamodelFactory.eINSTANCE.createEmployee()));

		newChildDescriptors.add
			(createChildParameter
				(RestaurantMetamodelPackage.Literals.RESTAURANT__MENUS,
				 RestaurantMetamodelFactory.eINSTANCE.createMenu()));
	}

}
