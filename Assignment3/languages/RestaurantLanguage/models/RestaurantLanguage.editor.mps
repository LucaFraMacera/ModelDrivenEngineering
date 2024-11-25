<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:eb9c75be-da35-4573-8ac4-4a633a652563(RestaurantLanguage.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="7682" ref="r:ed2e1c8b-f3ce-4973-8d88-0d8c7147e936(RestaurantLanguage.structure)" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1106270571710" name="jetbrains.mps.lang.editor.structure.CellLayout_Vertical" flags="nn" index="2iRkQZ" />
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1186414928363" name="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem" flags="ln" index="VPM3Z" />
      <concept id="1233758997495" name="jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem" flags="ln" index="11L4FC" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1236262245656" name="jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem" flags="ln" index="3mYdg7">
        <property id="1238091709220" name="labelName" index="1413C4" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <property id="1140017977771" name="readOnly" index="1Intyy" />
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ngI" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="3d6oDjjL7">
    <ref role="1XX52x" to="7682:22wu4jVVMLr" resolve="Employee" />
    <node concept="3EZMnI" id="3d6oDjNWY" role="2wV5jI">
      <node concept="l2Vlx" id="3d6oDjNWZ" role="2iSdaV" />
      <node concept="3F0ifn" id="3d6oDjNX0" role="3EZMnx">
        <property role="3F0ifm" value="employee" />
      </node>
      <node concept="3F0A7n" id="3d6oDjNX1" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0A7n" id="3d6oDjNXT" role="3EZMnx">
        <ref role="1NtTu8" to="7682:22wu4jVVMLj" resolve="surname" />
      </node>
      <node concept="3F0ifn" id="3d6oDjNX9" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="3d6oDjNXa" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="3d6oDjNXb" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="3d6oDjNXc" role="3EZMnx">
        <node concept="l2Vlx" id="3d6oDjNXd" role="2iSdaV" />
        <node concept="lj46D" id="3d6oDjNXe" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="3d6oDjNXf" role="3EZMnx">
          <property role="3F0ifm" value="contractExpirationDate" />
        </node>
        <node concept="3F0ifn" id="3d6oDjNXg" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3d6oDjNXh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3d6oDjNXi" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLt" resolve="contractExpirationDate" />
          <node concept="ljvvj" id="3d6oDjNXj" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3d6oDjNXM" role="3EZMnx">
          <property role="3F0ifm" value="gender" />
        </node>
        <node concept="3F0ifn" id="3d6oDjNXN" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3d6oDjNXO" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3d6oDjNXP" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLm" resolve="gender" />
          <node concept="ljvvj" id="3d6oDjNXQ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3d6oDjNXk" role="3EZMnx">
          <property role="3F0ifm" value="contractSignSate" />
        </node>
        <node concept="3F0ifn" id="3d6oDjNXl" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3d6oDjNXm" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3d6oDjNXn" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLu" resolve="contractSignDate" />
          <node concept="ljvvj" id="3d6oDjNXo" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3d6oDjNXp" role="3EZMnx">
          <property role="3F0ifm" value="salary" />
        </node>
        <node concept="3F0ifn" id="3d6oDjNXq" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3d6oDjNXr" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3d6oDjNXs" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLv" resolve="salary" />
          <node concept="ljvvj" id="3d6oDjNXt" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3d6oDjNXu" role="3EZMnx">
          <property role="3F0ifm" value="role" />
        </node>
        <node concept="3F0ifn" id="3d6oDjNXv" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3d6oDjNXw" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3d6oDjNXx" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLw" resolve="role" />
          <node concept="ljvvj" id="3d6oDjNXy" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3d6oDjNXC" role="3EZMnx">
          <property role="3F0ifm" value="fiscalCode" />
        </node>
        <node concept="3F0ifn" id="3d6oDjNXD" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3d6oDjNXE" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3d6oDjNXF" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLk" resolve="fiscalCode" />
          <node concept="ljvvj" id="3d6oDjNXG" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3d6oDjNXH" role="3EZMnx">
          <property role="3F0ifm" value="birthDate" />
        </node>
        <node concept="3F0ifn" id="3d6oDjNXI" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3d6oDjNXJ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3d6oDjNXK" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLl" resolve="birthDate" />
          <node concept="ljvvj" id="3d6oDjNXL" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3d6oDjNY2" role="3EZMnx">
          <property role="3F0ifm" value="birthPlace" />
        </node>
        <node concept="3F0ifn" id="3d6oDjNY8" role="3EZMnx">
          <property role="3F0ifm" value=":" />
        </node>
        <node concept="1iCGBv" id="3d6oDjNYd" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLq" resolve="birthPlace" />
          <node concept="1sVBvm" id="3d6oDjNYf" role="1sWHZn">
            <node concept="3EZMnI" id="3d6oDl32$" role="2wV5jI">
              <node concept="l2Vlx" id="3d6oDl32_" role="2iSdaV" />
              <node concept="VPM3Z" id="3d6oDl32A" role="3F10Kt" />
              <node concept="3EZMnI" id="3d6oDl32B" role="3EZMnx">
                <node concept="3F0ifn" id="3d6oDl32y" role="3EZMnx">
                  <property role="3F0ifm" value="{" />
                </node>
                <node concept="3EZMnI" id="3d6oDkNCD" role="3EZMnx">
                  <node concept="VPM3Z" id="3d6oDkNCF" role="3F10Kt" />
                  <node concept="3F0ifn" id="3d6oDkNCM" role="3EZMnx">
                    <property role="3F0ifm" value="name" />
                  </node>
                  <node concept="3F0ifn" id="3d6oDkNCP" role="3EZMnx">
                    <property role="3F0ifm" value=":" />
                  </node>
                  <node concept="3F0A7n" id="3d6oDkNCU" role="3EZMnx">
                    <property role="1Intyy" value="true" />
                    <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
                  </node>
                  <node concept="3F0ifn" id="3d6oDkND2" role="3EZMnx">
                    <property role="3F0ifm" value="cap" />
                  </node>
                  <node concept="3F0ifn" id="3d6oDkND5" role="3EZMnx">
                    <property role="3F0ifm" value=":" />
                  </node>
                  <node concept="3F0A7n" id="3d6oDkNDa" role="3EZMnx">
                    <property role="1Intyy" value="true" />
                    <ref role="1NtTu8" to="7682:22wu4jVVML2" resolve="cap" />
                  </node>
                  <node concept="l2Vlx" id="3d6oDkNCI" role="2iSdaV" />
                </node>
                <node concept="3F0ifn" id="3d6oDl32z" role="3EZMnx">
                  <property role="3F0ifm" value="}" />
                </node>
                <node concept="2iRkQZ" id="3d6oDl32C" role="2iSdaV" />
                <node concept="VPM3Z" id="3d6oDl32D" role="3F10Kt" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="3d6oDjNXR" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="3d6oDjNXS" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3d6oDjjMP">
    <ref role="1XX52x" to="7682:22wu4jVVNt5" resolve="Diagram" />
    <node concept="3EZMnI" id="3d6oDjjN6" role="2wV5jI">
      <node concept="2iRkQZ" id="3d6oDjjN7" role="2iSdaV" />
      <node concept="3EZMnI" id="3d6oDjjN8" role="3EZMnx">
        <node concept="l2Vlx" id="3d6oDjjN9" role="2iSdaV" />
        <node concept="VPM3Z" id="3d6oDjjNa" role="3F10Kt" />
        <node concept="3F0ifn" id="3d6oDjjNc" role="3EZMnx">
          <property role="3F0ifm" value="define" />
        </node>
        <node concept="3F0A7n" id="3d6oDjjNh" role="3EZMnx">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        </node>
        <node concept="3F0ifn" id="3d6oDjjNk" role="3EZMnx">
          <property role="3F0ifm" value="{" />
        </node>
      </node>
      <node concept="3EZMnI" id="3d6oDkbkD" role="3EZMnx">
        <node concept="VPM3Z" id="3d6oDkbkF" role="3F10Kt" />
        <node concept="3F2HdR" id="3d6oDkbkJ" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVNt7" resolve="entities" />
          <node concept="2iRkQZ" id="3d6oDkbkL" role="2czzBx" />
        </node>
        <node concept="2iRkQZ" id="3d6oDkbkI" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="3d6oDjB6F" role="3EZMnx">
        <property role="3F0ifm" value="}" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3d6oDjY5h">
    <ref role="1XX52x" to="7682:22wu4jVVMKY" resolve="Region" />
    <node concept="3EZMnI" id="3d6oDjY5j" role="2wV5jI">
      <node concept="l2Vlx" id="3d6oDjY5k" role="2iSdaV" />
      <node concept="3F0ifn" id="3d6oDjY5l" role="3EZMnx">
        <property role="3F0ifm" value="region" />
      </node>
      <node concept="3F0A7n" id="3d6oDjY5m" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="3d6oDjY5n" role="3EZMnx">
        <property role="3F0ifm" value=";" />
        <node concept="11L4FC" id="3d6oDjY5o" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3d6oDjY5p">
    <ref role="1XX52x" to="7682:22wu4jVVML0" resolve="City" />
    <node concept="3EZMnI" id="3d6oDjY5s" role="2wV5jI">
      <node concept="l2Vlx" id="3d6oDjY5t" role="2iSdaV" />
      <node concept="3F0ifn" id="3d6oDjY5u" role="3EZMnx">
        <property role="3F0ifm" value="city" />
      </node>
      <node concept="3F0A7n" id="3d6oDjY5v" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="3d6oDjY5B" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="3d6oDjY5C" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="3d6oDjY5D" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="3d6oDjY5E" role="3EZMnx">
        <node concept="l2Vlx" id="3d6oDjY5F" role="2iSdaV" />
        <node concept="lj46D" id="3d6oDjY5G" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="3d6oDjY5H" role="3EZMnx">
          <property role="3F0ifm" value="cap" />
        </node>
        <node concept="3F0ifn" id="3d6oDjY5I" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3d6oDjY5J" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="3d6oDjY5K" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVML2" resolve="cap" />
          <node concept="ljvvj" id="3d6oDjY5L" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3d6oDjY5R" role="3EZMnx">
          <property role="3F0ifm" value="region" />
        </node>
        <node concept="3F0ifn" id="3d6oDjY6a" role="3EZMnx">
          <property role="3F0ifm" value=":" />
        </node>
        <node concept="1iCGBv" id="3d6oDjY6d" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVML3" resolve="region" />
          <node concept="1sVBvm" id="3d6oDjY6f" role="1sWHZn">
            <node concept="3EZMnI" id="3d6oDk_Iy" role="2wV5jI">
              <node concept="3F0ifn" id="3d6oDk_IB" role="3EZMnx">
                <property role="3F0ifm" value="name" />
              </node>
              <node concept="3F0ifn" id="3d6oDk_IE" role="3EZMnx">
                <property role="3F0ifm" value=":" />
              </node>
              <node concept="3F0A7n" id="3d6oDk_IJ" role="3EZMnx">
                <property role="1Intyy" value="true" />
                <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
              </node>
              <node concept="l2Vlx" id="3d6oDk_I_" role="2iSdaV" />
              <node concept="VPM3Z" id="3d6oDk_IA" role="3F10Kt" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="3d6oDjY5M" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="3d6oDjY5N" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
</model>

