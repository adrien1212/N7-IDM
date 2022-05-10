/**
 */
package petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinet.Arc#getWeight <em>Weight</em>}</li>
 *   <li>{@link petrinet.Arc#isIsReadArc <em>Is Read Arc</em>}</li>
 *   <li>{@link petrinet.Arc#getTarget <em>Target</em>}</li>
 *   <li>{@link petrinet.Arc#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see petrinet.PetrinetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see petrinet.PetrinetPackage#getArc_Weight()
	 * @model required="true"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Is Read Arc</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Arc</em>' attribute.
	 * @see #setIsReadArc(boolean)
	 * @see petrinet.PetrinetPackage#getArc_IsReadArc()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isIsReadArc();

	/**
	 * Sets the value of the '{@link petrinet.Arc#isIsReadArc <em>Is Read Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Arc</em>' attribute.
	 * @see #isIsReadArc()
	 * @generated
	 */
	void setIsReadArc(boolean value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Noeud#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Noeud)
	 * @see petrinet.PetrinetPackage#getArc_Target()
	 * @see petrinet.Noeud#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	Noeud getTarget();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Noeud value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petrinet.Noeud#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Noeud)
	 * @see petrinet.PetrinetPackage#getArc_Source()
	 * @see petrinet.Noeud#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	Noeud getSource();

	/**
	 * Sets the value of the '{@link petrinet.Arc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Noeud value);

} // Arc
