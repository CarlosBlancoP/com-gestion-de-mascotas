
// Archivo: src/com/mascotas/gestion/Main.java
package com.mascotas.gestion;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Max", "Canino", "Labrador", 3, "Mediano", "Dorado", "Saludable");
        Gato gato = new Gato("Luna", "Felino", "Siames", 2, "Pequeño", "Gris", "Saludable");
        Pajaro pajaro = new Pajaro("Piolín", "Ave", "Canario", 1, "Pequeño", "Amarillo", "Saludable");
        Tortuga tortuga = new Tortuga("Tuga", "Reptil", "Tortuga de tierra", 10, "Mediana", "Verde", "Saludable");

        Mascota[] mascotas = { perro, gato, pajaro, tortuga };

        for (Mascota mascota : mascotas) {
            System.out.println("==============");
            mascota.mostrarInformacion();
            mascota.hacerSonido();
            mascota.alimentar();
            mascota.cuidar();
            System.out.println();
        }
    }
}
