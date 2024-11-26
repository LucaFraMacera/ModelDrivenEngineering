<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:6142c5f6-2907-48aa-8a44-fb0a42c9cd30(RestaurantLanguage.constraints)">
  <persistence version="9" />
  <languages>
    <use id="5dae8159-ab99-46bb-a40d-0cee30ee7018" name="jetbrains.mps.lang.constraints.rules.kinds" version="0" />
    <use id="ea3159bf-f48e-4720-bde2-86dba75f0d34" name="jetbrains.mps.lang.context.defs" version="0" />
    <use id="e51810c5-7308-4642-bcb6-469e61b5dd18" name="jetbrains.mps.lang.constraints.msg.specification" version="0" />
    <use id="134c38d4-e3af-4d9e-b069-1c7df0a4005d" name="jetbrains.mps.lang.constraints.rules.skeleton" version="0" />
    <use id="b3551702-269c-4f05-ba61-58060cef4292" name="jetbrains.mps.lang.rulesAndMessages" version="0" />
    <use id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints" version="6" />
    <use id="13744753-c81f-424a-9c1b-cf8943bf4e86" name="jetbrains.mps.lang.sharedConcepts" version="0" />
    <use id="3ad5badc-1d9c-461c-b7b1-fa2fcd0a0ae7" name="jetbrains.mps.lang.context" version="0" />
    <use id="ad93155d-79b2-4759-b10c-55123e763903" name="jetbrains.mps.lang.messages" version="0" />
    <devkit ref="00000000-0000-4000-0000-5604ebd4f22c(jetbrains.mps.devkit.aspect.constraints)" />
  </languages>
  <imports>
    <import index="7682" ref="r:ed2e1c8b-f3ce-4973-8d88-0d8c7147e936(RestaurantLanguage.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
    </language>
    <language id="3f4bc5f5-c6c1-4a28-8b10-c83066ffa4a1" name="jetbrains.mps.lang.constraints">
      <concept id="6702802731807351367" name="jetbrains.mps.lang.constraints.structure.ConstraintFunction_CanBeAChild" flags="in" index="9S07l" />
      <concept id="1202989658459" name="jetbrains.mps.lang.constraints.structure.ConstraintFunctionParameter_parentNode" flags="nn" index="nLn13" />
      <concept id="1213093968558" name="jetbrains.mps.lang.constraints.structure.ConceptConstraints" flags="ng" index="1M2fIO">
        <reference id="1213093996982" name="concept" index="1M2myG" />
        <child id="6702802731807737306" name="canBeChild" index="9Vyp8" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
    </language>
  </registry>
  <node concept="1M2fIO" id="7zcgsOhd3a9">
    <ref role="1M2myG" to="7682:22wu4jVVOau" resolve="Restaurant" />
    <node concept="9S07l" id="7zcgsOhd3aa" role="9Vyp8">
      <node concept="3clFbS" id="7zcgsOhd3ab" role="2VODD2">
        <node concept="3cpWs6" id="7zcgsOhd3nI" role="3cqZAp">
          <node concept="2OqwBi" id="7zcgsOhd3J4" role="3cqZAk">
            <node concept="nLn13" id="7zcgsOhd3_W" role="2Oq$k0" />
            <node concept="1mIQ4w" id="7zcgsOhd5M$" role="2OqNvi">
              <node concept="chp4Y" id="7zcgsOhd628" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVNt5" resolve="Diagram" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="7zcgsOhdeXY">
    <ref role="1M2myG" to="7682:22wu4jVVMLz" resolve="Owner" />
    <node concept="9S07l" id="7zcgsOhdeXZ" role="9Vyp8">
      <node concept="3clFbS" id="7zcgsOhdeY0" role="2VODD2">
        <node concept="3cpWs6" id="7zcgsOhdfbQ" role="3cqZAp">
          <node concept="2OqwBi" id="7zcgsOhdfm6" role="3cqZAk">
            <node concept="nLn13" id="7zcgsOhdfcY" role="2Oq$k0" />
            <node concept="1mIQ4w" id="7zcgsOhdfC1" role="2OqNvi">
              <node concept="chp4Y" id="7zcgsOhdfEx" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVNt5" resolve="Diagram" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="7zcgsOhdfWH">
    <ref role="1M2myG" to="7682:22wu4jVVMLr" resolve="Employee" />
    <node concept="9S07l" id="7zcgsOhdfWI" role="9Vyp8">
      <node concept="3clFbS" id="7zcgsOhdfWJ" role="2VODD2">
        <node concept="3cpWs6" id="7zcgsOhdgDN" role="3cqZAp">
          <node concept="2OqwBi" id="7zcgsOhdgO1" role="3cqZAk">
            <node concept="nLn13" id="7zcgsOhdgET" role="2Oq$k0" />
            <node concept="1mIQ4w" id="7zcgsOhdgW0" role="2OqNvi">
              <node concept="chp4Y" id="7zcgsOhdgYw" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVNt5" resolve="Diagram" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="7zcgsOhe8A8">
    <ref role="1M2myG" to="7682:22wu4jVVML0" resolve="City" />
    <node concept="9S07l" id="7zcgsOhe8A9" role="9Vyp8">
      <node concept="3clFbS" id="7zcgsOhe8Aa" role="2VODD2">
        <node concept="3cpWs6" id="7zcgsOhe8O2" role="3cqZAp">
          <node concept="2OqwBi" id="7zcgsOhe8Yg" role="3cqZAk">
            <node concept="nLn13" id="7zcgsOhe8P8" role="2Oq$k0" />
            <node concept="1mIQ4w" id="7zcgsOhe9jj" role="2OqNvi">
              <node concept="chp4Y" id="7zcgsOhe9lN" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVNt5" resolve="Diagram" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="1M2fIO" id="7zcgsOhe9pj">
    <ref role="1M2myG" to="7682:22wu4jVVMKY" resolve="Region" />
    <node concept="9S07l" id="7zcgsOhe9pk" role="9Vyp8">
      <node concept="3clFbS" id="7zcgsOhe9pl" role="2VODD2">
        <node concept="3cpWs6" id="7zcgsOhe9Bj" role="3cqZAp">
          <node concept="2OqwBi" id="7zcgsOhe9L7" role="3cqZAk">
            <node concept="nLn13" id="7zcgsOhe9BZ" role="2Oq$k0" />
            <node concept="1mIQ4w" id="7zcgsOhea6a" role="2OqNvi">
              <node concept="chp4Y" id="7zcgsOhealI" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVNt5" resolve="Diagram" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

