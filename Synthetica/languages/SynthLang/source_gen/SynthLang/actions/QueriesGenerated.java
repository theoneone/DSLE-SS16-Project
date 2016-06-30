package SynthLang.actions;

/*Generated by MPS */

import java.util.List;
import jetbrains.mps.openapi.editor.cells.SubstituteAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.action.SideTransformActionsBuilderContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.action.AbstractSideTransformHintSubstituteAction;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.constraints.ModelConstraints;
import jetbrains.mps.smodel.action.SideTransformPreconditionContext;

public class QueriesGenerated {
  public static List<SubstituteAction> sideTransform_ActionsFactory_Port_3340082741251427987(final IOperationContext operationContext, final SideTransformActionsBuilderContext _context) {
    List<SubstituteAction> result = ListSequence.fromList(new ArrayList<SubstituteAction>());
    ListSequence.fromList(result).addElement(new AbstractSideTransformHintSubstituteAction(MetaAdapterFactory.getConcept(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x2e5a5b8e80b0127aL, "SynthLang.structure.Port").getDeclarationNode(), _context.getSourceNode()) {
      public SNode doSubstitute(@Nullable final EditorContext editorContext, String pattern) {
        SPropertyOperations.set(_context.getSourceNode(), MetaAdapterFactory.getProperty(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x2e5a5b8e80b0127aL, 0x2e5a5b8e80b1e952L, "hasConfig"), "" + (true));
        return _context.getSourceNode();
      }
      public String getMatchingText(String pattern) {
        return ":";
      }
      public String getVisibleMatchingText(String pattern) {
        return getMatchingText(pattern);
      }
      public String getDescriptionText(String pattern) {
        return "add configuration";
      }
      @Override
      protected boolean isEnabled() {
        SNode sourceNode = getSourceNode();
        SNode parent = SNodeOperations.getParent(sourceNode);
        SNode containingLink = SNodeOperations.getContainingLinkDeclaration(sourceNode);
        return parent == null || containingLink == null || (ModelConstraints.canBeParent(parent, MetaAdapterFactory.getConcept(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x2e5a5b8e80b0127aL, "SynthLang.structure.Port").getDeclarationNode(), containingLink, null, null) && ModelConstraints.canBeAncestor(parent, null, MetaAdapterFactory.getConcept(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x2e5a5b8e80b0127aL, "SynthLang.structure.Port").getDeclarationNode(), null));
      }
    });
    return result;
  }
  public static boolean sideTransformHintSubstituteActionsBuilder_Precondition_Port_3340082741251428477(final IOperationContext operationContext, final SideTransformPreconditionContext _context) {
    return SPropertyOperations.getBoolean(_context.getSourceNode(), MetaAdapterFactory.getProperty(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x2e5a5b8e80b0127aL, 0x2e5a5b8e80b1e952L, "hasConfig")) == false;
  }
}
