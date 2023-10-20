/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 14 17:58:10 GMT 2023
 */

package org.apache.commons.net.examples.util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import org.apache.commons.net.examples.util.IOUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IOUtil_ESTest extends IOUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("7^/x|*&!3`8cF&", true);
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1465), (byte)0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(4255);
      IOUtil.readWrite(byteArrayInputStream0, byteArrayOutputStream0, (InputStream) null, mockFileOutputStream0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IOUtil iOUtil0 = new IOUtil();
  }
}
