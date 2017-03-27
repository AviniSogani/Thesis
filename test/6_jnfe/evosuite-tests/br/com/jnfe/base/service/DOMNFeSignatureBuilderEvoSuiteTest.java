/*
 * This file was automatically generated by EvoSuite
 */

package br.com.jnfe.base.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import br.com.jnfe.base.service.DOMNFeKeyInfoBuilder;
import br.com.jnfe.base.service.DOMNFeSignatureBuilder;
import br.com.jnfe.base.service.KeyInfoBuilder;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.List;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import org.apache.xalan.templates.ElemExtensionDecl;
import org.jcp.xml.dsig.internal.dom.DOMXMLSignatureFactory;
import org.junit.BeforeClass;
import org.w3c.dom.Element;

@RunWith(EvoSuiteRunner.class)
public class DOMNFeSignatureBuilderEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DOMNFeSignatureBuilder dOMNFeSignatureBuilder0 = new DOMNFeSignatureBuilder();
      ElemExtensionDecl elemExtensionDecl0 = new ElemExtensionDecl();
      // Undeclared exception!
      try {
        dOMNFeSignatureBuilder0.build((Element) elemExtensionDecl0, (Element) elemExtensionDecl0, (Certificate) null, (PrivateKey) null);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {
        /*
         * Imposs\u00EDvel construir assinatura, 
         */
      }
  }

  @Test
  public void test1()  throws Throwable  {
      DOMNFeSignatureBuilder dOMNFeSignatureBuilder0 = new DOMNFeSignatureBuilder();
      DigestMethod digestMethod0 = dOMNFeSignatureBuilder0.getDigestMethod();
      assertNull(digestMethod0);
  }

  @Test
  public void test2()  throws Throwable  {
      DOMNFeSignatureBuilder dOMNFeSignatureBuilder0 = new DOMNFeSignatureBuilder();
      // Undeclared exception!
      try {
        dOMNFeSignatureBuilder0.newReference("%~2vZL");
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      DOMNFeSignatureBuilder dOMNFeSignatureBuilder0 = new DOMNFeSignatureBuilder();
      dOMNFeSignatureBuilder0.setDigestMethod((DigestMethod) null);
  }

  @Test
  public void test4()  throws Throwable  {
      DOMNFeSignatureBuilder dOMNFeSignatureBuilder0 = new DOMNFeSignatureBuilder();
      DOMNFeKeyInfoBuilder dOMNFeKeyInfoBuilder0 = new DOMNFeKeyInfoBuilder();
      dOMNFeSignatureBuilder0.setKeyInfoBuilder((KeyInfoBuilder) dOMNFeKeyInfoBuilder0);
  }

  @Test
  public void test5()  throws Throwable  {
      DOMNFeSignatureBuilder dOMNFeSignatureBuilder0 = new DOMNFeSignatureBuilder();
      DOMXMLSignatureFactory dOMXMLSignatureFactory0 = (DOMXMLSignatureFactory)XMLSignatureFactory.getInstance();
      dOMNFeSignatureBuilder0.setXMLSignatureFactory((XMLSignatureFactory) dOMXMLSignatureFactory0);
      dOMNFeSignatureBuilder0.afterPropertiesSet();
      dOMNFeSignatureBuilder0.afterPropertiesSet();
  }

  @Test
  public void test6()  throws Throwable  {
      DOMNFeSignatureBuilder dOMNFeSignatureBuilder0 = new DOMNFeSignatureBuilder();
      try {
        dOMNFeSignatureBuilder0.afterPropertiesSet();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      DOMNFeSignatureBuilder dOMNFeSignatureBuilder0 = new DOMNFeSignatureBuilder();
      // Undeclared exception!
      try {
        dOMNFeSignatureBuilder0.newSignedInfo((List<Reference>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
