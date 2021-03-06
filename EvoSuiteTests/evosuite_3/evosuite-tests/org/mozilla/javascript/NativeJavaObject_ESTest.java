/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 02 04:59:52 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.BaseFunction;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.FieldAndMethods;
import org.mozilla.javascript.IdFunctionObjectES6;
import org.mozilla.javascript.JavaMembers;
import org.mozilla.javascript.NativeArray;
import org.mozilla.javascript.NativeCallSite;
import org.mozilla.javascript.NativeContinuation;
import org.mozilla.javascript.NativeDate;
import org.mozilla.javascript.NativeError;
import org.mozilla.javascript.NativeJSON;
import org.mozilla.javascript.NativeJavaArray;
import org.mozilla.javascript.NativeJavaClass;
import org.mozilla.javascript.NativeJavaMethod;
import org.mozilla.javascript.NativeJavaObject;
import org.mozilla.javascript.NativeJavaTopPackage;
import org.mozilla.javascript.NativeNumber;
import org.mozilla.javascript.NativeObject;
import org.mozilla.javascript.NativeScript;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Synchronizer;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeInt32Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;
import org.mozilla.javascript.typedarrays.NativeUint8ClampedArray;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NativeJavaObject_ESTest extends NativeJavaObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<Short> class0 = Short.class;
      Byte byte0 = new Byte((byte)37);
      Object object0 = NativeJavaObject.coerceTypeImpl(class0, byte0);
      assertEquals((short)37, object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Synchronizer synchronizer0 = new Synchronizer(nativeJavaClass0);
      nativeJavaClass0.setPrototype(synchronizer0);
      assertEquals("JavaClass", nativeJavaClass0.getClassName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      NativeNumber nativeNumber0 = new NativeNumber(100);
      nativeJavaObject0.setParentScope(nativeNumber0);
      assertEquals("JavaObject", nativeJavaObject0.getClassName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        nativeJavaClass0.put(58, (Scriptable) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeJavaArray nativeJavaArray0 = null;
      try {
        nativeJavaArray0 = new NativeJavaArray(nativeContinuation0, "java.io.ObjectInputStream");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("org.mozilla.javascript.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      boolean boolean0 = nativeJavaObject0.hasInstance((Scriptable) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      // Undeclared exception!
      try { 
        nativeJavaObject0.has("value ", (Scriptable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      boolean boolean0 = nativeJavaObject0.has(4, (Scriptable) nativeError0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Synchronizer> class0 = Synchronizer.class;
      int int0 = NativeJavaObject.getSizeRank(class0);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Short short0 = new Short((short)1);
      Class<Float> class0 = Float.TYPE;
      int int0 = NativeJavaObject.getConversionWeight(short0, class0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      // Undeclared exception!
      try { 
        nativeJavaObject0.getIds();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Class<Boolean> class0 = Boolean.class;
      // Undeclared exception!
      try { 
        nativeJavaObject0.getDefaultValue(class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Class<BaseFunction> class0 = BaseFunction.class;
      // Undeclared exception!
      try { 
        nativeJavaObject0.getDefaultValue(class0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      Class<Annotation> class0 = Annotation.class;
      int int0 = NativeJavaObject.getConversionWeight(nativeArrayBuffer0, class0);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Class<String> class0 = String.class;
      Context context0 = Context.enter();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      int int0 = NativeJavaObject.getConversionWeight(nativeJavaTopPackage0, class0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(312);
      Class<Object> class0 = Object.class;
      int int0 = NativeJavaObject.getConversionWeight(nativeArrayBuffer0, class0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      NativeObject nativeObject0 = new NativeObject();
      int int0 = NativeJavaObject.getConversionWeight(nativeObject0, class0);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Class<String> class0 = String.class;
      Context context0 = Context.enter();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      int int0 = NativeJavaObject.getConversionWeight(classLoader0, class0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Class<IdFunctionObjectES6> class0 = IdFunctionObjectES6.class;
      boolean boolean0 = NativeJavaObject.canConvert(nativeJavaObject0, class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Class<NativeCallSite> class0 = NativeCallSite.class;
      Class<FieldAndMethods> class1 = FieldAndMethods.class;
      boolean boolean0 = NativeJavaObject.canConvert(class0, class1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Class<NativeJavaMethod> class0 = NativeJavaMethod.class;
      boolean boolean0 = NativeJavaObject.canConvert("", class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Object> class0 = Object.class;
      int int0 = NativeJavaObject.getConversionWeight("x=ZBd>?WH", class0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Float float0 = new Float(0.75F);
      Class<Object> class0 = Object.class;
      int int0 = NativeJavaObject.getConversionWeight(float0, class0);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Short short0 = new Short((short)1);
      Class<Float> class0 = Float.class;
      int int0 = NativeJavaObject.getConversionWeight(short0, class0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Byte byte0 = new Byte((byte)0);
      Object object0 = NativeJavaObject.coerceTypeImpl(class0, byte0);
      assertEquals((short)0, object0);
      
      int int0 = NativeJavaObject.getConversionWeight(object0, class0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Boolean boolean0 = new Boolean(false);
      Class<NativeJSON> class0 = NativeJSON.class;
      int int0 = NativeJavaObject.getConversionWeight(boolean0, class0);
      assertEquals(99, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      String string0 = nativeJavaObject0.getClassName();
      assertEquals("JavaObject", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Class<IdFunctionObjectES6> class0 = IdFunctionObjectES6.class;
      JavaMembers javaMembers0 = null;
      try {
        javaMembers0 = new JavaMembers(nativeJavaObject0, class0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      // Undeclared exception!
      try { 
        nativeJavaObject0.get(8, (Scriptable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      nativeJavaClass0.delete("");
      assertEquals("JavaClass", nativeJavaClass0.getClassName());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      nativeJavaClass0.delete(0);
      assertEquals("JavaClass", nativeJavaClass0.getClassName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(99);
      Class<NativeScript> class0 = NativeScript.class;
      // Undeclared exception!
      try { 
        NativeJavaObject.coerceType(class0, nativeArrayBuffer0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot convert org.mozilla.javascript.typedarrays.NativeArrayBuffer@3 to org.mozilla.javascript.NativeScript
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer(312);
      NativeInt32Array nativeInt32Array0 = new NativeInt32Array(nativeArrayBuffer0, 2, 2);
      Class<Object> class0 = Object.class;
      Object object0 = NativeJavaObject.coerceTypeImpl(class0, nativeInt32Array0);
      assertSame(object0, nativeInt32Array0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Class<String> class0 = String.class;
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array((NativeArrayBuffer) null, 8, 8);
      NativeWith nativeWith0 = new NativeWith(nativeUint8Array0, nativeUint8Array0);
      // Undeclared exception!
      try { 
        NativeJavaObject.coerceTypeImpl(class0, nativeWith0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        NativeJavaObject.coerceTypeImpl(class0, nativeJavaObject0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Class<NativeScript> class0 = NativeScript.class;
      // Undeclared exception!
      try { 
        NativeJavaObject.coerceTypeImpl(class0, nativeJavaObject0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot convert null to org.mozilla.javascript.NativeScript
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Class<NativeError> class0 = NativeError.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        NativeJavaObject.coerceTypeImpl(class0, nativeJavaClass0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot convert null to org.mozilla.javascript.NativeError
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<BaseFunction> class1 = BaseFunction.class;
      Object object0 = NativeJavaObject.coerceTypeImpl(class0, class1);
      assertEquals("class org.mozilla.javascript.BaseFunction", object0.toString());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Class<NativeDate> class0 = NativeDate.class;
      // Undeclared exception!
      try { 
        NativeJavaObject.coerceType(class0, "org.mozilla.javascript.NativeJavaObject");
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot convert org.mozilla.javascript.NativeJavaObject to org.mozilla.javascript.NativeDate
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Object object0 = NativeJavaObject.coerceTypeImpl(class0, "{Wf|Y2DeKSte=%4L");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<NativeObject> class0 = NativeObject.class;
      Double double0 = new Double(127.0);
      // Undeclared exception!
      try { 
        NativeJavaObject.coerceTypeImpl(class0, double0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot convert 127.0 to org.mozilla.javascript.NativeObject
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<String> class0 = String.class;
      Boolean boolean0 = Boolean.valueOf(false);
      Object object0 = NativeJavaObject.coerceTypeImpl(class0, boolean0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Boolean boolean0 = Boolean.FALSE;
      // Undeclared exception!
      try { 
        NativeJavaObject.coerceTypeImpl(class0, boolean0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot convert false to java.lang.Integer
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = new NativeArrayBuffer();
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(nativeArrayBuffer0, 161, (-604));
      Class<Float> class0 = Float.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getTypedProperty((Scriptable) nativeUint8ClampedArray0, 8, class0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot convert undefined to java.lang.Float
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      // Undeclared exception!
      try { 
        NativeJavaObject.coerceTypeImpl(class0, (Object) null);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot convert null to short
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Class<Float> class0 = Float.class;
      Float float0 = new Float((-3422.6694F));
      Object object0 = NativeJavaObject.coerceTypeImpl(class0, float0);
      assertEquals((-3422.6694F), object0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Class<NativeJavaObject> class0 = NativeJavaObject.class;
      Object object0 = NativeJavaObject.coerceType(class0, (Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Class<Short> class0 = Short.TYPE;
      Byte byte0 = new Byte((byte)0);
      Object object0 = NativeJavaObject.coerceTypeImpl(class0, byte0);
      Object object1 = NativeJavaObject.coerceTypeImpl(class0, object0);
      assertEquals((short)0, object1);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Float float0 = new Float((float) 4);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0, float0);
      // Undeclared exception!
      try { 
        NativeJavaObject.coerceTypeImpl(class0, synchronizer0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("org.mozilla.javascript.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Class<Byte> class0 = Byte.TYPE;
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        NativeJavaObject.coerceTypeImpl(class0, object0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot convert java.lang.Object@0000000001 to java.lang.Byte
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Integer integer0 = new Integer((short) (-1495));
      Class<Float> class0 = Float.TYPE;
      Object object0 = NativeJavaObject.coerceTypeImpl(class0, integer0);
      assertEquals((-1495.0F), object0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Class<Double> class0 = Double.class;
      Long long0 = new Long((-4332462841530417152L));
      Object object0 = NativeJavaObject.coerceTypeImpl(class0, long0);
      assertNotNull(object0);
      assertEquals((-4.3324628415304172E18), object0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      NativeUint8ClampedArray nativeUint8ClampedArray0 = new NativeUint8ClampedArray(13);
      Class<Float> class0 = Float.class;
      Float float0 = ScriptableObject.getTypedProperty((Scriptable) nativeUint8ClampedArray0, 8, class0);
      assertNotNull(float0);
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Class<NativeJavaTopPackage> class0 = NativeJavaTopPackage.class;
      boolean boolean0 = NativeJavaObject.canConvert((Object) null, class0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        NativeJavaObject.coerceTypeImpl(class0, nativeJavaClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}
