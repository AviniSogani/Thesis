/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.IndPag;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class IndPagEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      IndPag indPag0 = IndPag.PGTO_A_PRAZO;
      char char0 = indPag0.getValue();
      assertEquals('1', char0);
  }
}