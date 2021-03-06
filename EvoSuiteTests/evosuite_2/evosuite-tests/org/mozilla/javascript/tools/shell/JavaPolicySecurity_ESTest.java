/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 31 20:58:54 GMT 2018
 */

package org.mozilla.javascript.tools.shell;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.security.AllPermission;
import java.security.ProtectionDomain;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.GeneratedClassLoader;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.tools.shell.JavaPolicySecurity;
import org.mozilla.javascript.typedarrays.NativeArrayBuffer;
import org.mozilla.javascript.typedarrays.NativeUint32Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavaPolicySecurity_ESTest extends JavaPolicySecurity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Object object0 = javaPolicySecurity0.getDynamicSecurityDomain((Object) null);
      Class<Integer> class0 = Integer.class;
      try { 
        Context.jsToJava(object0, class0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Cannot convert ProtectionDomain  null
         //  null
         //  <no principals>
         //  org.mozilla.javascript.tools.shell.JavaPolicySecurity$ContextPermissions@2 (context=java.security.AccessControlContext@35202e9a, static_permitions=null)
         //  to java.lang.Integer
         //
         verifyException("org.mozilla.javascript.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Object object0 = javaPolicySecurity0.getDynamicSecurityDomain((Object) null);
      AllPermission allPermission0 = new AllPermission();
      ProtectionDomain protectionDomain0 = (ProtectionDomain)javaPolicySecurity0.getDynamicSecurityDomain(object0);
      assertNotNull(protectionDomain0);
      
      boolean boolean0 = protectionDomain0.implies(allPermission0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NativeArrayBuffer nativeArrayBuffer0 = NativeArrayBuffer.EMPTY_BUFFER;
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      // Undeclared exception!
      try { 
        javaPolicySecurity0.callProcessFileSecure((Context) null, nativeArrayBuffer0, "file:");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.SourceReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        javaPolicySecurity0.callProcessFileSecure(context0, (Scriptable) null, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can not construct file URL for 'null':null
         //
         verifyException("org.mozilla.javascript.tools.shell.JavaPolicySecurity", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      Class<?> class0 = javaPolicySecurity0.getStaticSecurityDomainClassInternal();
      assertFalse(class0.isArray());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      GeneratedClassLoader generatedClassLoader0 = javaPolicySecurity0.createClassLoader((ClassLoader) null, (Object) null);
      assertNotNull(generatedClassLoader0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JavaPolicySecurity javaPolicySecurity0 = new JavaPolicySecurity();
      NativeUint32Array nativeUint32Array0 = new NativeUint32Array();
      // Undeclared exception!
      try { 
        javaPolicySecurity0.callProcessFileSecure((Context) null, nativeUint32Array0, "/home/mmotwani/rhino/buildGjadlf/libs/evosuite_2/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.tools.SourceReader", e);
      }
  }
}
