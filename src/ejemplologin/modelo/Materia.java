/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplologin.modelo;

import java.io.Serializable;

/**
 *
 * @author carloaiza
 */
public class Materia implements Serializable{
    private String codigo;
    private String nombre;
    private byte capacidadAlumnos;

    public Materia(String codigo, String nombre, byte capacidadAlumnos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.capacidadAlumnos = capacidadAlumnos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public byte getCapacidadAlumnos() {
        return capacidadAlumnos;
    }

    public void setCapacidadAlumnos(byte capacidadAlumnos) {
        this.capacidadAlumnos = capacidadAlumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Metodo para obtener un arreglo de solo String
    public String [] getArray(){
        
        String[] datos = {codigo, nombre, String.valueOf(capacidadAlumnos)};
        return datos;
    }
    
    
     public Object[] obtenerArregloObjeto(){
        Object[] data={ getCodigo(), getNombre(),getCapacidadAlumnos() };
        return data;
    }
    
    
     
     
}
