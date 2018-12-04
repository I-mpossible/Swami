/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 01 05:50:18 GMT 2018
 */

package org.mozilla.javascript;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mozilla.javascript.ObjToIntMap;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ObjToIntMap_ESTest extends ObjToIntMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      Object object0 = new Object();
      objToIntMap0.put(object0, 3737);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      objToIntMap_Iterator0.start();
      assertFalse(objToIntMap0.isEmpty());
      
      objToIntMap_Iterator0.setValue(3737);
      assertFalse(objToIntMap_Iterator0.done());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      // Undeclared exception!
      try { 
        objToIntMap_Iterator0.getValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ObjToIntMap$Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      // Undeclared exception!
      try { 
        objToIntMap_Iterator0.getKey();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mozilla.javascript.ObjToIntMap$Iterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      boolean boolean0 = objToIntMap_Iterator0.done();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      int int0 = objToIntMap_Iterator0.master.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      Object object0 = new Object();
      objToIntMap0.intern(object0);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      Object object1 = new Object();
      objToIntMap_Iterator0.master.intern(object1);
      objToIntMap_Iterator0.master.put((Object) null, 0);
      ObjToIntMap.Iterator objToIntMap_Iterator1 = objToIntMap0.newIterator();
      objToIntMap_Iterator0.master.put(objToIntMap_Iterator1, 0);
      objToIntMap0.put(objToIntMap_Iterator0, 0);
      Object object2 = new Object();
      objToIntMap_Iterator0.master.intern(object2);
      Object object3 = new Object();
      objToIntMap0.intern(object3);
      assertFalse(objToIntMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(4112);
      boolean boolean0 = objToIntMap0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      objToIntMap0.intern((Object) null);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      objToIntMap_Iterator0.start();
      Object object0 = objToIntMap_Iterator0.getKey();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(4087);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      objToIntMap_Iterator0.start();
      assertTrue(objToIntMap_Iterator0.done());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      boolean boolean0 = objToIntMap0.has((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      Object object0 = new Object();
      objToIntMap_Iterator0.master.intern(object0);
      objToIntMap_Iterator0.master.getKeys();
      assertEquals(1, objToIntMap0.size());
      assertFalse(objToIntMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        objToIntMap0.getExisting(object0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // FAILED ASSERTION
         //
         verifyException("org.mozilla.javascript.Kit", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(4112);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      Object object0 = objToIntMap0.intern(objToIntMap_Iterator0);
      assertNotNull(object0);
      
      int int0 = objToIntMap0.get(object0, 4112);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(4112);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      int int0 = objToIntMap0.get(objToIntMap_Iterator0, 4112);
      assertEquals(4112, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      Object object0 = new Object();
      objToIntMap0.intern(object0);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      Object object1 = new Object();
      objToIntMap_Iterator0.master.intern(object1);
      objToIntMap_Iterator0.master.put((Object) null, 0);
      objToIntMap0.newIterator();
      ObjToIntMap objToIntMap1 = new ObjToIntMap(0);
      objToIntMap1.newIterator();
      objToIntMap1.newIterator();
      Object object2 = new Object();
      Object object3 = objToIntMap_Iterator0.master.intern(object2);
      objToIntMap_Iterator0.master.getExisting(object3);
      assertEquals(4, objToIntMap0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      Object object0 = objToIntMap_Iterator0.master.intern(objToIntMap0);
      assertFalse(objToIntMap0.isEmpty());
      
      objToIntMap_Iterator0.master.remove(object0);
      objToIntMap0.remove(object0);
      assertEquals(0, objToIntMap0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      ObjToIntMap.Iterator objToIntMap_Iterator0 = objToIntMap0.newIterator();
      Object object0 = new Object();
      objToIntMap_Iterator0.master.intern(object0);
      ObjToIntMap objToIntMap1 = (ObjToIntMap)objToIntMap_Iterator0.master.intern(objToIntMap0);
      objToIntMap_Iterator0.master.remove(objToIntMap1);
      objToIntMap_Iterator0.master.newIterator();
      ObjToIntMap objToIntMap2 = new ObjToIntMap();
      objToIntMap_Iterator0.master.newIterator();
      objToIntMap2.newIterator();
      objToIntMap2.newIterator();
      objToIntMap1.newIterator();
      Object object1 = new Object();
      objToIntMap_Iterator0.master.intern(object1);
      Object object2 = new Object();
      objToIntMap0.intern(object2);
      assertEquals(3, objToIntMap0.size());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap();
      Object object0 = new Object();
      objToIntMap0.intern(object0);
      ObjToIntMap.Iterator objToIntMap_Iterator0 = new ObjToIntMap.Iterator(objToIntMap0);
      Object object1 = new Object();
      objToIntMap_Iterator0.master.intern(object1);
      objToIntMap_Iterator0.master.put((Object) null, 0);
      ObjToIntMap objToIntMap1 = new ObjToIntMap();
      ObjToIntMap objToIntMap2 = new ObjToIntMap(0);
      objToIntMap2.newIterator();
      Object object2 = new Object();
      objToIntMap_Iterator0.master.intern(object2);
      Object object3 = new Object();
      objToIntMap_Iterator0.master.intern(object3);
      objToIntMap0.intern(object3);
      assertEquals(5, objToIntMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(4087);
      Object object0 = new Object();
      objToIntMap0.put(object0, 4087);
      objToIntMap0.remove(object0);
      objToIntMap0.put(object0, 4087);
      assertFalse(objToIntMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(4087);
      Object object0 = new Object();
      objToIntMap0.put(object0, 4087);
      objToIntMap0.put(object0, 4087);
      assertFalse(objToIntMap0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ObjToIntMap objToIntMap0 = new ObjToIntMap(4087);
      Object object0 = new Object();
      objToIntMap0.put(object0, 4087);
      objToIntMap0.clear();
      assertTrue(objToIntMap0.isEmpty());
  }
}