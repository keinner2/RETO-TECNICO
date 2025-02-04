package com.animales.models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnimalTest {
    
    @Test
    public void testAnimalTerrestre() {
        Animal perro = new Animal("Firulais", "terrestre", "Guau guau!");
        assertEquals("Firulais", perro.getNombre());
        assertEquals("terrestre", perro.getTipo());
        assertEquals("Guau guau!", perro.emitirSonido());
        assertEquals("El Firulais es un animal terrestre.", perro.descripcion());
    }

    @Test
    public void testAnimalAcuatico() {
        Animal delfin = new Animal("Flipper", "acuatico", "iiii iiii!");
        assertEquals("Flipper", delfin.getNombre());
        assertEquals("acuatico", delfin.getTipo());
        assertEquals("iiii iiii!", delfin.emitirSonido());
        assertEquals("El Flipper es un animal acuatico.", delfin.descripcion());
    }

    @Test
    public void testAnimalVolador() {
        Animal halcon = new Animal("Ave Rápida", "volador", "gañido!");
        assertEquals("Ave Rápida", halcon.getNombre());
        assertEquals("volador", halcon.getTipo());
        assertEquals("gañido!", halcon.emitirSonido());
        assertEquals("El Ave Rápida es un animal volador.", halcon.descripcion());
    }
}