package RestaurantLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseConstraintsAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class ConstraintsAspectDescriptor extends BaseConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  @Override
  public ConstraintsDescriptor getConstraints(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return new City_Constraints();
      case 1:
        return new Employee_Constraints();
      case 2:
        return new IRestaurantRelation_Constraints();
      case 3:
        return new Owner_Constraints();
      case 4:
        return new Region_Constraints();
      case 5:
        return new Restaurant_Constraints();
      case 6:
        return new RestaurantArea_Constraints();
      case 7:
        return new Table_Constraints();
      default:
    }
    return new BaseConstraintsDescriptor(concept);
  }
  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c40L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c5bL), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x529faf485a6b8e78L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c63L), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c3eL), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef429eL), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c6eL), MetaIdFactory.conceptId(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef2c73L)).seal();
}