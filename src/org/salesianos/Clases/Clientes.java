package org.salesianos.Clases;

import java.util.Random;

public class Clientes {

    private String nombre;
    private int totalProductos;

    // Creacion de la lista de productos

    private static final String[] CLIENTE_NAMES = new String[] {

        "German"

    };

    // Creacion de la utilidad de obtener un producto aleatorio
    public static String getRandomItems() {

        Random random = new Random();

        int randomIndex = random.nextInt(Clientes.CLIENTE_NAMES.length);

        return Clientes.CLIENTE_NAMES[randomIndex];
    };

}
