
// Archivo: src/com/mascotas/gestion/Perro.java
package com.mascotas.gestion;

public class Perro extends Mascota {

    public Perro(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("🐶 " + nombre + " dice: ¡Guau guau!");
    }

    @Override
    public void alimentar() {
        System.out.println(nombre + " come croquetas y comida húmeda para perros.");
    }

    @Override
    public void cuidar() {
        System.out.println(nombre + " necesita paseos diarios, baño mensual y cepillado semanal.");
    }
}

