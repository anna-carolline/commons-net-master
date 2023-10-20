/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 21:39:51 GMT 2023
 */

package org.apache.commons.net.tftp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.tftp.TFTPReadRequestPacket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TFTPReadRequestPacket_ESTest extends TFTPReadRequestPacket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("2B5lDpVA^Yw7V");
      TFTPReadRequestPacket tFTPReadRequestPacket0 = new TFTPReadRequestPacket(inetAddress0, 0, (String) null, 0);
      String string0 = tFTPReadRequestPacket0.toString();
      assertEquals("2B5lDpVA^Yw7V/200.42.42.0 0 1 RRQ null netascii", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, (byte)0, 0);
      TFTPReadRequestPacket tFTPReadRequestPacket0 = null;
      try {
        tFTPReadRequestPacket0 = new TFTPReadRequestPacket(datagramPacket0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // TFTP operator code does not match type.
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, 0);
      TFTPReadRequestPacket tFTPReadRequestPacket0 = null;
      try {
        tFTPReadRequestPacket0 = new TFTPReadRequestPacket(datagramPacket0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TFTPReadRequestPacket tFTPReadRequestPacket0 = null;
      try {
        tFTPReadRequestPacket0 = new TFTPReadRequestPacket((DatagramPacket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPRequestPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName(" Q_xH5a',U9");
      TFTPReadRequestPacket tFTPReadRequestPacket0 = new TFTPReadRequestPacket(inetAddress0, 5133, "org.apache.commons.net.tftp.TFTPReadRequestPacket", 5133);
      // Undeclared exception!
      try { 
        tFTPReadRequestPacket0.toString();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 5133
         //
         verifyException("org.apache.commons.net.tftp.TFTP", e);
      }
  }
}
