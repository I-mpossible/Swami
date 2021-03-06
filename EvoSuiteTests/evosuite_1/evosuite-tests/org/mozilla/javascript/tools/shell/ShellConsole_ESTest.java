/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 20:18:02 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.ShellConsole;
import org.mozilla.javascript.typedarrays.NativeUint16Array;
import org.mozilla.javascript.typedarrays.NativeUint8Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ShellConsole_ESTest extends ShellConsole_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("jline.console.ConsoleReader");
      mockPrintStream0.print((String) null);
      Charset charset0 = Charset.defaultCharset();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)83;
      byteArray0[1] = (byte)47;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)26;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)80;
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte)1;
      byteArray0[8] = (byte)83;
      pipedOutputStream0.write(byteArray0);
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) pipedInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.println("jline.console.ConsoleReader");
      shellConsole0.readLine("");
      shellConsole0.flush();
      shellConsole0.print("jline.console.ConsoleReader");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NativeUint8Array nativeUint8Array0 = new NativeUint8Array(0);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole.getConsole((Scriptable) nativeUint8Array0, charset0);
      NativeUint16Array nativeUint16Array0 = new NativeUint16Array();
      String string0 = "println";
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      // Undeclared exception!
      try { 
        Charset.forName("println");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // println
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream(pipedOutputStream0);
      mockPrintStream0.checkError();
      pipedOutputStream0.close();
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) pipedInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.println("");
      shellConsole0.println();
      shellConsole0.getIn();
      shellConsole0.readLine();
      shellConsole0.println((String) null);
      shellConsole0.println("addCompletor");
      shellConsole0.readLine();
      InputStream inputStream0 = shellConsole0.getIn();
      assertSame(pipedInputStream0, inputStream0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("jline.console.ConsoleReader");
      mockPrintStream0.print((String) null);
      Charset charset0 = Charset.defaultCharset();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)83;
      byteArray0[1] = (byte)47;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)26;
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)80;
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)86;
      pipedOutputStream0.write(byteArray0);
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) pipedInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.println("jline.console.ConsoleReader");
      shellConsole0.readLine("search");
      shellConsole0.flush();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(pipedInputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(bufferedInputStream0, pipedInputStream0);
      File file0 = MockFile.createTempFile("addCompleter", "7", (File) null);
      MockPrintStream mockPrintStream0 = new MockPrintStream(file0);
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) sequenceInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.println();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 1361);
      MockPrintStream mockPrintStream0 = new MockPrintStream("addCompleter");
      // Undeclared exception!
      try { 
        ShellConsole.getConsole((InputStream) pipedInputStream0, (PrintStream) mockPrintStream0, (Charset) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // charset
         //
         verifyException("java.io.InputStreamReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        ShellConsole.getConsole((InputStream) null, (PrintStream) null, charset0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.Writer", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("jline.console.ConsoleReader");
      mockPrintStream0.print((String) null);
      Charset charset0 = Charset.defaultCharset();
      byte[] byteArray0 = new byte[9];
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)26;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)10;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)86;
      pipedOutputStream0.write(byteArray0);
      ShellConsole shellConsole0 = ShellConsole.getConsole((InputStream) pipedInputStream0, (PrintStream) mockPrintStream0, charset0);
      shellConsole0.readLine("jline.console.ConsoleReader");
      shellConsole0.flush();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      ShellConsole shellConsole0 = ShellConsole.getConsole((Scriptable) null, charset0);
      assertNull(shellConsole0);
      
      Charset charset1 = Charset.defaultCharset();
      assertSame(charset1, charset0);
  }
}
