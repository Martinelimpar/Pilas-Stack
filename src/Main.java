public class Main {
    public static void main(String[] args) {

        ListStack miPila = new ListStack();
        System.out.println("--- PRUEBA DE PUSH (Insertar) ---");
        miPila.push("Ecuaciones de trayectoria");
        miPila.push("Cálculo de velocidad inicial");
        miPila.push("Fricción atmosférica"); // Este será el tope de la pila

        //toString y el size
        System.out.println("Estado actual de la pila:");
        System.out.println(miPila.toString());
        System.out.println("Tamaño actual: " + miPila.size());

        //peek (ver la cima sin borrar)
        System.out.println("\n--- PRUEBA DE PEEK ---");
        System.out.println("Elemento en la cima (sin sacarlo): " + miPila.peek());

        //search (buscar elementos)
        System.out.println("\n--- PRUEBA DE SEARCH ---");
        System.out.println("¿Está 'Cálculo de velocidad inicial'? " + miPila.search("Cálculo de velocidad inicial"));
        System.out.println("¿Está 'Gravedad'? " + miPila.search("Gravedad")); // Debería dar false

        //pop (sacar el elemento de la cima)
        System.out.println("\n--- PRUEBA DE POP (Retirar) ---");
        System.out.println("Elemento retirado: " + miPila.pop());
        System.out.println("Estado de la pila tras el pop:");
        System.out.println(miPila.toString());

        //clear y isEmpty
        System.out.println("\n--- PRUEBA DE CLEAR (Limpiar) ---");
        miPila.clear();
        System.out.println("¿La pila está vacía ahora? " + miPila.isEmpty());
        System.out.println("Tamaño final: " + miPila.size());
    }
}