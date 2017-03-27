/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 07 03:30:37 GMT 2017
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brain.ga.Evaluator;
import brain.ga.GAAlgorithm;
import brain.ga.Mutator;
import brain.ga.SectMutator;
import brain.ga.Selector;
import brain.ga.SexualCrossover;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GAAlgorithm_ESTest extends GAAlgorithm_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAAlgorithm.<init>()V: root-Branch
   * Goal 2. brain.ga.GAAlgorithm.setCrossoverOperator(Lbrain/ga/SexualCrossover;)V: root-Branch
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      gAAlgorithm0.setCrossoverOperator((SexualCrossover) null);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAAlgorithm.<init>()V: root-Branch
   * Goal 2. brain.ga.GAAlgorithm.getMutator()Lbrain/ga/Mutator;: root-Branch
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      Mutator mutator0 = gAAlgorithm0.getMutator();
      assertNull(mutator0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAAlgorithm.<init>()V: root-Branch
   * Goal 2. brain.ga.GAAlgorithm.getSelector()Lbrain/ga/Selector;: root-Branch
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      Selector selector0 = gAAlgorithm0.getSelector();
      assertNull(selector0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAAlgorithm.setEvaluator(Lbrain/ga/Evaluator;)V: root-Branch
   * Goal 2. brain.ga.GAAlgorithm.<init>()V: root-Branch
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      // Undeclared exception!
      try { 
        gAAlgorithm0.setEvaluator((Evaluator) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("brain.ga.GAAlgorithm", e);
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAAlgorithm.step()V: root-Branch
   * Goal 2. brain.ga.GAAlgorithm.<init>()V: root-Branch
   */

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      gAAlgorithm0.step();
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * Goal 1. brain.ga.GAAlgorithm.initialize()V: root-Branch
   * Goal 2. brain.ga.GAAlgorithm.done()Z: root-Branch
   * Goal 3. brain.ga.GAAlgorithm.<init>()V: root-Branch
   * Goal 4. brain.ga.GAAlgorithm.evolve()V: I8 Branch 1 IFNE L18 - true
   */

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      gAAlgorithm0.evolve();
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAAlgorithm.setMutator(Lbrain/ga/Mutator;)V: root-Branch
   * Goal 2. brain.ga.GAAlgorithm.<init>()V: root-Branch
   */

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      SectMutator sectMutator0 = new SectMutator();
      gAAlgorithm0.setMutator(sectMutator0);
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAAlgorithm.getEvaluator()Lbrain/ga/Evaluator;: root-Branch
   * Goal 2. brain.ga.GAAlgorithm.<init>()V: root-Branch
   */

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      Evaluator evaluator0 = gAAlgorithm0.getEvaluator();
      assertNull(evaluator0);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAAlgorithm.setSelector(Lbrain/ga/Selector;)V: root-Branch
   * Goal 2. brain.ga.GAAlgorithm.<init>()V: root-Branch
   */

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      // Undeclared exception!
      try { 
        gAAlgorithm0.setSelector((Selector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("brain.ga.GAAlgorithm", e);
      }
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAAlgorithm.getCrossoverOperator()Lbrain/ga/SexualCrossover;: root-Branch
   * Goal 2. brain.ga.GAAlgorithm.<init>()V: root-Branch
   */

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      GAAlgorithm gAAlgorithm0 = new GAAlgorithm();
      SexualCrossover sexualCrossover0 = gAAlgorithm0.getCrossoverOperator();
      assertNull(sexualCrossover0);
  }
}
