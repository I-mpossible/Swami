/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 22:59:43 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.util.Arrays;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.DToA;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DToA_ESTest extends DToA_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      assertEquals("", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      boolean boolean0 = DToA.roundOff(stringBuilder0);
      assertEquals("", stringBuilder0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("org.mozilla.javascript.DToA");
      assertEquals("org.mozilla.javascript.DToA", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      boolean[] booleanArray0 = new boolean[3];
      int int0 = DToA.JS_dtoa('W', 4, false, 0, booleanArray0, stringBuilder0);
      assertEquals(3, booleanArray0.length);
      assertEquals("org.mozilla.javascript.DToA9", stringBuilder0.toString());
      assertEquals(2, int0);
      assertTrue(Arrays.equals(new boolean[] {false, false, false}, booleanArray0));
      
      boolean boolean0 = DToA.roundOff(stringBuilder0);
      assertEquals("org.mozilla.javascript.DToB", stringBuilder0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertNotNull(stringBuffer0);
      
      StringBuilder stringBuilder0 = new StringBuilder(stringBuffer0);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertEquals("", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      DToA.JS_dtostr(stringBuilder0, 0, 11, 0.633386423082678);
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuffer0.toString());
      assertEquals("0.633386423082678", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      assertEquals("", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      DToA.JS_dtostr(stringBuilder0, 4, (-2145), 1.04151808E9);
      assertEquals("1e+9", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = DToA.JS_dtobasestr(36, (-888.143519793439));
      assertEquals("-oo.56025383", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String string0 = DToA.JS_dtobasestr(36, (-888.097091));
      assertEquals("-oo.3htvlhs8r", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = DToA.JS_dtobasestr(19, 0.5);
      assertEquals("0.9999999999999", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = DToA.JS_dtobasestr(4, 7.6639199100664E-311);
      assertEquals("0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000003201232220010033113022", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = DToA.JS_dtobasestr(2, 1.0E128);
      assertEquals("100100111011101001000111110010011000000011101001100100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = DToA.JS_dtobasestr(14, 0);
      assertEquals("0", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        DToA.JS_dtobasestr((-65536), (-572.372));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad base: -65536
         //
         verifyException("org.mozilla.javascript.DToA", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      StringBuilder stringBuilder0 = new StringBuilder("iEoQS&bh\"ZCa%s^+qsy");
      assertEquals("iEoQS&bh\"ZCa%s^+qsy", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      int int0 = DToA.JS_dtoa((-1103.7460734), 5, true, 13, booleanArray0, stringBuilder0);
      assertEquals(1, booleanArray0.length);
      assertEquals("iEoQS&bh\"ZCa%s^+qsy11037460733999999", stringBuilder0.toString());
      assertEquals(4, int0);
      assertTrue(Arrays.equals(new boolean[] {true}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      CharBuffer charBuffer0 = CharBuffer.allocate('b');
      assertFalse(charBuffer0.isReadOnly());
      assertEquals(0, charBuffer0.arrayOffset());
      assertTrue(charBuffer0.hasArray());
      assertTrue(charBuffer0.hasRemaining());
      assertEquals(98, charBuffer0.remaining());
      assertEquals(0, charBuffer0.position());
      assertFalse(charBuffer0.isDirect());
      assertEquals(98, charBuffer0.limit());
      assertEquals(98, charBuffer0.capacity());
      assertEquals(98, charBuffer0.length());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", charBuffer0.toString());
      assertNotNull(charBuffer0);
      
      StringBuilder stringBuilder0 = new StringBuilder(charBuffer0);
      assertFalse(charBuffer0.isReadOnly());
      assertEquals(0, charBuffer0.arrayOffset());
      assertTrue(charBuffer0.hasArray());
      assertTrue(charBuffer0.hasRemaining());
      assertEquals(98, charBuffer0.remaining());
      assertEquals(0, charBuffer0.position());
      assertFalse(charBuffer0.isDirect());
      assertEquals(98, charBuffer0.limit());
      assertEquals(98, charBuffer0.capacity());
      assertEquals(98, charBuffer0.length());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", charBuffer0.toString());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      int int0 = DToA.JS_dtoa(0.5, (-439), true, 10, booleanArray0, stringBuilder0);
      assertEquals(6, booleanArray0.length);
      assertFalse(charBuffer0.isReadOnly());
      assertEquals(0, charBuffer0.arrayOffset());
      assertTrue(charBuffer0.hasArray());
      assertTrue(charBuffer0.hasRemaining());
      assertEquals(98, charBuffer0.remaining());
      assertEquals(0, charBuffer0.position());
      assertFalse(charBuffer0.isDirect());
      assertEquals(98, charBuffer0.limit());
      assertEquals(98, charBuffer0.capacity());
      assertEquals(98, charBuffer0.length());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", charBuffer0.toString());
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u00005", stringBuilder0.toString());
      assertEquals(0, int0);
      assertTrue(Arrays.equals(new boolean[] {false, false, false, false, false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      StringBuilder stringBuilder0 = new StringBuilder();
      assertEquals("", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      int int0 = DToA.JS_dtoa(0.49999999999975575, 2, false, 588, booleanArray0, stringBuilder0);
      assertEquals(6, booleanArray0.length);
      assertEquals("49999999999975575093458246556110680103302001953125", stringBuilder0.toString());
      assertEquals(0, int0);
      assertTrue(Arrays.equals(new boolean[] {false, false, false, false, false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[1];
      StringBuilder stringBuilder0 = new StringBuilder("iEoQS&bh\"ZCa%s^+qsy");
      assertEquals("iEoQS&bh\"ZCa%s^+qsy", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      int int0 = DToA.JS_dtoa((-888.143519793439), 5, true, (-5), booleanArray0, stringBuilder0);
      assertEquals(1, booleanArray0.length);
      assertEquals("0", stringBuilder0.toString());
      assertEquals(1, int0);
      assertTrue(Arrays.equals(new boolean[] {true}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("org.mozilla.javascript.DToA");
      assertEquals("org.mozilla.javascript.DToA", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      DToA.JS_dtostr(stringBuilder0, 0, (-65536), 3.0);
      assertEquals("o.rg.mozilla.javascript.DToA3", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("10");
      assertEquals("10", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      DToA.JS_dtostr(stringBuilder0, 3, 3, 2475.0);
      assertEquals("2.48e+3", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      StringBuilder stringBuilder0 = new StringBuilder("iEoQS&bh\"ZCa%s^+qsy");
      assertEquals("iEoQS&bh\"ZCa%s^+qsy", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      int int0 = DToA.JS_dtoa(4.151808E8, 3, true, 1, booleanArray0, stringBuilder0);
      assertEquals(4, booleanArray0.length);
      assertEquals("iEoQS&bh\"ZCa%s^+qsy4151808", stringBuilder0.toString());
      assertEquals(9, int0);
      assertTrue(Arrays.equals(new boolean[] {false, false, false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer();
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertNotNull(stringBuffer0);
      
      StringBuilder stringBuilder0 = new StringBuilder(stringBuffer0);
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertEquals("", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      boolean[] booleanArray0 = new boolean[2];
      int int0 = DToA.JS_dtoa(43, 5, false, 0, booleanArray0, stringBuilder0);
      assertEquals(2, booleanArray0.length);
      assertEquals("", stringBuffer0.toString());
      assertEquals(0, stringBuffer0.length());
      assertEquals("43", stringBuilder0.toString());
      assertEquals(2, int0);
      assertTrue(Arrays.equals(new boolean[] {false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("org.mozilla.javascript.DToA");
      assertEquals("org.mozilla.javascript.DToA", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      boolean[] booleanArray0 = new boolean[3];
      int int0 = DToA.JS_dtoa('^', 4, false, 3, booleanArray0, stringBuilder0);
      assertEquals(3, booleanArray0.length);
      assertEquals("org.mozilla.javascript.DToA94", stringBuilder0.toString());
      assertEquals(2, int0);
      assertTrue(Arrays.equals(new boolean[] {false, false, false}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      assertEquals("", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      DToA.JS_dtostr(stringBuilder0, 2, (-2), 22.02353790644215);
      assertEquals("0", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("org.mozilla.javascript.DToA");
      assertEquals("org.mozilla.javascript.DToA", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      DToA.JS_dtostr(stringBuilder0, 3, 0, 1.0E22);
      assertEquals("o.rg.mozilla.javascript.DToA1e+22", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      assertEquals("", stringBuilder0.toString());
      assertNotNull(stringBuilder0);
      
      DToA.JS_dtostr(stringBuilder0, 2, (-2857), 2500.0);
      assertEquals("0", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      DToA.JS_dtostr(stringBuilder0, 2, 2, 2);
      assertEquals("2.00", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("org.mozilla.javascript.DToA");
      boolean[] booleanArray0 = new boolean[3];
      int int0 = DToA.JS_dtoa(7.6630573001233E-311, 2, false, 0, booleanArray0, stringBuilder0);
      assertEquals("org.mozilla.javascript.DToA\u2B87", stringBuilder0.toString());
      assertEquals((-314), int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[2];
      // Undeclared exception!
      try { 
        DToA.JS_dtoa(2240.83, 6, false, 11, booleanArray0, (StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.DToA", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("org.mozilla.javascript.DToA");
      DToA.JS_dtostr(stringBuilder0, 0, 0, 1.0E22);
      assertEquals("o.rg.mozilla.javascript.DToA1e+22", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      // Undeclared exception!
      try { 
        DToA.JS_dtoa(99998.44393842468, 57320, false, 57320, booleanArray0, (StringBuilder) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.DToA", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("org.mozilla.javascript.DToA");
      DToA.JS_dtostr(stringBuilder0, 0, 0, 7.6630081272404E-311);
      assertEquals("o.rg.mozilla.javascript.DToA76630081272404e-311", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      StringBuilder stringBuilder0 = new StringBuilder(stringBuffer0);
      boolean[] booleanArray0 = new boolean[2];
      int int0 = DToA.JS_dtoa(0, 2233, false, 0, booleanArray0, stringBuilder0);
      assertEquals("0", stringBuilder0.toString());
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer("");
      StringBuilder stringBuilder0 = new StringBuilder(stringBuffer0);
      DToA.JS_dtostr(stringBuilder0, 0, 0, (-2475.607492331));
      assertEquals("-2475.607492331", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DToA dToA0 = new DToA();
  }
}