/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 28 20:40:47 GMT 2017
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brain.ga.Evaluator;
import brain.ga.GAEnumAllelesSet;
import brain.ga.Population;
import brain.ga.Selector;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Population_ESTest extends Population_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.Population.<init>()V: root-Branch in context: brain.ga.Population:<init>()V
   * Goal 2. Branch brain.ga.Population.sort()V: I19 Branch 1 IF_ICMPGE L55 - false in context: brain.ga.Population:sort()V
   */

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Population population0 = new Population();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      population0.genoms = (List) linkedList0;
      linkedList0.add("");
      // Undeclared exception!
      try { 
        population0.sort();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to brain.ga.Genome
         //
         assertThrownBy("brain.ga.Population", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.Population.<init>()V: root-Branch in context: brain.ga.Population:<init>()V
   * Goal 2. Branch brain.ga.Population.sort()V: I19 Branch 1 IF_ICMPGE L55 - true in context: brain.ga.Population:sort()V
   */

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Population population0 = new Population();
      population0.sort();
      assertEquals(4, population0.getGenomeSize());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.Population.<init>()V: root-Branch in context: brain.ga.Population:<init>()V
   * Goal 2. Branch brain.ga.Population.getSize()I: root-Branch in context: brain.ga.Population:getSize()I
   */

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Population population0 = new Population();
      population0.getSize();
      assertEquals(4, population0.getGenomeSize());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.Population.<init>()V: root-Branch in context: brain.ga.Population:<init>()V
   * Goal 2. Branch brain.ga.Population.getEvaluator()Lbrain/ga/Evaluator;: root-Branch in context: brain.ga.Population:getEvaluator()Lbrain/ga/Evaluator;
   */

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Population population0 = new Population();
      population0.getEvaluator();
      assertEquals(4, population0.getGenomeSize());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.Population.<init>()V: root-Branch in context: brain.ga.Population:<init>()V
   * Goal 2. Branch brain.ga.Population.getSelector()Lbrain/ga/Selector;: root-Branch in context: brain.ga.Population:getSelector()Lbrain/ga/Selector;
   */

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Population population0 = new Population();
      population0.getSelector();
      assertEquals(4, population0.getGenomeSize());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.Population.<init>()V: root-Branch in context: brain.ga.Population:<init>()V
   * Goal 2. Branch brain.ga.Population.setSelector(Lbrain/ga/Selector;)V: root-Branch in context: brain.ga.Population:setSelector(Lbrain/ga/Selector;)V
   */

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Population population0 = new Population();
      population0.setSelector((Selector) null);
      assertEquals(4, population0.getGenomeSize());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.Population.<init>()V: root-Branch in context: brain.ga.Population:<init>()V
   * Goal 2. Branch brain.ga.Population.selectNextGenome()Lbrain/ga/Genome;: root-Branch in context: brain.ga.Population:selectNextGenome()Lbrain/ga/Genome;
   */

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Population population0 = new Population();
      // Undeclared exception!
      try { 
        population0.selectNextGenome();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("brain.ga.Population", e);
      }
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.Population.<init>()V: root-Branch in context: brain.ga.Population:<init>()V
   * Goal 2. Branch brain.ga.Population.get(I)Lbrain/ga/Genome;: root-Branch in context: brain.ga.Population:get(I)Lbrain/ga/Genome;
   */

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Population population0 = new Population();
      // Undeclared exception!
      try { 
        population0.get((-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.Population.<init>()V: root-Branch in context: brain.ga.Population:<init>()V
   * Goal 2. Branch brain.ga.Population.setEvaluator(Lbrain/ga/Evaluator;)V: root-Branch in context: brain.ga.Population:setEvaluator(Lbrain/ga/Evaluator;)V
   */

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Population population0 = new Population();
      population0.setEvaluator((Evaluator) null);
      assertEquals(4, population0.getGenomeSize());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.Population.<init>()V: root-Branch in context: brain.ga.Population:<init>()V
   * Goal 2. Branch brain.ga.Population.setGenomeSize(I)V: root-Branch in context: brain.ga.Population:setGenomeSize(I)V
   */

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Population population0 = new Population();
      population0.setGenomeSize((-1444));
      assertEquals(-1444, population0.getGenomeSize());
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.Population.<init>()V: root-Branch in context: brain.ga.Population:<init>()V
   * Goal 2. Branch brain.ga.Population.getGenomeSize()I: root-Branch in context: brain.ga.Population:getGenomeSize()I
   */

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Population population0 = new Population();
      int int0 = population0.getGenomeSize();
      assertEquals(4, int0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. Branch brain.ga.Population.<init>()V: root-Branch in context: brain.ga.Population:<init>()V
   * Goal 2. Branch brain.ga.Population.initialize(Lbrain/ga/GAEnumAllelesSet;)V: root-Branch in context: brain.ga.Population:initialize(Lbrain/ga/GAEnumAllelesSet;)V
   */

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Population population0 = new Population();
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      population0.initialize(gAEnumAllelesSet0);
      assertEquals(4, population0.getGenomeSize());
  }
}
