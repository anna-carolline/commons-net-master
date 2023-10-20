/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 21:36:28 GMT 2023
 */

package org.apache.commons.net.examples.unix;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import org.apache.commons.net.examples.unix.chargen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class chargen_ESTest extends chargen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        chargen.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40000);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("127.0.0.1", 19);
      byte[] byteArray0 = new byte[6];
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, evoSuiteRemoteAddress0, byteArray0);
      try { 
        chargen.chargenUDP((String) null);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IO exception
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoDatagramSocketImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        chargen.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.examples.unix.chargen", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        chargen.chargenTCP((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hostname can't be null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-idp";
      // Undeclared exception!
      try { 
        chargen.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        chargen.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        chargen.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // hostname can't be null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "-udp";
      // Undeclared exception!
      try { 
        chargen.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      chargen chargen0 = new chargen();
  }
}
