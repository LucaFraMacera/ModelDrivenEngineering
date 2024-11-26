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
        <property id="1140524450557" name="separatorText" index="2czwfO" />
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1106270571710" name="jetbrains.mps.lang.editor.structure.CellLayout_Vertical" flags="nn" index="2iRkQZ" />
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186403694788" name="jetbrains.mps.lang.editor.structure.ColorStyleClassItem" flags="ln" index="VaVBg">
        <property id="1186403713874" name="color" index="Vb096" />
      </concept>
      <concept id="1186403751766" name="jetbrains.mps.lang.editor.structure.FontStyleStyleClassItem" flags="ln" index="Vb9p2">
        <property id="1186403771423" name="style" index="Vbekb" />
      </concept>
      <concept id="1186404549998" name="jetbrains.mps.lang.editor.structure.ForegroundColorStyleClassItem" flags="ln" index="VechU" />
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
  <node concept="24kQdi" id="3d6oDjY5h">
    <ref role="1XX52x" to="7682:22wu4jVVMKY" resolve="Region" />
    <node concept="3EZMnI" id="3d6oDjY5j" role="2wV5jI">
      <node concept="l2Vlx" id="3d6oDjY5k" role="2iSdaV" />
      <node concept="3F0ifn" id="3d6oDjY5l" role="3EZMnx">
        <property role="3F0ifm" value="region" />
        <node concept="VechU" id="7zcgsOhg0eP" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
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
  <node concept="24kQdi" id="3d6oDjjL7">
    <ref role="1XX52x" to="7682:22wu4jVVMLr" resolve="Employee" />
    <node concept="3EZMnI" id="7zcgsOhen1R" role="2wV5jI">
      <node concept="l2Vlx" id="7zcgsOhen1S" role="2iSdaV" />
      <node concept="3F0ifn" id="7zcgsOhen1T" role="3EZMnx">
        <property role="3F0ifm" value="employee" />
        <node concept="VechU" id="7zcgsOhf563" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0A7n" id="7zcgsOhen1U" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="7zcgsOhen1V" role="3EZMnx">
        <property role="3F0ifm" value="birth place" />
      </node>
      <node concept="1iCGBv" id="7zcgsOhen1W" role="3EZMnx">
        <ref role="1NtTu8" to="7682:22wu4jVVMLq" resolve="birthPlace" />
        <node concept="1sVBvm" id="7zcgsOhen1Z" role="1sWHZn">
          <node concept="3F0A7n" id="7zcgsOhen21" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhen22" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="7zcgsOhen23" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7zcgsOhen24" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7zcgsOhen25" role="3EZMnx">
        <node concept="l2Vlx" id="7zcgsOhen26" role="2iSdaV" />
        <node concept="lj46D" id="7zcgsOhen27" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhen28" role="3EZMnx">
          <property role="3F0ifm" value="contract expiration date" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhen29" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhen2a" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhen2b" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLt" resolve="contractExpirationDate" />
          <node concept="ljvvj" id="7zcgsOhen2c" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2d" role="3EZMnx">
          <property role="3F0ifm" value="contract sign date" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2e" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhen2f" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhen2g" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLu" resolve="contractSignDate" />
          <node concept="ljvvj" id="7zcgsOhen2h" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2i" role="3EZMnx">
          <property role="3F0ifm" value="salary" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2j" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhen2k" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhen2l" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLv" resolve="salary" />
          <node concept="ljvvj" id="7zcgsOhen2m" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2n" role="3EZMnx">
          <property role="3F0ifm" value="role" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2o" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhen2p" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhen2q" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLw" resolve="role" />
          <node concept="ljvvj" id="7zcgsOhen2r" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2s" role="3EZMnx">
          <property role="3F0ifm" value="surname" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2t" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhen2u" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhen2v" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLj" resolve="surname" />
          <node concept="ljvvj" id="7zcgsOhen2w" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2x" role="3EZMnx">
          <property role="3F0ifm" value="fiscal code" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2y" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhen2z" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhen2$" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLk" resolve="fiscalCode" />
          <node concept="ljvvj" id="7zcgsOhen2_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2A" role="3EZMnx">
          <property role="3F0ifm" value="birth date" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2B" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhen2C" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhen2D" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLl" resolve="birthDate" />
          <node concept="ljvvj" id="7zcgsOhen2E" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2F" role="3EZMnx">
          <property role="3F0ifm" value="gender" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhen2G" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhen2H" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhen2I" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLm" resolve="gender" />
          <node concept="ljvvj" id="7zcgsOhen2J" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhen2K" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7zcgsOhen2L" role="3F10Kt">
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
          <node concept="VechU" id="7zcgsOhf55M" role="3F10Kt">
            <property role="Vb096" value="fLwANPu/blue" />
          </node>
        </node>
        <node concept="3F0A7n" id="3d6oDjjNh" role="3EZMnx">
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          <node concept="Vb9p2" id="7zcgsOhf55S" role="3F10Kt">
            <property role="Vbekb" value="g1_k_vY/BOLD" />
          </node>
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
  <node concept="24kQdi" id="3d6oDjY5p">
    <ref role="1XX52x" to="7682:22wu4jVVML0" resolve="City" />
    <node concept="3EZMnI" id="3d6oDjY5s" role="2wV5jI">
      <node concept="l2Vlx" id="3d6oDjY5t" role="2iSdaV" />
      <node concept="3F0ifn" id="3d6oDjY5u" role="3EZMnx">
        <property role="3F0ifm" value="city" />
        <node concept="VechU" id="7zcgsOhf55Y" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
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
  <node concept="24kQdi" id="7zcgsOhdidN">
    <ref role="1XX52x" to="7682:22wu4jVVMLN" resolve="Table" />
    <node concept="3EZMnI" id="7zcgsOhdidP" role="2wV5jI">
      <node concept="l2Vlx" id="7zcgsOhdidQ" role="2iSdaV" />
      <node concept="3F0ifn" id="7zcgsOhdidR" role="3EZMnx">
        <property role="3F0ifm" value="table" />
        <node concept="VechU" id="7zcgsOhf569" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhdidS" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="7zcgsOhdidT" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7zcgsOhdidU" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7zcgsOhdidV" role="3EZMnx">
        <node concept="l2Vlx" id="7zcgsOhdidW" role="2iSdaV" />
        <node concept="lj46D" id="7zcgsOhdidX" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdidY" role="3EZMnx">
          <property role="3F0ifm" value="number" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdidZ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdie0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdie1" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLO" resolve="number" />
          <node concept="ljvvj" id="7zcgsOhdie2" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdie3" role="3EZMnx">
          <property role="3F0ifm" value="number of seat" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdie4" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdie5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdie6" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLP" resolve="numberOfSeat" />
          <node concept="ljvvj" id="7zcgsOhdie7" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdie8" role="3EZMnx">
          <property role="3F0ifm" value="material" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdie9" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdiea" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdieb" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLQ" resolve="material" />
          <node concept="ljvvj" id="7zcgsOhdiec" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhdied" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7zcgsOhdiee" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7zcgsOhdief">
    <ref role="1XX52x" to="7682:22wu4jVVMLz" resolve="Owner" />
    <node concept="3EZMnI" id="7zcgsOhenoj" role="2wV5jI">
      <node concept="l2Vlx" id="7zcgsOhenok" role="2iSdaV" />
      <node concept="3F0ifn" id="7zcgsOhenol" role="3EZMnx">
        <property role="3F0ifm" value="owner" />
        <node concept="VechU" id="7zcgsOhf566" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0A7n" id="7zcgsOhenom" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="7zcgsOhenon" role="3EZMnx">
        <property role="3F0ifm" value="birth place" />
      </node>
      <node concept="1iCGBv" id="7zcgsOhenoo" role="3EZMnx">
        <ref role="1NtTu8" to="7682:22wu4jVVMLq" resolve="birthPlace" />
        <node concept="1sVBvm" id="7zcgsOhenor" role="1sWHZn">
          <node concept="3F0A7n" id="7zcgsOhenot" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhenou" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="7zcgsOhenov" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7zcgsOhenow" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7zcgsOhenox" role="3EZMnx">
        <node concept="l2Vlx" id="7zcgsOhenoy" role="2iSdaV" />
        <node concept="lj46D" id="7zcgsOhenoz" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7zcgsOheno$" role="3EZMnx">
          <property role="3F0ifm" value="vat" />
        </node>
        <node concept="3F0ifn" id="7zcgsOheno_" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhenoA" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhenoB" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVML_" resolve="vat" />
          <node concept="ljvvj" id="7zcgsOhenoC" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhenoD" role="3EZMnx">
          <property role="3F0ifm" value="surname" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhenoE" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhenoF" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhenoG" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLj" resolve="surname" />
          <node concept="ljvvj" id="7zcgsOhenoH" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhenoI" role="3EZMnx">
          <property role="3F0ifm" value="fiscal code" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhenoJ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhenoK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhenoL" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLk" resolve="fiscalCode" />
          <node concept="ljvvj" id="7zcgsOhenoM" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhenoN" role="3EZMnx">
          <property role="3F0ifm" value="birth date" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhenoO" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhenoP" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhenoQ" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLl" resolve="birthDate" />
          <node concept="ljvvj" id="7zcgsOhenoR" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhenoS" role="3EZMnx">
          <property role="3F0ifm" value="gender" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhenoT" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhenoU" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhenoV" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLm" resolve="gender" />
          <node concept="ljvvj" id="7zcgsOhenoW" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhenoX" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7zcgsOhenoY" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7zcgsOhdieX">
    <ref role="1XX52x" to="7682:22wu4jVVMLX" resolve="DiningRoom" />
    <node concept="3EZMnI" id="7zcgsOhdieZ" role="2wV5jI">
      <node concept="l2Vlx" id="7zcgsOhdif0" role="2iSdaV" />
      <node concept="3F0ifn" id="7zcgsOhdif1" role="3EZMnx">
        <property role="3F0ifm" value="dining room" />
        <node concept="VechU" id="7zcgsOhf562" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0A7n" id="7zcgsOhdif2" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="7zcgsOhdif3" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="7zcgsOhdif4" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7zcgsOhdif5" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7zcgsOhdif6" role="3EZMnx">
        <node concept="l2Vlx" id="7zcgsOhdif7" role="2iSdaV" />
        <node concept="lj46D" id="7zcgsOhdif8" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdif9" role="3EZMnx">
          <property role="3F0ifm" value="perimeter" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdifa" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdifb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdifc" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLK" resolve="perimeter" />
          <node concept="ljvvj" id="7zcgsOhdifd" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdife" role="3EZMnx">
          <property role="3F0ifm" value="area" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdiff" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdifg" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdifh" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLL" resolve="area" />
          <node concept="ljvvj" id="7zcgsOhdifi" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdifj" role="3EZMnx">
          <node concept="ljvvj" id="7zcgsOhdifk" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdifl" role="3EZMnx">
          <property role="3F0ifm" value="tables" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdifm" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdifn" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7zcgsOhdifo" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7zcgsOhdifp" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLZ" resolve="tables" />
          <node concept="l2Vlx" id="7zcgsOhdifq" role="2czzBx" />
          <node concept="pj6Ft" id="7zcgsOhdifr" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7zcgsOhdifs" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7zcgsOhdift" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhdifu" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7zcgsOhdifv" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7zcgsOhdifw">
    <ref role="1XX52x" to="7682:22wu4jVVMLU" resolve="Kitchen" />
    <node concept="3EZMnI" id="7zcgsOhdify" role="2wV5jI">
      <node concept="l2Vlx" id="7zcgsOhdifz" role="2iSdaV" />
      <node concept="3F0ifn" id="7zcgsOhdif$" role="3EZMnx">
        <property role="3F0ifm" value="kitchen" />
        <node concept="VechU" id="7zcgsOhf564" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0A7n" id="7zcgsOhdif_" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="7zcgsOhdifA" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="7zcgsOhdifB" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7zcgsOhdifC" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7zcgsOhdifD" role="3EZMnx">
        <node concept="l2Vlx" id="7zcgsOhdifE" role="2iSdaV" />
        <node concept="lj46D" id="7zcgsOhdifF" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdifG" role="3EZMnx">
          <property role="3F0ifm" value="number of stoves" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdifH" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdifI" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdifJ" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLW" resolve="numberOfStoves" />
          <node concept="ljvvj" id="7zcgsOhdifK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdifL" role="3EZMnx">
          <property role="3F0ifm" value="perimeter" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdifM" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdifN" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdifO" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLK" resolve="perimeter" />
          <node concept="ljvvj" id="7zcgsOhdifP" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdifQ" role="3EZMnx">
          <property role="3F0ifm" value="area" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdifR" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdifS" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdifT" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLL" resolve="area" />
          <node concept="ljvvj" id="7zcgsOhdifU" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhdifV" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7zcgsOhdifW" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7zcgsOhdifX">
    <ref role="1XX52x" to="7682:22wu4jVVMKT" resolve="Bathroom" />
    <node concept="3EZMnI" id="7zcgsOhdifZ" role="2wV5jI">
      <node concept="l2Vlx" id="7zcgsOhdig0" role="2iSdaV" />
      <node concept="3F0ifn" id="7zcgsOhdig1" role="3EZMnx">
        <property role="3F0ifm" value="bathroom" />
        <node concept="VechU" id="7zcgsOhf55W" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0A7n" id="7zcgsOhdig2" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="Vb9p2" id="7zcgsOhf55X" role="3F10Kt">
          <property role="Vbekb" value="g1_k_vY/BOLD" />
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhdig3" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="7zcgsOhdig4" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7zcgsOhdig5" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7zcgsOhdig6" role="3EZMnx">
        <node concept="l2Vlx" id="7zcgsOhdig7" role="2iSdaV" />
        <node concept="lj46D" id="7zcgsOhdig8" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdig9" role="3EZMnx">
          <property role="3F0ifm" value="number of toilets" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdiga" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdigb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdigc" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMM1" resolve="numberOfToilets" />
          <node concept="ljvvj" id="7zcgsOhdigd" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdige" role="3EZMnx">
          <property role="3F0ifm" value="gender" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigf" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdigg" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdigh" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMM2" resolve="gender" />
          <node concept="ljvvj" id="7zcgsOhdigi" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigj" role="3EZMnx">
          <property role="3F0ifm" value="is accessible" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigk" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdigl" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdigm" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMM3" resolve="isAccessible" />
          <node concept="ljvvj" id="7zcgsOhdign" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigo" role="3EZMnx">
          <property role="3F0ifm" value="perimeter" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigp" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdigq" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdigr" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLK" resolve="perimeter" />
          <node concept="ljvvj" id="7zcgsOhdigs" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigt" role="3EZMnx">
          <property role="3F0ifm" value="area" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigu" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdigv" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdigw" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLL" resolve="area" />
          <node concept="ljvvj" id="7zcgsOhdigx" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhdigy" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7zcgsOhdigz" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7zcgsOhdig$">
    <ref role="1XX52x" to="7682:22wu4jVVML4" resolve="Course" />
    <node concept="3EZMnI" id="7zcgsOhdigA" role="2wV5jI">
      <node concept="l2Vlx" id="7zcgsOhdigB" role="2iSdaV" />
      <node concept="3F0ifn" id="7zcgsOhdigC" role="3EZMnx">
        <property role="3F0ifm" value="course" />
        <node concept="VechU" id="7zcgsOhf561" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0A7n" id="7zcgsOhdigD" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="7zcgsOhdigE" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="7zcgsOhdigF" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7zcgsOhdigG" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7zcgsOhdigH" role="3EZMnx">
        <node concept="l2Vlx" id="7zcgsOhdigI" role="2iSdaV" />
        <node concept="lj46D" id="7zcgsOhdigJ" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigK" role="3EZMnx">
          <property role="3F0ifm" value="price" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigL" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdigM" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdigN" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVML6" resolve="price" />
          <node concept="ljvvj" id="7zcgsOhdigO" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigP" role="3EZMnx">
          <property role="3F0ifm" value="type" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigQ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdigR" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdigS" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVML7" resolve="type" />
          <node concept="ljvvj" id="7zcgsOhdigT" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigU" role="3EZMnx">
          <property role="3F0ifm" value="number of pieces" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdigV" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdigW" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhdigX" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLg" resolve="numberOfPieces" />
          <node concept="ljvvj" id="7zcgsOhdigY" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhdigZ" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7zcgsOhdih0" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7zcgsOhdih1">
    <ref role="1XX52x" to="7682:22wu4jVVMLR" resolve="Menu" />
    <node concept="3EZMnI" id="7zcgsOhdih3" role="2wV5jI">
      <node concept="l2Vlx" id="7zcgsOhdih4" role="2iSdaV" />
      <node concept="3F0ifn" id="7zcgsOhdih5" role="3EZMnx">
        <property role="3F0ifm" value="menu" />
        <node concept="VechU" id="7zcgsOhf565" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0A7n" id="7zcgsOhdih6" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="7zcgsOhdih7" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="7zcgsOhdih8" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7zcgsOhdih9" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7zcgsOhdiha" role="3EZMnx">
        <node concept="l2Vlx" id="7zcgsOhdihb" role="2iSdaV" />
        <node concept="lj46D" id="7zcgsOhdihc" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdihd" role="3EZMnx">
          <property role="3F0ifm" value="courses" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhdihe" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhdihf" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7zcgsOhdihg" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7zcgsOhdihh" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVMLT" resolve="courses" />
          <node concept="l2Vlx" id="7zcgsOhdihi" role="2czzBx" />
          <node concept="pj6Ft" id="7zcgsOhdihj" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7zcgsOhdihk" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7zcgsOhdihl" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhdihm" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7zcgsOhdihn" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7zcgsOhdiho">
    <ref role="1XX52x" to="7682:22wu4jVVOau" resolve="Restaurant" />
    <node concept="3EZMnI" id="7zcgsOhenp0" role="2wV5jI">
      <node concept="l2Vlx" id="7zcgsOhenp1" role="2iSdaV" />
      <node concept="3F0ifn" id="7zcgsOhenp2" role="3EZMnx">
        <property role="3F0ifm" value="restaurant" />
        <node concept="VechU" id="7zcgsOhf567" role="3F10Kt">
          <property role="Vb096" value="fLwANPu/blue" />
        </node>
      </node>
      <node concept="3F0A7n" id="7zcgsOhenp3" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="7zcgsOhenp4" role="3EZMnx">
        <property role="3F0ifm" value="city" />
      </node>
      <node concept="1iCGBv" id="7zcgsOhenp5" role="3EZMnx">
        <ref role="1NtTu8" to="7682:22wu4jVVOa$" resolve="city" />
        <node concept="1sVBvm" id="7zcgsOhenp8" role="1sWHZn">
          <node concept="3F0A7n" id="7zcgsOhenpa" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhenpb" role="3EZMnx">
        <property role="3F0ifm" value="owners" />
      </node>
      <node concept="3F2HdR" id="7zcgsOhenpc" role="3EZMnx">
        <property role="2czwfO" value="," />
        <ref role="1NtTu8" to="7682:7zcgsOhemKq" resolve="owners" />
        <node concept="l2Vlx" id="7zcgsOhenpd" role="2czzBx" />
      </node>
      <node concept="3F0ifn" id="7zcgsOhenpe" role="3EZMnx">
        <property role="3F0ifm" value="employes" />
      </node>
      <node concept="3F2HdR" id="7zcgsOhenpf" role="3EZMnx">
        <property role="2czwfO" value="," />
        <ref role="1NtTu8" to="7682:22wu4jVVOaD" resolve="employes" />
        <node concept="l2Vlx" id="7zcgsOhenpg" role="2czzBx" />
      </node>
      <node concept="3F0ifn" id="7zcgsOhenph" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="7zcgsOhenpi" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="7zcgsOhenpj" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7zcgsOhenpk" role="3EZMnx">
        <node concept="l2Vlx" id="7zcgsOhenpl" role="2iSdaV" />
        <node concept="lj46D" id="7zcgsOhenpm" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhenpn" role="3EZMnx">
          <property role="3F0ifm" value="street" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhenpo" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhenpp" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhenpq" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVOax" resolve="street" />
          <node concept="ljvvj" id="7zcgsOhenpr" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhenps" role="3EZMnx">
          <property role="3F0ifm" value="telephone" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhenpt" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhenpu" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0A7n" id="7zcgsOhenpv" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVOay" resolve="telephone" />
          <node concept="ljvvj" id="7zcgsOhenpw" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhenpx" role="3EZMnx">
          <node concept="ljvvj" id="7zcgsOhenpy" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhenpz" role="3EZMnx">
          <property role="3F0ifm" value="rooms" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhenp$" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhenp_" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7zcgsOhenpA" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7zcgsOhenpB" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVOa_" resolve="rooms" />
          <node concept="l2Vlx" id="7zcgsOhenpC" role="2czzBx" />
          <node concept="pj6Ft" id="7zcgsOhenpD" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7zcgsOhenpE" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7zcgsOhenpF" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhenpG" role="3EZMnx">
          <node concept="ljvvj" id="7zcgsOhenpH" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="7zcgsOhenpI" role="3EZMnx">
          <property role="3F0ifm" value="menus" />
        </node>
        <node concept="3F0ifn" id="7zcgsOhenpJ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="7zcgsOhenpK" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7zcgsOhenpL" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="7zcgsOhenpM" role="3EZMnx">
          <ref role="1NtTu8" to="7682:22wu4jVVOaE" resolve="menus" />
          <node concept="l2Vlx" id="7zcgsOhenpN" role="2czzBx" />
          <node concept="pj6Ft" id="7zcgsOhenpO" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="7zcgsOhenpP" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="7zcgsOhenpQ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="7zcgsOhenpR" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="7zcgsOhenpS" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
</model>

