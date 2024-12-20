/**
 */
package RestaurantMetamodel.impl;

import RestaurantMetamodel.Kitchen;
import RestaurantMetamodel.RestaurantMetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kitchen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RestaurantMetamodel.impl.KitchenImpl#getNumberOfStoves <em>Number Of Stoves</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KitchenImpl extends RestaurantAreaImpl implements Kitchen {
	/**
	 * The default value of the '{@link #getNumberOfStoves() <em>Number Of Stoves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfStoves()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_STOVES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfStoves() <em>Number Of Stoves</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfStoves()
	 * @generated
	 * @ordered
	 */
	protected int numberOfStoves = NUMBER_OF_STOVES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KitchenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RestaurantMetamodelPackage.Literals.KITCHEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfStoves() {
		return numberOfStoves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfStoves(int newNumberOfStoves) {
		int oldNumberOfStoves = numberOfStoves;
		numberOfStoves = newNumberOfStoves;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RestaurantMetamodelPackage.KITCHEN__NUMBER_OF_STOVES, oldNumberOfStoves, numberOfStoves));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RestaurantMetamodelPackage.KITCHEN__NUMBER_OF_STOVES:
				return getNumberOfStoves();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RestaurantMetamodelPackage.KITCHEN__NUMBER_OF_STOVES:
				setNumberOfStoves((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RestaurantMetamodelPackage.KITCHEN__NUMBER_OF_STOVES:
				setNumberOfStoves(NUMBER_OF_STOVES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RestaurantMetamodelPackage.KITCHEN__NUMBER_OF_STOVES:
				return numberOfStoves != NUMBER_OF_STOVES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (numberOfStoves: ");
		result.append(numberOfStoves);
		result.append(')');
		return result.toString();
	}

} //KitchenImpl
