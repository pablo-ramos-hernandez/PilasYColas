package org.salesianos.Clases;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private int id = 0;
    private Queue<Clientes> filaCliente = new LinkedList<Clientes>();
    private boolean cajero = false;

    public int getId() {
        return id;
    }

    public Queue<Clientes> getFilaCliente() {
        return filaCliente;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFilaCliente(Queue<Clientes> filaCliente) {
        this.filaCliente = filaCliente;
    }

    public Cajero() {
        id++;
    }

    public void abrirCajero() {
        if (cajero) {
            System.out.println("La caja ya esta abierta");
        } else {
            System.out.println("Abierta la caja");
            cajero = true;
        }

    }

    public void cerrarCajero() {

        if (!cajero) {
            System.out.println("La caja ya esta cerrada");
        } else {
            System.out.println("Caja cerrada");
            cajero = false;
        }
    }

    public void anadirCliente() {

        if (cajero) {
            Clientes cliente = new Clientes();
            filaCliente.add(cliente);
            cliente.toString();

        } else {
            System.out.println("Se tiene que abrir la caja");
        }

    }

    public void atenderCliente() {
        if (cajero) {
            if (filaCliente.size() == 0) {
                System.out.println("No hay nadie en la cola");
            } else {
                System.out.println("El cliente " + filaCliente.poll().getNombre() + " ha sido atendido");
            }
        } else {
            System.out.println("Se tiene que abrir la caja");
        }
    }

    @Override
    public String toString() {
        String mensaje = 
        "* Numero de caja: " + id + "\n" +
        "* Total de clientes: " + filaCliente.size() + "\n" +
        "* Clientes en la fila: \n";
        
        for (Clientes clientes : filaCliente) {
            mensaje += clientes.getNombre()+"\n";
        }
        return mensaje;
    }
}
