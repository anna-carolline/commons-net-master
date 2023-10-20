/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 22:14:38 GMT 2023
 */

package org.apache.commons.net.nntp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.nntp.NntpThreadContainer;
import org.apache.commons.net.nntp.Threadable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NntpThreadContainer_ESTest extends NntpThreadContainer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NntpThreadContainer nntpThreadContainer0 = new NntpThreadContainer();
      nntpThreadContainer0.findChild((NntpThreadContainer) null);
      nntpThreadContainer0.flush();
      nntpThreadContainer0.findChild((NntpThreadContainer) null);
      nntpThreadContainer0.reverseChildren();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NntpThreadContainer nntpThreadContainer0 = new NntpThreadContainer();
      nntpThreadContainer0.reverseChildren();
      NntpThreadContainer nntpThreadContainer1 = new NntpThreadContainer();
      nntpThreadContainer1.parent = nntpThreadContainer0;
      nntpThreadContainer0.child = nntpThreadContainer1;
      nntpThreadContainer0.child = nntpThreadContainer1;
      // Undeclared exception!
      try { 
        nntpThreadContainer0.flush();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no threadable in org.apache.commons.net.nntp.NntpThreadContainer@0000000002
         //
         verifyException("org.apache.commons.net.nntp.NntpThreadContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NntpThreadContainer nntpThreadContainer0 = new NntpThreadContainer();
      NntpThreadContainer nntpThreadContainer1 = new NntpThreadContainer();
      nntpThreadContainer0.child = nntpThreadContainer1;
      Threadable threadable0 = nntpThreadContainer0.threadable;
      nntpThreadContainer0.child.reverseChildren();
      nntpThreadContainer1.next = nntpThreadContainer0.child;
      nntpThreadContainer1.threadable = null;
      nntpThreadContainer0.findChild(nntpThreadContainer1);
      nntpThreadContainer0.findChild(nntpThreadContainer1);
      nntpThreadContainer0.parent = nntpThreadContainer1.next;
      nntpThreadContainer0.child.reverseChildren();
      nntpThreadContainer0.parent.next = nntpThreadContainer1;
      // Undeclared exception!
      nntpThreadContainer0.reverseChildren();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NntpThreadContainer nntpThreadContainer0 = new NntpThreadContainer();
      nntpThreadContainer0.reverseChildren();
      NntpThreadContainer nntpThreadContainer1 = new NntpThreadContainer();
      nntpThreadContainer1.parent = nntpThreadContainer0;
      nntpThreadContainer0.child = nntpThreadContainer1;
      nntpThreadContainer0.child = nntpThreadContainer1;
      // Undeclared exception!
      try { 
        nntpThreadContainer0.flush();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no threadable in org.apache.commons.net.nntp.NntpThreadContainer@0000000002
         //
         verifyException("org.apache.commons.net.nntp.NntpThreadContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NntpThreadContainer nntpThreadContainer0 = new NntpThreadContainer();
      NntpThreadContainer nntpThreadContainer1 = new NntpThreadContainer();
      nntpThreadContainer0.next = nntpThreadContainer1;
      nntpThreadContainer0.threadable = null;
      nntpThreadContainer0.parent = nntpThreadContainer1;
      nntpThreadContainer0.child = nntpThreadContainer1;
      nntpThreadContainer1.threadable = null;
      nntpThreadContainer0.parent.reverseChildren();
      nntpThreadContainer0.child = nntpThreadContainer1;
      nntpThreadContainer1.threadable = null;
      nntpThreadContainer0.reverseChildren();
      nntpThreadContainer1.findChild(nntpThreadContainer0);
      nntpThreadContainer0.parent.reverseChildren();
      nntpThreadContainer0.reverseChildren();
      nntpThreadContainer0.parent.reverseChildren();
      // Undeclared exception!
      try { 
        nntpThreadContainer0.flush();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no threadable in org.apache.commons.net.nntp.NntpThreadContainer@0000000001
         //
         verifyException("org.apache.commons.net.nntp.NntpThreadContainer", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NntpThreadContainer nntpThreadContainer0 = new NntpThreadContainer();
      NntpThreadContainer nntpThreadContainer1 = new NntpThreadContainer();
      nntpThreadContainer0.child = nntpThreadContainer1;
      nntpThreadContainer1.next = nntpThreadContainer0.child;
      // Undeclared exception!
      nntpThreadContainer0.reverseChildren();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NntpThreadContainer nntpThreadContainer0 = new NntpThreadContainer();
      nntpThreadContainer0.findChild(nntpThreadContainer0);
      nntpThreadContainer0.flush();
      nntpThreadContainer0.findChild(nntpThreadContainer0);
      nntpThreadContainer0.findChild(nntpThreadContainer0);
      nntpThreadContainer0.reverseChildren();
      nntpThreadContainer0.flush();
      nntpThreadContainer0.reverseChildren();
      nntpThreadContainer0.flush();
      nntpThreadContainer0.reverseChildren();
      nntpThreadContainer0.next = nntpThreadContainer0;
      nntpThreadContainer0.flush();
      nntpThreadContainer0.flush();
      nntpThreadContainer0.reverseChildren();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NntpThreadContainer nntpThreadContainer0 = new NntpThreadContainer();
      NntpThreadContainer nntpThreadContainer1 = new NntpThreadContainer();
      nntpThreadContainer0.child = nntpThreadContainer1;
      nntpThreadContainer0.flush();
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NntpThreadContainer nntpThreadContainer0 = new NntpThreadContainer();
      nntpThreadContainer0.parent = null;
      NntpThreadContainer nntpThreadContainer1 = new NntpThreadContainer();
      nntpThreadContainer0.child = nntpThreadContainer1;
      nntpThreadContainer0.flush();
      nntpThreadContainer0.findChild((NntpThreadContainer) null);
  }
}
