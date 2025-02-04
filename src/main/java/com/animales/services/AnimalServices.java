package com.animales.services;

import com.animales.models.Animal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalServices {
    public void agruparYMostrarAnimales(List<Animal> animales) {
        Map<String, List<Animal>> agrupados = animales.stream()
                .collect(Collectors.groupingBy(Animal::getTipo));

        agrupados.forEach((tipo, lista) -> {
            System.out.println("\nAnimales " + tipo + ":");
            lista.forEach(a -> System.out.println(a.descripcion() + " y su sonido es: " + a.emitirSonido()));
        });
    }
}