
// Archivo: src/com/mascotas/gestion/Tortuga.java
package com.mascotas.gestion;

public class Tortuga extends Mascota {

    public Tortuga(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("🐢 " + nombre + " no emite sonidos audibles.");
    }

    @Override
    public void alimentar() {
        System.out.println(nombre + " come vegetales, frutas y a veces proteínas.");
    }

    @Override
    public void cuidar() {
        System.out.println(nombre + " necesita un terrario limpio con luz solar y agua.");
    }
}

