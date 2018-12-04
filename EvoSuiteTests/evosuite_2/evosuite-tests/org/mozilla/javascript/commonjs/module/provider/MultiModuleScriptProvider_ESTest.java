/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 02:39:02 GMT 2018
 */

package org.mozilla.javascript.commonjs.module.provider;

import org.junit.Test;
import static org.junit.Assert.*;
import java.net.URI;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.commonjs.module.ModuleScript;
import org.mozilla.javascript.commonjs.module.provider.MultiModuleScriptProvider;
import org.mozilla.javascript.typedarrays.NativeFloat64Array;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiModuleScriptProvider_ESTest extends MultiModuleScriptProvider_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Stack<MultiModuleScriptProvider> stack0 = new Stack<MultiModuleScriptProvider>();
      MultiModuleScriptProvider multiModuleScriptProvider0 = new MultiModuleScriptProvider(stack0);
      URI uRI0 = MockURI.aHttpURI;
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array();
      ModuleScript moduleScript0 = multiModuleScriptProvider0.getModuleScript((Context) null, ",5uNi*35Z", uRI0, uRI0, nativeFloat64Array0);
      assertNull(moduleScript0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Stack<MultiModuleScriptProvider> stack0 = new Stack<MultiModuleScriptProvider>();
      MultiModuleScriptProvider multiModuleScriptProvider0 = new MultiModuleScriptProvider(stack0);
      stack0.add(multiModuleScriptProvider0);
      MultiModuleScriptProvider multiModuleScriptProvider1 = new MultiModuleScriptProvider(stack0);
      URI uRI0 = MockURI.aHttpURI;
      NativeFloat64Array nativeFloat64Array0 = new NativeFloat64Array();
      ModuleScript moduleScript0 = multiModuleScriptProvider1.getModuleScript((Context) null, ",5uNi*35Z", uRI0, uRI0, nativeFloat64Array0);
      assertNull(moduleScript0);
  }
}