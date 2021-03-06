/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 16:37:22 GMT 2018
 */

package org.mozilla.javascript.xmlimpl;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.ContextFactory;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt16Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint32Array;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.Namespace;
import org.mozilla.javascript.xmlimpl.QName;
import org.mozilla.javascript.xmlimpl.XML;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XMLList;
import org.mozilla.javascript.xmlimpl.XMLName;
import org.mozilla.javascript.xmlimpl.XMLObjectImpl;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.mozilla.javascript.xmlimpl.XmlProcessor;
import org.w3c.dom.DOMException;
import org.w3c.dom.Node;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XML_ESTest extends XML_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XML xML1 = (XML)xML0.valueOf();
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array(nativeArrayBuffer0, (-100), 0);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, nativeUint32Array0, (XMLObject) null, xmlNode0);
      // Undeclared exception!
      try { 
        xML0.toSource((-471));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Node node0 = xML0.toDomNode();
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.text();
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      xML0.setNamespace((Namespace) null);
      assertTrue(xML0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      xML0.setName((QName) null);
      assertFalse(xML0.isSealed());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "msg.undef.prop.read", "msg.undef.prop.read");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      xML0.setLocalName("msg.undef.prop.read");
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.formStar();
      XMLList xMLList0 = xML0.elements(xMLName0);
      // Undeclared exception!
      try { 
        xML0.setAttribute(xMLName0, xMLList0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Can only set attributes on elements.
         //
         verifyException("org.mozilla.javascript.xmlimpl.XML", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      xML0.replaceWith(xML0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XMLName xMLName0 = XMLName.formStar();
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XML xML1 = xML0.replace(xMLName0, "$f0");
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Class<Object> class0 = Object.class;
      XML xML1 = xML0.replace(4, class0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XML xML1 = xML0.removeNamespace((Namespace) null);
      assertEquals("XML", xML1.getClassName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "msg.undef.prop.read", "msg.undef.prop.read");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      // Undeclared exception!
      try { 
        xML0.removeChild(0);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.formStar();
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      XML xML1 = new XML(xMLLibImpl0, (Scriptable) null, xMLList0, xmlNode0);
      xML1.putXMLProperty(xMLName0, xML1);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      // Undeclared exception!
      try { 
        xML0.put(0, (Scriptable) null, (Object) "-0");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Assignment to indexed XML is not allowed
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Float float0 = new Float((float) 0);
      boolean boolean0 = xML0.propertyIsEnumerable(float0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext((Context) null);
      boolean boolean0 = xML0.propertyIsEnumerable(context0.VERSION_UNKNOWN);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.create("-0", "-0");
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      boolean boolean0 = xML0.propertyIsEnumerable(xMLList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.formStar();
      XMLList xMLList0 = xML0.processingInstructions(xMLName0);
      assertFalse(xMLList0.isSealed());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "msg.undef.prop.read", "msg.undef.prop.read");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Object object0 = xML0.parent();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "msg.undef.prop.read", "msg.undef.prop.read");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      xML0.normalize();
      assertFalse(xML0.isSealed());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "msg.undef.prop.read", "msg.undef.prop.read");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Object object0 = xML0.nodeKind();
      assertEquals("text", object0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Namespace[] namespaceArray0 = xML0.namespaceDeclarations();
      assertEquals(0, namespaceArray0.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "*");
      XML xML0 = new XML((XMLLibImpl) null, (Scriptable) null, (XMLObject) null, xmlNode0);
      // Undeclared exception!
      try { 
        xML0.namespace((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XMLObjectImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Namespace namespace0 = xML0.namespace("-0");
      assertNull(namespace0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.formStar();
      // Undeclared exception!
      try { 
        xML0.makeXmlFromString(xMLName0, "0");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: NAMESPACE_ERR: An attempt is made to create or change an object in a way which is incorrect with regard to namespaces.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      String string0 = xML0.localName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(2001);
      NativeInt16Array nativeInt16Array0 = new NativeInt16Array(nativeArrayBuffer0, 8, 185);
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, nativeInt16Array0, (XMLObject) null, xmlNode0);
      int int0 = xML0.length();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Object[] objectArray0 = new Object[13];
      // Undeclared exception!
      try { 
        xML0.jsConstructor((Context) null, false, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      boolean boolean0 = xML0.is(xML0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "-0");
      BaseFunction baseFunction0 = new BaseFunction();
      XML xML0 = new XML(xMLLibImpl0, baseFunction0, (XMLObject) null, xmlNode0);
      XML xML1 = xML0.insertChildBefore((XML) null, "`*");
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Namespace[] namespaceArray0 = xML0.inScopeNamespaces();
      assertEquals(0, namespaceArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.formStar();
      boolean boolean0 = xML0.hasXMLProperty(xMLName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.formStar();
      XMLList xMLList0 = xML0.child(8);
      XMLLibImpl xMLLibImpl1 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XML xML1 = new XML(xMLLibImpl1, xML0, xMLList0, xmlNode0);
      boolean boolean0 = xML1.hasOwnProperty(xMLName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.formStar();
      boolean boolean0 = xML0.hasOwnProperty(xMLName0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "msg.undef.prop.read", "msg.undef.prop.read");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      boolean boolean0 = xML0.hasComplexContent();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      // Undeclared exception!
      try { 
        xML0.getXmlChild((-3429));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.formProperty("-0", "-0");
      XMLList xMLList0 = (XMLList)xML0.getXMLProperty(xMLName0);
      assertFalse(xMLList0.isSealed());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array();
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, (String) null);
      XML xML0 = new XML(xMLLibImpl0, nativeInt8Array0, (XMLObject) null, xmlNode0);
      XML xML1 = xML0.getXML();
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      // Undeclared exception!
      try { 
        xML0.insertChildAfter(xML0, xmlProcessor0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createEmpty(xmlProcessor0);
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XML xML1 = xML0.insertChildBefore(xML0, xML0);
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.formStar();
      boolean boolean0 = xMLName0.matches(xML0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "msg.undef.prop.read", "msg.undef.prop.read");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XML xML1 = xML0.getLastXmlChild();
      assertNull(xML1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "msgJndef.p6op.read");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.formStar();
      XMLList xMLList0 = xML0.elements(xMLName0);
      XML xML1 = new XML(xMLLibImpl0, (Scriptable) null, xMLList0, xmlNode0);
      XML xML2 = xML1.appendChild(xmlNode0);
      Object[] objectArray0 = xML2.getIds();
      assertEquals(1, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Object[] objectArray0 = xML0.getIds();
      assertEquals(0, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      String string0 = xML0.getClassName();
      assertEquals("XML", string0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.create("-0", "-0");
      XMLList xMLList0 = xMLName0.getMyValueOn(xML0);
      XML xML1 = xML0.insertChildAfter(xML0, xMLList0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      // Undeclared exception!
      try { 
        xML0.getAttributes();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Must be element.
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XmlNode xmlNode1 = xML0.getAnnotation();
      assertSame(xmlNode0, xmlNode1);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Object object0 = xML0.get(0, (Scriptable) null);
      assertSame(object0, xML0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "msg.undef.prop.read", "msg.undef.prop.read");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Object object0 = xML0.get(4, (Scriptable) xML0);
      XML xML1 = xML0.insertChildAfter((XML) null, object0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createText(xmlProcessor0, "msgJndef.p6op.read");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.formStar();
      XMLList xMLList0 = xML0.elements(xMLName0);
      boolean boolean0 = xML0.equivalentXml(xMLList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      Object object0 = xML0.equivalentValues(xmlNode0);
      //  // Unstable assertion: assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext((Context) null);
      // Undeclared exception!
      try { 
        xML0.getExtraMethodSource(context0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.create("-0", "-0");
      xML0.deleteXMLProperty(xMLName0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) xML0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLObjectImpl xMLObjectImpl0 = xML0.copy();
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "msg.undef.prop.read", "msg.undef.prop.read");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      // Undeclared exception!
      try { 
        xML0.contains(xML0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.xmlimpl.XmlNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      boolean boolean0 = xML0.contains((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLList xMLList0 = xML0.comments();
      assertEquals(1, ScriptableObject.READONLY);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      int int0 = xML0.childIndex();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.formStar();
      XMLList xMLList0 = xML0.child(xMLName0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "ON", "ON");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XMLName xMLName0 = XMLName.create("ON", "ON");
      XMLList xMLList0 = xML0.children();
      xML0.addMatches(xMLList0, xMLName0);
      assertFalse(xML0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlProcessor xmlProcessor0 = new XmlProcessor();
      XmlNode xmlNode0 = XmlNode.createElement(xmlProcessor0, "-0", "-0");
      XML xML0 = new XML(xMLLibImpl0, (Scriptable) null, (XMLObject) null, xmlNode0);
      XML xML1 = xML0.addNamespace((Namespace) null);
      assertTrue(xML1.isExtensible());
  }
}
