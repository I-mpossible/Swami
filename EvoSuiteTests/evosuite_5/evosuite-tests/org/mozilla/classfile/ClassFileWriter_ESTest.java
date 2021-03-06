/*
 * This file was automatically generated by EvoSuite
 * Fri Aug 03 06:59:27 GMT 2018
 */

package org.mozilla.classfile;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.classfile.ClassFileWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ClassFileWriter_ESTest extends ClassFileWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      ClassFileWriter.StackMapTable classFileWriter_StackMapTable0 = classFileWriter0.new StackMapTable();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        classFileWriter_StackMapTable0.write(byteArray0, (short)256);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 256
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      ClassFileWriter.StackMapTable classFileWriter_StackMapTable0 = classFileWriter0.new StackMapTable();
      // Undeclared exception!
      try { 
        classFileWriter_StackMapTable0.computeWriteSize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileWriter$StackMapTable", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte) (-91), "`T4k[z!>A", (String) null, "aKZ^yw`0V1 ");
      String string0 = classFileWriter_MHandle0.toString();
      assertEquals("`T4k[z!>A.nullaKZ^yw`0V1  (-91)", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte) (-91), "`T4k[z!>A", (String) null, "aKZ^~w`0V1?");
      boolean boolean0 = classFileWriter_MHandle0.equals(classFileWriter_MHandle0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte)75, "", "", "|-#sFUaCY-0");
      boolean boolean0 = classFileWriter_MHandle0.equals(classFileWriter0);
      assertFalse(boolean0);
      assertEquals("", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte)66, "V:EY0", "", "Lorg/mozilla/classfile/ClassFileField;");
      Object[] objectArray0 = new Object[4];
      ClassFileWriter.BootstrapEntry classFileWriter_BootstrapEntry0 = null;
      try {
        classFileWriter_BootstrapEntry0 = classFileWriter0.new BootstrapEntry(classFileWriter_MHandle0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // value null
         //
         verifyException("org.mozilla.classfile.ConstantPool", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("Z04KE(}YDuFcTbFZF", "Z04KE(}YDuFcTbFZF", "Z04KE(}YDuFcTbFZF");
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte)17, "H0G", "", "org.mozilla.classfile.ClassFileField");
      Object[] objectArray0 = new Object[0];
      ClassFileWriter.BootstrapEntry classFileWriter_BootstrapEntry0 = classFileWriter0.new BootstrapEntry(classFileWriter_MHandle0, objectArray0);
      boolean boolean0 = classFileWriter_BootstrapEntry0.equals(classFileWriter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("aKZ^~w`0V1?", "aKZ^~w`0V1?", "aKZ^~w`0V1?");
      // Undeclared exception!
      try { 
        classFileWriter0.addLStore(3);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -2
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addAStore((short)1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -1
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", ")0~\"vCfu@", "g-OLG4O'");
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(1561);
      classFileWriter0.write(byteArrayOutputStream0);
      assertEquals(77, byteArrayOutputStream0.size());
      assertEquals("\uFFFD\uFFFD\uFFFD\uFFFD\u0000\u0000\u00004\u0000\u0007\u0001\u0000\u0000\u0007\u0000\u0001\u0001\u0000\t)0~\"vCfu@\u0007\u0000\u0003\u0001\u0000\bg-OLG4O'\u0001\u0000\nSourceFile\u0000!\u0000\u0002\u0000\u0004\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0006\u0000\u0000\u0000\u0002\u0000\u0005", byteArrayOutputStream0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("OSD)j&J", "OSD)j&J", "");
      // Undeclared exception!
      try { 
        classFileWriter0.stopMethod((short) (-2192));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No method to stop
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addInvoke((-68), "", "", "(java/lang/String;)Ljava/lang/StringBuilder;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad parameter signature: (java/lang/String;)Ljava/lang/StringBuilder;
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "|iMG.U NOWkQB", "");
      // Undeclared exception!
      try { 
        classFileWriter0.setTableSwitchJump((-4228), (-4228), (-4228));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad jump target: -4228
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("<init>", "<init>", "@aLAjy$4X");
      classFileWriter0.setStackTop((short)224);
      assertEquals((short)224, classFileWriter0.getStackTop());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("z|MA}]", "z|MA}]", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.setFlags((short)191);
      assertEquals("z|MA}]", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      // Undeclared exception!
      try { 
        classFileWriter0.add(216);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad opcode: 216
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      // Undeclared exception!
      try { 
        classFileWriter0.markTableSwitchDefault(736);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 736 is outside a possible range of tableswitch in already generated code
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "k$4l/~;_Zrc#0T(O", "\"#t");
      // Undeclared exception!
      try { 
        classFileWriter0.markTableSwitchCase(127, 127, 127);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad stack index: 127
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("!70uPWZ", "Uh0p;t!8f~`{_ce", "Uh0p;t!8f~`{_ce");
      // Undeclared exception!
      try { 
        classFileWriter0.markTableSwitchCase(296, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("pbC", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.markLabel((int) (short) (-577), (short) (-577));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad label
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("org.mozilla.classfile.SuperBlock", "org.mozilla.classfile.SuperBlock", "");
      // Undeclared exception!
      try { 
        classFileWriter0.markLabel(Integer.MIN_VALUE, (short)15);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("0w#C}H`\"(AKjo|Wquv", "0w#C}H`\"(AKjo|Wquv", "");
      // Undeclared exception!
      try { 
        classFileWriter0.markHandler(6);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad label, no biscuit
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("S}+", "S}+", "5_,");
      classFileWriter0.isUnderStringSizeLimit("S}+");
      assertEquals("S}+", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      // Undeclared exception!
      try { 
        classFileWriter0.toByteArray();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.classfile.ClassFileMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      short short0 = classFileWriter0.getStackTop();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "B=%6Rv8Z$[t", "B=%6Rv8Z$[t");
      // Undeclared exception!
      try { 
        classFileWriter0.getLabelPC(1973);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad label, no biscuit
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.getLabelPC((-1627));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad label
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("generated bytecode for method exceeds 64K limit.", "generated bytecode for method exceeds 64K limit.", "0Z3'9b3)KTzW!2_H>");
      int int0 = classFileWriter0.getCurrentCodeOffset();
      assertEquals(0, int0);
      assertEquals("generated bytecode for method exceeds 64K limit.", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("OBm=Ly)fgP|Tk\t$qup", "org.mozilla.classfile.ClassFileField", " \u2209 [0, ");
      String string0 = classFileWriter0.getClassName();
      assertEquals("OBm=Ly)fgP|Tk\t$qup", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad offset: ", "bad offset: ", "bad offset: ");
      char[] charArray0 = classFileWriter0.getCharBuffer(1024);
      assertEquals(1024, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      // Undeclared exception!
      try { 
        classFileWriter0.stopMethod((short)32);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad method type
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String string0 = ClassFileWriter.classNameToSignature("org.mozilla.classfile.ClassFileField");
      assertEquals("Lorg/mozilla/classfile/ClassFileField;", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.adjustStackTop((-196));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -196
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.adjustStackTop((short)64);
      assertEquals((short)64, classFileWriter0.getStackTop());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.addVariableDescriptor("", "org.mozilla.classfile.ExceptionTableEntry", 254, 12);
      assertEquals("", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addTableSwitch(0, (-806));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Bad bounds: 0 -806
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "0Z\u0006k'9b3)KjzW2_H>");
      // Undeclared exception!
      try { 
        classFileWriter0.addTableSwitch(3755, 3755);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -1
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      // Undeclared exception!
      try { 
        classFileWriter0.markTableSwitchCase(7, 7);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7 is outside a possible range of tableswitch in already generated code
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("LZ", "Please build and run with JDK 1.7 for invokedynamic support", "Please build and run with JDK 1.7 for invokedynamic support");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush(false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("Z04KE(}YDuFcTbFZF", "Z04KE(}YDuFcTbFZF", "Z04KE(}YDuFcTbFZF");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("ARtp,L,]LU", "ARtp,L,]LU", "F/aMo$teryMS2");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush(1452.957582191);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      classFileWriter0.addPush(1.0);
      assertEquals((short)2, classFileWriter0.getStackTop());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "]DEk>$0gWb1_u5", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush(0.0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad method type", "out of range variable", "bad method type");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush("bad method type");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9cZ[", (short)32);
      classFileWriter0.addLoadConstant((-2596L));
      assertEquals((short)2, classFileWriter0.getStackTop());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      classFileWriter0.addLoadConstant((int) (short)4);
      assertEquals(1, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter(":$sH?u`V/(.S+", "Please build and run with JDK 1.7 for invokedynamic support", ":$sH?u`V/(.S+");
      // Undeclared exception!
      try { 
        classFileWriter0.addLoadConstant(1568.7957F);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      classFileWriter0.addLineNumberEntry((short)475);
      assertEquals("", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      // Undeclared exception!
      try { 
        classFileWriter0.addLineNumberEntry((short)475);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to stop
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addLStore(127);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -2
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("(I)V", "(I)V", "(I)V");
      classFileWriter0.startMethod("(I)V", "(I)V", (short) (-14));
      classFileWriter0.addLLoad(346);
      assertEquals((short)2, classFileWriter0.getStackTop());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("aKZ^yw`0V1 ", "aKZ^yw`0V1 ", "aKZ^yw`0V1 ");
      ClassFileWriter.MHandle classFileWriter_MHandle0 = new ClassFileWriter.MHandle((byte) (-91), "`T4k[z!>A", (String) null, "aKZ^yw`0V1 ");
      Object[] objectArray0 = new Object[4];
      // Undeclared exception!
      try { 
        classFileWriter0.addInvokeDynamic("aKZ^yw`0V1 ", "`T4k[z!>A", classFileWriter_MHandle0, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad parameter signature: `T4k[z!>A
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addInvoke(12, "", "", "(Ljava/lang/String;)Ljava/lang/StringBuilder;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad opcode for method reference
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addInvoke((-68), "", "", "(Ljava/lang/String;)Ljava/lang/StringBuilder;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad opcode: -68
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.addInterface("\t");
      assertEquals("", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addILoad((-2031));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // out of range variable
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("Kk{j~|NpgF", "Kk{j~|NpgF", "");
      classFileWriter0.addField("+?", "Kk{j~|NpgF", (short) (-1131), (-605L));
      assertEquals("Kk{j~|NpgF", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("9>SJA2l_a@ek%0r", "9>SJA2l_a@ek%0r", "9>SJA2l_a@ek%0r");
      classFileWriter0.addField("9>SJA2l_a@ek%0r", "", (short) (-1), (int) (short) (-1));
      byte[] byteArray0 = classFileWriter0.toByteArray();
      //  // Unstable assertion: assertEquals(124, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("fX%4:", "", "fX%4:");
      classFileWriter0.addField("3Lo751v@B9a}.G", "org.mozilla.javascript.ObjArray", (short)31161, (double) (short)31161);
      assertEquals((short)16, ClassFileWriter.ACC_FINAL);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("out of range increment", "e,J>v.wD|/", "");
      classFileWriter0.addField("Bc6m |>AATz", "q_d", (short)0);
      assertEquals("out of range increment", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      classFileWriter0.addLoadConstant(0.0);
      classFileWriter0.addFStore((short)128);
      assertEquals(5, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("TH", "TH", "TH");
      // Undeclared exception!
      try { 
        classFileWriter0.addFLoad((short)2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", ")0~\"vCfu@", "g-OLG4O'");
      // Undeclared exception!
      try { 
        classFileWriter0.addExceptionHandler((byte) (-76), 953, 3, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad endLabel
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("z|MA}]", "z|MA}]", "org.mozilla.classfile.ExceptionTableEntry");
      // Undeclared exception!
      try { 
        classFileWriter0.addExceptionHandler(2047, 2047, 2047, "org.mozilla.classfile.ExceptionTableEntry");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad startLabel
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      // Undeclared exception!
      try { 
        classFileWriter0.addExceptionHandler((-3055), (-3055), 1078, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Bad handlerLabel
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      classFileWriter0.addDLoad(736);
      assertEquals(4, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      classFileWriter0.addLoadConstant(0.0);
      classFileWriter0.addAStore(3190);
      assertEquals(7, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("*", "*", "");
      // Undeclared exception!
      try { 
        classFileWriter0.add(15, "", "*", "I3A/hOt!9'T->(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad opcode for field reference
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("{PAUn/2px", "{PAUn/2px", "");
      // Undeclared exception!
      try { 
        classFileWriter0.add(3, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // bad opcode for class reference
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("SroEu%qb -![S(%o", "J!z0c==`5_wtyZ", "$");
      // Undeclared exception!
      try { 
        classFileWriter0.add(156, 161, (-131));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -1
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("N9nAw7", "N9nAw7", "N9nAw7");
      // Undeclared exception!
      try { 
        classFileWriter0.add(0, (int) (short)1631);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected opcode for 1 operand
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)44);
      classFileWriter0.addLoadConstant(0.0);
      classFileWriter0.addDStore(15);
      assertEquals(5, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      classFileWriter0.addLoadConstant((-4032));
      assertEquals(2, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      classFileWriter0.addLoadConstant(0.0);
      classFileWriter0.addIStore(954);
      assertEquals(7, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      classFileWriter0.addPush(2231);
      assertEquals((short)1, classFileWriter0.getStackTop());
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("9>SJA2l_a@ek%0r", "9>SJA2l_a@ek%0r", "9>SJA2l_a@ek%0r");
      // Undeclared exception!
      try { 
        classFileWriter0.addPush((-2417L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)29);
      classFileWriter0.addPush(11);
      assertEquals(2, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      classFileWriter0.startMethod("", "e0x:+m9c![", (short)32);
      classFileWriter0.addLoadThis();
      assertEquals(1, classFileWriter0.getCurrentCodeOffset());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("LGW", "auS/|Sm", "T%iqOsp");
      // Undeclared exception!
      try { 
        classFileWriter0.addLoadConstant(5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // No method to add to
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      // Undeclared exception!
      try { 
        classFileWriter0.add(16);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unexpected operands
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("bad offset: ", "=", "bad offset: ");
      // Undeclared exception!
      try { 
        classFileWriter0.addAStore(0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Stack underflow: -1
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "org.mozilla.classfile.ExceptionTableEntry");
      int int0 = classFileWriter0.acquireLabel();
      assertEquals(Integer.MIN_VALUE, int0);
      assertEquals("", classFileWriter0.getClassName());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      ClassFileWriter classFileWriter0 = new ClassFileWriter("", "", "");
      // Undeclared exception!
      try { 
        classFileWriter0.addALoad((-3055));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // out of range variable
         //
         verifyException("org.mozilla.classfile.ClassFileWriter", e);
      }
  }
}
