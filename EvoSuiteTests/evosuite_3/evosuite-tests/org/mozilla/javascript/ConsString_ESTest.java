/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 23:59:01 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ConsString;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConsString_ESTest extends ConsString_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConsString consString0 = new ConsString("org.mozilla.javcript.CosStin", "org.mozilla.javcript.CosStin");
      String string0 = consString0.toString();
      assertEquals("org.mozilla.javcript.CosStinorg.mozilla.javcript.CosStin", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConsString consString0 = new ConsString("org.mozilla.javcript.CosStin", "org.mozilla.javcript.CosStin");
      // Undeclared exception!
      try { 
        consString0.subSequence('S', 'S');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[14];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      ConsString consString0 = new ConsString(charBuffer0, charBuffer0);
      ConsString consString1 = new ConsString(consString0, consString0);
      // Undeclared exception!
      try { 
        charBuffer0.append((CharSequence) consString1, 7, 7);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.nio.HeapCharBuffer cannot be cast to java.lang.String
         //
         verifyException("org.mozilla.javascript.ConsString", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConsString consString0 = new ConsString("org.mozilla.javcript.CosStin", "org.mozilla.javcript.CosStin");
      char char0 = consString0.charAt(24);
      assertEquals(56, consString0.length());
      assertEquals('S', char0);
  }
}