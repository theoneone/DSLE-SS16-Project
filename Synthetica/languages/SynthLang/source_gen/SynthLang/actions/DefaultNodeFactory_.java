package SynthLang.actions;

/*Generated by MPS */

import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class DefaultNodeFactory_ {
  public static class NodeFactory_3347507059715037549 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      SPropertyOperations.set(newNode, MetaAdapterFactory.getProperty(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x43fe12378cc7d475L, 0x4854ee8f94d75898L, "spanX"), "" + (1));
      SPropertyOperations.set(newNode, MetaAdapterFactory.getProperty(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x43fe12378cc7d475L, 0x4854ee8f94d758f0L, "spanY"), "" + (1));
    }
  }
}
