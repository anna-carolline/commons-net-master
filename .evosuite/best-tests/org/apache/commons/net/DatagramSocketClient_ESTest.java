/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 21:56:38 GMT 2023
 */

package org.apache.commons.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.time.Duration;
import org.apache.commons.net.DatagramSocketFactory;
import org.apache.commons.net.chargen.CharGenUDPClient;
import org.apache.commons.net.daytime.DaytimeUDPClient;
import org.apache.commons.net.discard.DiscardUDPClient;
import org.apache.commons.net.echo.EchoUDPClient;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.tftp.TFTP;
import org.apache.commons.net.tftp.TFTPClient;
import org.apache.commons.net.time.TimeUDPClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DatagramSocketClient_ESTest extends DatagramSocketClient_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DiscardUDPClient discardUDPClient0 = new DiscardUDPClient();
      Duration duration0 = TFTP.DEFAULT_TIMEOUT_DURATION;
      discardUDPClient0.setDefaultTimeout(duration0);
      assertEquals(5000, discardUDPClient0.getDefaultTimeout());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DiscardUDPClient discardUDPClient0 = new DiscardUDPClient();
      discardUDPClient0.open(19, (InetAddress) null);
      discardUDPClient0.setSoTimeout(848);
      assertTrue(discardUDPClient0.isOpen());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DiscardUDPClient discardUDPClient0 = new DiscardUDPClient();
      discardUDPClient0.open(19, (InetAddress) null);
      boolean boolean0 = discardUDPClient0.isOpen();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DiscardUDPClient discardUDPClient0 = new DiscardUDPClient();
      discardUDPClient0.open(9, (InetAddress) null);
      discardUDPClient0.getSoTimeoutDuration();
      assertTrue(discardUDPClient0.isOpen());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EchoUDPClient echoUDPClient0 = new EchoUDPClient();
      echoUDPClient0.open();
      echoUDPClient0.getSoTimeout();
      assertTrue(echoUDPClient0.isOpen());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DaytimeUDPClient daytimeUDPClient0 = new DaytimeUDPClient();
      daytimeUDPClient0.open();
      daytimeUDPClient0.getLocalPort();
      assertTrue(daytimeUDPClient0.isOpen());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      int int0 = tFTPClient0.getDefaultTimeout();
      assertEquals(5000, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharGenUDPClient charGenUDPClient0 = new CharGenUDPClient();
      charGenUDPClient0.setDefaultTimeout((-591));
      int int0 = charGenUDPClient0.getDefaultTimeout();
      assertEquals((-591), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DiscardUDPClient discardUDPClient0 = new DiscardUDPClient();
      discardUDPClient0.setCharset((Charset) null);
      Charset charset0 = discardUDPClient0.getCharset();
      assertNull(charset0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NTPUDPClient nTPUDPClient0 = new NTPUDPClient();
      nTPUDPClient0.open();
      InetAddress inetAddress0 = nTPUDPClient0.getLocalAddress();
      // Undeclared exception!
      try { 
        nTPUDPClient0.open((-630), inetAddress0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-630
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TFTPClient tFTPClient0 = new TFTPClient();
      // Undeclared exception!
      try { 
        tFTPClient0.open((-43));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-43
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NTPUDPClient nTPUDPClient0 = new NTPUDPClient();
      nTPUDPClient0.setCharset((Charset) null);
      // Undeclared exception!
      try { 
        nTPUDPClient0.getCharsetName();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.DatagramSocketClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharGenUDPClient charGenUDPClient0 = new CharGenUDPClient();
      // Undeclared exception!
      try { 
        charGenUDPClient0.setDefaultTimeout((Duration) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.DatagramSocketClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DiscardUDPClient discardUDPClient0 = new DiscardUDPClient();
      discardUDPClient0.setDatagramSocketFactory((DatagramSocketFactory) null);
      assertEquals("windows-1252", discardUDPClient0.getCharsetName());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DiscardUDPClient discardUDPClient0 = new DiscardUDPClient();
      discardUDPClient0.close();
      assertFalse(discardUDPClient0.isOpen());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DiscardUDPClient discardUDPClient0 = new DiscardUDPClient();
      discardUDPClient0.open(9, (InetAddress) null);
      assertTrue(discardUDPClient0.isOpen());
      
      discardUDPClient0.close();
      assertFalse(discardUDPClient0.isOpen());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DaytimeUDPClient daytimeUDPClient0 = new DaytimeUDPClient();
      // Undeclared exception!
      try { 
        daytimeUDPClient0.getLocalPort();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DiscardUDPClient discardUDPClient0 = new DiscardUDPClient();
      // Undeclared exception!
      try { 
        discardUDPClient0.getSoTimeoutDuration();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TimeUDPClient timeUDPClient0 = new TimeUDPClient();
      // Undeclared exception!
      try { 
        timeUDPClient0.getSoTimeout();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TFTP tFTP0 = new TFTP();
      NTPUDPClient nTPUDPClient0 = new NTPUDPClient();
      Charset charset0 = tFTP0.getCharset();
      nTPUDPClient0.setCharset(charset0);
      assertEquals(0, nTPUDPClient0.getDefaultTimeout());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NTPUDPClient nTPUDPClient0 = new NTPUDPClient();
      // Undeclared exception!
      try { 
        nTPUDPClient0.getLocalAddress();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NTPUDPClient nTPUDPClient0 = new NTPUDPClient();
      boolean boolean0 = nTPUDPClient0.isOpen();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DiscardUDPClient discardUDPClient0 = new DiscardUDPClient();
      TFTP tFTP0 = new TFTP();
      // Undeclared exception!
      try { 
        discardUDPClient0.setSoTimeout(tFTP0.DEFAULT_TIMEOUT_DURATION);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DiscardUDPClient discardUDPClient0 = new DiscardUDPClient();
      // Undeclared exception!
      try { 
        discardUDPClient0.setSoTimeout(9);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // DatagramSocket
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NTPUDPClient nTPUDPClient0 = new NTPUDPClient();
      String string0 = nTPUDPClient0.getCharsetName();
      assertEquals("windows-1252", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DiscardUDPClient discardUDPClient0 = new DiscardUDPClient();
      discardUDPClient0.open(0);
      TFTP tFTP0 = new TFTP();
      discardUDPClient0.setSoTimeout(tFTP0.DEFAULT_TIMEOUT_DURATION);
      assertTrue(discardUDPClient0.isOpen());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CharGenUDPClient charGenUDPClient0 = new CharGenUDPClient();
      int int0 = charGenUDPClient0.getDefaultTimeout();
      assertEquals(0, int0);
  }
}
