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
     * @param a primer sumando
     * @param b segundo sumando
     * @return la suma de a + b
     */
    public int getSuma(int a, int b) {
        return a + b;
    }

    /**
     * Realiza una resta
     *
     * @param a minuendo
     * @param b sustraendo
     * @return la resta de a - b
     */
    public int getResta(int a, int b) {
        return a - b;
    }

    /**
     * Incrementa un entero
     *
     * @param a número a incrementar
     * @return a incrementado en uno
     */
    public int getInc(int a) {
        return a + 1;
    }

    /**
     * Decrementa un entero
     *
     * @param a número a decrementar
     * @return a decrementado en uno
     */
    public int getDec(int a) {
        return a - 1;
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
