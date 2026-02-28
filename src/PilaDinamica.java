import java.util.ArrayList;

public class PilaDinamica {

    private ArrayList<Nodo> pila;

    // Constructor
    public PilaDinamica() {
        pila = new ArrayList<>();
    }

    // Inserta un nuevo nodo en la cima
    public void push(Nodo nodo) {
        pila.add(nodo);
        System.out.println("Elemento agregado: " + nodo.getInfo());
    }

    // Elimina el elemento en la cima
    public Nodo pop() {

        if (pila.isEmpty()) {
            System.out.println("ERROR: No se puede eliminar porque la pila esta vacia.");
            return null;
        }

        Nodo eliminado = pila.get(pila.size() - 1);

        System.out.println("Elemento eliminado: " + eliminado.getInfo());

        pila.remove(pila.size() - 1);

        return eliminado;
    }

    // Devuelve la cima
    public Nodo peek() {

        if (pila.isEmpty()) {
            System.out.println("ERROR: La pila esta vacia.");
            return null;
        }

        return pila.get(pila.size() - 1);
    }


    // Muestra los elementos de la pila desde la cima hacia la base
    public void mostrarPila() {

        if (pila.isEmpty()) {
            System.out.println("ERROR: No se puede mostrar, la pila esta vacia.");
            return;
        }

        System.out.println("\n===== REPRESENTACION VISUAL DE LA PILA =====\n");

        for (int i = pila.size() - 1; i >= 0; i--) {

            Nodo actual = pila.get(i);

            // Parte superior (CIMA)
            if (i == pila.size() - 1) {

                System.out.println("┌──────────────────────────────┐");
                System.out.println("│ CIMA -> " + actual.getInfo());
                System.out.println("├──────────────────────────────┤");

            }
            // Elementos intermedios
            else if (i > 0) {

                System.out.println("│ " + actual.getInfo());
                System.out.println("├──────────────────────────────┤");

            }
            // Base de la pila
            else {

                System.out.println("│ " + actual.getInfo());
                System.out.println("└──────────────────────────────┘");
            }
        }

        System.out.println();
    }
}