/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:17:34 GMT 2023
 */

package org.apache.commons.net.tftp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.tftp.TFTPAckPacket;
import org.apache.commons.net.tftp.TFTPPacket;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TFTPAckPacket_ESTest extends TFTPAckPacket_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      TFTPAckPacket tFTPAckPacket0 = new TFTPAckPacket(inetAddress0, 105, 3060);
      byte[] byteArray0 = new byte[5];
      tFTPAckPacket0.type = (int) (byte)2;
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, 4, inetAddress0, 2175);
      tFTPAckPacket0.newDatagram(datagramPacket0, byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)2, (byte)11, (byte) (-12), (byte)0}, byteArray0);
      assertEquals(105, datagramPacket0.getPort());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      TFTPAckPacket tFTPAckPacket0 = new TFTPAckPacket(inetAddress0, 105, 3060);
      tFTPAckPacket0.type = (int) (byte)2;
      DatagramPacket datagramPacket0 = tFTPAckPacket0.newDatagram();
      assertEquals(3060, tFTPAckPacket0.getBlockNumber());
      assertEquals(4, datagramPacket0.getLength());
      assertEquals(105, datagramPacket0.getPort());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      TFTPAckPacket tFTPAckPacket0 = new TFTPAckPacket(inetAddress0, 0, (-1));
      byte[] byteArray0 = new byte[6];
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, 1, 1, inetAddress0, (byte)1);
      tFTPAckPacket0.newDatagram(datagramPacket0, byteArray0);
      assertEquals(4, datagramPacket0.getLength());
      assertArrayEquals(new byte[] {(byte)0, (byte)4, (byte) (-1), (byte) (-1), (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      TFTPAckPacket tFTPAckPacket0 = new TFTPAckPacket(inetAddress0, 1209, 0);
      int int0 = tFTPAckPacket0.getBlockNumber();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      TFTPAckPacket tFTPAckPacket0 = new TFTPAckPacket(inetAddress0, 1044, 2170);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        tFTPAckPacket0.newDatagram((DatagramPacket) null, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPAckPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.getByName("[X&@s");
      TFTPAckPacket tFTPAckPacket0 = new TFTPAckPacket(inetAddress0, (-1454), 255);
      byte[] byteArray0 = new byte[4];
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, 0);
      // Undeclared exception!
      try { 
        tFTPAckPacket0.newDatagram(datagramPacket0, byteArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port out of range:-1454
         //
         verifyException("java.net.DatagramPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      InetAddress inetAddress0 = mock(InetAddress.class, new ViolatedAssumptionAnswer());
      TFTPAckPacket tFTPAckPacket0 = new TFTPAckPacket(inetAddress0, 0, (-940));
      DatagramPacket datagramPacket0 = tFTPAckPacket0.newDatagram();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        tFTPAckPacket0.newDatagram(datagramPacket0, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3
         //
         verifyException("org.apache.commons.net.tftp.TFTPAckPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      TFTPAckPacket tFTPAckPacket0 = new TFTPAckPacket(inetAddress0, (-44), 0);
      // Undeclared exception!
      try { 
        tFTPAckPacket0.newDatagram();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port out of range:-44
         //
         verifyException("java.net.DatagramPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TFTPAckPacket tFTPAckPacket0 = null;
      try {
        tFTPAckPacket0 = new TFTPAckPacket((DatagramPacket) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.tftp.TFTPAckPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, 0, 0, inetAddress0, 0);
      TFTPAckPacket tFTPAckPacket0 = null;
      try {
        tFTPAckPacket0 = new TFTPAckPacket(datagramPacket0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.apache.commons.net.tftp.TFTPAckPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, 5);
      TFTPAckPacket tFTPAckPacket0 = null;
      try {
        tFTPAckPacket0 = new TFTPAckPacket(datagramPacket0);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // TFTP operator code does not match type.
         //
         verifyException("org.apache.commons.net.tftp.TFTPAckPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      InetAddress inetAddress0 = mock(InetAddress.class, new ViolatedAssumptionAnswer());
      TFTPAckPacket tFTPAckPacket0 = new TFTPAckPacket(inetAddress0, 0, (-940));
      DatagramPacket datagramPacket0 = tFTPAckPacket0.newDatagram();
      TFTPAckPacket tFTPAckPacket1 = (TFTPAckPacket)TFTPPacket.newTFTPPacket(datagramPacket0);
      assertEquals(4, datagramPacket0.getLength());
      assertEquals(0, tFTPAckPacket1.getPort());
      assertEquals(64596, tFTPAckPacket1.getBlockNumber());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      TFTPAckPacket tFTPAckPacket0 = new TFTPAckPacket(inetAddress0, 105, 3060);
      int int0 = tFTPAckPacket0.getBlockNumber();
      assertEquals(3060, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      TFTPAckPacket tFTPAckPacket0 = new TFTPAckPacket(inetAddress0, 105, 3060);
      tFTPAckPacket0.setBlockNumber((-2235));
      int int0 = tFTPAckPacket0.getBlockNumber();
      assertEquals((-2235), int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      TFTPAckPacket tFTPAckPacket0 = new TFTPAckPacket(inetAddress0, 105, 3060);
      String string0 = tFTPAckPacket0.toString();
      assertEquals("/192.168.1.42 105 4 ACK 3060", string0);
  }
}
