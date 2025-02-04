package com.animales;

import com.animales.models.Animal;
import com.animales.services.AnimalServices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String filePath = "/animales.txt"; // Ruta del archivo
        List<Animal> animales = new ArrayList<>();

        // Cargar animales desde el archivo
        try (BufferedReader br = new BufferedReader(new InputStreamReader(Main.class.getResourceAsStream(filePath)))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split("\\|");
                if (datos.length != 3) {
                    System.out.println("Formato incorrecto en: " + linea);
                    continue;
                }

                String nombre = datos[0];
                String tipo = datos[1];
                String sonido = datos[2];

                animales.add(new Animal(nombre, tipo, sonido));
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        // Si hay animales cargados, pedir al usuario un nombre y mostrar el animal correspondiente
        if (!animales.isEmpty()) {
            // Crear un scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el nombre del animal: ");
            String nombreBuscado = scanner.nextLine();

            // Buscar el animal por nombre
            Animal animalEncontrado = null;
            for (Animal animal : animales) {
                if (animal.getNombre().equalsIgnoreCase(nombreBuscado)) {
                    animalEncontrado = animal;
                    break;
                }
            }

            // Mostrar el resultado
            if (animalEncontrado != null) {
                System.out.println(animalEncontrado.getNombre() + "|" + animalEncontrado.getTipo() + "|" + animalEncontrado.emitirSonido());
            } else {
                System.out.println("No se encontró un animal con el nombre: " + nombreBuscado);
            }
        } else {
            System.out.println("No se encontraron animales en el archivo.");
        }
    }
}