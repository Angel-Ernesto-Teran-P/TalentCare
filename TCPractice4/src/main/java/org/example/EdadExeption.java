package org.example;

public class EdadExeption extends Exception {

    public EdadExeption() {
    }

    public EdadExeption(String message) {
        super(message);
    }
    public EdadExeption(String message) throws EdadExeption {
        this.validarEdad(edad);
    }
    public void validarEdad(int edad) throws EdadExeption{
        throw new EdadExeption("Error en la edad");
    }


}
