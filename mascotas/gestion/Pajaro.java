
// Archivo: src/com/mascotas/gestion/Pajaro.java
package com.mascotas.gestion;

public class Pajaro extends Mascota {

    public Pajaro(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void hacerSonido() {
        System.out.println("🐦 " + nombre + " canta: Pío pío trino trino.");
    }

    @Override
    public void alimentar() {
        System.out.println(nombre + " come semillas, frutas y agua fresca.");
    }

    @Override
    public void cuidar() {
        System.out.println(nombre + " necesita una jaula limpia y tiempo fuera para volar.");
    }
}

