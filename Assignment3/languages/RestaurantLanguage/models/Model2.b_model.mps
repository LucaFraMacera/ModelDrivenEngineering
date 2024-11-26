<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:b865cac1-cbca-4e6d-b498-93d7e117e52f(Model2.b_model)">
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
      <concept id="2351011243167269534" name="RestaurantLanguage.structure.Restaurant" flags="ng" index="3rjNFq">
        <property id="2351011243167269537" name="street" index="3rjNF_" />
        <property id="2351011243167269538" name="telephone" index="3rjNFA" />
        <reference id="2351011243167269540" name="city" index="3rjNFw" />
        <child id="2351011243167269541" name="rooms" index="3rjNFx" />
        <child id="2351011243167269545" name="employes" index="3rjNFH" />
        <child id="2351011243167269546" name="menus" index="3rjNFI" />
        <child id="8704404528813403162" name="owners" index="1DXiRn" />
      </concept>
      <concept id="2351011243167266629" name="RestaurantLanguage.structure.Diagram" flags="ng" index="3rjOW1">
        <child id="2351011243167266631" name="entities" index="3rjOW3" />
      </concept>
      <concept id="2351011243167263812" name="RestaurantLanguage.structure.Course" flags="ng" index="3rjPg0">
        <property id="2351011243167263814" name="price" index="3rjPg2" />
        <property id="2351011243167263815" name="type" index="3rjPg3" />
        <property id="2351011243167263824" name="numberOfPieces" index="3rjPgk" />
      </concept>
      <concept id="2351011243167263808" name="RestaurantLanguage.structure.City" flags="ng" index="3rjPg4">
        <property id="2351011243167263810" name="cap" index="3rjPg6" />
        <reference id="2351011243167263811" name="region" index="3rjPg7" />
      </concept>
      <concept id="2351011243167263825" name="RestaurantLanguage.structure.Person" flags="ngI" index="3rjPgl">
        <property id="2351011243167263828" name="fiscalCode" index="3rjPgg" />
        <property id="2351011243167263829" name="birthDate" index="3rjPgh" />
        <property id="2351011243167263827" name="surname" index="3rjPgn" />
        <reference id="2351011243167263834" name="birthPlace" index="3rjPgu" />
      </concept>
      <concept id="2351011243167263835" name="RestaurantLanguage.structure.Employee" flags="ng" index="3rjPgv">
        <property id="2351011243167263837" name="contractExpirationDate" index="3rjPgp" />
        <property id="2351011243167263838" name="contractSignDate" index="3rjPgq" />
        <property id="2351011243167263839" name="salary" index="3rjPgr" />
      </concept>
      <concept id="2351011243167263843" name="RestaurantLanguage.structure.Owner" flags="ng" index="3rjPgB" />
      <concept id="2351011243167263854" name="RestaurantLanguage.structure.RestaurantArea" flags="ngI" index="3rjPgE">
        <property id="2351011243167263856" name="perimeter" index="3rjPgO" />
        <property id="2351011243167263857" name="area" index="3rjPgP" />
      </concept>
      <concept id="2351011243167263863" name="RestaurantLanguage.structure.Menu" flags="ng" index="3rjPgN">
        <child id="2351011243167263865" name="courses" index="3rjPgX" />
      </concept>
      <concept id="2351011243167263859" name="RestaurantLanguage.structure.Table" flags="ng" index="3rjPgR">
        <property id="2351011243167263860" name="number" index="3rjPgK" />
        <property id="2351011243167263861" name="numberOfSeat" index="3rjPgL" />
      </concept>
      <concept id="2351011243167263869" name="RestaurantLanguage.structure.DiningRoom" flags="ng" index="3rjPgT">
        <child id="2351011243167263871" name="tables" index="3rjPgV" />
      </concept>
      <concept id="2351011243167263866" name="RestaurantLanguage.structure.Kitchen" flags="ng" index="3rjPgY">
        <property id="2351011243167263868" name="numberOfStoves" index="3rjPgS" />
      </concept>
      <concept id="2351011243167263806" name="RestaurantLanguage.structure.Region" flags="ng" index="3rjPhU" />
      <concept id="2351011243167263801" name="RestaurantLanguage.structure.Bathroom" flags="ng" index="3rjPhX">
        <property id="2351011243167263873" name="numberOfToilets" index="3rjPj5" />
        <property id="2351011243167263874" name="gender" index="3rjPj6" />
        <property id="2351011243167263875" name="isAccessible" index="3rjPj7" />
      </concept>
      <concept id="8704404528813403160" name="RestaurantLanguage.structure.EmployeeRelation" flags="ng" index="1DXiRl">
        <reference id="8704404528813403161" name="employe" index="1DXiRk" />
      </concept>
      <concept id="8704404528813403158" name="RestaurantLanguage.structure.OwnerRelation" flags="ng" index="1DXiRr">
        <reference id="8704404528813403159" name="owner" index="1DXiRq" />
      </concept>
    </language>
  </registry>
  <node concept="3rjOW1" id="4Ulx8hCWnLB">
    <property role="TrG5h" value="Model2" />
    <node concept="3rjPhU" id="4Ulx8hCWnLC" role="3rjOW3">
      <property role="TrG5h" value="Abruzzo" />
    </node>
    <node concept="3rjPhU" id="4Ulx8hCWnM3" role="3rjOW3">
      <property role="TrG5h" value="Kanto di Honshu" />
    </node>
    <node concept="3rjPg4" id="4Ulx8hCWnLF" role="3rjOW3">
      <property role="TrG5h" value="Vasto" />
      <property role="3rjPg6" value="66054" />
      <ref role="3rjPg7" node="4Ulx8hCWnLC" resolve="Abruzzo" />
    </node>
    <node concept="3rjPg4" id="4Ulx8hCWnM5" role="3rjOW3">
      <property role="TrG5h" value="Tokyo" />
      <property role="3rjPg6" value="JP-13" />
      <ref role="3rjPg7" node="4Ulx8hCWnM3" resolve="Kanto di Honshu" />
    </node>
    <node concept="3rjPgB" id="4Ulx8hCWnLY" role="3rjOW3">
      <property role="TrG5h" value="Senku" />
      <property role="3rjPgn" value="Ishigami" />
      <property role="3rjPgg" value="SHGSNK04L52O12A" />
      <property role="3rjPgh" value="04/01/2004" />
      <ref role="3rjPgu" node="4Ulx8hCWnM5" resolve="Tokyo" />
    </node>
    <node concept="3rjPgv" id="4Ulx8hCWnM8" role="3rjOW3">
      <property role="TrG5h" value="Taiju" />
      <property role="3rjPgn" value="Oki" />
      <property role="3rjPgq" value="02/04/2024" />
      <property role="3rjPgr" value="1500" />
      <property role="3rjPgh" value="02/04/2003" />
      <ref role="3rjPgu" node="4Ulx8hCWnM5" resolve="Tokyo" />
    </node>
    <node concept="3rjPgv" id="4Ulx8hCXHym" role="3rjOW3">
      <property role="TrG5h" value="Francois" />
      <property role="3rjPgn" value="Foransowa" />
      <property role="3rjPgp" value="10/06/2027" />
      <property role="3rjPgq" value="05/11/2024" />
      <property role="3rjPgr" value="2200" />
      <property role="3rjPgh" value="07/08/1997" />
      <ref role="3rjPgu" node="4Ulx8hCWnM5" resolve="Tokyo" />
    </node>
    <node concept="3rjNFq" id="4Ulx8hCWnLH" role="3rjOW3">
      <property role="TrG5h" value="Kuma Sushi" />
      <property role="3rjNF_" value="Piazza Gabriele Rossetti 35" />
      <property role="3rjNFA" value="065880787" />
      <ref role="3rjNFw" node="4Ulx8hCWnLF" resolve="Vasto" />
      <node concept="3rjPgY" id="4Ulx8hCXHyq" role="3rjNFx">
        <property role="TrG5h" value="Guoba" />
        <property role="3rjPgS" value="6" />
        <property role="3rjPgO" value="15" />
        <property role="3rjPgP" value="2" />
      </node>
      <node concept="3rjPhX" id="4Ulx8hCXHyv" role="3rjNFx">
        <property role="TrG5h" value="Benjou" />
        <property role="3rjPj5" value="2" />
        <property role="3rjPgO" value="45" />
        <property role="3rjPgP" value="12" />
      </node>
      <node concept="3rjPhX" id="4Ulx8hCXHyy" role="3rjNFx">
        <property role="TrG5h" value="Tearai" />
        <property role="3rjPj5" value="2" />
        <property role="3rjPj6" value="22wu4jVVMLp/FEMALE" />
        <property role="3rjPj7" value="true" />
        <property role="3rjPgO" value="6" />
        <property role="3rjPgP" value="5" />
      </node>
      <node concept="3rjPgT" id="4Ulx8hCXHyA" role="3rjNFx">
        <property role="TrG5h" value="Panda" />
        <property role="3rjPgO" value="68" />
        <property role="3rjPgP" value="12" />
        <node concept="3rjPgR" id="4Ulx8hCXHyC" role="3rjPgV">
          <property role="3rjPgK" value="0" />
          <property role="3rjPgL" value="6" />
        </node>
        <node concept="3rjPgR" id="4Ulx8hCXHyD" role="3rjPgV">
          <property role="3rjPgK" value="1" />
          <property role="3rjPgL" value="7" />
        </node>
      </node>
      <node concept="3rjPgT" id="4Ulx8hCXHyJ" role="3rjNFx">
        <property role="TrG5h" value="Kuma" />
        <property role="3rjPgO" value="54" />
        <property role="3rjPgP" value="23" />
        <node concept="3rjPgR" id="4Ulx8hCXHyL" role="3rjPgV">
          <property role="3rjPgK" value="3" />
          <property role="3rjPgL" value="8" />
        </node>
        <node concept="3rjPgR" id="4Ulx8hCXHyM" role="3rjPgV">
          <property role="3rjPgK" value="2" />
          <property role="3rjPgL" value="10" />
        </node>
      </node>
      <node concept="1DXiRr" id="4Ulx8hCWnLJ" role="1DXiRn">
        <ref role="1DXiRq" node="4Ulx8hCWnLY" resolve="Senku" />
      </node>
      <node concept="3rjPgN" id="4Ulx8hCWnLK" role="3rjNFI">
        <property role="TrG5h" value="Pranzo" />
        <node concept="3rjPg0" id="4Ulx8hCWnLL" role="3rjPgX">
          <property role="TrG5h" value="Sake nigiri" />
          <property role="3rjPg2" value="3" />
          <property role="3rjPg3" value="22wu4jVVMLd/NIGIRI" />
          <property role="3rjPgk" value="3" />
        </node>
        <node concept="3rjPg0" id="4Ulx8hCWnLN" role="3rjPgX">
          <property role="TrG5h" value="Riso alla cantonese" />
          <property role="3rjPg2" value="7" />
          <property role="3rjPgk" value="1" />
        </node>
      </node>
      <node concept="3rjPgN" id="4Ulx8hCWnLO" role="3rjNFI">
        <property role="TrG5h" value="Cena" />
        <node concept="3rjPg0" id="4Ulx8hCWnLP" role="3rjPgX">
          <property role="TrG5h" value="Sake nigiri" />
          <property role="3rjPg2" value="3" />
          <property role="3rjPg3" value="22wu4jVVMLd/NIGIRI" />
          <property role="3rjPgk" value="3" />
        </node>
        <node concept="3rjPg0" id="4Ulx8hCWnLS" role="3rjPgX">
          <property role="TrG5h" value="Riso alla cantonese" />
          <property role="3rjPg2" value="7" />
          <property role="3rjPgk" value="1" />
        </node>
        <node concept="3rjPg0" id="4Ulx8hCWnLT" role="3rjPgX">
          <property role="TrG5h" value="Gio stella" />
          <property role="3rjPg2" value="5" />
          <property role="3rjPg3" value="22wu4jVVMLf/APPETIZER" />
          <property role="3rjPgk" value="2" />
        </node>
        <node concept="3rjPg0" id="4Ulx8hCWnLU" role="3rjPgX">
          <property role="TrG5h" value="La Piovra" />
          <property role="3rjPg2" value="19" />
          <property role="3rjPg3" value="22wu4jVVMLa/PIZZA" />
          <property role="3rjPgk" value="1" />
        </node>
      </node>
      <node concept="1DXiRl" id="4Ulx8hCXHyn" role="3rjNFH">
        <ref role="1DXiRk" node="4Ulx8hCWnM8" resolve="Taiju" />
      </node>
      <node concept="1DXiRl" id="4Ulx8hCXHyo" role="3rjNFH">
        <ref role="1DXiRk" node="4Ulx8hCXHym" resolve="Francois" />
      </node>
    </node>
  </node>
</model>

