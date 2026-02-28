import java.util.Scanner;

public class Main {

    // Metodo principal donde se ejecuta el menu del programa
    public static void menu() {

        Scanner sc = new Scanner(System.in);
        PilaDinamica pila = new PilaDinamica(); // Se crea la pila de llamadas

        int opcion;

        do {

            // Menu de opciones
            System.out.println("\n--- MENU PILA DE LLAMADAS ---");
            System.out.println("1. Agregar llamada");
            System.out.println("2. Mostrar cima");
            System.out.println("3. Ejecutar llamada (Eliminar cima)");
            System.out.println("4. Mostrar pila");
            System.out.println("5. Salir");

            opcion = sc.nextInt(); // Lee la opcion
            sc.nextLine();

            switch (opcion) {

                case 1:
                    // Pide datos para crear una nueva llamada
                    System.out.print("Nombre de la rutina: ");
                    String nombre = sc.nextLine();

                    System.out.print("Tipo de retorno: ");
                    String retorno = sc.nextLine();

                    // Crea el nodo y lo agrega a la pila
                    Nodo nodo = new Nodo(nombre, retorno);
                    pila.push(nodo);
                    break;

                case 2:
                    // Muestra el elemento que esta en la cima
                    Nodo cima = pila.peek();
                    if (cima != null) {
                        System.out.println("\nElemento en la cima:");
                        System.out.println(cima.getInfo());
                    }
                    break;

                case 3:
                    // Elimina la llamada que esta en la cima
                    Nodo eliminado = pila.pop();
                    if (eliminado != null) {
                        System.out.println("\nLlamada ejecutada:");
                        System.out.println(eliminado.getInfo());
                    }
                    break;

                case 4:
                    // Muestra toda la pila
                    pila.mostrarPila();
                    break;

                case 5:
                    // Sale del programa
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }

        } while (opcion != 5); // Repite hasta salir

        sc.close(); // Cierra el Scanner
    }

    public static void main(String[] args) {
        menu(); // Llama al menu
    }
}