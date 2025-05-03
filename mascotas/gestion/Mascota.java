
// Archivo: src/com/mascotas/gestion/Mascota.java
package com.mascotas.gestion;

public abstract class Mascota {
    protected String nombre;
    protected String especie;
    protected String raza;
    protected int edad;
    protected String tamaño;
    protected String color;
    protected String estadoSalud;

    public Mascota(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.color = color;
        this.estadoSalud = estadoSalud;
    }

    public String getNombre() { return nombre; }
    public String getEspecie() { return especie; }
    public String getRaza() { return raza; }
    public int getEdad() { return edad; }
    public String getTamaño() { return tamaño; }
    public String getColor() { return color; }
    public String getEstadoSalud() { return estadoSalud; }

    public abstract void hacerSonido();
    public abstract void alimentar();
    public abstract void cuidar();

    public void mostrarInformacion() {
        System.out.println("🐾 Información de la Mascota:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Color: " + color);
        System.out.println("Estado de salud: " + estadoSalud);
    }
}

