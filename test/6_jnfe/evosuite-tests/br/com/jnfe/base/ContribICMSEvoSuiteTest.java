/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.ContribICMS;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ContribICMSEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ContribICMS contribICMS0 = ContribICMS.ICMS;
      char char0 = contribICMS0.getValue();
      assertEquals('C', char0);
  }
}
