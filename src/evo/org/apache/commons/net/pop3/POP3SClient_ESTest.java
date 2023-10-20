/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:37:03 GMT 2023
 */

package org.apache.commons.net.pop3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.commons.net.pop3.POP3SClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class POP3SClient_ESTest extends POP3SClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient();
      String[] stringArray0 = new String[0];
      pOP3SClient0.setEnabledProtocols(stringArray0);
      assertEquals(110, pOP3SClient0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SSLContext sSLContext0 = mock(SSLContext.class, new ViolatedAssumptionAnswer());
      POP3SClient pOP3SClient0 = new POP3SClient(false, sSLContext0);
      pOP3SClient0.setEndpointCheckingEnabled(true);
      boolean boolean0 = pOP3SClient0.isEndpointCheckingEnabled();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient();
      // Undeclared exception!
      try { 
        pOP3SClient0.execTLS();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Socket is not connected
         //
         verifyException("org.apache.commons.net.pop3.POP3", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient(";", true, (SSLContext) null);
      assertEquals(995, pOP3SClient0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient("", false, (SSLContext) null);
      assertEquals(110, pOP3SClient0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient("", true);
      // Undeclared exception!
      try { 
        pOP3SClient0.setEnabledCipherSuites((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.pop3.POP3SClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SSLContext sSLContext0 = mock(SSLContext.class, new ViolatedAssumptionAnswer());
      POP3SClient pOP3SClient0 = new POP3SClient(true, sSLContext0);
      pOP3SClient0.getEnabledProtocols();
      assertEquals(995, pOP3SClient0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient();
      pOP3SClient0.getEnabledCipherSuites();
      assertEquals(110, pOP3SClient0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient(true);
      // Undeclared exception!
      try { 
        pOP3SClient0._connectAction_();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.SocketClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient(true);
      pOP3SClient0.setHostnameVerifier((HostnameVerifier) null);
      assertEquals(995, pOP3SClient0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient(true);
      pOP3SClient0.setTrustManager((TrustManager) null);
      assertEquals(995, pOP3SClient0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient(true);
      pOP3SClient0.getTrustManager();
      assertEquals(995, pOP3SClient0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient(true);
      pOP3SClient0.getHostnameVerifier();
      assertEquals(995, pOP3SClient0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SSLContext sSLContext0 = mock(SSLContext.class, new ViolatedAssumptionAnswer());
      POP3SClient pOP3SClient0 = new POP3SClient(sSLContext0);
      // Undeclared exception!
      try { 
        pOP3SClient0._connectAction_();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.SocketClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient(true);
      String[] stringArray0 = new String[6];
      pOP3SClient0.setEnabledCipherSuites(stringArray0);
      assertEquals(995, pOP3SClient0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SSLContext sSLContext0 = mock(SSLContext.class, new ViolatedAssumptionAnswer());
      POP3SClient pOP3SClient0 = new POP3SClient(false, sSLContext0);
      pOP3SClient0.isEndpointCheckingEnabled();
      assertEquals(110, pOP3SClient0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient("");
      assertEquals(110, pOP3SClient0.getDefaultPort());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient();
      // Undeclared exception!
      try { 
        pOP3SClient0.setEnabledProtocols((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.pop3.POP3SClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      POP3SClient pOP3SClient0 = new POP3SClient();
      KeyManager keyManager0 = mock(KeyManager.class, new ViolatedAssumptionAnswer());
      pOP3SClient0.setKeyManager(keyManager0);
      assertEquals(110, pOP3SClient0.getDefaultPort());
  }
}
