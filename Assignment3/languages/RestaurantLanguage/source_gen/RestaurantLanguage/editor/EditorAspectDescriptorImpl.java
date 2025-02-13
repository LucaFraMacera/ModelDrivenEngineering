package RestaurantLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Bathroom_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new City_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new Course_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new Diagram_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new DiningRoom_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new Employee_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new EmployeeRelation_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new Kitchen_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new Menu_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new Owner_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new OwnerRelation_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new Region_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new Restaurant_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new Table_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new City_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new Employee_SubstituteMenu());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new EmployeeRelation_SubstituteMenu());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new Owner_SubstituteMenu());
      case 4:
        return Collections.<SubstituteMenu>singletonList(new OwnerRelation_SubstituteMenu());
      case 5:
        return Collections.<SubstituteMenu>singletonList(new Restaurant_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c39L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c40L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c44L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef3745L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c7dL), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c5bL), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x78cc41cd11396c18L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c7aL), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c77L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c63L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x78cc41cd11396c16L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c3eL), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef429eL), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c73L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c40L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c5bL), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x78cc41cd11396c18L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c63L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x78cc41cd11396c16L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef429eL)).seal();
}
