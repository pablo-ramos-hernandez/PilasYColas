package org.salesianos.Clases;

import java.util.Random;

public class CestaDeLaCompra {

    private String nombre;
    private int totalProductos;

    // Creacion de la lista de productos

    private static final String[] Productos_Names = new String[] {
            "Leche",
            "Queso",
            "Cereales",
            "Yogurt",
            "Atun",
            "Galletas",
            "Gelatina",
            "Jamon Serrano",
            "Pan",
            "Manzana",
            "Platano",
            "Naranja"
    };

    // Creacion de la utilidad de obtener un producto aleatorio
    public static String getRandomItems() {

        Random random = new Random();

        int randomIndex = random.nextInt(CestaDeLaCompra.Productos_Names.length);

        return CestaDeLaCompra.Productos_Names[randomIndex];
    }

}