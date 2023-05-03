package org.salesianos.Clases;

import java.util.Random;
import java.util.Stack;

public class Clientes {

    private String nombre;
    private int totalProductos;
    private Stack<String> pilasProductos = new Stack<>();

    public String getNombre() {
        return nombre;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    public void pushPilaCliente() {

        Random random = new Random();

        totalProductos = random.nextInt(10 - 1) + 1;

        for (int index = 0; index < totalProductos; index++) {
            pilasProductos.push(CestaDeLaCompra.getRandomItems());
        }

    }

    public Clientes() {
        this.nombre = CestaDeLaCompra.getRandomNames();
        pushPilaCliente();
    }

    @Override
    public String toString() {
        String mensaje = "* Nombre: " + nombre + "\n" +
                "* Total de productos: " + totalProductos + "\n" +
                "* Lista de articulos en la cesta \n";
        for (int index = 0; index < totalProductos; index++) {
            mensaje += pilasProductos.get(index) + "\n";
        }
        return mensaje;
    }


}
