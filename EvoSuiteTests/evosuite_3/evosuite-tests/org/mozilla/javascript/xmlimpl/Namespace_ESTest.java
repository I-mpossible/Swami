/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 14:12:02 GMT 2018
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
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;
import org.mozilla.javascript.typedarrays.NativeInt8Array;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;
import org.mozilla.javascript.xmlimpl.Namespace;
import org.mozilla.javascript.xmlimpl.QName;
import org.mozilla.javascript.xmlimpl.XMLLibImpl;
import org.mozilla.javascript.xmlimpl.XmlNode;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Namespace_ESTest extends Namespace_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Namespace.toSourceImpl("nll symbol am", "nll symbol am", stringBuilder0);
      assertEquals("new Namespace('nll symbol am', 'nll symbol am')", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Namespace.toSourceImpl("", "", stringBuilder0);
      assertEquals("new Namespace()", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(947);
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array(nativeArrayBuffer0, (-205), 947);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create(nativeUint16Array0, (Namespace) null, xmlNode_Namespace0);
      String string0 = namespace0.toLocaleString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("", "");
      Namespace namespace0 = Namespace.create((Scriptable) null, (Namespace) null, xmlNode_Namespace0);
      namespace0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("', '");
      Namespace namespace0 = Namespace.create(nativeFloat64Array0, (Namespace) null, xmlNode_Namespace0);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        namespace0.defineOwnProperties(context0, namespace0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create(nativeFloat64Array0, (Namespace) null, xmlNode_Namespace0);
      // Undeclared exception!
      try { 
        namespace0.getInstanceIdValue(8);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 8
         //
         verifyException("org.mozilla.javascript.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array((NativeArrayBuffer) null, 6, 6);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create((String) null);
      Namespace namespace0 = Namespace.create(nativeInt8Array0, (Namespace) null, xmlNode_Namespace0);
      XmlNode.Namespace xmlNode_Namespace1 = namespace0.getDelegate();
      assertSame(xmlNode_Namespace0, xmlNode_Namespace1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create(nativeUint16Array0, (Namespace) null, xmlNode_Namespace0);
      boolean boolean0 = namespace0.equals(namespace0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("5fX0!<Z,", "5fX0!<Z,");
      Namespace namespace0 = Namespace.create(nativeUint8ClampedArray0, (Namespace) null, xmlNode_Namespace0);
      XMLLibImpl xMLLibImpl0 = mock(XMLLibImpl.class, new ViolatedAssumptionAnswer());
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, "5fX0!<Z,");
      QName qName0 = QName.create(xMLLibImpl0, namespace0, (QName) null, xmlNode_QName0);
      Namespace namespace1 = namespace0.castToNamespace(qName0);
      assertTrue(namespace1.equals((Object)namespace0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeInt8Array nativeInt8Array0 = new NativeInt8Array(6);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create((String) null);
      Namespace namespace0 = Namespace.create(nativeInt8Array0, (Namespace) null, xmlNode_Namespace0);
      XmlNode.QName xmlNode_QName0 = XmlNode.QName.create(xmlNode_Namespace0, (String) null);
      QName qName0 = QName.create((XMLLibImpl) null, (Scriptable) null, (QName) null, xmlNode_QName0);
      Namespace namespace1 = namespace0.castToNamespace(qName0);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("', '");
      Namespace namespace0 = Namespace.create(nativeFloat64Array0, (Namespace) null, xmlNode_Namespace0);
      Namespace namespace1 = namespace0.constructNamespace(namespace0);
      assertEquals("Namespace", namespace1.getClassName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.GLOBAL;
      Namespace namespace0 = Namespace.create(nativeUint16Array0, (Namespace) null, xmlNode_Namespace0);
      Namespace namespace1 = namespace0.castToNamespace(namespace0);
      assertSame(namespace1, namespace0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      XmlNode.Namespace xmlNode_Namespace0 = XmlNode.Namespace.create("error reporter", "language version");
      Namespace namespace0 = Namespace.create(importerTopLevel0, (Namespace) null, xmlNode_Namespace0);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(namespace0, xmlNode_Namespace0, 1, 2);
      // Undeclared exception!
      try { 
        namespace0.execIdCall(idFunctionObject0, context0, namespace0, importerTopLevel0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=1 MASTER=language version
         //
         verifyException("org.mozilla.javascript.IdFunctionObject", e);
      }
  }
}
