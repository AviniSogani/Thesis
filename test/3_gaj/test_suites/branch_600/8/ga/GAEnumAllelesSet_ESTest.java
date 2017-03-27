/*
 * This file was automatically generated by EvoSuite
 * Wed Mar 08 03:22:28 GMT 2017
 */

package brain.ga;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import brain.ga.GAEnumAllelesSet;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GAEnumAllelesSet_ESTest extends GAEnumAllelesSet_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAEnumAllelesSet.<init>()V: root-Branch
   * Goal 2. brain.ga.GAEnumAllelesSet.size()I: root-Branch
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      // Undeclared exception!
      try { 
        gAEnumAllelesSet0.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("brain.ga.GAEnumAllelesSet", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAEnumAllelesSet.<init>()V: root-Branch
   * Goal 2. brain.ga.GAEnumAllelesSet.setAlleles(Ljava/util/Vector;)V: root-Branch
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      Vector<Object> vector0 = new Vector<Object>();
      gAEnumAllelesSet0.setAlleles(vector0);
      assertEquals(10, vector0.capacity());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAEnumAllelesSet.allele()Ljava/lang/Object;: root-Branch
   * Goal 2. brain.ga.GAEnumAllelesSet.<init>()V: root-Branch
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      // Undeclared exception!
      try { 
        gAEnumAllelesSet0.allele();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("brain.ga.GAEnumAllelesSet", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. brain.ga.GAEnumAllelesSet.allele(I)Ljava/lang/Object;: root-Branch
   * Goal 2. brain.ga.GAEnumAllelesSet.<init>()V: root-Branch
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GAEnumAllelesSet gAEnumAllelesSet0 = new GAEnumAllelesSet();
      // Undeclared exception!
      try { 
        gAEnumAllelesSet0.allele(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("brain.ga.GAEnumAllelesSet", e);
      }
  }
}
