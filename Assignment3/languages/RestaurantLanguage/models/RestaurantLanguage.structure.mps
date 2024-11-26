<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:ed2e1c8b-f3ce-4973-8d88-0d8c7147e936(RestaurantLanguage.structure)">
  <persistence version="9" />
  <languages>
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="3348158742936976480" name="jetbrains.mps.lang.structure.structure.EnumerationMemberDeclaration" flags="ng" index="25R33">
        <property id="1421157252384165432" name="memberId" index="3tVfz5" />
        <property id="672037151186491528" name="presentation" index="1L1pqM" />
      </concept>
      <concept id="3348158742936976479" name="jetbrains.mps.lang.structure.structure.EnumerationDeclaration" flags="ng" index="25R3W">
        <reference id="1075010451642646892" name="defaultMember" index="1H5jkz" />
        <child id="3348158742936976577" name="members" index="25R1y" />
      </concept>
      <concept id="1082978164218" name="jetbrains.mps.lang.structure.structure.DataTypeDeclaration" flags="ng" index="AxPO6">
        <property id="7791109065626895363" name="datatypeId" index="3F6X1D" />
      </concept>
      <concept id="1082978499127" name="jetbrains.mps.lang.structure.structure.ConstrainedDataTypeDeclaration" flags="ng" index="Az7Fb">
        <property id="1083066089218" name="constraint" index="FLfZY" />
      </concept>
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169125989551" name="jetbrains.mps.lang.structure.structure.InterfaceConceptDeclaration" flags="ig" index="PlHQZ">
        <child id="1169127546356" name="extends" index="PrDN$" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <property id="241647608299431129" name="propertyId" index="IQ2nx" />
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ngI" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="22wu4jVVMKT">
    <property role="EcuMT" value="2351011243167263801" />
    <property role="TrG5h" value="Bathroom" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="22wu4jVVMM0" role="PzmwI">
      <ref role="PrY4T" node="22wu4jVVMLI" resolve="RestaurantArea" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMM1" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263873" />
      <property role="TrG5h" value="numberOfToilets" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMM2" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263874" />
      <property role="TrG5h" value="gender" />
      <ref role="AX2Wp" node="22wu4jVVMLn" resolve="Gender" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMM3" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263875" />
      <property role="TrG5h" value="isAccessible" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
  </node>
  <node concept="Az7Fb" id="22wu4jVVMKU">
    <property role="3F6X1D" value="2351011243167263802" />
    <property role="TrG5h" value="Date" />
    <property role="FLfZY" value="[0-9]{2}/[0-9]{2}/[0-9]{4}" />
    <property role="3GE5qa" value="Types" />
  </node>
  <node concept="Az7Fb" id="22wu4jVVMKW">
    <property role="3F6X1D" value="2351011243167263804" />
    <property role="TrG5h" value="Float" />
    <property role="FLfZY" value="[0-9]+.?[0-9]*" />
    <property role="3GE5qa" value="Types" />
  </node>
  <node concept="Az7Fb" id="22wu4jVVMKX">
    <property role="3F6X1D" value="2351011243167263805" />
    <property role="TrG5h" value="VatCode" />
    <property role="FLfZY" value="(IT)?[0-9]{11}" />
    <property role="3GE5qa" value="Types" />
  </node>
  <node concept="1TIwiD" id="22wu4jVVMKY">
    <property role="EcuMT" value="2351011243167263806" />
    <property role="TrG5h" value="Region" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="22wu4jVVMKZ" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="22wu4jVVML0">
    <property role="EcuMT" value="2351011243167263808" />
    <property role="TrG5h" value="City" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="22wu4jVVML1" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVML2" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263810" />
      <property role="TrG5h" value="cap" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="22wu4jVVML3" role="1TKVEi">
      <property role="IQ2ns" value="2351011243167263811" />
      <property role="20kJfa" value="region" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="22wu4jVVMKY" resolve="Region" />
    </node>
  </node>
  <node concept="1TIwiD" id="22wu4jVVML4">
    <property role="EcuMT" value="2351011243167263812" />
    <property role="TrG5h" value="Course" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="22wu4jVVML5" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVML6" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263814" />
      <property role="TrG5h" value="price" />
      <ref role="AX2Wp" node="22wu4jVVMKW" resolve="Float" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVML7" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263815" />
      <property role="TrG5h" value="type" />
      <ref role="AX2Wp" node="22wu4jVVML9" resolve="CourseType" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLg" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263824" />
      <property role="TrG5h" value="numberOfPieces" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
  </node>
  <node concept="25R3W" id="22wu4jVVML9">
    <property role="3F6X1D" value="2351011243167263817" />
    <property role="TrG5h" value="CourseType" />
    <property role="3GE5qa" value="Types" />
    <ref role="1H5jkz" node="22wu4jVVMLc" resolve="MAIN_DISH" />
    <node concept="25R33" id="22wu4jVVMLb" role="25R1y">
      <property role="3tVfz5" value="2351011243167263819" />
      <property role="TrG5h" value="FRIED" />
      <property role="1L1pqM" value="FRIED" />
    </node>
    <node concept="25R33" id="22wu4jVVMLa" role="25R1y">
      <property role="3tVfz5" value="2351011243167263818" />
      <property role="TrG5h" value="PIZZA" />
      <property role="1L1pqM" value="PIZZA" />
    </node>
    <node concept="25R33" id="22wu4jVVMLc" role="25R1y">
      <property role="3tVfz5" value="2351011243167263820" />
      <property role="TrG5h" value="MAIN_DISH" />
      <property role="1L1pqM" value="MAIN_DISH" />
    </node>
    <node concept="25R33" id="22wu4jVVMLd" role="25R1y">
      <property role="3tVfz5" value="2351011243167263821" />
      <property role="TrG5h" value="NIGIRI" />
      <property role="1L1pqM" value="NIGIRI" />
    </node>
    <node concept="25R33" id="22wu4jVVMLe" role="25R1y">
      <property role="3tVfz5" value="2351011243167263822" />
      <property role="TrG5h" value="DESSERT" />
      <property role="1L1pqM" value="DESSERT" />
    </node>
    <node concept="25R33" id="22wu4jVVMLf" role="25R1y">
      <property role="3tVfz5" value="2351011243167263823" />
      <property role="TrG5h" value="APPETIZER" />
      <property role="1L1pqM" value="APPETIZER" />
    </node>
  </node>
  <node concept="PlHQZ" id="22wu4jVVMLh">
    <property role="EcuMT" value="2351011243167263825" />
    <property role="TrG5h" value="Person" />
    <node concept="PrWs8" id="22wu4jVVMLi" role="PrDN$">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLj" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263827" />
      <property role="TrG5h" value="surname" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLk" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263828" />
      <property role="TrG5h" value="fiscalCode" />
      <ref role="AX2Wp" node="7zcgsOheej3" resolve="FiscalCode" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLl" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263829" />
      <property role="TrG5h" value="birthDate" />
      <ref role="AX2Wp" node="22wu4jVVMKU" resolve="Date" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLm" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263830" />
      <property role="TrG5h" value="gender" />
      <ref role="AX2Wp" node="22wu4jVVMLn" resolve="Gender" />
    </node>
    <node concept="1TJgyj" id="22wu4jVVMLq" role="1TKVEi">
      <property role="IQ2ns" value="2351011243167263834" />
      <property role="20kJfa" value="birthPlace" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="22wu4jVVML0" resolve="City" />
    </node>
  </node>
  <node concept="25R3W" id="22wu4jVVMLn">
    <property role="3F6X1D" value="2351011243167263831" />
    <property role="TrG5h" value="Gender" />
    <property role="3GE5qa" value="Types" />
    <ref role="1H5jkz" node="22wu4jVVMLo" resolve="MALE" />
    <node concept="25R33" id="22wu4jVVMLo" role="25R1y">
      <property role="3tVfz5" value="2351011243167263832" />
      <property role="TrG5h" value="MALE" />
      <property role="1L1pqM" value="MALE" />
    </node>
    <node concept="25R33" id="22wu4jVVMLp" role="25R1y">
      <property role="3tVfz5" value="2351011243167263833" />
      <property role="TrG5h" value="FEMALE" />
      <property role="1L1pqM" value="FEMALE" />
    </node>
  </node>
  <node concept="1TIwiD" id="22wu4jVVMLr">
    <property role="EcuMT" value="2351011243167263835" />
    <property role="TrG5h" value="Employee" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="22wu4jVVMLs" role="PzmwI">
      <ref role="PrY4T" node="22wu4jVVMLh" resolve="Person" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLt" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263837" />
      <property role="TrG5h" value="contractExpirationDate" />
      <ref role="AX2Wp" node="22wu4jVVMKU" resolve="Date" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLu" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263838" />
      <property role="TrG5h" value="contractSignDate" />
      <ref role="AX2Wp" node="22wu4jVVMKU" resolve="Date" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLv" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263839" />
      <property role="TrG5h" value="salary" />
      <ref role="AX2Wp" node="22wu4jVVMKW" resolve="Float" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLw" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263840" />
      <property role="TrG5h" value="role" />
      <ref role="AX2Wp" node="22wu4jVVMLx" resolve="Role" />
    </node>
  </node>
  <node concept="25R3W" id="22wu4jVVMLx">
    <property role="3F6X1D" value="2351011243167263841" />
    <property role="TrG5h" value="Role" />
    <property role="3GE5qa" value="Types" />
    <ref role="1H5jkz" node="22wu4jVUm9s" resolve="WAITER" />
    <node concept="25R33" id="22wu4jVUm9p" role="25R1y">
      <property role="3tVfz5" value="2351011243166884441" />
      <property role="TrG5h" value="CHEF" />
      <property role="1L1pqM" value="CHEF" />
    </node>
    <node concept="25R33" id="22wu4jVUm9r" role="25R1y">
      <property role="3tVfz5" value="2351011243166884443" />
      <property role="TrG5h" value="SOUS_CHEF" />
      <property role="1L1pqM" value="SOUS_CHEF" />
    </node>
    <node concept="25R33" id="22wu4jVUm9s" role="25R1y">
      <property role="3tVfz5" value="2351011243166884444" />
      <property role="TrG5h" value="WAITER" />
      <property role="1L1pqM" value="WAITER" />
    </node>
    <node concept="25R33" id="22wu4jVUm9t" role="25R1y">
      <property role="3tVfz5" value="2351011243166884445" />
      <property role="TrG5h" value="CASHIER" />
      <property role="1L1pqM" value="CASHIER" />
    </node>
    <node concept="25R33" id="22wu4jVUm9u" role="25R1y">
      <property role="3tVfz5" value="2351011243166884446" />
      <property role="TrG5h" value="HEAD_WAITER" />
      <property role="1L1pqM" value="HEAD_WAITER" />
    </node>
    <node concept="25R33" id="22wu4jVUm9v" role="25R1y">
      <property role="3tVfz5" value="2351011243166884447" />
      <property role="TrG5h" value="HEAD_CHEF" />
      <property role="1L1pqM" value="HEAD_CHEF" />
    </node>
  </node>
  <node concept="1TIwiD" id="22wu4jVVMLz">
    <property role="EcuMT" value="2351011243167263843" />
    <property role="TrG5h" value="Owner" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="22wu4jVVML$" role="PzmwI">
      <ref role="PrY4T" node="22wu4jVVMLh" resolve="Person" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVML_" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263845" />
      <property role="TrG5h" value="vat" />
      <ref role="AX2Wp" node="22wu4jVVMKX" resolve="VatCode" />
    </node>
  </node>
  <node concept="25R3W" id="22wu4jVVMLB">
    <property role="3F6X1D" value="2351011243167263847" />
    <property role="TrG5h" value="Material" />
    <property role="3GE5qa" value="Types" />
    <ref role="1H5jkz" node="22wu4jVUm9C" resolve="WOOD" />
    <node concept="25R33" id="22wu4jVUm9C" role="25R1y">
      <property role="3tVfz5" value="2351011243166884456" />
      <property role="TrG5h" value="WOOD" />
      <property role="1L1pqM" value="WOOD" />
    </node>
    <node concept="25R33" id="22wu4jVUm9E" role="25R1y">
      <property role="3tVfz5" value="2351011243166884458" />
      <property role="TrG5h" value="PLASTIC" />
      <property role="1L1pqM" value="PLASTIC" />
    </node>
    <node concept="25R33" id="22wu4jVUm9F" role="25R1y">
      <property role="3tVfz5" value="2351011243166884459" />
      <property role="TrG5h" value="GLASS" />
      <property role="1L1pqM" value="GLASS" />
    </node>
    <node concept="25R33" id="22wu4jVUm9G" role="25R1y">
      <property role="3tVfz5" value="2351011243166884460" />
      <property role="TrG5h" value="PLEXIGLASS" />
      <property role="1L1pqM" value="PLEXIGLASS" />
    </node>
    <node concept="25R33" id="22wu4jVUm9H" role="25R1y">
      <property role="3tVfz5" value="2351011243166884461" />
      <property role="TrG5h" value="ALUMINIUM" />
      <property role="1L1pqM" value="ALUMINIUM" />
    </node>
  </node>
  <node concept="PlHQZ" id="22wu4jVVMLI">
    <property role="EcuMT" value="2351011243167263854" />
    <property role="TrG5h" value="RestaurantArea" />
    <node concept="PrWs8" id="22wu4jVVMLJ" role="PrDN$">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLK" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263856" />
      <property role="TrG5h" value="perimeter" />
      <ref role="AX2Wp" node="22wu4jVVMKW" resolve="Float" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLL" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263857" />
      <property role="TrG5h" value="area" />
      <ref role="AX2Wp" node="22wu4jVVMKW" resolve="Float" />
    </node>
  </node>
  <node concept="1TIwiD" id="22wu4jVVMLN">
    <property role="EcuMT" value="2351011243167263859" />
    <property role="TrG5h" value="Table" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="22wu4jVVMLO" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263860" />
      <property role="TrG5h" value="number" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLP" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263861" />
      <property role="TrG5h" value="numberOfSeat" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLQ" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263862" />
      <property role="TrG5h" value="material" />
      <ref role="AX2Wp" node="22wu4jVVMLB" resolve="Material" />
    </node>
  </node>
  <node concept="1TIwiD" id="22wu4jVVMLR">
    <property role="EcuMT" value="2351011243167263863" />
    <property role="TrG5h" value="Menu" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="22wu4jVVMLS" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="22wu4jVVMLT" role="1TKVEi">
      <property role="IQ2ns" value="2351011243167263865" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="courses" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="22wu4jVVML4" resolve="Course" />
    </node>
  </node>
  <node concept="1TIwiD" id="22wu4jVVMLU">
    <property role="EcuMT" value="2351011243167263866" />
    <property role="TrG5h" value="Kitchen" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="22wu4jVVMLV" role="PzmwI">
      <ref role="PrY4T" node="22wu4jVVMLI" resolve="RestaurantArea" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVMLW" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167263868" />
      <property role="TrG5h" value="numberOfStoves" />
      <ref role="AX2Wp" to="tpck:fKAQMTA" resolve="integer" />
    </node>
  </node>
  <node concept="1TIwiD" id="22wu4jVVMLX">
    <property role="EcuMT" value="2351011243167263869" />
    <property role="TrG5h" value="DiningRoom" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="22wu4jVVMLY" role="PzmwI">
      <ref role="PrY4T" node="22wu4jVVMLI" resolve="RestaurantArea" />
    </node>
    <node concept="1TJgyj" id="22wu4jVVMLZ" role="1TKVEi">
      <property role="IQ2ns" value="2351011243167263871" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="tables" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="22wu4jVVMLN" resolve="Table" />
    </node>
  </node>
  <node concept="1TIwiD" id="22wu4jVVNt5">
    <property role="EcuMT" value="2351011243167266629" />
    <property role="TrG5h" value="Diagram" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="22wu4jVVNt6" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyj" id="22wu4jVVNt7" role="1TKVEi">
      <property role="IQ2ns" value="2351011243167266631" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="entities" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" to="tpck:gw2VY9q" resolve="BaseConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="22wu4jVVOau">
    <property role="EcuMT" value="2351011243167269534" />
    <property role="TrG5h" value="Restaurant" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="PrWs8" id="22wu4jVVOav" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVOax" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167269537" />
      <property role="TrG5h" value="street" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyi" id="22wu4jVVOay" role="1TKVEl">
      <property role="IQ2nx" value="2351011243167269538" />
      <property role="TrG5h" value="telephone" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
    <node concept="1TJgyj" id="22wu4jVVOa$" role="1TKVEi">
      <property role="IQ2ns" value="2351011243167269540" />
      <property role="20kJfa" value="city" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="22wu4jVVML0" resolve="City" />
    </node>
    <node concept="1TJgyj" id="22wu4jVVOa_" role="1TKVEi">
      <property role="IQ2ns" value="2351011243167269541" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="rooms" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="22wu4jVVMLI" resolve="RestaurantArea" />
    </node>
    <node concept="1TJgyj" id="7zcgsOhemKq" role="1TKVEi">
      <property role="IQ2ns" value="8704404528813403162" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="owners" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="7zcgsOhemKm" resolve="OwnerRelation" />
    </node>
    <node concept="1TJgyj" id="22wu4jVVOaD" role="1TKVEi">
      <property role="IQ2ns" value="2351011243167269545" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="employes" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="7zcgsOhemKo" resolve="EmployeRelation" />
    </node>
    <node concept="1TJgyj" id="22wu4jVVOaE" role="1TKVEi">
      <property role="IQ2ns" value="2351011243167269546" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="menus" />
      <property role="20lbJX" value="fLJekj6/_1__n" />
      <ref role="20lvS9" node="22wu4jVVMLR" resolve="Menu" />
    </node>
  </node>
  <node concept="Az7Fb" id="7zcgsOheej3">
    <property role="3F6X1D" value="8704404528813368515" />
    <property role="3GE5qa" value="Types" />
    <property role="TrG5h" value="FiscalCode" />
    <property role="FLfZY" value="[A-Z]{5,6}[0-9]{2}[A-Z][0-9]{2}[A-Z][0-9]{2}[A-Z]" />
  </node>
  <node concept="1TIwiD" id="7zcgsOhemKm">
    <property role="EcuMT" value="8704404528813403158" />
    <property role="TrG5h" value="OwnerRelation" />
    <property role="3GE5qa" value="Relations" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyj" id="7zcgsOhemKn" role="1TKVEi">
      <property role="IQ2ns" value="8704404528813403159" />
      <property role="20kJfa" value="owner" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="22wu4jVVMLz" resolve="Owner" />
    </node>
  </node>
  <node concept="1TIwiD" id="7zcgsOhemKo">
    <property role="EcuMT" value="8704404528813403160" />
    <property role="TrG5h" value="EmployeRelation" />
    <property role="3GE5qa" value="Relations" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" />
    <node concept="1TJgyj" id="7zcgsOhemKp" role="1TKVEi">
      <property role="IQ2ns" value="8704404528813403161" />
      <property role="20kJfa" value="employe" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="22wu4jVVMLr" resolve="Employee" />
    </node>
  </node>
</model>

