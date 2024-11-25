<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:084f0b24-d659-4856-8d64-22365454c487(RestaurantLanguage.structure.a_model)">
  <persistence version="9" />
  <languages>
    <use id="b104fc7d-0eb9-4ddc-828f-1118413b5a6b" name="RestaurantLanguage" version="0" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports />
  <registry>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="b104fc7d-0eb9-4ddc-828f-1118413b5a6b" name="RestaurantLanguage">
      <concept id="2351011243167266629" name="RestaurantLanguage.structure.Diagram" flags="ng" index="3rjOW1">
        <child id="2351011243167266631" name="entities" index="3rjOW3" />
      </concept>
      <concept id="2351011243167263808" name="RestaurantLanguage.structure.City" flags="ng" index="3rjPg4">
        <property id="2351011243167263810" name="cap" index="3rjPg6" />
        <reference id="2351011243167263811" name="region" index="3rjPg7" />
      </concept>
      <concept id="2351011243167263825" name="RestaurantLanguage.structure.Person" flags="ngI" index="3rjPgl">
        <reference id="2351011243167263834" name="birthPlace" index="3rjPgu" />
      </concept>
      <concept id="2351011243167263835" name="RestaurantLanguage.structure.Employee" flags="ng" index="3rjPgv" />
      <concept id="2351011243167263806" name="RestaurantLanguage.structure.Region" flags="ng" index="3rjPhU" />
    </language>
  </registry>
  <node concept="3rjOW1" id="3d6oDjB6D">
    <property role="TrG5h" value="Suca" />
    <node concept="3rjPhU" id="3d6oDkbkA" role="3rjOW3">
      <property role="TrG5h" value="Abruzzo" />
    </node>
    <node concept="3rjPg4" id="3d6oDkbky" role="3rjOW3">
      <property role="TrG5h" value="Vasto" />
      <property role="3rjPg6" value="12345" />
      <ref role="3rjPg7" node="3d6oDkbkA" resolve="Abruzzo" />
    </node>
    <node concept="3rjPgv" id="3d6oDjNVn" role="3rjOW3">
      <ref role="3rjPgu" node="3d6oDkbky" resolve="Vasto" />
    </node>
  </node>
</model>

