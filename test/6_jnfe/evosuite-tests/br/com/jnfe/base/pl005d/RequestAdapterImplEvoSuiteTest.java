/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base.pl005d;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.pl005d.RequestAdapterImpl;
import java.util.NoSuchElementException;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.xerces.jaxp.DocumentBuilderFactoryImpl;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RequestAdapterImplEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RequestAdapterImpl requestAdapterImpl0 = new RequestAdapterImpl();
      DocumentBuilderFactoryImpl documentBuilderFactoryImpl0 = (DocumentBuilderFactoryImpl)DocumentBuilderFactory.newInstance();
      requestAdapterImpl0.setDocumentBuilder((DocumentBuilderFactory) documentBuilderFactoryImpl0);
      // Undeclared exception!
      try {
        requestAdapterImpl0.newRequest("M", "M", "M");
        fail("Expecting exception: NoSuchElementException");
      } catch(NoSuchElementException e) {
      }
  }
}