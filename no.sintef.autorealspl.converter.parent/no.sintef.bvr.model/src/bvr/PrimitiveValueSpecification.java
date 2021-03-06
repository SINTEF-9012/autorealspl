/*******************************************************************************
 * Copyright (c)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
/**
 */
package bvr;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p> A PrimitiveValueSpecification contains an expression in our Basic Constraint Language and is typed by a primitive type.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bvr.PrimitiveValueSpecification#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see bvr.BvrPackage#getPrimitiveValueSpecification()
 * @model
 * @generated
 */
public interface PrimitiveValueSpecification extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Expression specifying the value.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(BCLExpression)
	 * @see bvr.BvrPackage#getPrimitiveValueSpecification_Expression()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BCLExpression getExpression();

	/**
	 * Sets the value of the '{@link bvr.PrimitiveValueSpecification#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(BCLExpression value);

} // PrimitiveValueSpecification
