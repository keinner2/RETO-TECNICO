package com.animales.models;

public class Animal {
    private String nombre;
    private String tipo;
    private String sonido;

    public Animal(String nombre, String tipo, String sonido) {
        this.nombre = nombre;
        this.tipo = tipo.toLowerCase();
        this.sonido = sonido;
    }   

    public String getNombre() { 
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String emitirSonido() {
        return sonido;
    }

    public String descripcion() {
        return "El " + nombre + " es un animal " + tipo + ".";
    }
}