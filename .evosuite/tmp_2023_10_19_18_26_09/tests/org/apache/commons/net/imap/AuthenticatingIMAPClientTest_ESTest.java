/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 21:52:17 GMT 2023
 */

package org.apache.commons.net.imap;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.imap.AuthenticatingIMAPClient;
import org.apache.commons.net.imap.AuthenticatingIMAPClientTest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.opentest4j.AssertionFailedError;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AuthenticatingIMAPClientTest_ESTest extends AuthenticatingIMAPClientTest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AuthenticatingIMAPClientTest authenticatingIMAPClientTest0 = new AuthenticatingIMAPClientTest();
      AuthenticatingIMAPClient.AUTH_METHOD authenticatingIMAPClient_AUTH_METHOD0 = AuthenticatingIMAPClient.AUTH_METHOD.PLAIN;
      authenticatingIMAPClientTest0.getAuthName("PLAIN", authenticatingIMAPClient_AUTH_METHOD0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AuthenticatingIMAPClientTest authenticatingIMAPClientTest0 = new AuthenticatingIMAPClientTest();
      // Undeclared exception!
      try { 
        authenticatingIMAPClientTest0.getAuthName("Uq/D8vMXKB[f{", (AuthenticatingIMAPClient.AUTH_METHOD) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.imap.AuthenticatingIMAPClientTest", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AuthenticatingIMAPClientTest authenticatingIMAPClientTest0 = new AuthenticatingIMAPClientTest();
      AuthenticatingIMAPClient.AUTH_METHOD authenticatingIMAPClient_AUTH_METHOD0 = AuthenticatingIMAPClient.AUTH_METHOD.PLAIN;
      // Undeclared exception!
      try { 
        authenticatingIMAPClientTest0.getAuthName("EMy-", authenticatingIMAPClient_AUTH_METHOD0);
        fail("Expecting exception: AssertionFailedError");
      
      } catch(AssertionFailedError e) {
         //
         // expected: <EMy-> but was: <PLAIN>
         //
         verifyException("org.junit.jupiter.api.AssertionFailureBuilder", e);
      }
  }
}
