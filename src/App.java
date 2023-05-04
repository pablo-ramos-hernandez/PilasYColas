import java.util.Scanner;

import org.salesianos.Clases.Cajero;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("Bienvenido al menu aqui tiene las opcion: " + "\n"
                    + "1:Abrir caja: Permite al cajero/a abrir la caja para que se puedan pasar clientes a hacer cola. Debe salir un mensaje que indique al usuario la correcta apertura o si ya estaba abierta"
                    + "\n"
                    + "2:Añadir un nuevo cliente a la cola: Genera un cliente aleatorio con un número aleatorio de productos. A continuación, si la caja está abierta, se añade a la cola y se muestra por pantalla el cliente generado, de lo contrario, debe mostrarse un mensaje que indique que la caja está cerrada."
                    + "\n"
                    + "3:Atender un cliente: Si hay clientes en la cola, atenderá al que le toque. Se mostrará por pantalla un mensaje indicando a quién se ha atendido, así como uno si no hubiera clientes a los que atender."
                    + "\n"
                    + "4:Ver clientes pendientes: Muestra los clientes que hay esperando actualmente en la cola junto con el identificador del cajero/a."
                    + "\n" + "5:Cerrar supermercado: Si está abierta, cierra la caja antes de salir del programa.");

            opcion = teclado.nextLine();
            switch (opcion) {
                case 1:
                    break;
            }
        }
    }
}
