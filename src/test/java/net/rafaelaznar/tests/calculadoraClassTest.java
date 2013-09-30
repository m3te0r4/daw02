/*
 * Copyright (C) 2013 Rafael Aznar
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package net.rafaelaznar.tests;

import net.rafaelaznar.operaciones.calculadoraClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Clase para testear la clase calculadoraClass
 *
 * @version %I%, %G%
 * @author Rafael Aznar
 */
public class calculadoraClassTest {

    public calculadoraClassTest() {
        System.out.println("NewEmptyJUnitTest");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("beforeClass-setUpClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("afterClass-tearDownClass");
    }

    @Before
    public void setUp() {
        System.out.println("before-setUp");
    }

    @After
    public void tearDown() {
        System.out.println("after-tearDown");
    }

    @Test
    public void testGetSuma() {
        System.out.println("test: getSuma");
        calculadoraClass oCalculadora = new calculadoraClass();
        assertNotNull("objeto calculadora creado", oCalculadora);
        assertEquals("getSuma: 12+12=24", oCalculadora.getSuma(12, 12), 24);
        assertTrue("getSuma: 55+11=66", 66 == oCalculadora.getSuma(55, 11));
        if (3 != oCalculadora.getSuma(1, 2)) {
            fail("getSuma: 1+2=·");
        }
        assertSame("prueba getReference", oCalculadora, oCalculadora.getReference());
        calculadoraClass oCalculadora2 = new calculadoraClass();
        assertNotSame("no son el mismo objeto", oCalculadora, oCalculadora2);
    }
}
