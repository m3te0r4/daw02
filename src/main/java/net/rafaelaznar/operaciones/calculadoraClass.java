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
package net.rafaelaznar.operaciones;

/**
 * Realiza operaciones aritméticas simples 30/Sept/2013
 *
 * @author Rafael Aznar
 * @version %I%, %G%
 */
public class calculadoraClass {

    /**
     * Calcula la suma
     *
     * @param intOperando1 primer sumando
     * @param intOperando2 segundo sumando
     * @return la suma de a + b
     */
    public int getSuma(int intOperando1, int intOperando2) {
        return intOperando1 + intOperando2;
    }

    /**
     * Realiza una resta
     *
     * @param intOperando1 minuendo
     * @param intOperando2 sustraendo
     * @return la resta de a - b
     */
    public int getResta(int intOperando1, int intOperando2) {
        return intOperando1 - intOperando2;
    }

    /**
     * Incrementa un entero
     *
     * @param intOperando1 número a incrementar
     * @return a incrementado en uno
     */
    public int getInc(int intOperando1) {
        return intOperando1 + 1;
    }

    /**
     * Decrementa un entero
     *
     * @param intOperando1 número a decrementar
     * @return a decrementado en uno
     */
    public int getDec(int intOperando1) {
        return intOperando1 - 1;
    }

    /**
     * Para obtener la referencia a este objeto
     *
     * @return referencia al objeto
     */
    public calculadoraClass getReference() {
        return this;
    }
}
