/*
 * This file was automatically generated by EvoSuite
 * Thu Oct 19 23:57:02 GMT 2023
 */

package org.apache.commons.net.examples.nntp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.net.examples.nntp.NNTPUtils;
import org.apache.commons.net.nntp.NNTPClient;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NNTPUtils_ESTest extends NNTPUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NNTPUtils nNTPUtils0 = new NNTPUtils();
      NNTPClient nNTPClient0 = mock(NNTPClient.class, new ViolatedAssumptionAnswer());
      doReturn((Iterable) null).when(nNTPClient0).iterateArticleInfo(anyLong() , anyLong());
      // Undeclared exception!
      try { 
        NNTPUtils.getArticleInfo(nNTPClient0, 119, 119);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.examples.nntp.NNTPUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NNTPClient nNTPClient0 = mock(NNTPClient.class, new ViolatedAssumptionAnswer());
      doReturn((Iterable) null).when(nNTPClient0).iterateArticleInfo(anyLong() , anyLong());
      // Undeclared exception!
      try { 
        NNTPUtils.getArticleInfo(nNTPClient0, 119, 1894L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.net.examples.nntp.NNTPUtils", e);
      }
  }
}
