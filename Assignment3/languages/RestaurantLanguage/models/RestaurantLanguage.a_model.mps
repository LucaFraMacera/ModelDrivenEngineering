<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:9d94a8bb-9add-4227-8291-8a4bb3bafc66(RestaurantLanguage.a_model)">
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
      <concept id="2351011243167263843" name="RestaurantLanguage.structure.Owner" flags="ng" index="3rjPgB">
        <property id="2351011243167263845" name="vat" index="3rjPgx" />
      </concept>
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
      </concept>
      <concept id="8704404528813403160" name="RestaurantLanguage.structure.EmployeRelation" flags="ng" index="1DXiRl">
        <reference id="8704404528813403161" name="employe" index="1DXiRk" />
      </concept>
      <concept id="8704404528813403158" name="RestaurantLanguage.structure.OwnerRelation" flags="ng" index="1DXiRr">
        <reference id="8704404528813403159" name="owner" index="1DXiRq" />
      </concept>
    </language>
  </registry>
  <node concept="3rjOW1" id="7zcgsOheeiQ">
    <property role="TrG5h" value="Model1" />
    <node concept="3rjPhU" id="7zcgsOheeiR" role="3rjOW3">
      <property role="TrG5h" value="Abruzzo" />
    </node>
    <node concept="3rjPhU" id="7zcgsOheeiW" role="3rjOW3">
      <property role="TrG5h" value="Sicilia" />
    </node>
    <node concept="3rjPg4" id="7zcgsOheeiT" role="3rjOW3">
      <property role="TrG5h" value="Vasto" />
      <property role="3rjPg6" value="56054" />
      <ref role="3rjPg7" node="7zcgsOheeiR" resolve="Abruzzo" />
    </node>
    <node concept="3rjPg4" id="7zcgsOheeiY" role="3rjOW3">
      <property role="TrG5h" value="Palma di Montechiaro" />
      <property role="3rjPg6" value="92020" />
      <ref role="3rjPg7" node="7zcgsOheeiW" resolve="Sicilia" />
    </node>
    <node concept="3rjPgB" id="7zcgsOheej0" role="3rjOW3">
      <property role="TrG5h" value="Giuseppe" />
      <property role="3rjPgn" value="Carlino" />
      <property role="3rjPgx" value="IT11111111111" />
      <property role="3rjPgg" value="CAGIR68D12G48X" />
      <property role="3rjPgh" value="12/12/1968" />
      <ref role="3rjPgu" node="7zcgsOheeiY" resolve="Palma di Montechiaro" />
    </node>
    <node concept="3rjPgv" id="7zcgsOhf55t" role="3rjOW3">
      <property role="TrG5h" value="Mario" />
      <property role="3rjPgp" value="16/01/2025" />
      <property role="3rjPgq" value="04/11/2024" />
      <property role="3rjPgr" value="1200" />
      <property role="3rjPgn" value="Bianchi" />
      <property role="3rjPgg" value="BNCMRA98L08E37J" />
      <property role="3rjPgh" value="08/07/2998" />
      <ref role="3rjPgu" node="7zcgsOheeiT" resolve="Vasto" />
    </node>
    <node concept="3rjNFq" id="7zcgsOhf55v" role="3rjOW3">
      <property role="TrG5h" value="Pizzeria Okay" />
      <property role="3rjNF_" value="Piazza Santa Chiara 51" />
      <property role="3rjNFA" value="33944331038" />
      <ref role="3rjNFw" node="7zcgsOheeiT" resolve="Vasto" />
      <node concept="3rjPhX" id="7zcgsOhf55_" role="3rjNFx">
        <property role="TrG5h" value="Bagno" />
        <property role="3rjPj5" value="1" />
        <property role="3rjPgO" value="4" />
        <property role="3rjPgP" value="2" />
      </node>
      <node concept="3rjPgY" id="7zcgsOhf55C" role="3rjNFx">
        <property role="TrG5h" value="Cucina" />
        <property role="3rjPgS" value="1" />
        <property role="3rjPgO" value="14" />
        <property role="3rjPgP" value="12" />
      </node>
      <node concept="3rjPgT" id="7zcgsOhf55F" role="3rjNFx">
        <property role="TrG5h" value="Sala" />
        <property role="3rjPgO" value="18" />
        <property role="3rjPgP" value="25" />
        <node concept="3rjPgR" id="7zcgsOhf55H" role="3rjPgV">
          <property role="3rjPgK" value="0" />
          <property role="3rjPgL" value="4" />
        </node>
        <node concept="3rjPgR" id="7zcgsOhf55I" role="3rjPgV">
          <property role="3rjPgK" value="1" />
          <property role="3rjPgL" value="3" />
        </node>
        <node concept="3rjPgR" id="7zcgsOhf55J" role="3rjPgV">
          <property role="3rjPgK" value="2" />
          <property role="3rjPgL" value="3" />
        </node>
      </node>
      <node concept="1DXiRr" id="7zcgsOhf55x" role="1DXiRn">
        <ref role="1DXiRq" node="7zcgsOheej0" resolve="Giuseppe" />
      </node>
      <node concept="3rjPgN" id="7zcgsOhf55y" role="3rjNFI">
        <property role="TrG5h" value="Menu" />
        <node concept="3rjPg0" id="7zcgsOhf55z" role="3rjPgX">
          <property role="TrG5h" value="Capricciosa" />
          <property role="3rjPg2" value="9" />
          <property role="3rjPg3" value="22wu4jVVMLa/PIZZA" />
          <property role="3rjPgk" value="1" />
        </node>
        <node concept="3rjPg0" id="7zcgsOhf55K" role="3rjPgX">
          <property role="TrG5h" value="PatatineDippersGrandi" />
          <property role="3rjPg2" value="4" />
          <property role="3rjPg3" value="22wu4jVVMLb/FRIED" />
          <property role="3rjPgk" value="1" />
        </node>
      </node>
      <node concept="1DXiRl" id="7zcgsOhf55$" role="3rjNFH">
        <ref role="1DXiRk" node="7zcgsOhf55t" resolve="Mario" />
      </node>
    </node>
  </node>
</model>

