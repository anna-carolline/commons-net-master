/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:02:55 GMT 2023
 */

package org.apache.commons.net.echo;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.net.InetAddress;
import org.apache.commons.net.echo.EchoUDPClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EchoUDPClient_ESTest extends EchoUDPClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      byte[] byteArray0 = new byte[10];
      echoUDPClient0.open();
      InetAddress inetAddress0 = echoUDPClient0.getLocalAddress();
      echoUDPClient0.send(byteArray0, (int) (byte)0, inetAddress0);
      assertFalse(inetAddress0.isLoopbackAddress());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 40000);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("", 12345);
      byte[] byteArray0 = new byte[0];
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, evoSuiteRemoteAddress0, byteArray0);
      echoUDPClient0.open();
      int int0 = echoUDPClient0.receive(byteArray0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      echoUDPClient0.open(9, (InetAddress) null);
      byte[] byteArray0 = new byte[1];
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 9);
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, byteArray0);
      int int0 = echoUDPClient0.receive(byteArray0, 0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      echoUDPClient0.open(9, (InetAddress) null);
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 9);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("192.168.1.42", 7);
      byte[] byteArray0 = new byte[0];
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, evoSuiteRemoteAddress0, byteArray0);
      byte[] byteArray1 = new byte[1];
      int int0 = echoUDPClient0.receive(byteArray1);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("192.168.1.42", 9);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("192.168.1.42", 7);
      byte[] byteArray0 = new byte[4];
      NetworkHandling.sendUdpPacket(evoSuiteLocalAddress0, evoSuiteRemoteAddress0, byteArray0);
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      echoUDPClient0.open(9, (InetAddress) null);
      int int0 = echoUDPClient0.receive(byteArray0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        echoUDPClient0.send(byteArray0, (InetAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        echoUDPClient0.send(byteArray0, (int) (byte)0, (InetAddress) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        echoUDPClient0.receive(byteArray0, (int) (byte)13);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // illegal length
         //
         verifyException("java.net.DatagramPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      echoUDPClient0.open(9, (InetAddress) null);
      byte[] byteArray0 = new byte[1];
      try { 
        echoUDPClient0.receive(byteArray0, 0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IO exception
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoDatagramSocketImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      byte[] byteArray0 = new byte[1];
      echoUDPClient0.open((int) (byte)0);
      try { 
        echoUDPClient0.receive(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IO exception
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoDatagramSocketImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        echoUDPClient0.receive(byteArray0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      byte[] byteArray0 = new byte[1];
      echoUDPClient0.open();
      InetAddress inetAddress0 = echoUDPClient0.getLocalAddress();
      echoUDPClient0.send(byteArray0, inetAddress0);
      assertFalse(inetAddress0.isMCNodeLocal());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        echoUDPClient0.receive(byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      byte[] byteArray0 = new byte[1];
      echoUDPClient0.open();
      InetAddress inetAddress0 = echoUDPClient0.getLocalAddress();
      // Undeclared exception!
      try { 
        echoUDPClient0.send(byteArray0, (int) (byte)56, inetAddress0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // illegal length
         //
         verifyException("java.net.DatagramPacket", e);
      }
  }
}
