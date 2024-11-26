package RestaurantLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import jetbrains.mps.lang.editor.menus.EditorMenuDescriptorBase;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.menus.substitute.ConstraintsFilteringSubstituteMenuPartDecorator;
import jetbrains.mps.lang.editor.menus.substitute.ReferenceScopeSubstituteMenuPart;
import jetbrains.mps.lang.editor.menus.ConceptMenusPart;
import java.util.Collection;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.editor.menus.substitute.DefaultSubstituteMenuLookup;
import jetbrains.mps.smodel.language.LanguageRegistry;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SReferenceLink;

public class Restaurant_SubstituteMenu extends SubstituteMenuBase {
  public Restaurant_SubstituteMenu() {
    super(false, new EditorMenuDescriptorBase("default substitute menu for Restaurant. Generated from implicit smart reference attribute.", new SNodePointer("r:ed2e1c8b-f3ce-4973-8d88-0d8c7147e936(RestaurantLanguage.structure)", "2351011243167269534")));
  }
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new ConstraintsFilteringSubstituteMenuPartDecorator(new SMP_ReferenceScope_kurx9p_a(), CONCEPTS.Restaurant$6f));
    result.add(new SMP_Subconcepts_kurx9p_b());
    return result;
  }

  public class SMP_ReferenceScope_kurx9p_a extends ReferenceScopeSubstituteMenuPart {

    public SMP_ReferenceScope_kurx9p_a() {
      super(CONCEPTS.Restaurant$6f, LINKS.city$OncX, new EditorMenuDescriptorBase("reference scope substitute menu part", null));
    }

  }
  public class SMP_Subconcepts_kurx9p_b extends ConceptMenusPart<SubstituteMenuItem, SubstituteMenuContext> {
    public SMP_Subconcepts_kurx9p_b() {
      super(new EditorMenuDescriptorBase("include menus for all the direct subconcepts of " + "Restaurant", null));
    }

    @Override
    protected Collection<SAbstractConcept> getConcepts(final SubstituteMenuContext _context) {
      return getDirectDescendants(_context, CONCEPTS.Restaurant$6f);
    }

    @Override
    protected Collection<SubstituteMenuItem> createItemsForConcept(SubstituteMenuContext context, SAbstractConcept concept) {
      return context.createItems(new DefaultSubstituteMenuLookup(LanguageRegistry.getInstance(context.getEditorContext().getRepository()), concept));
    }
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Restaurant$6f = MetaAdapterFactory.getConcept(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef429eL, "RestaurantLanguage.structure.Restaurant");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink city$OncX = MetaAdapterFactory.getReferenceLink(0xb104fc7d0eb94ddcL, 0x828f1118413b5a6bL, 0x20a07844fbef429eL, 0x20a07844fbef42a4L, "city");
  }
}