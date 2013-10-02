/*
 * Copyright (C) 2013 al037455
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

import net.rafaelaznar.operaciones.jogrboClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author JGrancha
 * @version 1.0
 * Fecha 02-10-2013
 */
public class jogrboClassTest {

    public jogrboClassTest() {
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
    public void testGetNombreApellidos() {
        System.out.println("test: GetNombreApellidos()");
        jogrboClass oJogrbo = new jogrboClass();
        assertNotNull("objeto jogrbo creado", oJogrbo);
        assertEquals("getNombre: Debe devolver José", oJogrbo.getNombre(), "José");
        assertTrue("geApellido: Deve devolver Grancha", "Grancha".equals(oJogrbo.getApellido()));
        if (!oJogrbo.getNombre().equals("José")) {
            fail("getNombre: Nombre distinto de José");
        }
        assertSame("prueba getReference", oJogrbo, oJogrbo.getReference());
        jogrboClass oJogrbo2 = new jogrboClass();
        assertNotSame("no son el mismo objeto", oJogrbo, oJogrbo2);
    }
}