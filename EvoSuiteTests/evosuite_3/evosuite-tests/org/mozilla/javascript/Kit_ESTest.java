/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 23:20:20 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.StringReader;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockRuntimeException;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Kit;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Kit_ESTest extends Kit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = Kit.makeHashKeyFromPair(hashMap0, hashMap0);
      hashMap0.put(hashMap0, "mQE?t0&H[(,a^V");
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Kit.initHash(hashMap0, object0, pipedInputStream0);
      assertEquals(2, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int int0 = Kit.xDigitToInt(97, 97);
      assertEquals(1562, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Kit.xDigitToInt(66, 66);
      assertEquals(1067, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Kit.xDigitToInt(63, 63);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Kit.xDigitToInt(49, 49);
      assertEquals(785, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Object object0 = Kit.addListener("Bad initialBufferCapacity: ", "Bad initialBufferCapacity: ");
      Object object1 = Kit.addListener(object0, "Bad initialBufferCapacity: ");
      Object object2 = Kit.removeListener(object1, fileSystemHandling0);
      assertNotSame(object2, object0);
      assertNotNull(object2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(65);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Object object0 = Kit.addListener(pipedInputStream0, pipedOutputStream0);
      Object object1 = Kit.removeListener(object0, pipedInputStream0);
      assertSame(pipedOutputStream0, object1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Object object0 = Kit.addListener(pipedInputStream0, pipedInputStream0);
      PipedInputStream pipedInputStream1 = (PipedInputStream)Kit.removeListener(object0, pipedInputStream0);
      assertEquals(0, pipedInputStream1.available());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      Object object0 = Kit.removeListener(pipedOutputStream0, pipedOutputStream0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      byte[] byteArray1 = Kit.readStream(dataInputStream0, (byte)7);
      assertEquals(0, byteArrayInputStream0.available());
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        Kit.readStream(byteArrayInputStream0, (-3061));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad initialBufferCapacity: -3061
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;");
      String string0 = Kit.readReader(stringReader0);
      assertEquals("(Lorg/mozilla/javascript/Context;Lorg/mozilla/javascript/Scriptable;Lorg/mozilla/javascript/Scriptable;[Ljava/lang/Object;)Ljava/lang/Object;", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Object object0 = Kit.newInstanceOrNull(class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = Kit.initHash(hashMap0, fileSystemHandling0, fileSystemHandling0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Kit.initHash(hashMap0, object0, pipedInputStream0);
      assertFalse(hashMap0.isEmpty());
      assertEquals(1, hashMap0.size());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockRuntimeException mockRuntimeException0 = new MockRuntimeException("");
      RuntimeException runtimeException0 = Kit.initCause(mockRuntimeException0, mockRuntimeException0);
      assertSame(mockRuntimeException0, runtimeException0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RuntimeException runtimeException0 = Kit.initCause((RuntimeException) null, (Throwable) null);
      assertNull(runtimeException0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Class<String> class0 = String.class;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Object object0 = Kit.addListener(pipedInputStream0, class0);
      Object object1 = Kit.getListener(object0, 2);
      assertNull(object1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object object0 = Kit.addListener("Bad ini7ilBuffeVCapccityu'", "Bad ini7ilBuffeVCapccityu'");
      // Undeclared exception!
      try { 
        Kit.getListener(object0, (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Object object0 = Kit.addListener("y", "y");
      Object object1 = Kit.getListener(object0, 1);
      assertEquals("y", object1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Object object0 = Kit.getListener(classLoader0, 0);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Object object0 = Kit.getListener((Object) null, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      try { 
        Kit.codeBug("[Symbol.iterator]");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION: [Symbol.iterator]
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      try { 
        Kit.codeBug();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<?> class0 = Kit.classOrNull("tJ-_<l};Yb~@");
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Class<?> class0 = Kit.classOrNull("org.mozilla.javascript.EvaluatorException");
      Object object0 = Kit.getListener(class0, 1);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = Kit.classOrNull(classLoader0, "org/mozilla/javascript/ScriptRuntime");
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      Class<?> class0 = Kit.classOrNull(classLoader0, "mQE?t0&H[(,a^V");
      assertNull(class0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      boolean boolean0 = Kit.testIfCanLoadRhinoClasses(classLoader0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PipedInputStream pipedInputStream1 = (PipedInputStream)Kit.addListener((Object) null, pipedInputStream0);
      assertEquals(0, pipedInputStream1.available());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Class<String> class0 = String.class;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Object object0 = Kit.addListener(pipedInputStream0, class0);
      Object object1 = Kit.getListener(object0, 0);
      assertSame(object1, pipedInputStream0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Kit kit0 = new Kit();
  }
}
