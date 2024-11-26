<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:199448eb-571c-4c58-8638-f42c71503ccb(RestaurantLanguage.feedback)">
  <persistence version="9" />
  <languages>
    <use id="ea3159bf-f48e-4720-bde2-86dba75f0d34" name="jetbrains.mps.lang.context.defs" version="0" />
    <use id="7127d409-29f0-43e8-917f-f016ea288944" name="jetbrains.mps.lang.feedback.problem.structural" version="0" />
    <use id="517077fd-e44f-4338-a475-1d29781dfdb8" name="jetbrains.mps.lang.feedback.skeleton" version="0" />
    <use id="16e76fe3-9534-4def-afb7-925a169a7c0b" name="jetbrains.mps.lang.feedback.messages" version="0" />
    <use id="033598a4-76a9-47e1-ac89-a300c0fceab8" name="jetbrains.mps.lang.feedback.problem" version="0" />
    <use id="cddf55b3-117e-46ec-837c-ff50eb7b89b0" name="jetbrains.mps.lang.feedback.problem.childAndProp" version="0" />
    <use id="cd17a113-ca4e-472f-a8de-c49008f9eea8" name="jetbrains.mps.lang.feedback" version="0" />
    <use id="3ad5badc-1d9c-461c-b7b1-fa2fcd0a0ae7" name="jetbrains.mps.lang.context" version="0" />
    <use id="feec32f9-bc8f-4da8-8efd-7f3f9dd4101b" name="jetbrains.mps.lang.feedback.problem.scopes" version="0" />
    <devkit ref="0845ddb4-34c2-4a32-b2ae-270bffc5b430(jetbrains.mps.devkit.aspect.feedback)" />
  </languages>
  <imports>
    <import index="qzsv" ref="r:63ce0387-25e9-4762-bec1-dac3eb032399(jetbrains.mps.lang.feedback.problem.structural.feedback)" />
    <import index="7682" ref="r:ed2e1c8b-f3ce-4973-8d88-0d8c7147e936(RestaurantLanguage.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="ea3159bf-f48e-4720-bde2-86dba75f0d34" name="jetbrains.mps.lang.context.defs">
      <concept id="7291380803376202513" name="jetbrains.mps.lang.context.defs.structure.TypedDefReference" flags="ng" index="3QpRc$">
        <reference id="7291380803376221790" name="declaration" index="3QpVTF" />
      </concept>
    </language>
    <language id="033598a4-76a9-47e1-ac89-a300c0fceab8" name="jetbrains.mps.lang.feedback.problem">
      <concept id="7716791493892884282" name="jetbrains.mps.lang.feedback.problem.structure.ProblemPointsToKindRoot" flags="ng" index="sa$J0">
        <reference id="7716791493892884283" name="kind" index="sa$J1" />
      </concept>
    </language>
    <language id="7127d409-29f0-43e8-917f-f016ea288944" name="jetbrains.mps.lang.feedback.problem.structural">
      <concept id="7574732359718311403" name="jetbrains.mps.lang.feedback.problem.structural.structure.TargetConceptIncorrectChild" flags="ng" index="2SH4Wp" />
    </language>
    <language id="cd17a113-ca4e-472f-a8de-c49008f9eea8" name="jetbrains.mps.lang.feedback">
      <concept id="6285588811486118729" name="jetbrains.mps.lang.feedback.structure.Feedback" flags="ngI" index="3JXyrL">
        <child id="6285588811486118732" name="problem" index="3JXyrO" />
      </concept>
    </language>
    <language id="16e76fe3-9534-4def-afb7-925a169a7c0b" name="jetbrains.mps.lang.feedback.messages">
      <concept id="7291380803381892689" name="jetbrains.mps.lang.feedback.messages.structure.ShowMessage" flags="ng" index="3QByp$">
        <child id="5258059200641510856" name="message" index="16N$OO" />
      </concept>
    </language>
    <language id="ad93155d-79b2-4759-b10c-55123e763903" name="jetbrains.mps.lang.messages">
      <concept id="5258059200642172255" name="jetbrains.mps.lang.messages.structure.CombinedMessageExpression" flags="ng" index="16I2mz">
        <child id="5258059200642172257" name="part" index="16I2mt" />
      </concept>
      <concept id="5258059200642278562" name="jetbrains.mps.lang.messages.structure.MacroMessageExpression" flags="ng" index="16Iohu">
        <child id="2716118816014328328" name="defRef" index="9Y7m$" />
      </concept>
      <concept id="5258059200641510853" name="jetbrains.mps.lang.messages.structure.LiteralMessageExpression" flags="ng" index="16N$OT">
        <property id="5258059200641510854" name="message" index="16N$OU" />
      </concept>
    </language>
    <language id="517077fd-e44f-4338-a475-1d29781dfdb8" name="jetbrains.mps.lang.feedback.skeleton">
      <concept id="7291380803381892615" name="jetbrains.mps.lang.feedback.skeleton.structure.FeedbackPerConceptRoot" flags="ng" index="3QByoM">
        <reference id="7188575577281228125" name="concept" index="3Z9TSV" />
        <child id="7291380803381927154" name="feedbacks" index="3QBEN7" />
      </concept>
    </language>
  </registry>
  <node concept="3QByoM" id="7zcgsOhdhSD">
    <ref role="3Z9TSV" to="7682:22wu4jVVMLz" resolve="Owner" />
    <node concept="3QByp$" id="7zcgsOhdhSM" role="3QBEN7">
      <node concept="16I2mz" id="7zcgsOhdhSN" role="16N$OO">
        <node concept="16N$OT" id="7zcgsOhdhT4" role="16I2mt">
          <property role="16N$OU" value="&quot;" />
        </node>
        <node concept="16Iohu" id="7zcgsOhdhT2" role="16I2mt">
          <node concept="3QpRc$" id="7zcgsOhdhT3" role="9Y7m$">
            <ref role="3QpVTF" to="qzsv:sEk7mxZfrm" resolve="parentConcept" />
          </node>
        </node>
        <node concept="16N$OT" id="7zcgsOhdhT5" role="16I2mt">
          <property role="16N$OU" value="&quot; is not correct" />
        </node>
      </node>
      <node concept="2SH4Wp" id="7zcgsOhdhSJ" role="3JXyrO">
        <ref role="sa$J1" to="qzsv:sEk7mxZf2A" />
      </node>
    </node>
  </node>
  <node concept="3QByoM" id="7zcgsOhdibl">
    <ref role="3Z9TSV" to="7682:22wu4jVVMLr" resolve="Employee" />
    <node concept="3QByp$" id="7zcgsOhdibn" role="3QBEN7">
      <node concept="16I2mz" id="7zcgsOhdibo" role="16N$OO">
        <node concept="16Iohu" id="7zcgsOhdibr" role="16I2mt">
          <node concept="3QpRc$" id="7zcgsOhdibs" role="9Y7m$">
            <ref role="3QpVTF" to="qzsv:sEk7mxZf2C" resolve="parentNode" />
          </node>
        </node>
        <node concept="16N$OT" id="7zcgsOhdibz" role="16I2mt">
          <property role="16N$OU" value=" is not correct" />
        </node>
      </node>
      <node concept="2SH4Wp" id="7zcgsOhdibm" role="3JXyrO">
        <ref role="sa$J1" to="qzsv:sEk7mxZf2A" />
      </node>
    </node>
  </node>
  <node concept="3QByoM" id="7zcgsOhdib$">
    <ref role="3Z9TSV" to="7682:22wu4jVVOau" resolve="Restaurant" />
    <node concept="3QByp$" id="7zcgsOhdibA" role="3QBEN7">
      <node concept="16I2mz" id="7zcgsOhdibB" role="16N$OO">
        <node concept="16Iohu" id="7zcgsOhdibE" role="16I2mt">
          <node concept="3QpRc$" id="7zcgsOhdibF" role="9Y7m$">
            <ref role="3QpVTF" to="qzsv:sEk7mxZf2C" resolve="parentNode" />
          </node>
        </node>
        <node concept="16N$OT" id="7zcgsOhdibM" role="16I2mt">
          <property role="16N$OU" value=" is not correct" />
        </node>
      </node>
      <node concept="2SH4Wp" id="7zcgsOhdib_" role="3JXyrO">
        <ref role="sa$J1" to="qzsv:sEk7mxZf2A" />
      </node>
    </node>
  </node>
</model>

