package SynthLang.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import java.util.Map;
import jetbrains.mps.smodel.adapter.ids.SPropertyId;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class AbstractSound_Constraints extends BaseConstraintsDescriptor {
  public AbstractSound_Constraints() {
    super(MetaIdFactory.conceptId(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x43fe12378cc7cd4aL));
  }
  @Override
  protected Map<SPropertyId, PropertyConstraintsDescriptor> getNotDefaultSProperties() {
    Map<SPropertyId, PropertyConstraintsDescriptor> properties = new HashMap<SPropertyId, PropertyConstraintsDescriptor>();
    properties.put(MetaIdFactory.propId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L), new BasePropertyConstraintsDescriptor(MetaIdFactory.propId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L), this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }
      @Override
      public boolean validateValue(SNode node, String propertyValue) {
        String propertyName = "name";
        {
          if ((SPropertyOperations.getString(propertyValue)) == null) {
            return false;
          }
          String validatedString = (SPropertyOperations.getString(propertyValue)).replaceAll("[^_\\p{Alnum}]", "");
          if ((validatedString == null || validatedString.length() == 0)) {
            return false;
          }
          for (SNode n : ListSequence.fromList(SLinkOperations.getChildren(SNodeOperations.getNodeAncestor(node, MetaAdapterFactory.getConcept(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x43fe12378cc7d50bL, "SynthLang.structure.SoundList"), false, false), MetaAdapterFactory.getContainmentLink(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x43fe12378cc7d50bL, 0x43fe12378cc86b5eL, "sounds")))) {
            if (SPropertyOperations.getString(n, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")) != null && (n != node && SPropertyOperations.getString(n, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name")).replaceAll("[^_\\p{Alnum}]", "").equals(validatedString))) {
              return false;
            }
          }
          return true;
        }
      }
    });
    return properties;
  }
}
