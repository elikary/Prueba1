/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class CirculoTest {
    
    public CirculoTest() {
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

    
@Test
    public void testPerimetro() {
       double perimetro=Circulo.calcularPerimetro(40);
         assertEquals(251.3304,perimetro,0);
    }
    
     @Test
    public void testarea() {
       double area=Circulo.calcularArea(80);
         assertEquals(12800,area,0);
    }

    }
