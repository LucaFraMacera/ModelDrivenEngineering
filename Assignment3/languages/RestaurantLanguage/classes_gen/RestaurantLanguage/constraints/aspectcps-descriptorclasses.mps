<?xml version="1.0" encoding="UTF-8"?>
<model ref="00000000-0000-4000-5f02-5beb5f025beb/i:f50eaf1(checkpoints/RestaurantLanguage.constraints@descriptorclasses)">
  <persistence version="9" />
  <attribute name="checkpoint" value="DescriptorClasses" />
  <attribute name="generation-plan" value="AspectCPS" />
  <attribute name="user-objects" value="true" />
  <languages />
  <imports>
    <import index="9xly" ref="r:6142c5f6-2907-48aa-8a44-fb0a42c9cd30(RestaurantLanguage.constraints)" />
    <import index="mhfm" ref="3f233e7f-b8a6-46d2-a57f-795d56775243/java:org.jetbrains.annotations(Annotations/)" />
    <import index="7682" ref="r:ed2e1c8b-f3ce-4973-8d88-0d8c7147e936(RestaurantLanguage.structure)" />
    <import index="mhbf" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.model(MPS.OpenAPI/)" />
    <import index="c17a" ref="8865b7a8-5271-43d3-884c-6fd1d9cfdd34/java:org.jetbrains.mps.openapi.language(MPS.OpenAPI/)" />
    <import index="i8bi" ref="r:c3548bac-30eb-4a2a-937c-0111d5697309(jetbrains.mps.lang.smodel.generator.smodelAdapter)" />
    <import index="2k9e" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.adapter.structure(MPS.Core/)" />
    <import index="ze1i" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel.runtime(MPS.Core/)" />
    <import index="33ny" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.util(JDK/)" />
    <import index="ze1j" ref="8e98f4e2-decf-4e97-bf80-9109e8b759ee/java:jetbrains.mps.smodel.runtime(jetbrains.mps.lang.constraints.rules.runtime/)" />
    <import index="w1kc" ref="6ed54515-acc8-4d1e-a16c-9fd6cfe951ea/java:jetbrains.mps.smodel(MPS.Core/)" />
    <import index="79pl" ref="8e98f4e2-decf-4e97-bf80-9109e8b759ee/java:jetbrains.mps.smodel.runtime.base(jetbrains.mps.lang.constraints.rules.runtime/)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="nn" index="2tJIrI" />
      <concept id="1188207840427" name="jetbrains.mps.baseLanguage.structure.AnnotationInstance" flags="nn" index="2AHcQZ">
        <reference id="1188208074048" name="annotation" index="2AI5Lk" />
      </concept>
      <concept id="1188208481402" name="jetbrains.mps.baseLanguage.structure.HasAnnotation" flags="ngI" index="2AJDlI">
        <child id="1188208488637" name="annotation" index="2AJF6D" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1070475354124" name="jetbrains.mps.baseLanguage.structure.ThisExpression" flags="nn" index="Xjq3P" />
      <concept id="1070475587102" name="jetbrains.mps.baseLanguage.structure.SuperConstructorInvocation" flags="nn" index="XkiVB" />
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1182160077978" name="jetbrains.mps.baseLanguage.structure.AnonymousClassCreator" flags="nn" index="YeOm9">
        <child id="1182160096073" name="cls" index="YeSDq" />
      </concept>
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1081236700937" name="jetbrains.mps.baseLanguage.structure.StaticMethodCall" flags="nn" index="2YIFZM">
        <reference id="1144433194310" name="classConcept" index="1Pybhc" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1070534644030" name="jetbrains.mps.baseLanguage.structure.BooleanType" flags="in" index="10P_77" />
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu">
        <child id="1165602531693" name="superclass" index="1zkMxy" />
      </concept>
      <concept id="8353134822275456723" name="jetbrains.mps.baseLanguage.structure.HexLongLiteral" flags="ng" index="11gdke">
        <property id="8353134822275456796" name="hexValue" index="11gdj1" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1225271283259" name="jetbrains.mps.baseLanguage.structure.NPEEqualsExpression" flags="nn" index="17R0WA" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <property id="4276006055363816570" name="isSynchronized" index="od$2w" />
        <property id="1181808852946" name="isFinal" index="DiZV1" />
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123165" name="jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration" flags="ig" index="3clFb_">
        <property id="1178608670077" name="isAbstract" index="1EzhhJ" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123137" name="jetbrains.mps.baseLanguage.structure.BooleanConstant" flags="nn" index="3clFbT">
        <property id="1068580123138" name="value" index="3clFbU" />
      </concept>
      <concept id="1068580123140" name="jetbrains.mps.baseLanguage.structure.ConstructorDeclaration" flags="ig" index="3clFbW" />
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ngI" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1212685548494" name="jetbrains.mps.baseLanguage.structure.ClassCreator" flags="nn" index="1pGfFk">
        <child id="1212687122400" name="typeParameter" index="1pMfVU" />
      </concept>
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <property id="521412098689998745" name="nonStatic" index="2bfB8j" />
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="7812454656619025412" name="jetbrains.mps.baseLanguage.structure.LocalMethodCall" flags="nn" index="1rXfSq" />
      <concept id="1107535904670" name="jetbrains.mps.baseLanguage.structure.ClassifierType" flags="in" index="3uibUv">
        <reference id="1107535924139" name="classifier" index="3uigEE" />
        <child id="1109201940907" name="parameter" index="11_B2D" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ngI" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
      <concept id="1146644623116" name="jetbrains.mps.baseLanguage.structure.PrivateVisibility" flags="nn" index="3Tm6S6" />
      <concept id="1146644641414" name="jetbrains.mps.baseLanguage.structure.ProtectedVisibility" flags="nn" index="3Tmbuc" />
      <concept id="1080120340718" name="jetbrains.mps.baseLanguage.structure.AndExpression" flags="nn" index="1Wc70l" />
      <concept id="1170345865475" name="jetbrains.mps.baseLanguage.structure.AnonymousClass" flags="ig" index="1Y3b0j">
        <reference id="1170346070688" name="classifier" index="1Y3XeK" />
        <child id="1201186121363" name="typeParameter" index="2Ghqu4" />
      </concept>
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="5808518347809715508" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_InputNode" flags="nn" index="385nmt">
        <property id="5808518347809748738" name="presentation" index="385vuF" />
        <child id="5808518347809747118" name="node" index="385v07" />
      </concept>
      <concept id="3864140621129707969" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_Mappings" flags="nn" index="39dXUE">
        <child id="3864140621129713349" name="labels" index="39e2AI" />
      </concept>
      <concept id="3864140621129713351" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeMapEntry" flags="nn" index="39e2AG">
        <property id="5843998055530255671" name="isNewRoot" index="2mV_xN" />
        <reference id="3864140621129713371" name="inputOrigin" index="39e2AK" />
        <child id="5808518347809748862" name="inputNode" index="385vvn" />
        <child id="3864140621129713365" name="outputNode" index="39e2AY" />
      </concept>
      <concept id="3864140621129713348" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_LabelEntry" flags="nn" index="39e2AJ">
        <property id="3864140621129715945" name="label" index="39e3Y2" />
        <child id="3864140621129715947" name="entries" index="39e3Y0" />
      </concept>
      <concept id="3864140621129713362" name="jetbrains.mps.lang.generator.structure.GeneratorDebug_NodeRef" flags="nn" index="39e2AT">
        <reference id="3864140621129713363" name="node" index="39e2AS" />
      </concept>
      <concept id="3637169702552512264" name="jetbrains.mps.lang.generator.structure.ElementaryNodeId" flags="ng" index="3u3nmq">
        <property id="3637169702552512269" name="nodeId" index="3u3nmv" />
      </concept>
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="2524418899405758586" name="jetbrains.mps.baseLanguage.closures.structure.InferredClosureParameterDeclaration" flags="ig" index="gl6BB" />
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="df345b11-b8c7-4213-ac66-48d2a9b75d88" name="jetbrains.mps.baseLanguageInternal">
      <concept id="1238251434034" name="jetbrains.mps.baseLanguageInternal.structure.ExtractToConstantExpression" flags="ng" index="1dyn4i">
        <property id="1238251449050" name="fieldName" index="1dyqJU" />
        <child id="1238251454130" name="expression" index="1dyrYi" />
      </concept>
      <concept id="1173996401517" name="jetbrains.mps.baseLanguageInternal.structure.InternalNewExpression" flags="nn" index="1nCR9W">
        <property id="1173996588177" name="fqClassName" index="1nD$Q0" />
        <child id="1179332974947" name="type" index="2lIhxL" />
      </concept>
      <concept id="4927083583736784422" name="jetbrains.mps.baseLanguageInternal.structure.ExtractToSingleConstantExpression" flags="ng" index="1BaE9c">
        <property id="3566113306135792467" name="baseContainerName" index="1ouuDV" />
        <property id="4927083583736815155" name="uniqueFieldName" index="1BaxDp" />
        <child id="4927083583736819744" name="expression" index="1Bazha" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="1171407110247" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" flags="nn" index="2Xjw5R" />
      <concept id="6677504323281689838" name="jetbrains.mps.lang.smodel.structure.SConceptType" flags="in" index="3bZ5Sz" />
      <concept id="1154546950173" name="jetbrains.mps.lang.smodel.structure.ConceptReference" flags="ng" index="3gn64h">
        <reference id="1154546997487" name="concept" index="3gnhBz" />
      </concept>
      <concept id="1139621453865" name="jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation" flags="nn" index="1mIQ4w">
        <child id="1177027386292" name="conceptArgument" index="cj9EA" />
      </concept>
      <concept id="6039268229364358244" name="jetbrains.mps.lang.smodel.structure.ExactConceptCase" flags="ng" index="1pnPoh">
        <child id="6039268229364358388" name="body" index="1pnPq1" />
        <child id="6039268229364358387" name="concept" index="1pnPq6" />
      </concept>
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="5944356402132808749" name="jetbrains.mps.lang.smodel.structure.ConceptSwitchStatement" flags="nn" index="1_3QMa">
        <child id="6039268229365417680" name="defaultBlock" index="1prKM_" />
        <child id="5944356402132808753" name="case" index="1_3QMm" />
        <child id="5944356402132808752" name="expression" index="1_3QMn" />
      </concept>
      <concept id="1138055754698" name="jetbrains.mps.lang.smodel.structure.SNodeType" flags="in" index="3Tqbb2" />
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
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
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1204796164442" name="jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation" flags="nn" index="23sCx2">
        <child id="1204796294226" name="closure" index="23t8la" />
      </concept>
      <concept id="1165530316231" name="jetbrains.mps.baseLanguage.collections.structure.IsEmptyOperation" flags="nn" index="1v1jN8" />
      <concept id="1202120902084" name="jetbrains.mps.baseLanguage.collections.structure.WhereOperation" flags="nn" index="3zZkjj" />
    </language>
  </registry>
  <node concept="312cEu" id="0">
    <property role="TrG5h" value="City_Constraints" />
    <uo k="s:originTrace" v="n:8704404528813345160" />
    <node concept="3Tm1VV" id="1" role="1B3o_S">
      <uo k="s:originTrace" v="n:8704404528813345160" />
    </node>
    <node concept="3uibUv" id="2" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:8704404528813345160" />
    </node>
    <node concept="3clFbW" id="3" role="jymVt">
      <uo k="s:originTrace" v="n:8704404528813345160" />
      <node concept="3cqZAl" id="7" role="3clF45">
        <uo k="s:originTrace" v="n:8704404528813345160" />
      </node>
      <node concept="3clFbS" id="8" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813345160" />
        <node concept="XkiVB" id="a" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:8704404528813345160" />
          <node concept="1BaE9c" id="b" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="City$rv" />
            <uo k="s:originTrace" v="n:8704404528813345160" />
            <node concept="2YIFZM" id="c" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:8704404528813345160" />
              <node concept="11gdke" id="d" role="37wK5m">
                <property role="11gdj1" value="b104fc7d0eb94ddcL" />
                <uo k="s:originTrace" v="n:8704404528813345160" />
              </node>
              <node concept="11gdke" id="e" role="37wK5m">
                <property role="11gdj1" value="828f1118413b5a6bL" />
                <uo k="s:originTrace" v="n:8704404528813345160" />
              </node>
              <node concept="11gdke" id="f" role="37wK5m">
                <property role="11gdj1" value="20a07844fbef2c40L" />
                <uo k="s:originTrace" v="n:8704404528813345160" />
              </node>
              <node concept="Xl_RD" id="g" role="37wK5m">
                <property role="Xl_RC" value="RestaurantLanguage.structure.City" />
                <uo k="s:originTrace" v="n:8704404528813345160" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="9" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813345160" />
      </node>
    </node>
    <node concept="2tJIrI" id="4" role="jymVt">
      <uo k="s:originTrace" v="n:8704404528813345160" />
    </node>
    <node concept="3clFb_" id="5" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeChildConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <uo k="s:originTrace" v="n:8704404528813345160" />
      <node concept="3Tmbuc" id="h" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813345160" />
      </node>
      <node concept="3uibUv" id="i" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <uo k="s:originTrace" v="n:8704404528813345160" />
        <node concept="3uibUv" id="l" role="11_B2D">
          <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
          <uo k="s:originTrace" v="n:8704404528813345160" />
        </node>
        <node concept="3uibUv" id="m" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
          <uo k="s:originTrace" v="n:8704404528813345160" />
        </node>
      </node>
      <node concept="3clFbS" id="j" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813345160" />
        <node concept="3clFbF" id="n" role="3cqZAp">
          <uo k="s:originTrace" v="n:8704404528813345160" />
          <node concept="2ShNRf" id="o" role="3clFbG">
            <uo k="s:originTrace" v="n:8704404528813345160" />
            <node concept="YeOm9" id="p" role="2ShVmc">
              <uo k="s:originTrace" v="n:8704404528813345160" />
              <node concept="1Y3b0j" id="q" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <uo k="s:originTrace" v="n:8704404528813345160" />
                <node concept="3Tm1VV" id="r" role="1B3o_S">
                  <uo k="s:originTrace" v="n:8704404528813345160" />
                </node>
                <node concept="3clFb_" id="s" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <uo k="s:originTrace" v="n:8704404528813345160" />
                  <node concept="3Tm1VV" id="v" role="1B3o_S">
                    <uo k="s:originTrace" v="n:8704404528813345160" />
                  </node>
                  <node concept="2AHcQZ" id="w" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    <uo k="s:originTrace" v="n:8704404528813345160" />
                  </node>
                  <node concept="3uibUv" id="x" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                    <uo k="s:originTrace" v="n:8704404528813345160" />
                  </node>
                  <node concept="37vLTG" id="y" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <uo k="s:originTrace" v="n:8704404528813345160" />
                    <node concept="3uibUv" id="_" role="1tU5fm">
                      <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                      <uo k="s:originTrace" v="n:8704404528813345160" />
                    </node>
                    <node concept="2AHcQZ" id="A" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                      <uo k="s:originTrace" v="n:8704404528813345160" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="z" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:8704404528813345160" />
                    <node concept="3uibUv" id="B" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                      <uo k="s:originTrace" v="n:8704404528813345160" />
                    </node>
                    <node concept="2AHcQZ" id="C" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      <uo k="s:originTrace" v="n:8704404528813345160" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="$" role="3clF47">
                    <uo k="s:originTrace" v="n:8704404528813345160" />
                    <node concept="3cpWs8" id="D" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813345160" />
                      <node concept="3cpWsn" id="I" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <uo k="s:originTrace" v="n:8704404528813345160" />
                        <node concept="10P_77" id="J" role="1tU5fm">
                          <uo k="s:originTrace" v="n:8704404528813345160" />
                        </node>
                        <node concept="1rXfSq" id="K" role="33vP2m">
                          <ref role="37wK5l" node="6" resolve="staticCanBeAChild" />
                          <uo k="s:originTrace" v="n:8704404528813345160" />
                          <node concept="2OqwBi" id="L" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813345160" />
                            <node concept="37vLTw" id="P" role="2Oq$k0">
                              <ref role="3cqZAo" node="y" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813345160" />
                            </node>
                            <node concept="liA8E" id="Q" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getNode()" resolve="getNode" />
                              <uo k="s:originTrace" v="n:8704404528813345160" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="M" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813345160" />
                            <node concept="37vLTw" id="R" role="2Oq$k0">
                              <ref role="3cqZAo" node="y" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813345160" />
                            </node>
                            <node concept="liA8E" id="S" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getParentNode()" resolve="getParentNode" />
                              <uo k="s:originTrace" v="n:8704404528813345160" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="N" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813345160" />
                            <node concept="37vLTw" id="T" role="2Oq$k0">
                              <ref role="3cqZAo" node="y" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813345160" />
                            </node>
                            <node concept="liA8E" id="U" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getConcept()" resolve="getConcept" />
                              <uo k="s:originTrace" v="n:8704404528813345160" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="O" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813345160" />
                            <node concept="37vLTw" id="V" role="2Oq$k0">
                              <ref role="3cqZAo" node="y" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813345160" />
                            </node>
                            <node concept="liA8E" id="W" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getLink()" resolve="getLink" />
                              <uo k="s:originTrace" v="n:8704404528813345160" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="E" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813345160" />
                    </node>
                    <node concept="3clFbJ" id="F" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813345160" />
                      <node concept="3clFbS" id="X" role="3clFbx">
                        <uo k="s:originTrace" v="n:8704404528813345160" />
                        <node concept="3clFbF" id="Z" role="3cqZAp">
                          <uo k="s:originTrace" v="n:8704404528813345160" />
                          <node concept="2OqwBi" id="10" role="3clFbG">
                            <uo k="s:originTrace" v="n:8704404528813345160" />
                            <node concept="37vLTw" id="11" role="2Oq$k0">
                              <ref role="3cqZAo" node="z" resolve="checkingNodeContext" />
                              <uo k="s:originTrace" v="n:8704404528813345160" />
                            </node>
                            <node concept="liA8E" id="12" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                              <uo k="s:originTrace" v="n:8704404528813345160" />
                              <node concept="1dyn4i" id="13" role="37wK5m">
                                <property role="1dyqJU" value="canBeChildBreakingPoint" />
                                <uo k="s:originTrace" v="n:8704404528813345160" />
                                <node concept="2ShNRf" id="14" role="1dyrYi">
                                  <uo k="s:originTrace" v="n:8704404528813345160" />
                                  <node concept="1pGfFk" id="15" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <uo k="s:originTrace" v="n:8704404528813345160" />
                                    <node concept="Xl_RD" id="16" role="37wK5m">
                                      <property role="Xl_RC" value="r:6142c5f6-2907-48aa-8a44-fb0a42c9cd30(RestaurantLanguage.constraints)" />
                                      <uo k="s:originTrace" v="n:8704404528813345160" />
                                    </node>
                                    <node concept="Xl_RD" id="17" role="37wK5m">
                                      <property role="Xl_RC" value="8704404528813345161" />
                                      <uo k="s:originTrace" v="n:8704404528813345160" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="Y" role="3clFbw">
                        <uo k="s:originTrace" v="n:8704404528813345160" />
                        <node concept="3y3z36" id="18" role="3uHU7w">
                          <uo k="s:originTrace" v="n:8704404528813345160" />
                          <node concept="10Nm6u" id="1a" role="3uHU7w">
                            <uo k="s:originTrace" v="n:8704404528813345160" />
                          </node>
                          <node concept="37vLTw" id="1b" role="3uHU7B">
                            <ref role="3cqZAo" node="z" resolve="checkingNodeContext" />
                            <uo k="s:originTrace" v="n:8704404528813345160" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="19" role="3uHU7B">
                          <uo k="s:originTrace" v="n:8704404528813345160" />
                          <node concept="37vLTw" id="1c" role="3fr31v">
                            <ref role="3cqZAo" node="I" resolve="result" />
                            <uo k="s:originTrace" v="n:8704404528813345160" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="G" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813345160" />
                    </node>
                    <node concept="3clFbF" id="H" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813345160" />
                      <node concept="37vLTw" id="1d" role="3clFbG">
                        <ref role="3cqZAo" node="I" resolve="result" />
                        <uo k="s:originTrace" v="n:8704404528813345160" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="t" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                  <uo k="s:originTrace" v="n:8704404528813345160" />
                </node>
                <node concept="3uibUv" id="u" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  <uo k="s:originTrace" v="n:8704404528813345160" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="k" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:8704404528813345160" />
      </node>
    </node>
    <node concept="2YIFZL" id="6" role="jymVt">
      <property role="TrG5h" value="staticCanBeAChild" />
      <uo k="s:originTrace" v="n:8704404528813345160" />
      <node concept="10P_77" id="1e" role="3clF45">
        <uo k="s:originTrace" v="n:8704404528813345160" />
      </node>
      <node concept="3Tm6S6" id="1f" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813345160" />
      </node>
      <node concept="3clFbS" id="1g" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813345162" />
        <node concept="3cpWs6" id="1l" role="3cqZAp">
          <uo k="s:originTrace" v="n:8704404528813346050" />
          <node concept="2OqwBi" id="1m" role="3cqZAk">
            <uo k="s:originTrace" v="n:8704404528813346704" />
            <node concept="37vLTw" id="1n" role="2Oq$k0">
              <ref role="3cqZAo" node="1i" resolve="parentNode" />
              <uo k="s:originTrace" v="n:8704404528813346120" />
            </node>
            <node concept="1mIQ4w" id="1o" role="2OqNvi">
              <uo k="s:originTrace" v="n:8704404528813348051" />
              <node concept="chp4Y" id="1p" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVNt5" resolve="Diagram" />
                <uo k="s:originTrace" v="n:8704404528813348211" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="1h" role="3clF46">
        <property role="TrG5h" value="node" />
        <uo k="s:originTrace" v="n:8704404528813345160" />
        <node concept="3uibUv" id="1q" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:8704404528813345160" />
        </node>
      </node>
      <node concept="37vLTG" id="1i" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <uo k="s:originTrace" v="n:8704404528813345160" />
        <node concept="3uibUv" id="1r" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:8704404528813345160" />
        </node>
      </node>
      <node concept="37vLTG" id="1j" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <uo k="s:originTrace" v="n:8704404528813345160" />
        <node concept="3uibUv" id="1s" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
          <uo k="s:originTrace" v="n:8704404528813345160" />
        </node>
      </node>
      <node concept="37vLTG" id="1k" role="3clF46">
        <property role="TrG5h" value="link" />
        <uo k="s:originTrace" v="n:8704404528813345160" />
        <node concept="3uibUv" id="1t" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
          <uo k="s:originTrace" v="n:8704404528813345160" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="1u">
    <property role="TrG5h" value="ConstraintsAspectDescriptor" />
    <property role="3GE5qa" value="Constraints" />
    <node concept="3uibUv" id="1v" role="1zkMxy">
      <ref role="3uigEE" to="ze1j:~BaseConstraintsAspectDescriptor" resolve="BaseConstraintsAspectDescriptor" />
    </node>
    <node concept="3Tm1VV" id="1w" role="1B3o_S" />
    <node concept="3clFbW" id="1x" role="jymVt">
      <node concept="3cqZAl" id="1$" role="3clF45" />
      <node concept="3Tm1VV" id="1_" role="1B3o_S" />
      <node concept="3clFbS" id="1A" role="3clF47" />
    </node>
    <node concept="2tJIrI" id="1y" role="jymVt" />
    <node concept="3clFb_" id="1z" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getConstraints" />
      <property role="DiZV1" value="false" />
      <node concept="2AHcQZ" id="1B" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
      </node>
      <node concept="3Tm1VV" id="1C" role="1B3o_S" />
      <node concept="3uibUv" id="1D" role="3clF45">
        <ref role="3uigEE" to="ze1j:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
      </node>
      <node concept="37vLTG" id="1E" role="3clF46">
        <property role="TrG5h" value="concept" />
        <node concept="3bZ5Sz" id="1G" role="1tU5fm" />
      </node>
      <node concept="3clFbS" id="1F" role="3clF47">
        <node concept="1_3QMa" id="1H" role="3cqZAp">
          <node concept="37vLTw" id="1J" role="1_3QMn">
            <ref role="3cqZAo" node="1E" resolve="concept" />
          </node>
          <node concept="1pnPoh" id="1K" role="1_3QMm">
            <node concept="3clFbS" id="1T" role="1pnPq1">
              <node concept="3cpWs6" id="1V" role="3cqZAp">
                <node concept="1nCR9W" id="1W" role="3cqZAk">
                  <property role="1nD$Q0" value="RestaurantLanguage.constraints.Restaurant_Constraints" />
                  <node concept="3uibUv" id="1X" role="2lIhxL">
                    <ref role="3uigEE" to="ze1j:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="1U" role="1pnPq6">
              <ref role="3gnhBz" to="7682:22wu4jVVOau" resolve="Restaurant" />
            </node>
          </node>
          <node concept="1pnPoh" id="1L" role="1_3QMm">
            <node concept="3clFbS" id="1Y" role="1pnPq1">
              <node concept="3cpWs6" id="20" role="3cqZAp">
                <node concept="1nCR9W" id="21" role="3cqZAk">
                  <property role="1nD$Q0" value="RestaurantLanguage.constraints.Owner_Constraints" />
                  <node concept="3uibUv" id="22" role="2lIhxL">
                    <ref role="3uigEE" to="ze1j:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="1Z" role="1pnPq6">
              <ref role="3gnhBz" to="7682:22wu4jVVMLz" resolve="Owner" />
            </node>
          </node>
          <node concept="1pnPoh" id="1M" role="1_3QMm">
            <node concept="3clFbS" id="23" role="1pnPq1">
              <node concept="3cpWs6" id="25" role="3cqZAp">
                <node concept="1nCR9W" id="26" role="3cqZAk">
                  <property role="1nD$Q0" value="RestaurantLanguage.constraints.Employee_Constraints" />
                  <node concept="3uibUv" id="27" role="2lIhxL">
                    <ref role="3uigEE" to="ze1j:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="24" role="1pnPq6">
              <ref role="3gnhBz" to="7682:22wu4jVVMLr" resolve="Employee" />
            </node>
          </node>
          <node concept="1pnPoh" id="1N" role="1_3QMm">
            <node concept="3clFbS" id="28" role="1pnPq1">
              <node concept="3cpWs6" id="2a" role="3cqZAp">
                <node concept="1nCR9W" id="2b" role="3cqZAk">
                  <property role="1nD$Q0" value="RestaurantLanguage.constraints.City_Constraints" />
                  <node concept="3uibUv" id="2c" role="2lIhxL">
                    <ref role="3uigEE" to="ze1j:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="29" role="1pnPq6">
              <ref role="3gnhBz" to="7682:22wu4jVVML0" resolve="City" />
            </node>
          </node>
          <node concept="1pnPoh" id="1O" role="1_3QMm">
            <node concept="3clFbS" id="2d" role="1pnPq1">
              <node concept="3cpWs6" id="2f" role="3cqZAp">
                <node concept="1nCR9W" id="2g" role="3cqZAk">
                  <property role="1nD$Q0" value="RestaurantLanguage.constraints.Region_Constraints" />
                  <node concept="3uibUv" id="2h" role="2lIhxL">
                    <ref role="3uigEE" to="ze1j:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="2e" role="1pnPq6">
              <ref role="3gnhBz" to="7682:22wu4jVVMKY" resolve="Region" />
            </node>
          </node>
          <node concept="1pnPoh" id="1P" role="1_3QMm">
            <node concept="3clFbS" id="2i" role="1pnPq1">
              <node concept="3cpWs6" id="2k" role="3cqZAp">
                <node concept="1nCR9W" id="2l" role="3cqZAk">
                  <property role="1nD$Q0" value="RestaurantLanguage.constraints.IRestaurantRelation_Constraints" />
                  <node concept="3uibUv" id="2m" role="2lIhxL">
                    <ref role="3uigEE" to="ze1j:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="2j" role="1pnPq6">
              <ref role="3gnhBz" to="7682:5avFOxqqSTS" resolve="IRestaurantRelation" />
            </node>
          </node>
          <node concept="1pnPoh" id="1Q" role="1_3QMm">
            <node concept="3clFbS" id="2n" role="1pnPq1">
              <node concept="3cpWs6" id="2p" role="3cqZAp">
                <node concept="1nCR9W" id="2q" role="3cqZAk">
                  <property role="1nD$Q0" value="RestaurantLanguage.constraints.RestaurantArea_Constraints" />
                  <node concept="3uibUv" id="2r" role="2lIhxL">
                    <ref role="3uigEE" to="ze1j:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="2o" role="1pnPq6">
              <ref role="3gnhBz" to="7682:22wu4jVVMLI" resolve="RestaurantArea" />
            </node>
          </node>
          <node concept="1pnPoh" id="1R" role="1_3QMm">
            <node concept="3clFbS" id="2s" role="1pnPq1">
              <node concept="3cpWs6" id="2u" role="3cqZAp">
                <node concept="1nCR9W" id="2v" role="3cqZAk">
                  <property role="1nD$Q0" value="RestaurantLanguage.constraints.Table_Constraints" />
                  <node concept="3uibUv" id="2w" role="2lIhxL">
                    <ref role="3uigEE" to="ze1j:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
                  </node>
                </node>
              </node>
            </node>
            <node concept="3gn64h" id="2t" role="1pnPq6">
              <ref role="3gnhBz" to="7682:22wu4jVVMLN" resolve="Table" />
            </node>
          </node>
          <node concept="3clFbS" id="1S" role="1prKM_" />
        </node>
        <node concept="3cpWs6" id="1I" role="3cqZAp">
          <node concept="2ShNRf" id="2x" role="3cqZAk">
            <node concept="1pGfFk" id="2y" role="2ShVmc">
              <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
              <node concept="37vLTw" id="2z" role="37wK5m">
                <ref role="3cqZAo" node="1E" resolve="concept" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="2$">
    <property role="TrG5h" value="Employee_Constraints" />
    <uo k="s:originTrace" v="n:8704404528813113133" />
    <node concept="3Tm1VV" id="2_" role="1B3o_S">
      <uo k="s:originTrace" v="n:8704404528813113133" />
    </node>
    <node concept="3uibUv" id="2A" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:8704404528813113133" />
    </node>
    <node concept="3clFbW" id="2B" role="jymVt">
      <uo k="s:originTrace" v="n:8704404528813113133" />
      <node concept="3cqZAl" id="2F" role="3clF45">
        <uo k="s:originTrace" v="n:8704404528813113133" />
      </node>
      <node concept="3clFbS" id="2G" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813113133" />
        <node concept="XkiVB" id="2I" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:8704404528813113133" />
          <node concept="1BaE9c" id="2J" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="Employee$75" />
            <uo k="s:originTrace" v="n:8704404528813113133" />
            <node concept="2YIFZM" id="2K" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:8704404528813113133" />
              <node concept="11gdke" id="2L" role="37wK5m">
                <property role="11gdj1" value="b104fc7d0eb94ddcL" />
                <uo k="s:originTrace" v="n:8704404528813113133" />
              </node>
              <node concept="11gdke" id="2M" role="37wK5m">
                <property role="11gdj1" value="828f1118413b5a6bL" />
                <uo k="s:originTrace" v="n:8704404528813113133" />
              </node>
              <node concept="11gdke" id="2N" role="37wK5m">
                <property role="11gdj1" value="20a07844fbef2c5bL" />
                <uo k="s:originTrace" v="n:8704404528813113133" />
              </node>
              <node concept="Xl_RD" id="2O" role="37wK5m">
                <property role="Xl_RC" value="RestaurantLanguage.structure.Employee" />
                <uo k="s:originTrace" v="n:8704404528813113133" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="2H" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813113133" />
      </node>
    </node>
    <node concept="2tJIrI" id="2C" role="jymVt">
      <uo k="s:originTrace" v="n:8704404528813113133" />
    </node>
    <node concept="3clFb_" id="2D" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeChildConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <uo k="s:originTrace" v="n:8704404528813113133" />
      <node concept="3Tmbuc" id="2P" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813113133" />
      </node>
      <node concept="3uibUv" id="2Q" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <uo k="s:originTrace" v="n:8704404528813113133" />
        <node concept="3uibUv" id="2T" role="11_B2D">
          <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
          <uo k="s:originTrace" v="n:8704404528813113133" />
        </node>
        <node concept="3uibUv" id="2U" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
          <uo k="s:originTrace" v="n:8704404528813113133" />
        </node>
      </node>
      <node concept="3clFbS" id="2R" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813113133" />
        <node concept="3clFbF" id="2V" role="3cqZAp">
          <uo k="s:originTrace" v="n:8704404528813113133" />
          <node concept="2ShNRf" id="2W" role="3clFbG">
            <uo k="s:originTrace" v="n:8704404528813113133" />
            <node concept="YeOm9" id="2X" role="2ShVmc">
              <uo k="s:originTrace" v="n:8704404528813113133" />
              <node concept="1Y3b0j" id="2Y" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <uo k="s:originTrace" v="n:8704404528813113133" />
                <node concept="3Tm1VV" id="2Z" role="1B3o_S">
                  <uo k="s:originTrace" v="n:8704404528813113133" />
                </node>
                <node concept="3clFb_" id="30" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <uo k="s:originTrace" v="n:8704404528813113133" />
                  <node concept="3Tm1VV" id="33" role="1B3o_S">
                    <uo k="s:originTrace" v="n:8704404528813113133" />
                  </node>
                  <node concept="2AHcQZ" id="34" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    <uo k="s:originTrace" v="n:8704404528813113133" />
                  </node>
                  <node concept="3uibUv" id="35" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                    <uo k="s:originTrace" v="n:8704404528813113133" />
                  </node>
                  <node concept="37vLTG" id="36" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <uo k="s:originTrace" v="n:8704404528813113133" />
                    <node concept="3uibUv" id="39" role="1tU5fm">
                      <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                      <uo k="s:originTrace" v="n:8704404528813113133" />
                    </node>
                    <node concept="2AHcQZ" id="3a" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                      <uo k="s:originTrace" v="n:8704404528813113133" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="37" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:8704404528813113133" />
                    <node concept="3uibUv" id="3b" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                      <uo k="s:originTrace" v="n:8704404528813113133" />
                    </node>
                    <node concept="2AHcQZ" id="3c" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      <uo k="s:originTrace" v="n:8704404528813113133" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="38" role="3clF47">
                    <uo k="s:originTrace" v="n:8704404528813113133" />
                    <node concept="3cpWs8" id="3d" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813113133" />
                      <node concept="3cpWsn" id="3i" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <uo k="s:originTrace" v="n:8704404528813113133" />
                        <node concept="10P_77" id="3j" role="1tU5fm">
                          <uo k="s:originTrace" v="n:8704404528813113133" />
                        </node>
                        <node concept="1rXfSq" id="3k" role="33vP2m">
                          <ref role="37wK5l" node="2E" resolve="staticCanBeAChild" />
                          <uo k="s:originTrace" v="n:8704404528813113133" />
                          <node concept="2OqwBi" id="3l" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813113133" />
                            <node concept="37vLTw" id="3p" role="2Oq$k0">
                              <ref role="3cqZAo" node="36" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813113133" />
                            </node>
                            <node concept="liA8E" id="3q" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getNode()" resolve="getNode" />
                              <uo k="s:originTrace" v="n:8704404528813113133" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="3m" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813113133" />
                            <node concept="37vLTw" id="3r" role="2Oq$k0">
                              <ref role="3cqZAo" node="36" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813113133" />
                            </node>
                            <node concept="liA8E" id="3s" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getParentNode()" resolve="getParentNode" />
                              <uo k="s:originTrace" v="n:8704404528813113133" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="3n" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813113133" />
                            <node concept="37vLTw" id="3t" role="2Oq$k0">
                              <ref role="3cqZAo" node="36" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813113133" />
                            </node>
                            <node concept="liA8E" id="3u" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getConcept()" resolve="getConcept" />
                              <uo k="s:originTrace" v="n:8704404528813113133" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="3o" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813113133" />
                            <node concept="37vLTw" id="3v" role="2Oq$k0">
                              <ref role="3cqZAo" node="36" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813113133" />
                            </node>
                            <node concept="liA8E" id="3w" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getLink()" resolve="getLink" />
                              <uo k="s:originTrace" v="n:8704404528813113133" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="3e" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813113133" />
                    </node>
                    <node concept="3clFbJ" id="3f" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813113133" />
                      <node concept="3clFbS" id="3x" role="3clFbx">
                        <uo k="s:originTrace" v="n:8704404528813113133" />
                        <node concept="3clFbF" id="3z" role="3cqZAp">
                          <uo k="s:originTrace" v="n:8704404528813113133" />
                          <node concept="2OqwBi" id="3$" role="3clFbG">
                            <uo k="s:originTrace" v="n:8704404528813113133" />
                            <node concept="37vLTw" id="3_" role="2Oq$k0">
                              <ref role="3cqZAo" node="37" resolve="checkingNodeContext" />
                              <uo k="s:originTrace" v="n:8704404528813113133" />
                            </node>
                            <node concept="liA8E" id="3A" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                              <uo k="s:originTrace" v="n:8704404528813113133" />
                              <node concept="1dyn4i" id="3B" role="37wK5m">
                                <property role="1dyqJU" value="canBeChildBreakingPoint" />
                                <uo k="s:originTrace" v="n:8704404528813113133" />
                                <node concept="2ShNRf" id="3C" role="1dyrYi">
                                  <uo k="s:originTrace" v="n:8704404528813113133" />
                                  <node concept="1pGfFk" id="3D" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <uo k="s:originTrace" v="n:8704404528813113133" />
                                    <node concept="Xl_RD" id="3E" role="37wK5m">
                                      <property role="Xl_RC" value="r:6142c5f6-2907-48aa-8a44-fb0a42c9cd30(RestaurantLanguage.constraints)" />
                                      <uo k="s:originTrace" v="n:8704404528813113133" />
                                    </node>
                                    <node concept="Xl_RD" id="3F" role="37wK5m">
                                      <property role="Xl_RC" value="8704404528813113134" />
                                      <uo k="s:originTrace" v="n:8704404528813113133" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="3y" role="3clFbw">
                        <uo k="s:originTrace" v="n:8704404528813113133" />
                        <node concept="3y3z36" id="3G" role="3uHU7w">
                          <uo k="s:originTrace" v="n:8704404528813113133" />
                          <node concept="10Nm6u" id="3I" role="3uHU7w">
                            <uo k="s:originTrace" v="n:8704404528813113133" />
                          </node>
                          <node concept="37vLTw" id="3J" role="3uHU7B">
                            <ref role="3cqZAo" node="37" resolve="checkingNodeContext" />
                            <uo k="s:originTrace" v="n:8704404528813113133" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="3H" role="3uHU7B">
                          <uo k="s:originTrace" v="n:8704404528813113133" />
                          <node concept="37vLTw" id="3K" role="3fr31v">
                            <ref role="3cqZAo" node="3i" resolve="result" />
                            <uo k="s:originTrace" v="n:8704404528813113133" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="3g" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813113133" />
                    </node>
                    <node concept="3clFbF" id="3h" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813113133" />
                      <node concept="37vLTw" id="3L" role="3clFbG">
                        <ref role="3cqZAo" node="3i" resolve="result" />
                        <uo k="s:originTrace" v="n:8704404528813113133" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="31" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                  <uo k="s:originTrace" v="n:8704404528813113133" />
                </node>
                <node concept="3uibUv" id="32" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  <uo k="s:originTrace" v="n:8704404528813113133" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="2S" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:8704404528813113133" />
      </node>
    </node>
    <node concept="2YIFZL" id="2E" role="jymVt">
      <property role="TrG5h" value="staticCanBeAChild" />
      <uo k="s:originTrace" v="n:8704404528813113133" />
      <node concept="10P_77" id="3M" role="3clF45">
        <uo k="s:originTrace" v="n:8704404528813113133" />
      </node>
      <node concept="3Tm6S6" id="3N" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813113133" />
      </node>
      <node concept="3clFbS" id="3O" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813113135" />
        <node concept="3cpWs6" id="3T" role="3cqZAp">
          <uo k="s:originTrace" v="n:8704404528813116019" />
          <node concept="2OqwBi" id="3U" role="3cqZAk">
            <uo k="s:originTrace" v="n:8704404528813116673" />
            <node concept="37vLTw" id="3V" role="2Oq$k0">
              <ref role="3cqZAo" node="3Q" resolve="parentNode" />
              <uo k="s:originTrace" v="n:8704404528813116089" />
            </node>
            <node concept="1mIQ4w" id="3W" role="2OqNvi">
              <uo k="s:originTrace" v="n:8704404528813117184" />
              <node concept="chp4Y" id="3X" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVNt5" resolve="Diagram" />
                <uo k="s:originTrace" v="n:8704404528813117344" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="3P" role="3clF46">
        <property role="TrG5h" value="node" />
        <uo k="s:originTrace" v="n:8704404528813113133" />
        <node concept="3uibUv" id="3Y" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:8704404528813113133" />
        </node>
      </node>
      <node concept="37vLTG" id="3Q" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <uo k="s:originTrace" v="n:8704404528813113133" />
        <node concept="3uibUv" id="3Z" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:8704404528813113133" />
        </node>
      </node>
      <node concept="37vLTG" id="3R" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <uo k="s:originTrace" v="n:8704404528813113133" />
        <node concept="3uibUv" id="40" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
          <uo k="s:originTrace" v="n:8704404528813113133" />
        </node>
      </node>
      <node concept="37vLTG" id="3S" role="3clF46">
        <property role="TrG5h" value="link" />
        <uo k="s:originTrace" v="n:8704404528813113133" />
        <node concept="3uibUv" id="41" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
          <uo k="s:originTrace" v="n:8704404528813113133" />
        </node>
      </node>
    </node>
  </node>
  <node concept="39dXUE" id="42">
    <node concept="39e2AJ" id="43" role="39e2AI">
      <property role="39e3Y2" value="constraintClass" />
      <node concept="39e2AG" id="45" role="39e3Y0">
        <ref role="39e2AK" to="9xly:7zcgsOhe8A8" resolve="City_Constraints" />
        <node concept="385nmt" id="4d" role="385vvn">
          <property role="385vuF" value="City_Constraints" />
          <node concept="3u3nmq" id="4f" role="385v07">
            <property role="3u3nmv" value="8704404528813345160" />
          </node>
        </node>
        <node concept="39e2AT" id="4e" role="39e2AY">
          <ref role="39e2AS" node="0" resolve="City_Constraints" />
        </node>
      </node>
      <node concept="39e2AG" id="46" role="39e3Y0">
        <ref role="39e2AK" to="9xly:7zcgsOhdfWH" resolve="Employee_Constraints" />
        <node concept="385nmt" id="4g" role="385vvn">
          <property role="385vuF" value="Employee_Constraints" />
          <node concept="3u3nmq" id="4i" role="385v07">
            <property role="3u3nmv" value="8704404528813113133" />
          </node>
        </node>
        <node concept="39e2AT" id="4h" role="39e2AY">
          <ref role="39e2AS" node="2$" resolve="Employee_Constraints" />
        </node>
      </node>
      <node concept="39e2AG" id="47" role="39e3Y0">
        <ref role="39e2AK" to="9xly:5avFOxqqSTT" resolve="IRestaurantRelation_Constraints" />
        <node concept="385nmt" id="4j" role="385vvn">
          <property role="385vuF" value="IRestaurantRelation_Constraints" />
          <node concept="3u3nmq" id="4l" role="385v07">
            <property role="3u3nmv" value="5953669957696589433" />
          </node>
        </node>
        <node concept="39e2AT" id="4k" role="39e2AY">
          <ref role="39e2AS" node="4B" resolve="IRestaurantRelation_Constraints" />
        </node>
      </node>
      <node concept="39e2AG" id="48" role="39e3Y0">
        <ref role="39e2AK" to="9xly:7zcgsOhdeXY" resolve="Owner_Constraints" />
        <node concept="385nmt" id="4m" role="385vvn">
          <property role="385vuF" value="Owner_Constraints" />
          <node concept="3u3nmq" id="4o" role="385v07">
            <property role="3u3nmv" value="8704404528813109118" />
          </node>
        </node>
        <node concept="39e2AT" id="4n" role="39e2AY">
          <ref role="39e2AS" node="65" resolve="Owner_Constraints" />
        </node>
      </node>
      <node concept="39e2AG" id="49" role="39e3Y0">
        <ref role="39e2AK" to="9xly:7zcgsOhe9pj" resolve="Region_Constraints" />
        <node concept="385nmt" id="4p" role="385vvn">
          <property role="385vuF" value="Region_Constraints" />
          <node concept="3u3nmq" id="4r" role="385v07">
            <property role="3u3nmv" value="8704404528813348435" />
          </node>
        </node>
        <node concept="39e2AT" id="4q" role="39e2AY">
          <ref role="39e2AS" node="7z" resolve="Region_Constraints" />
        </node>
      </node>
      <node concept="39e2AG" id="4a" role="39e3Y0">
        <ref role="39e2AK" to="9xly:5avFOxqqYt5" resolve="RestaurantArea_Constraints" />
        <node concept="385nmt" id="4s" role="385vvn">
          <property role="385vuF" value="RestaurantArea_Constraints" />
          <node concept="3u3nmq" id="4u" role="385v07">
            <property role="3u3nmv" value="5953669957696612165" />
          </node>
        </node>
        <node concept="39e2AT" id="4t" role="39e2AY">
          <ref role="39e2AS" node="91" resolve="RestaurantArea_Constraints" />
        </node>
      </node>
      <node concept="39e2AG" id="4b" role="39e3Y0">
        <ref role="39e2AK" to="9xly:7zcgsOhd3a9" resolve="Restaurant_Constraints" />
        <node concept="385nmt" id="4v" role="385vvn">
          <property role="385vuF" value="Restaurant_Constraints" />
          <node concept="3u3nmq" id="4x" role="385v07">
            <property role="3u3nmv" value="8704404528813060745" />
          </node>
        </node>
        <node concept="39e2AT" id="4w" role="39e2AY">
          <ref role="39e2AS" node="av" resolve="Restaurant_Constraints" />
        </node>
      </node>
      <node concept="39e2AG" id="4c" role="39e3Y0">
        <ref role="39e2AK" to="9xly:5avFOxqqZeK" resolve="Table_Constraints" />
        <node concept="385nmt" id="4y" role="385vvn">
          <property role="385vuF" value="Table_Constraints" />
          <node concept="3u3nmq" id="4$" role="385v07">
            <property role="3u3nmv" value="5953669957696615344" />
          </node>
        </node>
        <node concept="39e2AT" id="4z" role="39e2AY">
          <ref role="39e2AS" node="bX" resolve="Table_Constraints" />
        </node>
      </node>
    </node>
    <node concept="39e2AJ" id="44" role="39e2AI">
      <property role="39e3Y2" value="aspectDescriptorClass" />
      <node concept="39e2AG" id="4_" role="39e3Y0">
        <property role="2mV_xN" value="true" />
        <node concept="39e2AT" id="4A" role="39e2AY">
          <ref role="39e2AS" node="1u" resolve="ConstraintsAspectDescriptor" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="4B">
    <property role="TrG5h" value="IRestaurantRelation_Constraints" />
    <uo k="s:originTrace" v="n:5953669957696589433" />
    <node concept="3Tm1VV" id="4C" role="1B3o_S">
      <uo k="s:originTrace" v="n:5953669957696589433" />
    </node>
    <node concept="3uibUv" id="4D" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:5953669957696589433" />
    </node>
    <node concept="3clFbW" id="4E" role="jymVt">
      <uo k="s:originTrace" v="n:5953669957696589433" />
      <node concept="3cqZAl" id="4I" role="3clF45">
        <uo k="s:originTrace" v="n:5953669957696589433" />
      </node>
      <node concept="3clFbS" id="4J" role="3clF47">
        <uo k="s:originTrace" v="n:5953669957696589433" />
        <node concept="XkiVB" id="4L" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:5953669957696589433" />
          <node concept="1BaE9c" id="4M" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="IRestaurantRelation$2S" />
            <uo k="s:originTrace" v="n:5953669957696589433" />
            <node concept="2YIFZM" id="4N" role="1Bazha">
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getInterfaceConcept(long,long,long,java.lang.String)" resolve="getInterfaceConcept" />
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <uo k="s:originTrace" v="n:5953669957696589433" />
              <node concept="11gdke" id="4O" role="37wK5m">
                <property role="11gdj1" value="b104fc7d0eb94ddcL" />
                <uo k="s:originTrace" v="n:5953669957696589433" />
              </node>
              <node concept="11gdke" id="4P" role="37wK5m">
                <property role="11gdj1" value="828f1118413b5a6bL" />
                <uo k="s:originTrace" v="n:5953669957696589433" />
              </node>
              <node concept="11gdke" id="4Q" role="37wK5m">
                <property role="11gdj1" value="529faf485a6b8e78L" />
                <uo k="s:originTrace" v="n:5953669957696589433" />
              </node>
              <node concept="Xl_RD" id="4R" role="37wK5m">
                <property role="Xl_RC" value="RestaurantLanguage.structure.IRestaurantRelation" />
                <uo k="s:originTrace" v="n:5953669957696589433" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="4K" role="1B3o_S">
        <uo k="s:originTrace" v="n:5953669957696589433" />
      </node>
    </node>
    <node concept="2tJIrI" id="4F" role="jymVt">
      <uo k="s:originTrace" v="n:5953669957696589433" />
    </node>
    <node concept="3clFb_" id="4G" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeChildConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <uo k="s:originTrace" v="n:5953669957696589433" />
      <node concept="3Tmbuc" id="4S" role="1B3o_S">
        <uo k="s:originTrace" v="n:5953669957696589433" />
      </node>
      <node concept="3uibUv" id="4T" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <uo k="s:originTrace" v="n:5953669957696589433" />
        <node concept="3uibUv" id="4W" role="11_B2D">
          <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
          <uo k="s:originTrace" v="n:5953669957696589433" />
        </node>
        <node concept="3uibUv" id="4X" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
          <uo k="s:originTrace" v="n:5953669957696589433" />
        </node>
      </node>
      <node concept="3clFbS" id="4U" role="3clF47">
        <uo k="s:originTrace" v="n:5953669957696589433" />
        <node concept="3clFbF" id="4Y" role="3cqZAp">
          <uo k="s:originTrace" v="n:5953669957696589433" />
          <node concept="2ShNRf" id="4Z" role="3clFbG">
            <uo k="s:originTrace" v="n:5953669957696589433" />
            <node concept="YeOm9" id="50" role="2ShVmc">
              <uo k="s:originTrace" v="n:5953669957696589433" />
              <node concept="1Y3b0j" id="51" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <uo k="s:originTrace" v="n:5953669957696589433" />
                <node concept="3Tm1VV" id="52" role="1B3o_S">
                  <uo k="s:originTrace" v="n:5953669957696589433" />
                </node>
                <node concept="3clFb_" id="53" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <uo k="s:originTrace" v="n:5953669957696589433" />
                  <node concept="3Tm1VV" id="56" role="1B3o_S">
                    <uo k="s:originTrace" v="n:5953669957696589433" />
                  </node>
                  <node concept="2AHcQZ" id="57" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    <uo k="s:originTrace" v="n:5953669957696589433" />
                  </node>
                  <node concept="3uibUv" id="58" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                    <uo k="s:originTrace" v="n:5953669957696589433" />
                  </node>
                  <node concept="37vLTG" id="59" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <uo k="s:originTrace" v="n:5953669957696589433" />
                    <node concept="3uibUv" id="5c" role="1tU5fm">
                      <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                      <uo k="s:originTrace" v="n:5953669957696589433" />
                    </node>
                    <node concept="2AHcQZ" id="5d" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                      <uo k="s:originTrace" v="n:5953669957696589433" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="5a" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:5953669957696589433" />
                    <node concept="3uibUv" id="5e" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                      <uo k="s:originTrace" v="n:5953669957696589433" />
                    </node>
                    <node concept="2AHcQZ" id="5f" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      <uo k="s:originTrace" v="n:5953669957696589433" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="5b" role="3clF47">
                    <uo k="s:originTrace" v="n:5953669957696589433" />
                    <node concept="3cpWs8" id="5g" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696589433" />
                      <node concept="3cpWsn" id="5l" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <uo k="s:originTrace" v="n:5953669957696589433" />
                        <node concept="10P_77" id="5m" role="1tU5fm">
                          <uo k="s:originTrace" v="n:5953669957696589433" />
                        </node>
                        <node concept="1rXfSq" id="5n" role="33vP2m">
                          <ref role="37wK5l" node="4H" resolve="staticCanBeAChild" />
                          <uo k="s:originTrace" v="n:5953669957696589433" />
                          <node concept="2OqwBi" id="5o" role="37wK5m">
                            <uo k="s:originTrace" v="n:5953669957696589433" />
                            <node concept="37vLTw" id="5s" role="2Oq$k0">
                              <ref role="3cqZAo" node="59" resolve="context" />
                              <uo k="s:originTrace" v="n:5953669957696589433" />
                            </node>
                            <node concept="liA8E" id="5t" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getNode()" resolve="getNode" />
                              <uo k="s:originTrace" v="n:5953669957696589433" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="5p" role="37wK5m">
                            <uo k="s:originTrace" v="n:5953669957696589433" />
                            <node concept="37vLTw" id="5u" role="2Oq$k0">
                              <ref role="3cqZAo" node="59" resolve="context" />
                              <uo k="s:originTrace" v="n:5953669957696589433" />
                            </node>
                            <node concept="liA8E" id="5v" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getParentNode()" resolve="getParentNode" />
                              <uo k="s:originTrace" v="n:5953669957696589433" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="5q" role="37wK5m">
                            <uo k="s:originTrace" v="n:5953669957696589433" />
                            <node concept="37vLTw" id="5w" role="2Oq$k0">
                              <ref role="3cqZAo" node="59" resolve="context" />
                              <uo k="s:originTrace" v="n:5953669957696589433" />
                            </node>
                            <node concept="liA8E" id="5x" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getConcept()" resolve="getConcept" />
                              <uo k="s:originTrace" v="n:5953669957696589433" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="5r" role="37wK5m">
                            <uo k="s:originTrace" v="n:5953669957696589433" />
                            <node concept="37vLTw" id="5y" role="2Oq$k0">
                              <ref role="3cqZAo" node="59" resolve="context" />
                              <uo k="s:originTrace" v="n:5953669957696589433" />
                            </node>
                            <node concept="liA8E" id="5z" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getLink()" resolve="getLink" />
                              <uo k="s:originTrace" v="n:5953669957696589433" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="5h" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696589433" />
                    </node>
                    <node concept="3clFbJ" id="5i" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696589433" />
                      <node concept="3clFbS" id="5$" role="3clFbx">
                        <uo k="s:originTrace" v="n:5953669957696589433" />
                        <node concept="3clFbF" id="5A" role="3cqZAp">
                          <uo k="s:originTrace" v="n:5953669957696589433" />
                          <node concept="2OqwBi" id="5B" role="3clFbG">
                            <uo k="s:originTrace" v="n:5953669957696589433" />
                            <node concept="37vLTw" id="5C" role="2Oq$k0">
                              <ref role="3cqZAo" node="5a" resolve="checkingNodeContext" />
                              <uo k="s:originTrace" v="n:5953669957696589433" />
                            </node>
                            <node concept="liA8E" id="5D" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                              <uo k="s:originTrace" v="n:5953669957696589433" />
                              <node concept="1dyn4i" id="5E" role="37wK5m">
                                <property role="1dyqJU" value="canBeChildBreakingPoint" />
                                <uo k="s:originTrace" v="n:5953669957696589433" />
                                <node concept="2ShNRf" id="5F" role="1dyrYi">
                                  <uo k="s:originTrace" v="n:5953669957696589433" />
                                  <node concept="1pGfFk" id="5G" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <uo k="s:originTrace" v="n:5953669957696589433" />
                                    <node concept="Xl_RD" id="5H" role="37wK5m">
                                      <property role="Xl_RC" value="r:6142c5f6-2907-48aa-8a44-fb0a42c9cd30(RestaurantLanguage.constraints)" />
                                      <uo k="s:originTrace" v="n:5953669957696589433" />
                                    </node>
                                    <node concept="Xl_RD" id="5I" role="37wK5m">
                                      <property role="Xl_RC" value="5953669957696589434" />
                                      <uo k="s:originTrace" v="n:5953669957696589433" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="5_" role="3clFbw">
                        <uo k="s:originTrace" v="n:5953669957696589433" />
                        <node concept="3y3z36" id="5J" role="3uHU7w">
                          <uo k="s:originTrace" v="n:5953669957696589433" />
                          <node concept="10Nm6u" id="5L" role="3uHU7w">
                            <uo k="s:originTrace" v="n:5953669957696589433" />
                          </node>
                          <node concept="37vLTw" id="5M" role="3uHU7B">
                            <ref role="3cqZAo" node="5a" resolve="checkingNodeContext" />
                            <uo k="s:originTrace" v="n:5953669957696589433" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="5K" role="3uHU7B">
                          <uo k="s:originTrace" v="n:5953669957696589433" />
                          <node concept="37vLTw" id="5N" role="3fr31v">
                            <ref role="3cqZAo" node="5l" resolve="result" />
                            <uo k="s:originTrace" v="n:5953669957696589433" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="5j" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696589433" />
                    </node>
                    <node concept="3clFbF" id="5k" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696589433" />
                      <node concept="37vLTw" id="5O" role="3clFbG">
                        <ref role="3cqZAo" node="5l" resolve="result" />
                        <uo k="s:originTrace" v="n:5953669957696589433" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="54" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                  <uo k="s:originTrace" v="n:5953669957696589433" />
                </node>
                <node concept="3uibUv" id="55" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  <uo k="s:originTrace" v="n:5953669957696589433" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="4V" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:5953669957696589433" />
      </node>
    </node>
    <node concept="2YIFZL" id="4H" role="jymVt">
      <property role="TrG5h" value="staticCanBeAChild" />
      <uo k="s:originTrace" v="n:5953669957696589433" />
      <node concept="10P_77" id="5P" role="3clF45">
        <uo k="s:originTrace" v="n:5953669957696589433" />
      </node>
      <node concept="3Tm6S6" id="5Q" role="1B3o_S">
        <uo k="s:originTrace" v="n:5953669957696589433" />
      </node>
      <node concept="3clFbS" id="5R" role="3clF47">
        <uo k="s:originTrace" v="n:5953669957696589435" />
        <node concept="3cpWs6" id="5W" role="3cqZAp">
          <uo k="s:originTrace" v="n:5953669957696593261" />
          <node concept="2OqwBi" id="5X" role="3cqZAk">
            <uo k="s:originTrace" v="n:5953669957696591825" />
            <node concept="37vLTw" id="5Y" role="2Oq$k0">
              <ref role="3cqZAo" node="5T" resolve="parentNode" />
              <uo k="s:originTrace" v="n:5953669957696590317" />
            </node>
            <node concept="1mIQ4w" id="5Z" role="2OqNvi">
              <uo k="s:originTrace" v="n:5953669957696592861" />
              <node concept="chp4Y" id="60" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVOau" resolve="Restaurant" />
                <uo k="s:originTrace" v="n:5953669957696593021" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="5S" role="3clF46">
        <property role="TrG5h" value="node" />
        <uo k="s:originTrace" v="n:5953669957696589433" />
        <node concept="3uibUv" id="61" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:5953669957696589433" />
        </node>
      </node>
      <node concept="37vLTG" id="5T" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <uo k="s:originTrace" v="n:5953669957696589433" />
        <node concept="3uibUv" id="62" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:5953669957696589433" />
        </node>
      </node>
      <node concept="37vLTG" id="5U" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <uo k="s:originTrace" v="n:5953669957696589433" />
        <node concept="3uibUv" id="63" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
          <uo k="s:originTrace" v="n:5953669957696589433" />
        </node>
      </node>
      <node concept="37vLTG" id="5V" role="3clF46">
        <property role="TrG5h" value="link" />
        <uo k="s:originTrace" v="n:5953669957696589433" />
        <node concept="3uibUv" id="64" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
          <uo k="s:originTrace" v="n:5953669957696589433" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="65">
    <property role="TrG5h" value="Owner_Constraints" />
    <uo k="s:originTrace" v="n:8704404528813109118" />
    <node concept="3Tm1VV" id="66" role="1B3o_S">
      <uo k="s:originTrace" v="n:8704404528813109118" />
    </node>
    <node concept="3uibUv" id="67" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:8704404528813109118" />
    </node>
    <node concept="3clFbW" id="68" role="jymVt">
      <uo k="s:originTrace" v="n:8704404528813109118" />
      <node concept="3cqZAl" id="6c" role="3clF45">
        <uo k="s:originTrace" v="n:8704404528813109118" />
      </node>
      <node concept="3clFbS" id="6d" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813109118" />
        <node concept="XkiVB" id="6f" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:8704404528813109118" />
          <node concept="1BaE9c" id="6g" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="Owner$l8" />
            <uo k="s:originTrace" v="n:8704404528813109118" />
            <node concept="2YIFZM" id="6h" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:8704404528813109118" />
              <node concept="11gdke" id="6i" role="37wK5m">
                <property role="11gdj1" value="b104fc7d0eb94ddcL" />
                <uo k="s:originTrace" v="n:8704404528813109118" />
              </node>
              <node concept="11gdke" id="6j" role="37wK5m">
                <property role="11gdj1" value="828f1118413b5a6bL" />
                <uo k="s:originTrace" v="n:8704404528813109118" />
              </node>
              <node concept="11gdke" id="6k" role="37wK5m">
                <property role="11gdj1" value="20a07844fbef2c63L" />
                <uo k="s:originTrace" v="n:8704404528813109118" />
              </node>
              <node concept="Xl_RD" id="6l" role="37wK5m">
                <property role="Xl_RC" value="RestaurantLanguage.structure.Owner" />
                <uo k="s:originTrace" v="n:8704404528813109118" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="6e" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813109118" />
      </node>
    </node>
    <node concept="2tJIrI" id="69" role="jymVt">
      <uo k="s:originTrace" v="n:8704404528813109118" />
    </node>
    <node concept="3clFb_" id="6a" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeChildConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <uo k="s:originTrace" v="n:8704404528813109118" />
      <node concept="3Tmbuc" id="6m" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813109118" />
      </node>
      <node concept="3uibUv" id="6n" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <uo k="s:originTrace" v="n:8704404528813109118" />
        <node concept="3uibUv" id="6q" role="11_B2D">
          <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
          <uo k="s:originTrace" v="n:8704404528813109118" />
        </node>
        <node concept="3uibUv" id="6r" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
          <uo k="s:originTrace" v="n:8704404528813109118" />
        </node>
      </node>
      <node concept="3clFbS" id="6o" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813109118" />
        <node concept="3clFbF" id="6s" role="3cqZAp">
          <uo k="s:originTrace" v="n:8704404528813109118" />
          <node concept="2ShNRf" id="6t" role="3clFbG">
            <uo k="s:originTrace" v="n:8704404528813109118" />
            <node concept="YeOm9" id="6u" role="2ShVmc">
              <uo k="s:originTrace" v="n:8704404528813109118" />
              <node concept="1Y3b0j" id="6v" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <uo k="s:originTrace" v="n:8704404528813109118" />
                <node concept="3Tm1VV" id="6w" role="1B3o_S">
                  <uo k="s:originTrace" v="n:8704404528813109118" />
                </node>
                <node concept="3clFb_" id="6x" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <uo k="s:originTrace" v="n:8704404528813109118" />
                  <node concept="3Tm1VV" id="6$" role="1B3o_S">
                    <uo k="s:originTrace" v="n:8704404528813109118" />
                  </node>
                  <node concept="2AHcQZ" id="6_" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    <uo k="s:originTrace" v="n:8704404528813109118" />
                  </node>
                  <node concept="3uibUv" id="6A" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                    <uo k="s:originTrace" v="n:8704404528813109118" />
                  </node>
                  <node concept="37vLTG" id="6B" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <uo k="s:originTrace" v="n:8704404528813109118" />
                    <node concept="3uibUv" id="6E" role="1tU5fm">
                      <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                      <uo k="s:originTrace" v="n:8704404528813109118" />
                    </node>
                    <node concept="2AHcQZ" id="6F" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                      <uo k="s:originTrace" v="n:8704404528813109118" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="6C" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:8704404528813109118" />
                    <node concept="3uibUv" id="6G" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                      <uo k="s:originTrace" v="n:8704404528813109118" />
                    </node>
                    <node concept="2AHcQZ" id="6H" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      <uo k="s:originTrace" v="n:8704404528813109118" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="6D" role="3clF47">
                    <uo k="s:originTrace" v="n:8704404528813109118" />
                    <node concept="3cpWs8" id="6I" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813109118" />
                      <node concept="3cpWsn" id="6N" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <uo k="s:originTrace" v="n:8704404528813109118" />
                        <node concept="10P_77" id="6O" role="1tU5fm">
                          <uo k="s:originTrace" v="n:8704404528813109118" />
                        </node>
                        <node concept="1rXfSq" id="6P" role="33vP2m">
                          <ref role="37wK5l" node="6b" resolve="staticCanBeAChild" />
                          <uo k="s:originTrace" v="n:8704404528813109118" />
                          <node concept="2OqwBi" id="6Q" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813109118" />
                            <node concept="37vLTw" id="6U" role="2Oq$k0">
                              <ref role="3cqZAo" node="6B" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813109118" />
                            </node>
                            <node concept="liA8E" id="6V" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getNode()" resolve="getNode" />
                              <uo k="s:originTrace" v="n:8704404528813109118" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="6R" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813109118" />
                            <node concept="37vLTw" id="6W" role="2Oq$k0">
                              <ref role="3cqZAo" node="6B" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813109118" />
                            </node>
                            <node concept="liA8E" id="6X" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getParentNode()" resolve="getParentNode" />
                              <uo k="s:originTrace" v="n:8704404528813109118" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="6S" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813109118" />
                            <node concept="37vLTw" id="6Y" role="2Oq$k0">
                              <ref role="3cqZAo" node="6B" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813109118" />
                            </node>
                            <node concept="liA8E" id="6Z" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getConcept()" resolve="getConcept" />
                              <uo k="s:originTrace" v="n:8704404528813109118" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="6T" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813109118" />
                            <node concept="37vLTw" id="70" role="2Oq$k0">
                              <ref role="3cqZAo" node="6B" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813109118" />
                            </node>
                            <node concept="liA8E" id="71" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getLink()" resolve="getLink" />
                              <uo k="s:originTrace" v="n:8704404528813109118" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="6J" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813109118" />
                    </node>
                    <node concept="3clFbJ" id="6K" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813109118" />
                      <node concept="3clFbS" id="72" role="3clFbx">
                        <uo k="s:originTrace" v="n:8704404528813109118" />
                        <node concept="3clFbF" id="74" role="3cqZAp">
                          <uo k="s:originTrace" v="n:8704404528813109118" />
                          <node concept="2OqwBi" id="75" role="3clFbG">
                            <uo k="s:originTrace" v="n:8704404528813109118" />
                            <node concept="37vLTw" id="76" role="2Oq$k0">
                              <ref role="3cqZAo" node="6C" resolve="checkingNodeContext" />
                              <uo k="s:originTrace" v="n:8704404528813109118" />
                            </node>
                            <node concept="liA8E" id="77" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                              <uo k="s:originTrace" v="n:8704404528813109118" />
                              <node concept="1dyn4i" id="78" role="37wK5m">
                                <property role="1dyqJU" value="canBeChildBreakingPoint" />
                                <uo k="s:originTrace" v="n:8704404528813109118" />
                                <node concept="2ShNRf" id="79" role="1dyrYi">
                                  <uo k="s:originTrace" v="n:8704404528813109118" />
                                  <node concept="1pGfFk" id="7a" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <uo k="s:originTrace" v="n:8704404528813109118" />
                                    <node concept="Xl_RD" id="7b" role="37wK5m">
                                      <property role="Xl_RC" value="r:6142c5f6-2907-48aa-8a44-fb0a42c9cd30(RestaurantLanguage.constraints)" />
                                      <uo k="s:originTrace" v="n:8704404528813109118" />
                                    </node>
                                    <node concept="Xl_RD" id="7c" role="37wK5m">
                                      <property role="Xl_RC" value="8704404528813109119" />
                                      <uo k="s:originTrace" v="n:8704404528813109118" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="73" role="3clFbw">
                        <uo k="s:originTrace" v="n:8704404528813109118" />
                        <node concept="3y3z36" id="7d" role="3uHU7w">
                          <uo k="s:originTrace" v="n:8704404528813109118" />
                          <node concept="10Nm6u" id="7f" role="3uHU7w">
                            <uo k="s:originTrace" v="n:8704404528813109118" />
                          </node>
                          <node concept="37vLTw" id="7g" role="3uHU7B">
                            <ref role="3cqZAo" node="6C" resolve="checkingNodeContext" />
                            <uo k="s:originTrace" v="n:8704404528813109118" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="7e" role="3uHU7B">
                          <uo k="s:originTrace" v="n:8704404528813109118" />
                          <node concept="37vLTw" id="7h" role="3fr31v">
                            <ref role="3cqZAo" node="6N" resolve="result" />
                            <uo k="s:originTrace" v="n:8704404528813109118" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="6L" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813109118" />
                    </node>
                    <node concept="3clFbF" id="6M" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813109118" />
                      <node concept="37vLTw" id="7i" role="3clFbG">
                        <ref role="3cqZAo" node="6N" resolve="result" />
                        <uo k="s:originTrace" v="n:8704404528813109118" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="6y" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                  <uo k="s:originTrace" v="n:8704404528813109118" />
                </node>
                <node concept="3uibUv" id="6z" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  <uo k="s:originTrace" v="n:8704404528813109118" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="6p" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:8704404528813109118" />
      </node>
    </node>
    <node concept="2YIFZL" id="6b" role="jymVt">
      <property role="TrG5h" value="staticCanBeAChild" />
      <uo k="s:originTrace" v="n:8704404528813109118" />
      <node concept="10P_77" id="7j" role="3clF45">
        <uo k="s:originTrace" v="n:8704404528813109118" />
      </node>
      <node concept="3Tm6S6" id="7k" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813109118" />
      </node>
      <node concept="3clFbS" id="7l" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813109120" />
        <node concept="3cpWs6" id="7q" role="3cqZAp">
          <uo k="s:originTrace" v="n:8704404528813110006" />
          <node concept="2OqwBi" id="7r" role="3cqZAk">
            <uo k="s:originTrace" v="n:8704404528813110662" />
            <node concept="37vLTw" id="7s" role="2Oq$k0">
              <ref role="3cqZAo" node="7n" resolve="parentNode" />
              <uo k="s:originTrace" v="n:8704404528813110078" />
            </node>
            <node concept="1mIQ4w" id="7t" role="2OqNvi">
              <uo k="s:originTrace" v="n:8704404528813111809" />
              <node concept="chp4Y" id="7u" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVNt5" resolve="Diagram" />
                <uo k="s:originTrace" v="n:8704404528813111969" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="7m" role="3clF46">
        <property role="TrG5h" value="node" />
        <uo k="s:originTrace" v="n:8704404528813109118" />
        <node concept="3uibUv" id="7v" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:8704404528813109118" />
        </node>
      </node>
      <node concept="37vLTG" id="7n" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <uo k="s:originTrace" v="n:8704404528813109118" />
        <node concept="3uibUv" id="7w" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:8704404528813109118" />
        </node>
      </node>
      <node concept="37vLTG" id="7o" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <uo k="s:originTrace" v="n:8704404528813109118" />
        <node concept="3uibUv" id="7x" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
          <uo k="s:originTrace" v="n:8704404528813109118" />
        </node>
      </node>
      <node concept="37vLTG" id="7p" role="3clF46">
        <property role="TrG5h" value="link" />
        <uo k="s:originTrace" v="n:8704404528813109118" />
        <node concept="3uibUv" id="7y" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
          <uo k="s:originTrace" v="n:8704404528813109118" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="7z">
    <property role="TrG5h" value="Region_Constraints" />
    <uo k="s:originTrace" v="n:8704404528813348435" />
    <node concept="3Tm1VV" id="7$" role="1B3o_S">
      <uo k="s:originTrace" v="n:8704404528813348435" />
    </node>
    <node concept="3uibUv" id="7_" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:8704404528813348435" />
    </node>
    <node concept="3clFbW" id="7A" role="jymVt">
      <uo k="s:originTrace" v="n:8704404528813348435" />
      <node concept="3cqZAl" id="7E" role="3clF45">
        <uo k="s:originTrace" v="n:8704404528813348435" />
      </node>
      <node concept="3clFbS" id="7F" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813348435" />
        <node concept="XkiVB" id="7H" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:8704404528813348435" />
          <node concept="1BaE9c" id="7I" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="Region$qx" />
            <uo k="s:originTrace" v="n:8704404528813348435" />
            <node concept="2YIFZM" id="7J" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:8704404528813348435" />
              <node concept="11gdke" id="7K" role="37wK5m">
                <property role="11gdj1" value="b104fc7d0eb94ddcL" />
                <uo k="s:originTrace" v="n:8704404528813348435" />
              </node>
              <node concept="11gdke" id="7L" role="37wK5m">
                <property role="11gdj1" value="828f1118413b5a6bL" />
                <uo k="s:originTrace" v="n:8704404528813348435" />
              </node>
              <node concept="11gdke" id="7M" role="37wK5m">
                <property role="11gdj1" value="20a07844fbef2c3eL" />
                <uo k="s:originTrace" v="n:8704404528813348435" />
              </node>
              <node concept="Xl_RD" id="7N" role="37wK5m">
                <property role="Xl_RC" value="RestaurantLanguage.structure.Region" />
                <uo k="s:originTrace" v="n:8704404528813348435" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="7G" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813348435" />
      </node>
    </node>
    <node concept="2tJIrI" id="7B" role="jymVt">
      <uo k="s:originTrace" v="n:8704404528813348435" />
    </node>
    <node concept="3clFb_" id="7C" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeChildConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <uo k="s:originTrace" v="n:8704404528813348435" />
      <node concept="3Tmbuc" id="7O" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813348435" />
      </node>
      <node concept="3uibUv" id="7P" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <uo k="s:originTrace" v="n:8704404528813348435" />
        <node concept="3uibUv" id="7S" role="11_B2D">
          <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
          <uo k="s:originTrace" v="n:8704404528813348435" />
        </node>
        <node concept="3uibUv" id="7T" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
          <uo k="s:originTrace" v="n:8704404528813348435" />
        </node>
      </node>
      <node concept="3clFbS" id="7Q" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813348435" />
        <node concept="3clFbF" id="7U" role="3cqZAp">
          <uo k="s:originTrace" v="n:8704404528813348435" />
          <node concept="2ShNRf" id="7V" role="3clFbG">
            <uo k="s:originTrace" v="n:8704404528813348435" />
            <node concept="YeOm9" id="7W" role="2ShVmc">
              <uo k="s:originTrace" v="n:8704404528813348435" />
              <node concept="1Y3b0j" id="7X" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <uo k="s:originTrace" v="n:8704404528813348435" />
                <node concept="3Tm1VV" id="7Y" role="1B3o_S">
                  <uo k="s:originTrace" v="n:8704404528813348435" />
                </node>
                <node concept="3clFb_" id="7Z" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <uo k="s:originTrace" v="n:8704404528813348435" />
                  <node concept="3Tm1VV" id="82" role="1B3o_S">
                    <uo k="s:originTrace" v="n:8704404528813348435" />
                  </node>
                  <node concept="2AHcQZ" id="83" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    <uo k="s:originTrace" v="n:8704404528813348435" />
                  </node>
                  <node concept="3uibUv" id="84" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                    <uo k="s:originTrace" v="n:8704404528813348435" />
                  </node>
                  <node concept="37vLTG" id="85" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <uo k="s:originTrace" v="n:8704404528813348435" />
                    <node concept="3uibUv" id="88" role="1tU5fm">
                      <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                      <uo k="s:originTrace" v="n:8704404528813348435" />
                    </node>
                    <node concept="2AHcQZ" id="89" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                      <uo k="s:originTrace" v="n:8704404528813348435" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="86" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:8704404528813348435" />
                    <node concept="3uibUv" id="8a" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                      <uo k="s:originTrace" v="n:8704404528813348435" />
                    </node>
                    <node concept="2AHcQZ" id="8b" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      <uo k="s:originTrace" v="n:8704404528813348435" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="87" role="3clF47">
                    <uo k="s:originTrace" v="n:8704404528813348435" />
                    <node concept="3cpWs8" id="8c" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813348435" />
                      <node concept="3cpWsn" id="8h" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <uo k="s:originTrace" v="n:8704404528813348435" />
                        <node concept="10P_77" id="8i" role="1tU5fm">
                          <uo k="s:originTrace" v="n:8704404528813348435" />
                        </node>
                        <node concept="1rXfSq" id="8j" role="33vP2m">
                          <ref role="37wK5l" node="7D" resolve="staticCanBeAChild" />
                          <uo k="s:originTrace" v="n:8704404528813348435" />
                          <node concept="2OqwBi" id="8k" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813348435" />
                            <node concept="37vLTw" id="8o" role="2Oq$k0">
                              <ref role="3cqZAo" node="85" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813348435" />
                            </node>
                            <node concept="liA8E" id="8p" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getNode()" resolve="getNode" />
                              <uo k="s:originTrace" v="n:8704404528813348435" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="8l" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813348435" />
                            <node concept="37vLTw" id="8q" role="2Oq$k0">
                              <ref role="3cqZAo" node="85" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813348435" />
                            </node>
                            <node concept="liA8E" id="8r" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getParentNode()" resolve="getParentNode" />
                              <uo k="s:originTrace" v="n:8704404528813348435" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="8m" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813348435" />
                            <node concept="37vLTw" id="8s" role="2Oq$k0">
                              <ref role="3cqZAo" node="85" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813348435" />
                            </node>
                            <node concept="liA8E" id="8t" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getConcept()" resolve="getConcept" />
                              <uo k="s:originTrace" v="n:8704404528813348435" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="8n" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813348435" />
                            <node concept="37vLTw" id="8u" role="2Oq$k0">
                              <ref role="3cqZAo" node="85" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813348435" />
                            </node>
                            <node concept="liA8E" id="8v" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getLink()" resolve="getLink" />
                              <uo k="s:originTrace" v="n:8704404528813348435" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="8d" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813348435" />
                    </node>
                    <node concept="3clFbJ" id="8e" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813348435" />
                      <node concept="3clFbS" id="8w" role="3clFbx">
                        <uo k="s:originTrace" v="n:8704404528813348435" />
                        <node concept="3clFbF" id="8y" role="3cqZAp">
                          <uo k="s:originTrace" v="n:8704404528813348435" />
                          <node concept="2OqwBi" id="8z" role="3clFbG">
                            <uo k="s:originTrace" v="n:8704404528813348435" />
                            <node concept="37vLTw" id="8$" role="2Oq$k0">
                              <ref role="3cqZAo" node="86" resolve="checkingNodeContext" />
                              <uo k="s:originTrace" v="n:8704404528813348435" />
                            </node>
                            <node concept="liA8E" id="8_" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                              <uo k="s:originTrace" v="n:8704404528813348435" />
                              <node concept="1dyn4i" id="8A" role="37wK5m">
                                <property role="1dyqJU" value="canBeChildBreakingPoint" />
                                <uo k="s:originTrace" v="n:8704404528813348435" />
                                <node concept="2ShNRf" id="8B" role="1dyrYi">
                                  <uo k="s:originTrace" v="n:8704404528813348435" />
                                  <node concept="1pGfFk" id="8C" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <uo k="s:originTrace" v="n:8704404528813348435" />
                                    <node concept="Xl_RD" id="8D" role="37wK5m">
                                      <property role="Xl_RC" value="r:6142c5f6-2907-48aa-8a44-fb0a42c9cd30(RestaurantLanguage.constraints)" />
                                      <uo k="s:originTrace" v="n:8704404528813348435" />
                                    </node>
                                    <node concept="Xl_RD" id="8E" role="37wK5m">
                                      <property role="Xl_RC" value="8704404528813348436" />
                                      <uo k="s:originTrace" v="n:8704404528813348435" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="8x" role="3clFbw">
                        <uo k="s:originTrace" v="n:8704404528813348435" />
                        <node concept="3y3z36" id="8F" role="3uHU7w">
                          <uo k="s:originTrace" v="n:8704404528813348435" />
                          <node concept="10Nm6u" id="8H" role="3uHU7w">
                            <uo k="s:originTrace" v="n:8704404528813348435" />
                          </node>
                          <node concept="37vLTw" id="8I" role="3uHU7B">
                            <ref role="3cqZAo" node="86" resolve="checkingNodeContext" />
                            <uo k="s:originTrace" v="n:8704404528813348435" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="8G" role="3uHU7B">
                          <uo k="s:originTrace" v="n:8704404528813348435" />
                          <node concept="37vLTw" id="8J" role="3fr31v">
                            <ref role="3cqZAo" node="8h" resolve="result" />
                            <uo k="s:originTrace" v="n:8704404528813348435" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="8f" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813348435" />
                    </node>
                    <node concept="3clFbF" id="8g" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813348435" />
                      <node concept="37vLTw" id="8K" role="3clFbG">
                        <ref role="3cqZAo" node="8h" resolve="result" />
                        <uo k="s:originTrace" v="n:8704404528813348435" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="80" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                  <uo k="s:originTrace" v="n:8704404528813348435" />
                </node>
                <node concept="3uibUv" id="81" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  <uo k="s:originTrace" v="n:8704404528813348435" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="7R" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:8704404528813348435" />
      </node>
    </node>
    <node concept="2YIFZL" id="7D" role="jymVt">
      <property role="TrG5h" value="staticCanBeAChild" />
      <uo k="s:originTrace" v="n:8704404528813348435" />
      <node concept="10P_77" id="8L" role="3clF45">
        <uo k="s:originTrace" v="n:8704404528813348435" />
      </node>
      <node concept="3Tm6S6" id="8M" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813348435" />
      </node>
      <node concept="3clFbS" id="8N" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813348437" />
        <node concept="3cpWs6" id="8S" role="3cqZAp">
          <uo k="s:originTrace" v="n:8704404528813349331" />
          <node concept="2OqwBi" id="8T" role="3cqZAk">
            <uo k="s:originTrace" v="n:8704404528813349959" />
            <node concept="37vLTw" id="8U" role="2Oq$k0">
              <ref role="3cqZAo" node="8P" resolve="parentNode" />
              <uo k="s:originTrace" v="n:8704404528813349375" />
            </node>
            <node concept="1mIQ4w" id="8V" role="2OqNvi">
              <uo k="s:originTrace" v="n:8704404528813351306" />
              <node concept="chp4Y" id="8W" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVNt5" resolve="Diagram" />
                <uo k="s:originTrace" v="n:8704404528813352302" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="8O" role="3clF46">
        <property role="TrG5h" value="node" />
        <uo k="s:originTrace" v="n:8704404528813348435" />
        <node concept="3uibUv" id="8X" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:8704404528813348435" />
        </node>
      </node>
      <node concept="37vLTG" id="8P" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <uo k="s:originTrace" v="n:8704404528813348435" />
        <node concept="3uibUv" id="8Y" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:8704404528813348435" />
        </node>
      </node>
      <node concept="37vLTG" id="8Q" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <uo k="s:originTrace" v="n:8704404528813348435" />
        <node concept="3uibUv" id="8Z" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
          <uo k="s:originTrace" v="n:8704404528813348435" />
        </node>
      </node>
      <node concept="37vLTG" id="8R" role="3clF46">
        <property role="TrG5h" value="link" />
        <uo k="s:originTrace" v="n:8704404528813348435" />
        <node concept="3uibUv" id="90" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
          <uo k="s:originTrace" v="n:8704404528813348435" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="91">
    <property role="TrG5h" value="RestaurantArea_Constraints" />
    <uo k="s:originTrace" v="n:5953669957696612165" />
    <node concept="3Tm1VV" id="92" role="1B3o_S">
      <uo k="s:originTrace" v="n:5953669957696612165" />
    </node>
    <node concept="3uibUv" id="93" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:5953669957696612165" />
    </node>
    <node concept="3clFbW" id="94" role="jymVt">
      <uo k="s:originTrace" v="n:5953669957696612165" />
      <node concept="3cqZAl" id="98" role="3clF45">
        <uo k="s:originTrace" v="n:5953669957696612165" />
      </node>
      <node concept="3clFbS" id="99" role="3clF47">
        <uo k="s:originTrace" v="n:5953669957696612165" />
        <node concept="XkiVB" id="9b" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:5953669957696612165" />
          <node concept="1BaE9c" id="9c" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="RestaurantArea$$C" />
            <uo k="s:originTrace" v="n:5953669957696612165" />
            <node concept="2YIFZM" id="9d" role="1Bazha">
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getInterfaceConcept(long,long,long,java.lang.String)" resolve="getInterfaceConcept" />
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <uo k="s:originTrace" v="n:5953669957696612165" />
              <node concept="11gdke" id="9e" role="37wK5m">
                <property role="11gdj1" value="b104fc7d0eb94ddcL" />
                <uo k="s:originTrace" v="n:5953669957696612165" />
              </node>
              <node concept="11gdke" id="9f" role="37wK5m">
                <property role="11gdj1" value="828f1118413b5a6bL" />
                <uo k="s:originTrace" v="n:5953669957696612165" />
              </node>
              <node concept="11gdke" id="9g" role="37wK5m">
                <property role="11gdj1" value="20a07844fbef2c6eL" />
                <uo k="s:originTrace" v="n:5953669957696612165" />
              </node>
              <node concept="Xl_RD" id="9h" role="37wK5m">
                <property role="Xl_RC" value="RestaurantLanguage.structure.RestaurantArea" />
                <uo k="s:originTrace" v="n:5953669957696612165" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="9a" role="1B3o_S">
        <uo k="s:originTrace" v="n:5953669957696612165" />
      </node>
    </node>
    <node concept="2tJIrI" id="95" role="jymVt">
      <uo k="s:originTrace" v="n:5953669957696612165" />
    </node>
    <node concept="3clFb_" id="96" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeChildConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <uo k="s:originTrace" v="n:5953669957696612165" />
      <node concept="3Tmbuc" id="9i" role="1B3o_S">
        <uo k="s:originTrace" v="n:5953669957696612165" />
      </node>
      <node concept="3uibUv" id="9j" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <uo k="s:originTrace" v="n:5953669957696612165" />
        <node concept="3uibUv" id="9m" role="11_B2D">
          <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
          <uo k="s:originTrace" v="n:5953669957696612165" />
        </node>
        <node concept="3uibUv" id="9n" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
          <uo k="s:originTrace" v="n:5953669957696612165" />
        </node>
      </node>
      <node concept="3clFbS" id="9k" role="3clF47">
        <uo k="s:originTrace" v="n:5953669957696612165" />
        <node concept="3clFbF" id="9o" role="3cqZAp">
          <uo k="s:originTrace" v="n:5953669957696612165" />
          <node concept="2ShNRf" id="9p" role="3clFbG">
            <uo k="s:originTrace" v="n:5953669957696612165" />
            <node concept="YeOm9" id="9q" role="2ShVmc">
              <uo k="s:originTrace" v="n:5953669957696612165" />
              <node concept="1Y3b0j" id="9r" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <uo k="s:originTrace" v="n:5953669957696612165" />
                <node concept="3Tm1VV" id="9s" role="1B3o_S">
                  <uo k="s:originTrace" v="n:5953669957696612165" />
                </node>
                <node concept="3clFb_" id="9t" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <uo k="s:originTrace" v="n:5953669957696612165" />
                  <node concept="3Tm1VV" id="9w" role="1B3o_S">
                    <uo k="s:originTrace" v="n:5953669957696612165" />
                  </node>
                  <node concept="2AHcQZ" id="9x" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    <uo k="s:originTrace" v="n:5953669957696612165" />
                  </node>
                  <node concept="3uibUv" id="9y" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                    <uo k="s:originTrace" v="n:5953669957696612165" />
                  </node>
                  <node concept="37vLTG" id="9z" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <uo k="s:originTrace" v="n:5953669957696612165" />
                    <node concept="3uibUv" id="9A" role="1tU5fm">
                      <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                      <uo k="s:originTrace" v="n:5953669957696612165" />
                    </node>
                    <node concept="2AHcQZ" id="9B" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                      <uo k="s:originTrace" v="n:5953669957696612165" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="9$" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:5953669957696612165" />
                    <node concept="3uibUv" id="9C" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                      <uo k="s:originTrace" v="n:5953669957696612165" />
                    </node>
                    <node concept="2AHcQZ" id="9D" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      <uo k="s:originTrace" v="n:5953669957696612165" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="9_" role="3clF47">
                    <uo k="s:originTrace" v="n:5953669957696612165" />
                    <node concept="3cpWs8" id="9E" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696612165" />
                      <node concept="3cpWsn" id="9J" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <uo k="s:originTrace" v="n:5953669957696612165" />
                        <node concept="10P_77" id="9K" role="1tU5fm">
                          <uo k="s:originTrace" v="n:5953669957696612165" />
                        </node>
                        <node concept="1rXfSq" id="9L" role="33vP2m">
                          <ref role="37wK5l" node="97" resolve="staticCanBeAChild" />
                          <uo k="s:originTrace" v="n:5953669957696612165" />
                          <node concept="2OqwBi" id="9M" role="37wK5m">
                            <uo k="s:originTrace" v="n:5953669957696612165" />
                            <node concept="37vLTw" id="9Q" role="2Oq$k0">
                              <ref role="3cqZAo" node="9z" resolve="context" />
                              <uo k="s:originTrace" v="n:5953669957696612165" />
                            </node>
                            <node concept="liA8E" id="9R" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getNode()" resolve="getNode" />
                              <uo k="s:originTrace" v="n:5953669957696612165" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="9N" role="37wK5m">
                            <uo k="s:originTrace" v="n:5953669957696612165" />
                            <node concept="37vLTw" id="9S" role="2Oq$k0">
                              <ref role="3cqZAo" node="9z" resolve="context" />
                              <uo k="s:originTrace" v="n:5953669957696612165" />
                            </node>
                            <node concept="liA8E" id="9T" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getParentNode()" resolve="getParentNode" />
                              <uo k="s:originTrace" v="n:5953669957696612165" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="9O" role="37wK5m">
                            <uo k="s:originTrace" v="n:5953669957696612165" />
                            <node concept="37vLTw" id="9U" role="2Oq$k0">
                              <ref role="3cqZAo" node="9z" resolve="context" />
                              <uo k="s:originTrace" v="n:5953669957696612165" />
                            </node>
                            <node concept="liA8E" id="9V" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getConcept()" resolve="getConcept" />
                              <uo k="s:originTrace" v="n:5953669957696612165" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="9P" role="37wK5m">
                            <uo k="s:originTrace" v="n:5953669957696612165" />
                            <node concept="37vLTw" id="9W" role="2Oq$k0">
                              <ref role="3cqZAo" node="9z" resolve="context" />
                              <uo k="s:originTrace" v="n:5953669957696612165" />
                            </node>
                            <node concept="liA8E" id="9X" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getLink()" resolve="getLink" />
                              <uo k="s:originTrace" v="n:5953669957696612165" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="9F" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696612165" />
                    </node>
                    <node concept="3clFbJ" id="9G" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696612165" />
                      <node concept="3clFbS" id="9Y" role="3clFbx">
                        <uo k="s:originTrace" v="n:5953669957696612165" />
                        <node concept="3clFbF" id="a0" role="3cqZAp">
                          <uo k="s:originTrace" v="n:5953669957696612165" />
                          <node concept="2OqwBi" id="a1" role="3clFbG">
                            <uo k="s:originTrace" v="n:5953669957696612165" />
                            <node concept="37vLTw" id="a2" role="2Oq$k0">
                              <ref role="3cqZAo" node="9$" resolve="checkingNodeContext" />
                              <uo k="s:originTrace" v="n:5953669957696612165" />
                            </node>
                            <node concept="liA8E" id="a3" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                              <uo k="s:originTrace" v="n:5953669957696612165" />
                              <node concept="1dyn4i" id="a4" role="37wK5m">
                                <property role="1dyqJU" value="canBeChildBreakingPoint" />
                                <uo k="s:originTrace" v="n:5953669957696612165" />
                                <node concept="2ShNRf" id="a5" role="1dyrYi">
                                  <uo k="s:originTrace" v="n:5953669957696612165" />
                                  <node concept="1pGfFk" id="a6" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <uo k="s:originTrace" v="n:5953669957696612165" />
                                    <node concept="Xl_RD" id="a7" role="37wK5m">
                                      <property role="Xl_RC" value="r:6142c5f6-2907-48aa-8a44-fb0a42c9cd30(RestaurantLanguage.constraints)" />
                                      <uo k="s:originTrace" v="n:5953669957696612165" />
                                    </node>
                                    <node concept="Xl_RD" id="a8" role="37wK5m">
                                      <property role="Xl_RC" value="5953669957696612166" />
                                      <uo k="s:originTrace" v="n:5953669957696612165" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="9Z" role="3clFbw">
                        <uo k="s:originTrace" v="n:5953669957696612165" />
                        <node concept="3y3z36" id="a9" role="3uHU7w">
                          <uo k="s:originTrace" v="n:5953669957696612165" />
                          <node concept="10Nm6u" id="ab" role="3uHU7w">
                            <uo k="s:originTrace" v="n:5953669957696612165" />
                          </node>
                          <node concept="37vLTw" id="ac" role="3uHU7B">
                            <ref role="3cqZAo" node="9$" resolve="checkingNodeContext" />
                            <uo k="s:originTrace" v="n:5953669957696612165" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="aa" role="3uHU7B">
                          <uo k="s:originTrace" v="n:5953669957696612165" />
                          <node concept="37vLTw" id="ad" role="3fr31v">
                            <ref role="3cqZAo" node="9J" resolve="result" />
                            <uo k="s:originTrace" v="n:5953669957696612165" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="9H" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696612165" />
                    </node>
                    <node concept="3clFbF" id="9I" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696612165" />
                      <node concept="37vLTw" id="ae" role="3clFbG">
                        <ref role="3cqZAo" node="9J" resolve="result" />
                        <uo k="s:originTrace" v="n:5953669957696612165" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="9u" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                  <uo k="s:originTrace" v="n:5953669957696612165" />
                </node>
                <node concept="3uibUv" id="9v" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  <uo k="s:originTrace" v="n:5953669957696612165" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="9l" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:5953669957696612165" />
      </node>
    </node>
    <node concept="2YIFZL" id="97" role="jymVt">
      <property role="TrG5h" value="staticCanBeAChild" />
      <uo k="s:originTrace" v="n:5953669957696612165" />
      <node concept="10P_77" id="af" role="3clF45">
        <uo k="s:originTrace" v="n:5953669957696612165" />
      </node>
      <node concept="3Tm6S6" id="ag" role="1B3o_S">
        <uo k="s:originTrace" v="n:5953669957696612165" />
      </node>
      <node concept="3clFbS" id="ah" role="3clF47">
        <uo k="s:originTrace" v="n:5953669957696612167" />
        <node concept="3cpWs6" id="am" role="3cqZAp">
          <uo k="s:originTrace" v="n:5953669957696613073" />
          <node concept="2OqwBi" id="an" role="3cqZAk">
            <uo k="s:originTrace" v="n:5953669957696613725" />
            <node concept="37vLTw" id="ao" role="2Oq$k0">
              <ref role="3cqZAo" node="aj" resolve="parentNode" />
              <uo k="s:originTrace" v="n:5953669957696613141" />
            </node>
            <node concept="1mIQ4w" id="ap" role="2OqNvi">
              <uo k="s:originTrace" v="n:5953669957696614946" />
              <node concept="chp4Y" id="aq" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVOau" resolve="Restaurant" />
                <uo k="s:originTrace" v="n:5953669957696615106" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="ai" role="3clF46">
        <property role="TrG5h" value="node" />
        <uo k="s:originTrace" v="n:5953669957696612165" />
        <node concept="3uibUv" id="ar" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:5953669957696612165" />
        </node>
      </node>
      <node concept="37vLTG" id="aj" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <uo k="s:originTrace" v="n:5953669957696612165" />
        <node concept="3uibUv" id="as" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:5953669957696612165" />
        </node>
      </node>
      <node concept="37vLTG" id="ak" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <uo k="s:originTrace" v="n:5953669957696612165" />
        <node concept="3uibUv" id="at" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
          <uo k="s:originTrace" v="n:5953669957696612165" />
        </node>
      </node>
      <node concept="37vLTG" id="al" role="3clF46">
        <property role="TrG5h" value="link" />
        <uo k="s:originTrace" v="n:5953669957696612165" />
        <node concept="3uibUv" id="au" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
          <uo k="s:originTrace" v="n:5953669957696612165" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="av">
    <property role="TrG5h" value="Restaurant_Constraints" />
    <uo k="s:originTrace" v="n:8704404528813060745" />
    <node concept="3Tm1VV" id="aw" role="1B3o_S">
      <uo k="s:originTrace" v="n:8704404528813060745" />
    </node>
    <node concept="3uibUv" id="ax" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:8704404528813060745" />
    </node>
    <node concept="3clFbW" id="ay" role="jymVt">
      <uo k="s:originTrace" v="n:8704404528813060745" />
      <node concept="3cqZAl" id="aA" role="3clF45">
        <uo k="s:originTrace" v="n:8704404528813060745" />
      </node>
      <node concept="3clFbS" id="aB" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813060745" />
        <node concept="XkiVB" id="aD" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:8704404528813060745" />
          <node concept="1BaE9c" id="aE" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="Restaurant$6f" />
            <uo k="s:originTrace" v="n:8704404528813060745" />
            <node concept="2YIFZM" id="aF" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:8704404528813060745" />
              <node concept="11gdke" id="aG" role="37wK5m">
                <property role="11gdj1" value="b104fc7d0eb94ddcL" />
                <uo k="s:originTrace" v="n:8704404528813060745" />
              </node>
              <node concept="11gdke" id="aH" role="37wK5m">
                <property role="11gdj1" value="828f1118413b5a6bL" />
                <uo k="s:originTrace" v="n:8704404528813060745" />
              </node>
              <node concept="11gdke" id="aI" role="37wK5m">
                <property role="11gdj1" value="20a07844fbef429eL" />
                <uo k="s:originTrace" v="n:8704404528813060745" />
              </node>
              <node concept="Xl_RD" id="aJ" role="37wK5m">
                <property role="Xl_RC" value="RestaurantLanguage.structure.Restaurant" />
                <uo k="s:originTrace" v="n:8704404528813060745" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="aC" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813060745" />
      </node>
    </node>
    <node concept="2tJIrI" id="az" role="jymVt">
      <uo k="s:originTrace" v="n:8704404528813060745" />
    </node>
    <node concept="3clFb_" id="a$" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeChildConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <uo k="s:originTrace" v="n:8704404528813060745" />
      <node concept="3Tmbuc" id="aK" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813060745" />
      </node>
      <node concept="3uibUv" id="aL" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <uo k="s:originTrace" v="n:8704404528813060745" />
        <node concept="3uibUv" id="aO" role="11_B2D">
          <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
          <uo k="s:originTrace" v="n:8704404528813060745" />
        </node>
        <node concept="3uibUv" id="aP" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
          <uo k="s:originTrace" v="n:8704404528813060745" />
        </node>
      </node>
      <node concept="3clFbS" id="aM" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813060745" />
        <node concept="3clFbF" id="aQ" role="3cqZAp">
          <uo k="s:originTrace" v="n:8704404528813060745" />
          <node concept="2ShNRf" id="aR" role="3clFbG">
            <uo k="s:originTrace" v="n:8704404528813060745" />
            <node concept="YeOm9" id="aS" role="2ShVmc">
              <uo k="s:originTrace" v="n:8704404528813060745" />
              <node concept="1Y3b0j" id="aT" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <uo k="s:originTrace" v="n:8704404528813060745" />
                <node concept="3Tm1VV" id="aU" role="1B3o_S">
                  <uo k="s:originTrace" v="n:8704404528813060745" />
                </node>
                <node concept="3clFb_" id="aV" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <uo k="s:originTrace" v="n:8704404528813060745" />
                  <node concept="3Tm1VV" id="aY" role="1B3o_S">
                    <uo k="s:originTrace" v="n:8704404528813060745" />
                  </node>
                  <node concept="2AHcQZ" id="aZ" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    <uo k="s:originTrace" v="n:8704404528813060745" />
                  </node>
                  <node concept="3uibUv" id="b0" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                    <uo k="s:originTrace" v="n:8704404528813060745" />
                  </node>
                  <node concept="37vLTG" id="b1" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <uo k="s:originTrace" v="n:8704404528813060745" />
                    <node concept="3uibUv" id="b4" role="1tU5fm">
                      <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                      <uo k="s:originTrace" v="n:8704404528813060745" />
                    </node>
                    <node concept="2AHcQZ" id="b5" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                      <uo k="s:originTrace" v="n:8704404528813060745" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="b2" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:8704404528813060745" />
                    <node concept="3uibUv" id="b6" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                      <uo k="s:originTrace" v="n:8704404528813060745" />
                    </node>
                    <node concept="2AHcQZ" id="b7" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      <uo k="s:originTrace" v="n:8704404528813060745" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="b3" role="3clF47">
                    <uo k="s:originTrace" v="n:8704404528813060745" />
                    <node concept="3cpWs8" id="b8" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813060745" />
                      <node concept="3cpWsn" id="bd" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <uo k="s:originTrace" v="n:8704404528813060745" />
                        <node concept="10P_77" id="be" role="1tU5fm">
                          <uo k="s:originTrace" v="n:8704404528813060745" />
                        </node>
                        <node concept="1rXfSq" id="bf" role="33vP2m">
                          <ref role="37wK5l" node="a_" resolve="staticCanBeAChild" />
                          <uo k="s:originTrace" v="n:8704404528813060745" />
                          <node concept="2OqwBi" id="bg" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813060745" />
                            <node concept="37vLTw" id="bk" role="2Oq$k0">
                              <ref role="3cqZAo" node="b1" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813060745" />
                            </node>
                            <node concept="liA8E" id="bl" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getNode()" resolve="getNode" />
                              <uo k="s:originTrace" v="n:8704404528813060745" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="bh" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813060745" />
                            <node concept="37vLTw" id="bm" role="2Oq$k0">
                              <ref role="3cqZAo" node="b1" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813060745" />
                            </node>
                            <node concept="liA8E" id="bn" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getParentNode()" resolve="getParentNode" />
                              <uo k="s:originTrace" v="n:8704404528813060745" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="bi" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813060745" />
                            <node concept="37vLTw" id="bo" role="2Oq$k0">
                              <ref role="3cqZAo" node="b1" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813060745" />
                            </node>
                            <node concept="liA8E" id="bp" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getConcept()" resolve="getConcept" />
                              <uo k="s:originTrace" v="n:8704404528813060745" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="bj" role="37wK5m">
                            <uo k="s:originTrace" v="n:8704404528813060745" />
                            <node concept="37vLTw" id="bq" role="2Oq$k0">
                              <ref role="3cqZAo" node="b1" resolve="context" />
                              <uo k="s:originTrace" v="n:8704404528813060745" />
                            </node>
                            <node concept="liA8E" id="br" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getLink()" resolve="getLink" />
                              <uo k="s:originTrace" v="n:8704404528813060745" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="b9" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813060745" />
                    </node>
                    <node concept="3clFbJ" id="ba" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813060745" />
                      <node concept="3clFbS" id="bs" role="3clFbx">
                        <uo k="s:originTrace" v="n:8704404528813060745" />
                        <node concept="3clFbF" id="bu" role="3cqZAp">
                          <uo k="s:originTrace" v="n:8704404528813060745" />
                          <node concept="2OqwBi" id="bv" role="3clFbG">
                            <uo k="s:originTrace" v="n:8704404528813060745" />
                            <node concept="37vLTw" id="bw" role="2Oq$k0">
                              <ref role="3cqZAo" node="b2" resolve="checkingNodeContext" />
                              <uo k="s:originTrace" v="n:8704404528813060745" />
                            </node>
                            <node concept="liA8E" id="bx" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                              <uo k="s:originTrace" v="n:8704404528813060745" />
                              <node concept="1dyn4i" id="by" role="37wK5m">
                                <property role="1dyqJU" value="canBeChildBreakingPoint" />
                                <uo k="s:originTrace" v="n:8704404528813060745" />
                                <node concept="2ShNRf" id="bz" role="1dyrYi">
                                  <uo k="s:originTrace" v="n:8704404528813060745" />
                                  <node concept="1pGfFk" id="b$" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <uo k="s:originTrace" v="n:8704404528813060745" />
                                    <node concept="Xl_RD" id="b_" role="37wK5m">
                                      <property role="Xl_RC" value="r:6142c5f6-2907-48aa-8a44-fb0a42c9cd30(RestaurantLanguage.constraints)" />
                                      <uo k="s:originTrace" v="n:8704404528813060745" />
                                    </node>
                                    <node concept="Xl_RD" id="bA" role="37wK5m">
                                      <property role="Xl_RC" value="8704404528813060746" />
                                      <uo k="s:originTrace" v="n:8704404528813060745" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="bt" role="3clFbw">
                        <uo k="s:originTrace" v="n:8704404528813060745" />
                        <node concept="3y3z36" id="bB" role="3uHU7w">
                          <uo k="s:originTrace" v="n:8704404528813060745" />
                          <node concept="10Nm6u" id="bD" role="3uHU7w">
                            <uo k="s:originTrace" v="n:8704404528813060745" />
                          </node>
                          <node concept="37vLTw" id="bE" role="3uHU7B">
                            <ref role="3cqZAo" node="b2" resolve="checkingNodeContext" />
                            <uo k="s:originTrace" v="n:8704404528813060745" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="bC" role="3uHU7B">
                          <uo k="s:originTrace" v="n:8704404528813060745" />
                          <node concept="37vLTw" id="bF" role="3fr31v">
                            <ref role="3cqZAo" node="bd" resolve="result" />
                            <uo k="s:originTrace" v="n:8704404528813060745" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="bb" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813060745" />
                    </node>
                    <node concept="3clFbF" id="bc" role="3cqZAp">
                      <uo k="s:originTrace" v="n:8704404528813060745" />
                      <node concept="37vLTw" id="bG" role="3clFbG">
                        <ref role="3cqZAo" node="bd" resolve="result" />
                        <uo k="s:originTrace" v="n:8704404528813060745" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="aW" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                  <uo k="s:originTrace" v="n:8704404528813060745" />
                </node>
                <node concept="3uibUv" id="aX" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  <uo k="s:originTrace" v="n:8704404528813060745" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="aN" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:8704404528813060745" />
      </node>
    </node>
    <node concept="2YIFZL" id="a_" role="jymVt">
      <property role="TrG5h" value="staticCanBeAChild" />
      <uo k="s:originTrace" v="n:8704404528813060745" />
      <node concept="10P_77" id="bH" role="3clF45">
        <uo k="s:originTrace" v="n:8704404528813060745" />
      </node>
      <node concept="3Tm6S6" id="bI" role="1B3o_S">
        <uo k="s:originTrace" v="n:8704404528813060745" />
      </node>
      <node concept="3clFbS" id="bJ" role="3clF47">
        <uo k="s:originTrace" v="n:8704404528813060747" />
        <node concept="3cpWs6" id="bO" role="3cqZAp">
          <uo k="s:originTrace" v="n:8704404528813061614" />
          <node concept="2OqwBi" id="bP" role="3cqZAk">
            <uo k="s:originTrace" v="n:8704404528813063108" />
            <node concept="37vLTw" id="bQ" role="2Oq$k0">
              <ref role="3cqZAo" node="bL" resolve="parentNode" />
              <uo k="s:originTrace" v="n:8704404528813062524" />
            </node>
            <node concept="1mIQ4w" id="bR" role="2OqNvi">
              <uo k="s:originTrace" v="n:8704404528813071524" />
              <node concept="chp4Y" id="bS" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVNt5" resolve="Diagram" />
                <uo k="s:originTrace" v="n:8704404528813072520" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="bK" role="3clF46">
        <property role="TrG5h" value="node" />
        <uo k="s:originTrace" v="n:8704404528813060745" />
        <node concept="3uibUv" id="bT" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:8704404528813060745" />
        </node>
      </node>
      <node concept="37vLTG" id="bL" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <uo k="s:originTrace" v="n:8704404528813060745" />
        <node concept="3uibUv" id="bU" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:8704404528813060745" />
        </node>
      </node>
      <node concept="37vLTG" id="bM" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <uo k="s:originTrace" v="n:8704404528813060745" />
        <node concept="3uibUv" id="bV" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
          <uo k="s:originTrace" v="n:8704404528813060745" />
        </node>
      </node>
      <node concept="37vLTG" id="bN" role="3clF46">
        <property role="TrG5h" value="link" />
        <uo k="s:originTrace" v="n:8704404528813060745" />
        <node concept="3uibUv" id="bW" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
          <uo k="s:originTrace" v="n:8704404528813060745" />
        </node>
      </node>
    </node>
  </node>
  <node concept="312cEu" id="bX">
    <property role="TrG5h" value="Table_Constraints" />
    <uo k="s:originTrace" v="n:5953669957696615344" />
    <node concept="3Tm1VV" id="bY" role="1B3o_S">
      <uo k="s:originTrace" v="n:5953669957696615344" />
    </node>
    <node concept="3uibUv" id="bZ" role="1zkMxy">
      <ref role="3uigEE" to="79pl:~BaseConstraintsDescriptor" resolve="BaseConstraintsDescriptor" />
      <uo k="s:originTrace" v="n:5953669957696615344" />
    </node>
    <node concept="3clFbW" id="c0" role="jymVt">
      <uo k="s:originTrace" v="n:5953669957696615344" />
      <node concept="3cqZAl" id="c6" role="3clF45">
        <uo k="s:originTrace" v="n:5953669957696615344" />
      </node>
      <node concept="3clFbS" id="c7" role="3clF47">
        <uo k="s:originTrace" v="n:5953669957696615344" />
        <node concept="XkiVB" id="c9" role="3cqZAp">
          <ref role="37wK5l" to="79pl:~BaseConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SAbstractConcept)" resolve="BaseConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="1BaE9c" id="ca" role="37wK5m">
            <property role="1ouuDV" value="CONCEPTS" />
            <property role="1BaxDp" value="Table$B3" />
            <uo k="s:originTrace" v="n:5953669957696615344" />
            <node concept="2YIFZM" id="cb" role="1Bazha">
              <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
              <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getConcept(long,long,long,java.lang.String)" resolve="getConcept" />
              <uo k="s:originTrace" v="n:5953669957696615344" />
              <node concept="11gdke" id="cc" role="37wK5m">
                <property role="11gdj1" value="b104fc7d0eb94ddcL" />
                <uo k="s:originTrace" v="n:5953669957696615344" />
              </node>
              <node concept="11gdke" id="cd" role="37wK5m">
                <property role="11gdj1" value="828f1118413b5a6bL" />
                <uo k="s:originTrace" v="n:5953669957696615344" />
              </node>
              <node concept="11gdke" id="ce" role="37wK5m">
                <property role="11gdj1" value="20a07844fbef2c73L" />
                <uo k="s:originTrace" v="n:5953669957696615344" />
              </node>
              <node concept="Xl_RD" id="cf" role="37wK5m">
                <property role="Xl_RC" value="RestaurantLanguage.structure.Table" />
                <uo k="s:originTrace" v="n:5953669957696615344" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="c8" role="1B3o_S">
        <uo k="s:originTrace" v="n:5953669957696615344" />
      </node>
    </node>
    <node concept="2tJIrI" id="c1" role="jymVt">
      <uo k="s:originTrace" v="n:5953669957696615344" />
    </node>
    <node concept="3clFb_" id="c2" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="calculateCanBeChildConstraint" />
      <property role="DiZV1" value="false" />
      <property role="od$2w" value="false" />
      <uo k="s:originTrace" v="n:5953669957696615344" />
      <node concept="3Tmbuc" id="cg" role="1B3o_S">
        <uo k="s:originTrace" v="n:5953669957696615344" />
      </node>
      <node concept="3uibUv" id="ch" role="3clF45">
        <ref role="3uigEE" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
        <uo k="s:originTrace" v="n:5953669957696615344" />
        <node concept="3uibUv" id="ck" role="11_B2D">
          <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
        <node concept="3uibUv" id="cl" role="11_B2D">
          <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
      </node>
      <node concept="3clFbS" id="ci" role="3clF47">
        <uo k="s:originTrace" v="n:5953669957696615344" />
        <node concept="3clFbF" id="cm" role="3cqZAp">
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="2ShNRf" id="cn" role="3clFbG">
            <uo k="s:originTrace" v="n:5953669957696615344" />
            <node concept="YeOm9" id="co" role="2ShVmc">
              <uo k="s:originTrace" v="n:5953669957696615344" />
              <node concept="1Y3b0j" id="cp" role="YeSDq">
                <property role="2bfB8j" value="true" />
                <ref role="1Y3XeK" to="ze1i:~ConstraintFunction" resolve="ConstraintFunction" />
                <ref role="37wK5l" to="wyt6:~Object.&lt;init&gt;()" resolve="Object" />
                <uo k="s:originTrace" v="n:5953669957696615344" />
                <node concept="3Tm1VV" id="cq" role="1B3o_S">
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
                <node concept="3clFb_" id="cr" role="jymVt">
                  <property role="1EzhhJ" value="false" />
                  <property role="TrG5h" value="invoke" />
                  <property role="DiZV1" value="false" />
                  <property role="od$2w" value="false" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                  <node concept="3Tm1VV" id="cu" role="1B3o_S">
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                  </node>
                  <node concept="2AHcQZ" id="cv" role="2AJF6D">
                    <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                  </node>
                  <node concept="3uibUv" id="cw" role="3clF45">
                    <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                  </node>
                  <node concept="37vLTG" id="cx" role="3clF46">
                    <property role="TrG5h" value="context" />
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                    <node concept="3uibUv" id="c$" role="1tU5fm">
                      <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                      <uo k="s:originTrace" v="n:5953669957696615344" />
                    </node>
                    <node concept="2AHcQZ" id="c_" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~NotNull" resolve="NotNull" />
                      <uo k="s:originTrace" v="n:5953669957696615344" />
                    </node>
                  </node>
                  <node concept="37vLTG" id="cy" role="3clF46">
                    <property role="TrG5h" value="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                    <node concept="3uibUv" id="cA" role="1tU5fm">
                      <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
                      <uo k="s:originTrace" v="n:5953669957696615344" />
                    </node>
                    <node concept="2AHcQZ" id="cB" role="2AJF6D">
                      <ref role="2AI5Lk" to="mhfm:~Nullable" resolve="Nullable" />
                      <uo k="s:originTrace" v="n:5953669957696615344" />
                    </node>
                  </node>
                  <node concept="3clFbS" id="cz" role="3clF47">
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                    <node concept="3cpWs8" id="cC" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696615344" />
                      <node concept="3cpWsn" id="cH" role="3cpWs9">
                        <property role="TrG5h" value="result" />
                        <uo k="s:originTrace" v="n:5953669957696615344" />
                        <node concept="10P_77" id="cI" role="1tU5fm">
                          <uo k="s:originTrace" v="n:5953669957696615344" />
                        </node>
                        <node concept="1rXfSq" id="cJ" role="33vP2m">
                          <ref role="37wK5l" node="c5" resolve="staticCanBeAChild" />
                          <uo k="s:originTrace" v="n:5953669957696615344" />
                          <node concept="2OqwBi" id="cK" role="37wK5m">
                            <uo k="s:originTrace" v="n:5953669957696615344" />
                            <node concept="37vLTw" id="cO" role="2Oq$k0">
                              <ref role="3cqZAo" node="cx" resolve="context" />
                              <uo k="s:originTrace" v="n:5953669957696615344" />
                            </node>
                            <node concept="liA8E" id="cP" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getNode()" resolve="getNode" />
                              <uo k="s:originTrace" v="n:5953669957696615344" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="cL" role="37wK5m">
                            <uo k="s:originTrace" v="n:5953669957696615344" />
                            <node concept="37vLTw" id="cQ" role="2Oq$k0">
                              <ref role="3cqZAo" node="cx" resolve="context" />
                              <uo k="s:originTrace" v="n:5953669957696615344" />
                            </node>
                            <node concept="liA8E" id="cR" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getParentNode()" resolve="getParentNode" />
                              <uo k="s:originTrace" v="n:5953669957696615344" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="cM" role="37wK5m">
                            <uo k="s:originTrace" v="n:5953669957696615344" />
                            <node concept="37vLTw" id="cS" role="2Oq$k0">
                              <ref role="3cqZAo" node="cx" resolve="context" />
                              <uo k="s:originTrace" v="n:5953669957696615344" />
                            </node>
                            <node concept="liA8E" id="cT" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getConcept()" resolve="getConcept" />
                              <uo k="s:originTrace" v="n:5953669957696615344" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="cN" role="37wK5m">
                            <uo k="s:originTrace" v="n:5953669957696615344" />
                            <node concept="37vLTw" id="cU" role="2Oq$k0">
                              <ref role="3cqZAo" node="cx" resolve="context" />
                              <uo k="s:originTrace" v="n:5953669957696615344" />
                            </node>
                            <node concept="liA8E" id="cV" role="2OqNvi">
                              <ref role="37wK5l" to="ze1j:~ConstraintContext_CanBeChild.getLink()" resolve="getLink" />
                              <uo k="s:originTrace" v="n:5953669957696615344" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="cD" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696615344" />
                    </node>
                    <node concept="3clFbJ" id="cE" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696615344" />
                      <node concept="3clFbS" id="cW" role="3clFbx">
                        <uo k="s:originTrace" v="n:5953669957696615344" />
                        <node concept="3clFbF" id="cY" role="3cqZAp">
                          <uo k="s:originTrace" v="n:5953669957696615344" />
                          <node concept="2OqwBi" id="cZ" role="3clFbG">
                            <uo k="s:originTrace" v="n:5953669957696615344" />
                            <node concept="37vLTw" id="d0" role="2Oq$k0">
                              <ref role="3cqZAo" node="cy" resolve="checkingNodeContext" />
                              <uo k="s:originTrace" v="n:5953669957696615344" />
                            </node>
                            <node concept="liA8E" id="d1" role="2OqNvi">
                              <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                              <uo k="s:originTrace" v="n:5953669957696615344" />
                              <node concept="1dyn4i" id="d2" role="37wK5m">
                                <property role="1dyqJU" value="canBeChildBreakingPoint" />
                                <uo k="s:originTrace" v="n:5953669957696615344" />
                                <node concept="2ShNRf" id="d3" role="1dyrYi">
                                  <uo k="s:originTrace" v="n:5953669957696615344" />
                                  <node concept="1pGfFk" id="d4" role="2ShVmc">
                                    <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                                    <uo k="s:originTrace" v="n:5953669957696615344" />
                                    <node concept="Xl_RD" id="d5" role="37wK5m">
                                      <property role="Xl_RC" value="r:6142c5f6-2907-48aa-8a44-fb0a42c9cd30(RestaurantLanguage.constraints)" />
                                      <uo k="s:originTrace" v="n:5953669957696615344" />
                                    </node>
                                    <node concept="Xl_RD" id="d6" role="37wK5m">
                                      <property role="Xl_RC" value="5953669957696615345" />
                                      <uo k="s:originTrace" v="n:5953669957696615344" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                      <node concept="1Wc70l" id="cX" role="3clFbw">
                        <uo k="s:originTrace" v="n:5953669957696615344" />
                        <node concept="3y3z36" id="d7" role="3uHU7w">
                          <uo k="s:originTrace" v="n:5953669957696615344" />
                          <node concept="10Nm6u" id="d9" role="3uHU7w">
                            <uo k="s:originTrace" v="n:5953669957696615344" />
                          </node>
                          <node concept="37vLTw" id="da" role="3uHU7B">
                            <ref role="3cqZAo" node="cy" resolve="checkingNodeContext" />
                            <uo k="s:originTrace" v="n:5953669957696615344" />
                          </node>
                        </node>
                        <node concept="3fqX7Q" id="d8" role="3uHU7B">
                          <uo k="s:originTrace" v="n:5953669957696615344" />
                          <node concept="37vLTw" id="db" role="3fr31v">
                            <ref role="3cqZAo" node="cH" resolve="result" />
                            <uo k="s:originTrace" v="n:5953669957696615344" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="3clFbH" id="cF" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696615344" />
                    </node>
                    <node concept="3clFbF" id="cG" role="3cqZAp">
                      <uo k="s:originTrace" v="n:5953669957696615344" />
                      <node concept="37vLTw" id="dc" role="3clFbG">
                        <ref role="3cqZAo" node="cH" resolve="result" />
                        <uo k="s:originTrace" v="n:5953669957696615344" />
                      </node>
                    </node>
                  </node>
                </node>
                <node concept="3uibUv" id="cs" role="2Ghqu4">
                  <ref role="3uigEE" to="ze1j:~ConstraintContext_CanBeChild" resolve="ConstraintContext_CanBeChild" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
                <node concept="3uibUv" id="ct" role="2Ghqu4">
                  <ref role="3uigEE" to="wyt6:~Boolean" resolve="Boolean" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="cj" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:5953669957696615344" />
      </node>
    </node>
    <node concept="312cEu" id="c3" role="jymVt">
      <property role="TrG5h" value="Number_Property" />
      <uo k="s:originTrace" v="n:5953669957696615344" />
      <node concept="3clFbW" id="dd" role="jymVt">
        <uo k="s:originTrace" v="n:5953669957696615344" />
        <node concept="3cqZAl" id="di" role="3clF45">
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
        <node concept="3Tm1VV" id="dj" role="1B3o_S">
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
        <node concept="3clFbS" id="dk" role="3clF47">
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="XkiVB" id="dm" role="3cqZAp">
            <ref role="37wK5l" to="79pl:~BasePropertyConstraintsDescriptor.&lt;init&gt;(org.jetbrains.mps.openapi.language.SProperty,jetbrains.mps.smodel.runtime.ConstraintsDescriptor,boolean,boolean,boolean)" resolve="BasePropertyConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:5953669957696615344" />
            <node concept="1BaE9c" id="dn" role="37wK5m">
              <property role="1ouuDV" value="PROPS" />
              <property role="1BaxDp" value="number$r6rS" />
              <uo k="s:originTrace" v="n:5953669957696615344" />
              <node concept="2YIFZM" id="ds" role="1Bazha">
                <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                <uo k="s:originTrace" v="n:5953669957696615344" />
                <node concept="11gdke" id="dt" role="37wK5m">
                  <property role="11gdj1" value="b104fc7d0eb94ddcL" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
                <node concept="11gdke" id="du" role="37wK5m">
                  <property role="11gdj1" value="828f1118413b5a6bL" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
                <node concept="11gdke" id="dv" role="37wK5m">
                  <property role="11gdj1" value="20a07844fbef2c73L" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
                <node concept="11gdke" id="dw" role="37wK5m">
                  <property role="11gdj1" value="20a07844fbef2c74L" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
                <node concept="Xl_RD" id="dx" role="37wK5m">
                  <property role="Xl_RC" value="number" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
              </node>
            </node>
            <node concept="37vLTw" id="do" role="37wK5m">
              <ref role="3cqZAo" node="dl" resolve="container" />
              <uo k="s:originTrace" v="n:5953669957696615344" />
            </node>
            <node concept="3clFbT" id="dp" role="37wK5m">
              <uo k="s:originTrace" v="n:5953669957696615344" />
            </node>
            <node concept="3clFbT" id="dq" role="37wK5m">
              <uo k="s:originTrace" v="n:5953669957696615344" />
            </node>
            <node concept="3clFbT" id="dr" role="37wK5m">
              <property role="3clFbU" value="true" />
              <uo k="s:originTrace" v="n:5953669957696615344" />
            </node>
          </node>
        </node>
        <node concept="37vLTG" id="dl" role="3clF46">
          <property role="TrG5h" value="container" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="3uibUv" id="dy" role="1tU5fm">
            <ref role="3uigEE" to="ze1j:~ConstraintsDescriptor" resolve="ConstraintsDescriptor" />
            <uo k="s:originTrace" v="n:5953669957696615344" />
          </node>
        </node>
      </node>
      <node concept="3clFb_" id="de" role="jymVt">
        <property role="1EzhhJ" value="false" />
        <property role="TrG5h" value="validateValue" />
        <property role="DiZV1" value="false" />
        <uo k="s:originTrace" v="n:5953669957696615344" />
        <node concept="3Tm1VV" id="dz" role="1B3o_S">
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
        <node concept="10P_77" id="d$" role="3clF45">
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
        <node concept="37vLTG" id="d_" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="3Tqbb2" id="dE" role="1tU5fm">
            <uo k="s:originTrace" v="n:5953669957696615344" />
          </node>
        </node>
        <node concept="37vLTG" id="dA" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="3uibUv" id="dF" role="1tU5fm">
            <ref role="3uigEE" to="wyt6:~Object" resolve="Object" />
            <uo k="s:originTrace" v="n:5953669957696615344" />
          </node>
        </node>
        <node concept="37vLTG" id="dB" role="3clF46">
          <property role="TrG5h" value="checkingNodeContext" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="3uibUv" id="dG" role="1tU5fm">
            <ref role="3uigEE" to="ze1i:~CheckingNodeContext" resolve="CheckingNodeContext" />
            <uo k="s:originTrace" v="n:5953669957696615344" />
          </node>
        </node>
        <node concept="3clFbS" id="dC" role="3clF47">
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="3cpWs8" id="dH" role="3cqZAp">
            <uo k="s:originTrace" v="n:5953669957696615344" />
            <node concept="3cpWsn" id="dK" role="3cpWs9">
              <property role="TrG5h" value="result" />
              <uo k="s:originTrace" v="n:5953669957696615344" />
              <node concept="10P_77" id="dL" role="1tU5fm">
                <uo k="s:originTrace" v="n:5953669957696615344" />
              </node>
              <node concept="1rXfSq" id="dM" role="33vP2m">
                <ref role="37wK5l" node="df" resolve="staticValidateProperty" />
                <uo k="s:originTrace" v="n:5953669957696615344" />
                <node concept="37vLTw" id="dN" role="37wK5m">
                  <ref role="3cqZAo" node="d_" resolve="node" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
                <node concept="2YIFZM" id="dO" role="37wK5m">
                  <ref role="1Pybhc" to="i8bi:5IkW5anFfnn" resolve="SPropertyOperations" />
                  <ref role="37wK5l" to="i8bi:7xvVBHRioHy" resolve="castInteger" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                  <node concept="37vLTw" id="dP" role="37wK5m">
                    <ref role="3cqZAo" node="dA" resolve="propertyValue" />
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbJ" id="dI" role="3cqZAp">
            <uo k="s:originTrace" v="n:5953669957696615344" />
            <node concept="3clFbS" id="dQ" role="3clFbx">
              <uo k="s:originTrace" v="n:5953669957696615344" />
              <node concept="3clFbF" id="dS" role="3cqZAp">
                <uo k="s:originTrace" v="n:5953669957696615344" />
                <node concept="2OqwBi" id="dT" role="3clFbG">
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                  <node concept="37vLTw" id="dU" role="2Oq$k0">
                    <ref role="3cqZAo" node="dB" resolve="checkingNodeContext" />
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                  </node>
                  <node concept="liA8E" id="dV" role="2OqNvi">
                    <ref role="37wK5l" to="ze1i:~CheckingNodeContext.setBreakingNode(org.jetbrains.mps.openapi.model.SNodeReference)" resolve="setBreakingNode" />
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                    <node concept="2ShNRf" id="dW" role="37wK5m">
                      <uo k="s:originTrace" v="n:5953669957696615344" />
                      <node concept="1pGfFk" id="dX" role="2ShVmc">
                        <ref role="37wK5l" to="w1kc:~SNodePointer.&lt;init&gt;(java.lang.String,java.lang.String)" resolve="SNodePointer" />
                        <uo k="s:originTrace" v="n:5953669957696615344" />
                        <node concept="Xl_RD" id="dY" role="37wK5m">
                          <property role="Xl_RC" value="r:6142c5f6-2907-48aa-8a44-fb0a42c9cd30(RestaurantLanguage.constraints)" />
                          <uo k="s:originTrace" v="n:5953669957696615344" />
                        </node>
                        <node concept="Xl_RD" id="dZ" role="37wK5m">
                          <property role="Xl_RC" value="5953669957696619396" />
                          <uo k="s:originTrace" v="n:5953669957696615344" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="1Wc70l" id="dR" role="3clFbw">
              <uo k="s:originTrace" v="n:5953669957696615344" />
              <node concept="3y3z36" id="e0" role="3uHU7w">
                <uo k="s:originTrace" v="n:5953669957696615344" />
                <node concept="10Nm6u" id="e2" role="3uHU7w">
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
                <node concept="37vLTw" id="e3" role="3uHU7B">
                  <ref role="3cqZAo" node="dB" resolve="checkingNodeContext" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
              </node>
              <node concept="3fqX7Q" id="e1" role="3uHU7B">
                <uo k="s:originTrace" v="n:5953669957696615344" />
                <node concept="37vLTw" id="e4" role="3fr31v">
                  <ref role="3cqZAo" node="dK" resolve="result" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
              </node>
            </node>
          </node>
          <node concept="3clFbF" id="dJ" role="3cqZAp">
            <uo k="s:originTrace" v="n:5953669957696615344" />
            <node concept="37vLTw" id="e5" role="3clFbG">
              <ref role="3cqZAo" node="dK" resolve="result" />
              <uo k="s:originTrace" v="n:5953669957696615344" />
            </node>
          </node>
        </node>
        <node concept="2AHcQZ" id="dD" role="2AJF6D">
          <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
      </node>
      <node concept="2YIFZL" id="df" role="jymVt">
        <property role="TrG5h" value="staticValidateProperty" />
        <uo k="s:originTrace" v="n:5953669957696615344" />
        <node concept="37vLTG" id="e6" role="3clF46">
          <property role="TrG5h" value="node" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="3Tqbb2" id="eb" role="1tU5fm">
            <uo k="s:originTrace" v="n:5953669957696615344" />
          </node>
        </node>
        <node concept="37vLTG" id="e7" role="3clF46">
          <property role="TrG5h" value="propertyValue" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="10Oyi0" id="ec" role="1tU5fm">
            <uo k="s:originTrace" v="n:5953669957696615344" />
          </node>
        </node>
        <node concept="10P_77" id="e8" role="3clF45">
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
        <node concept="3Tm6S6" id="e9" role="1B3o_S">
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
        <node concept="3clFbS" id="ea" role="3clF47">
          <uo k="s:originTrace" v="n:5953669957696619397" />
          <node concept="3clFbF" id="ed" role="3cqZAp">
            <uo k="s:originTrace" v="n:5953669957697616760" />
            <node concept="2OqwBi" id="ee" role="3clFbG">
              <uo k="s:originTrace" v="n:5953669957696888050" />
              <node concept="2OqwBi" id="ef" role="2Oq$k0">
                <uo k="s:originTrace" v="n:5953669957696888051" />
                <node concept="2OqwBi" id="eh" role="2Oq$k0">
                  <uo k="s:originTrace" v="n:5953669957696888052" />
                  <node concept="2OqwBi" id="ej" role="2Oq$k0">
                    <uo k="s:originTrace" v="n:5953669957696888053" />
                    <node concept="37vLTw" id="el" role="2Oq$k0">
                      <ref role="3cqZAo" node="e6" resolve="node" />
                      <uo k="s:originTrace" v="n:5953669957696888054" />
                    </node>
                    <node concept="2Xjw5R" id="em" role="2OqNvi">
                      <uo k="s:originTrace" v="n:5953669957696888055" />
                      <node concept="1xMEDy" id="en" role="1xVPHs">
                        <uo k="s:originTrace" v="n:5953669957696888056" />
                        <node concept="chp4Y" id="eo" role="ri$Ld">
                          <ref role="cht4Q" to="7682:22wu4jVVMLX" resolve="DiningRoom" />
                          <uo k="s:originTrace" v="n:5953669957696888057" />
                        </node>
                      </node>
                    </node>
                  </node>
                  <node concept="3Tsc0h" id="ek" role="2OqNvi">
                    <ref role="3TtcxE" to="7682:22wu4jVVMLZ" resolve="tables" />
                    <uo k="s:originTrace" v="n:5953669957696888058" />
                  </node>
                </node>
                <node concept="3zZkjj" id="ei" role="2OqNvi">
                  <uo k="s:originTrace" v="n:5953669957696888059" />
                  <node concept="1bVj0M" id="ep" role="23t8la">
                    <uo k="s:originTrace" v="n:5953669957696888060" />
                    <node concept="3clFbS" id="eq" role="1bW5cS">
                      <uo k="s:originTrace" v="n:5953669957696888061" />
                      <node concept="3clFbF" id="es" role="3cqZAp">
                        <uo k="s:originTrace" v="n:5953669957696888062" />
                        <node concept="17R0WA" id="et" role="3clFbG">
                          <uo k="s:originTrace" v="n:5953669957697266146" />
                          <node concept="2OqwBi" id="eu" role="3uHU7B">
                            <uo k="s:originTrace" v="n:5953669957696888064" />
                            <node concept="37vLTw" id="ew" role="2Oq$k0">
                              <ref role="3cqZAo" node="er" resolve="table" />
                              <uo k="s:originTrace" v="n:5953669957696888065" />
                            </node>
                            <node concept="3TrcHB" id="ex" role="2OqNvi">
                              <ref role="3TsBF5" to="7682:22wu4jVVMLO" resolve="number" />
                              <uo k="s:originTrace" v="n:5953669957697273698" />
                            </node>
                          </node>
                          <node concept="37vLTw" id="ev" role="3uHU7w">
                            <ref role="3cqZAo" node="e7" resolve="propertyValue" />
                            <uo k="s:originTrace" v="n:5953669957696888067" />
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="gl6BB" id="er" role="1bW2Oz">
                      <property role="TrG5h" value="table" />
                      <uo k="s:originTrace" v="n:5953669957696888068" />
                      <node concept="2jxLKc" id="ey" role="1tU5fm">
                        <uo k="s:originTrace" v="n:5953669957696888069" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
              <node concept="1v1jN8" id="eg" role="2OqNvi">
                <uo k="s:originTrace" v="n:5953669957697624730" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3Tm1VV" id="dg" role="1B3o_S">
        <uo k="s:originTrace" v="n:5953669957696615344" />
      </node>
      <node concept="3uibUv" id="dh" role="1zkMxy">
        <ref role="3uigEE" to="79pl:~BasePropertyConstraintsDescriptor" resolve="BasePropertyConstraintsDescriptor" />
        <uo k="s:originTrace" v="n:5953669957696615344" />
      </node>
    </node>
    <node concept="3clFb_" id="c4" role="jymVt">
      <property role="1EzhhJ" value="false" />
      <property role="TrG5h" value="getSpecifiedProperties" />
      <property role="DiZV1" value="false" />
      <uo k="s:originTrace" v="n:5953669957696615344" />
      <node concept="3Tmbuc" id="ez" role="1B3o_S">
        <uo k="s:originTrace" v="n:5953669957696615344" />
      </node>
      <node concept="3uibUv" id="e$" role="3clF45">
        <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
        <uo k="s:originTrace" v="n:5953669957696615344" />
        <node concept="3uibUv" id="eB" role="11_B2D">
          <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
        <node concept="3uibUv" id="eC" role="11_B2D">
          <ref role="3uigEE" to="ze1j:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
      </node>
      <node concept="3clFbS" id="e_" role="3clF47">
        <uo k="s:originTrace" v="n:5953669957696615344" />
        <node concept="3cpWs8" id="eD" role="3cqZAp">
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="3cpWsn" id="eG" role="3cpWs9">
            <property role="TrG5h" value="properties" />
            <uo k="s:originTrace" v="n:5953669957696615344" />
            <node concept="3uibUv" id="eH" role="1tU5fm">
              <ref role="3uigEE" to="33ny:~Map" resolve="Map" />
              <uo k="s:originTrace" v="n:5953669957696615344" />
              <node concept="3uibUv" id="eJ" role="11_B2D">
                <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                <uo k="s:originTrace" v="n:5953669957696615344" />
              </node>
              <node concept="3uibUv" id="eK" role="11_B2D">
                <ref role="3uigEE" to="ze1j:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                <uo k="s:originTrace" v="n:5953669957696615344" />
              </node>
            </node>
            <node concept="2ShNRf" id="eI" role="33vP2m">
              <uo k="s:originTrace" v="n:5953669957696615344" />
              <node concept="1pGfFk" id="eL" role="2ShVmc">
                <ref role="37wK5l" to="33ny:~HashMap.&lt;init&gt;()" resolve="HashMap" />
                <uo k="s:originTrace" v="n:5953669957696615344" />
                <node concept="3uibUv" id="eM" role="1pMfVU">
                  <ref role="3uigEE" to="c17a:~SProperty" resolve="SProperty" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
                <node concept="3uibUv" id="eN" role="1pMfVU">
                  <ref role="3uigEE" to="ze1j:~PropertyConstraintsDescriptor" resolve="PropertyConstraintsDescriptor" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eE" role="3cqZAp">
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="2OqwBi" id="eO" role="3clFbG">
            <uo k="s:originTrace" v="n:5953669957696615344" />
            <node concept="37vLTw" id="eP" role="2Oq$k0">
              <ref role="3cqZAo" node="eG" resolve="properties" />
              <uo k="s:originTrace" v="n:5953669957696615344" />
            </node>
            <node concept="liA8E" id="eQ" role="2OqNvi">
              <ref role="37wK5l" to="33ny:~Map.put(java.lang.Object,java.lang.Object)" resolve="put" />
              <uo k="s:originTrace" v="n:5953669957696615344" />
              <node concept="1BaE9c" id="eR" role="37wK5m">
                <property role="1ouuDV" value="PROPS" />
                <property role="1BaxDp" value="number$r6rS" />
                <uo k="s:originTrace" v="n:5953669957696615344" />
                <node concept="2YIFZM" id="eT" role="1Bazha">
                  <ref role="37wK5l" to="2k9e:~MetaAdapterFactory.getProperty(long,long,long,long,java.lang.String)" resolve="getProperty" />
                  <ref role="1Pybhc" to="2k9e:~MetaAdapterFactory" resolve="MetaAdapterFactory" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                  <node concept="11gdke" id="eU" role="37wK5m">
                    <property role="11gdj1" value="b104fc7d0eb94ddcL" />
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                  </node>
                  <node concept="11gdke" id="eV" role="37wK5m">
                    <property role="11gdj1" value="828f1118413b5a6bL" />
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                  </node>
                  <node concept="11gdke" id="eW" role="37wK5m">
                    <property role="11gdj1" value="20a07844fbef2c73L" />
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                  </node>
                  <node concept="11gdke" id="eX" role="37wK5m">
                    <property role="11gdj1" value="20a07844fbef2c74L" />
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                  </node>
                  <node concept="Xl_RD" id="eY" role="37wK5m">
                    <property role="Xl_RC" value="number" />
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                  </node>
                </node>
              </node>
              <node concept="2ShNRf" id="eS" role="37wK5m">
                <uo k="s:originTrace" v="n:5953669957696615344" />
                <node concept="1pGfFk" id="eZ" role="2ShVmc">
                  <ref role="37wK5l" node="dd" resolve="Table_Constraints.Number_Property" />
                  <uo k="s:originTrace" v="n:5953669957696615344" />
                  <node concept="Xjq3P" id="f0" role="37wK5m">
                    <uo k="s:originTrace" v="n:5953669957696615344" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="eF" role="3cqZAp">
          <uo k="s:originTrace" v="n:5953669957696615344" />
          <node concept="37vLTw" id="f1" role="3clFbG">
            <ref role="3cqZAo" node="eG" resolve="properties" />
            <uo k="s:originTrace" v="n:5953669957696615344" />
          </node>
        </node>
      </node>
      <node concept="2AHcQZ" id="eA" role="2AJF6D">
        <ref role="2AI5Lk" to="wyt6:~Override" resolve="Override" />
        <uo k="s:originTrace" v="n:5953669957696615344" />
      </node>
    </node>
    <node concept="2YIFZL" id="c5" role="jymVt">
      <property role="TrG5h" value="staticCanBeAChild" />
      <uo k="s:originTrace" v="n:5953669957696615344" />
      <node concept="10P_77" id="f2" role="3clF45">
        <uo k="s:originTrace" v="n:5953669957696615344" />
      </node>
      <node concept="3Tm6S6" id="f3" role="1B3o_S">
        <uo k="s:originTrace" v="n:5953669957696615344" />
      </node>
      <node concept="3clFbS" id="f4" role="3clF47">
        <uo k="s:originTrace" v="n:5953669957696615346" />
        <node concept="3cpWs6" id="f9" role="3cqZAp">
          <uo k="s:originTrace" v="n:5953669957696616258" />
          <node concept="2OqwBi" id="fa" role="3cqZAk">
            <uo k="s:originTrace" v="n:5953669957696617722" />
            <node concept="37vLTw" id="fb" role="2Oq$k0">
              <ref role="3cqZAo" node="f6" resolve="parentNode" />
              <uo k="s:originTrace" v="n:5953669957696616302" />
            </node>
            <node concept="1mIQ4w" id="fc" role="2OqNvi">
              <uo k="s:originTrace" v="n:5953669957696618943" />
              <node concept="chp4Y" id="fd" role="cj9EA">
                <ref role="cht4Q" to="7682:22wu4jVVMLX" resolve="DiningRoom" />
                <uo k="s:originTrace" v="n:5953669957696619103" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="f5" role="3clF46">
        <property role="TrG5h" value="node" />
        <uo k="s:originTrace" v="n:5953669957696615344" />
        <node concept="3uibUv" id="fe" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
      </node>
      <node concept="37vLTG" id="f6" role="3clF46">
        <property role="TrG5h" value="parentNode" />
        <uo k="s:originTrace" v="n:5953669957696615344" />
        <node concept="3uibUv" id="ff" role="1tU5fm">
          <ref role="3uigEE" to="mhbf:~SNode" resolve="SNode" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
      </node>
      <node concept="37vLTG" id="f7" role="3clF46">
        <property role="TrG5h" value="childConcept" />
        <uo k="s:originTrace" v="n:5953669957696615344" />
        <node concept="3uibUv" id="fg" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SAbstractConcept" resolve="SAbstractConcept" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
      </node>
      <node concept="37vLTG" id="f8" role="3clF46">
        <property role="TrG5h" value="link" />
        <uo k="s:originTrace" v="n:5953669957696615344" />
        <node concept="3uibUv" id="fh" role="1tU5fm">
          <ref role="3uigEE" to="c17a:~SContainmentLink" resolve="SContainmentLink" />
          <uo k="s:originTrace" v="n:5953669957696615344" />
        </node>
      </node>
    </node>
  </node>
</model>

