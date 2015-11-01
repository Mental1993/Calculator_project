/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mental
 */
public class mainFormTest {
    
    public mainFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class mainForm.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        mainForm instance = new mainForm();
        instance.add();
        
    }

    /**
     * Test of sub method, of class mainForm.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        mainForm instance = new mainForm();
        instance.sub();
        
    }

    /**
     * Test of mul method, of class mainForm.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        mainForm instance = new mainForm();
        instance.mul();
        
    }

    /**
     * Test of div method, of class mainForm.
     */
    @Test
    public void testDiv() {
        System.out.println("div");
        mainForm instance = new mainForm();
        instance.div();
        
    }

    /**
     * Test of checkEmpty method, of class mainForm.
     */
    @Test
    public void testCheckEmpty() {
        System.out.println("checkEmpty");
        mainForm instance = new mainForm();
        boolean expResult = false;
        boolean result = instance.checkEmpty();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of main method, of class mainForm.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        mainForm.main(args);
        
    }
    
}
