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
package net.rafaelaznar.operaciones;

/**
 *
 * @author Adriancito
 * @version 1.0
 * Fecha 06-10-2013
 *
 */
public class adfeciClass {

    /**
     * Declaración de Variables.
     */
    private String nombre = "Adrián";
    private String apellido = "Fernández";

    /**
     * Método que devuelve el nombre
     * @return nombre
     */
    
    public String getNombre() {
        return nombre;
    }

    /**
     * Método que establece el nombre
     * @return
     */
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *Método que devuelve el apellido
     * @return
     */
    
    public String getApellido() {
        return apellido;
    }

    /**
     *Método que establece el apellido
     * @return
     */
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método que devuelve el nombre y el apellido formateados
     * @return nombre + apellido
     */
    
    public String getNombreApellidos() {
        return nombre + " " + apellido;
    }
    
    /**
     * Para obtener la referencia a este objeto
     *
     * @return referencia al objeto
     */
    public adfeciClass getReference() {
        return this;
    }
}
