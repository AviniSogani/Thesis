/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 07 02:44:12 GMT 2017
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brain.ga.Evaluator;
import brain.ga.VectorGenome;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VectorGenome_ESTest extends VectorGenome_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.VectorGenome.<init>()V: root-Branch
   * Goal 2. brain.ga.VectorGenome.getGene(I)Ljava/lang/Object;: root-Branch
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VectorGenome vectorGenome0 = new VectorGenome();
      // Undeclared exception!
      try { 
        vectorGenome0.getGene(6498);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 6498
         //
         assertThrownBy("java.util.Vector", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.VectorGenome.<init>()V: root-Branch
   * Goal 2. brain.ga.VectorGenome.getGenesCount()I: root-Branch
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      VectorGenome vectorGenome0 = new VectorGenome();
      int int0 = vectorGenome0.getGenesCount();
      assertEquals(0, int0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. brain.ga.VectorGenome.<init>(Ljava/util/Vector;Lbrain/ga/Evaluator;)V: root-Branch
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      VectorGenome vectorGenome0 = new VectorGenome((Vector) vector0, (Evaluator) null);
      assertEquals(0, vectorGenome0.getGenesCount());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.VectorGenome.<init>()V: root-Branch
   * Goal 2. brain.ga.VectorGenome.setGene(ILjava/lang/Object;)V: root-Branch
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      VectorGenome vectorGenome0 = new VectorGenome();
      // Undeclared exception!
      try { 
        vectorGenome0.setGene(2072, vectorGenome0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 2072
         //
         assertThrownBy("java.util.Vector", e);
      }
  }
}
