package SynthLang.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;

public class Synthesizer_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_5zxs82_a(editorContext, node);
  }
  private EditorCell createCollection_5zxs82_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_5zxs82_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_5zxs82_a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_5zxs82_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5zxs82_c0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_5zxs82_d0(editorContext, node));
    return editorCell;
  }
  private EditorCell createConstant_5zxs82_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "synthesizer ");
    editorCell.setCellId("Constant_5zxs82_a0");
    Style style = new StyleImpl();
    highlightedKeyword_StyleSheet.apply_HighlightedKeyword(style, editorCell);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createProperty_5zxs82_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    Style style = new StyleImpl();
    BaseLanguageStyle_StyleSheet.apply_Parameter(style, editorCell);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      EditorManager manager = EditorManager.getInstanceFromContext(editorContext);
      return manager.createNodeRoleAttributeCell(attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }
  private EditorCell createConstant_5zxs82_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_5zxs82_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, 0, true);
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createCollection_5zxs82_d0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_5zxs82_d0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(this.createRefNode_5zxs82_a3a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5zxs82_b3a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5zxs82_c3a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5zxs82_d3a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_5zxs82_e3a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5zxs82_f3a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5zxs82_g3a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5zxs82_h3a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_5zxs82_i3a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_5zxs82_j3a(editorContext, node));
    return editorCell;
  }
  private EditorCell createRefNode_5zxs82_a3a(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Synthesizer_Editor.userInterfaceSingleRoleHandler_5zxs82_a3a(node, MetaAdapterFactory.getContainmentLink(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x43fe12378cc7cc9eL, 0x43fe12378cc7ccf4L, "userInterface"), editorContext);
    return provider.createCell();
  }
  private class userInterfaceSingleRoleHandler_5zxs82_a3a extends SingleRoleCellProvider {
    public userInterfaceSingleRoleHandler_5zxs82_a3a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("userInterface");
      }
      Style style = new StyleImpl();
      SNode node = myOwnerNode;
      EditorContext editorContext = myEditorContext;
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, 0, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_userInterface");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no userInterface>";
    }
  }
  private EditorCell createConstant_5zxs82_b3a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_5zxs82_b3a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_5zxs82_c3a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "sounds ");
    editorCell.setCellId("Constant_5zxs82_c3a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, 0, MPSFonts.BOLD_ITALIC);
    style.set(StyleAttributes.FONT_SIZE, 0, 15);
    style.set(StyleAttributes.TEXT_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_5zxs82_d3a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_5zxs82_d3a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, 0, MPSFonts.BOLD);
    style.set(StyleAttributes.FONT_SIZE, 0, 15);
    style.set(StyleAttributes.PUNCTUATION_LEFT, 0, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_5zxs82_e3a(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Synthesizer_Editor.soundsSingleRoleHandler_5zxs82_e3a(node, MetaAdapterFactory.getContainmentLink(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x43fe12378cc7cc9eL, 0x43fe12378cc7d4e0L, "sounds"), editorContext);
    return provider.createCell();
  }
  private class soundsSingleRoleHandler_5zxs82_e3a extends SingleRoleCellProvider {
    public soundsSingleRoleHandler_5zxs82_e3a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("sounds");
      }
      Style style = new StyleImpl();
      SNode node = myOwnerNode;
      EditorContext editorContext = myEditorContext;
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, 0, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, 0, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_sounds");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no sounds>";
    }
  }
  private EditorCell createConstant_5zxs82_f3a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_5zxs82_f3a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, 0, MPSFonts.BOLD);
    style.set(StyleAttributes.FONT_SIZE, 0, 15);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_5zxs82_g3a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "connections ");
    editorCell.setCellId("Constant_5zxs82_g3a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, 0, MPSFonts.BOLD_ITALIC);
    style.set(StyleAttributes.FONT_SIZE, 0, 15);
    style.set(StyleAttributes.TEXT_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createConstant_5zxs82_h3a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_5zxs82_h3a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, 0, MPSFonts.BOLD);
    style.set(StyleAttributes.FONT_SIZE, 0, 15);
    style.set(StyleAttributes.PUNCTUATION_LEFT, 0, true);
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, 0, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_5zxs82_i3a(EditorContext editorContext, SNode node) {
    SingleRoleCellProvider provider = new Synthesizer_Editor.connectionsSingleRoleHandler_5zxs82_i3a(node, MetaAdapterFactory.getContainmentLink(0x4367d71c7d554642L, 0x8148026aeb16dfebL, 0x43fe12378cc7cc9eL, 0x43fe12378cc7d4e5L, "connections"), editorContext);
    return provider.createCell();
  }
  private class connectionsSingleRoleHandler_5zxs82_i3a extends SingleRoleCellProvider {
    public connectionsSingleRoleHandler_5zxs82_i3a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(ownerNode, containmentLink, context);
    }
    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = super.createChildCell(child);
      installCellInfo(child, editorCell);
      return editorCell;
    }
    private void installCellInfo(SNode child, EditorCell editorCell) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(myOwnerNode, myContainmentLink.getDeclarationNode(), myEditorContext));
      if (editorCell.getRole() == null) {
        editorCell.setRole("connections");
      }
      Style style = new StyleImpl();
      SNode node = myOwnerNode;
      EditorContext editorContext = myEditorContext;
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, 0, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, 0, true);
      editorCell.getStyle().putAll(style);
    }
    @Override
    protected EditorCell createEmptyCell() {
      EditorCell editorCell = super.createEmptyCell();
      editorCell.setCellId("empty_connections");
      installCellInfo(null, editorCell);
      return editorCell;
    }
    protected String getNoTargetText() {
      return "<no connections>";
    }
  }
  private EditorCell createConstant_5zxs82_j3a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_5zxs82_j3a");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_STYLE, 0, MPSFonts.BOLD);
    style.set(StyleAttributes.FONT_SIZE, 0, 15);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
}
