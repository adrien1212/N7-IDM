/**
 * generated by Xtext 2.26.0
 */
package fr.n7.pDL2.impl;

import fr.n7.pDL2.DependanceStart;
import fr.n7.pDL2.PDL2Package;
import fr.n7.pDL2.WorkDefinition;
import fr.n7.pDL2.WorkSequenceKindStart;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependance Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.pDL2.impl.DependanceStartImpl#getPredecessor <em>Predecessor</em>}</li>
 *   <li>{@link fr.n7.pDL2.impl.DependanceStartImpl#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DependanceStartImpl extends MinimalEObjectImpl.Container implements DependanceStart
{
  /**
   * The cached value of the '{@link #getPredecessor() <em>Predecessor</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredecessor()
   * @generated
   * @ordered
   */
  protected WorkDefinition predecessor;

  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected WorkSequenceKindStart link;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependanceStartImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PDL2Package.Literals.DEPENDANCE_START;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WorkDefinition getPredecessor()
  {
    if (predecessor != null && predecessor.eIsProxy())
    {
      InternalEObject oldPredecessor = (InternalEObject)predecessor;
      predecessor = (WorkDefinition)eResolveProxy(oldPredecessor);
      if (predecessor != oldPredecessor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDL2Package.DEPENDANCE_START__PREDECESSOR, oldPredecessor, predecessor));
      }
    }
    return predecessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WorkDefinition basicGetPredecessor()
  {
    return predecessor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPredecessor(WorkDefinition newPredecessor)
  {
    WorkDefinition oldPredecessor = predecessor;
    predecessor = newPredecessor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL2Package.DEPENDANCE_START__PREDECESSOR, oldPredecessor, predecessor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WorkSequenceKindStart getLink()
  {
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLink(WorkSequenceKindStart newLink, NotificationChain msgs)
  {
    WorkSequenceKindStart oldLink = link;
    link = newLink;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PDL2Package.DEPENDANCE_START__LINK, oldLink, newLink);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLink(WorkSequenceKindStart newLink)
  {
    if (newLink != link)
    {
      NotificationChain msgs = null;
      if (link != null)
        msgs = ((InternalEObject)link).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PDL2Package.DEPENDANCE_START__LINK, null, msgs);
      if (newLink != null)
        msgs = ((InternalEObject)newLink).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PDL2Package.DEPENDANCE_START__LINK, null, msgs);
      msgs = basicSetLink(newLink, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL2Package.DEPENDANCE_START__LINK, newLink, newLink));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PDL2Package.DEPENDANCE_START__LINK:
        return basicSetLink(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PDL2Package.DEPENDANCE_START__PREDECESSOR:
        if (resolve) return getPredecessor();
        return basicGetPredecessor();
      case PDL2Package.DEPENDANCE_START__LINK:
        return getLink();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PDL2Package.DEPENDANCE_START__PREDECESSOR:
        setPredecessor((WorkDefinition)newValue);
        return;
      case PDL2Package.DEPENDANCE_START__LINK:
        setLink((WorkSequenceKindStart)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PDL2Package.DEPENDANCE_START__PREDECESSOR:
        setPredecessor((WorkDefinition)null);
        return;
      case PDL2Package.DEPENDANCE_START__LINK:
        setLink((WorkSequenceKindStart)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PDL2Package.DEPENDANCE_START__PREDECESSOR:
        return predecessor != null;
      case PDL2Package.DEPENDANCE_START__LINK:
        return link != null;
    }
    return super.eIsSet(featureID);
  }

} //DependanceStartImpl
