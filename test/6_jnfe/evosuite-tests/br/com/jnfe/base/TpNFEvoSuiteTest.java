/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.TpNF;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TpNFEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TpNF tpNF0 = TpNF.SAIDA;
      char char0 = tpNF0.getValue();
      assertEquals('1', char0);
  }
}
