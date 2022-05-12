/*
 * generated by Xtext 2.26.0
 */
package fr.n7.simplepdl.txt.serializer;

import com.google.inject.Inject;
import fr.n7.simplepdl.txt.services.PDLGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import simplepdl.Guidance;
import simplepdl.Need;
import simplepdl.Resource;
import simplepdl.SimplepdlPackage;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;

@SuppressWarnings("all")
public class PDLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PDLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SimplepdlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SimplepdlPackage.GUIDANCE:
				sequence_Guidance(context, (Guidance) semanticObject); 
				return; 
			case SimplepdlPackage.NEED:
				sequence_Need(context, (Need) semanticObject); 
				return; 
			case SimplepdlPackage.PROCESS:
				sequence_Process(context, (simplepdl.Process) semanticObject); 
				return; 
			case SimplepdlPackage.RESOURCE:
				sequence_Resource(context, (Resource) semanticObject); 
				return; 
			case SimplepdlPackage.WORK_DEFINITION:
				sequence_WorkDefinition(context, (WorkDefinition) semanticObject); 
				return; 
			case SimplepdlPackage.WORK_SEQUENCE:
				sequence_WorkSequence(context, (WorkSequence) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns Guidance
	 *     Guidance returns Guidance
	 *
	 * Constraint:
	 *     (text=STRING (elements+=[ProcessElement|ID] elements+=[ProcessElement|ID]*)?)
	 * </pre>
	 */
	protected void sequence_Guidance(ISerializationContext context, Guidance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Need returns Need
	 *
	 * Constraint:
	 *     (nbResources=INT resource=[Resource|ID])
	 * </pre>
	 */
	protected void sequence_Need(ISerializationContext context, Need semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.NEED__NB_RESOURCES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.NEED__NB_RESOURCES));
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.NEED__RESOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.NEED__RESOURCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNeedAccess().getNbResourcesINTTerminalRuleCall_1_0(), semanticObject.getNbResources());
		feeder.accept(grammarAccess.getNeedAccess().getResourceResourceIDTerminalRuleCall_3_0_1(), semanticObject.eGet(SimplepdlPackage.Literals.NEED__RESOURCE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Process returns Process
	 *
	 * Constraint:
	 *     (name=ID processElements+=ProcessElement*)
	 * </pre>
	 */
	protected void sequence_Process(ISerializationContext context, simplepdl.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns Resource
	 *     Resource returns Resource
	 *
	 * Constraint:
	 *     (nbAvailableResources=INT name=ID)
	 * </pre>
	 */
	protected void sequence_Resource(ISerializationContext context, Resource semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.RESOURCE__NB_AVAILABLE_RESOURCES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.RESOURCE__NB_AVAILABLE_RESOURCES));
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.RESOURCE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.RESOURCE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getResourceAccess().getNbAvailableResourcesINTTerminalRuleCall_1_0(), semanticObject.getNbAvailableResources());
		feeder.accept(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns WorkDefinition
	 *     WorkDefinition returns WorkDefinition
	 *
	 * Constraint:
	 *     (name=ID need+=Need?)
	 * </pre>
	 */
	protected void sequence_WorkDefinition(ISerializationContext context, WorkDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ProcessElement returns WorkSequence
	 *     WorkSequence returns WorkSequence
	 *
	 * Constraint:
	 *     (linkType=WorkSequenceType predecessor=[WorkDefinition|ID] successor=[WorkDefinition|ID])
	 * </pre>
	 */
	protected void sequence_WorkSequence(ISerializationContext context, WorkSequence semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.WORK_SEQUENCE__LINK_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.WORK_SEQUENCE__LINK_TYPE));
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.WORK_SEQUENCE__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.WORK_SEQUENCE__PREDECESSOR));
			if (transientValues.isValueTransient(semanticObject, SimplepdlPackage.Literals.WORK_SEQUENCE__SUCCESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SimplepdlPackage.Literals.WORK_SEQUENCE__SUCCESSOR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0(), semanticObject.getLinkType());
		feeder.accept(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_3_0_1(), semanticObject.eGet(SimplepdlPackage.Literals.WORK_SEQUENCE__PREDECESSOR, false));
		feeder.accept(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionIDTerminalRuleCall_5_0_1(), semanticObject.eGet(SimplepdlPackage.Literals.WORK_SEQUENCE__SUCCESSOR, false));
		feeder.finish();
	}
	
	
}
