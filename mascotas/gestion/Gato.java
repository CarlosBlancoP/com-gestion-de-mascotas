
// Archivo: src/com/mascotas/gestion/Gato.java
package com.mascotas.gestion;

public class Gato extends Mascota {

    public Gato(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("🐱 " + nombre + " dice: Miau miau.");
    }

    @Override
    public void alimentar() {
        System.out.println(nombre + " come alimento balanceado y pescado ocasionalmente.");
    }

    @Override
    public void cuidar() {
        System.out.println(nombre + " necesita cepillado frecuente y una caja de arena limpia.");
    }
}

