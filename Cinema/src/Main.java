import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //LLAMAMOS A LAS CLASES//

        Cinema cine = new Cinema();

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su nombre");
        String nombre_espectador = teclado.nextLine();

        System.out.println("Introduzca su edad");
        int edad_espectador = teclado.nextInt();
        teclado.nextLine(); // limpiar buffer. Si antes llamaste a nextInt() o nextDouble(), el enter que el usuario presiona
        // queda en el buffer. Entonces, al llamar a nextLine() justo después, lee esa línea vacía y no lo que escribió el usuario.

        System.out.println("¿Cuanto dinero tiene?");
        double dinero_espectador = teclado.nextDouble();
        teclado.nextLine(); // limpiar buffer

        System.out.println("¿Qué película desea ver?:\n Spiderman, El señor de los Anillos, Harry Potter, Los Vengadores");
        String pelicula_elegida = teclado.nextLine();
        boolean existe = cine.seleccionarPelicula(pelicula_elegida);
        if (!existe) {
            System.out.println("Fin del programa. Escoja una película válida.");
            return;
        }
        cine.generar_sala();
        // Elegir asiento
        boolean sentado = false;
        while (!sentado) {
            System.out.println("Seleccione fila (1-8):");
            int fila_index = teclado.nextInt() - 1; // Se convierte a indices fila 1 -> índice 0
            System.out.println("Seleccione columna (A-J):");
            char columna = Character.toUpperCase(teclado.next().charAt(0));
            int col_index = columna - 'A'; //Se convierte a indices columna 'A' -> índice 0
            if (fila_index < 0 || fila_index >= 8 ||
                    col_index < 0 || col_index >= 10) {
                System.out.println("Asiento fuera de rango. Intenta de nuevo.");
                continue;
            }
            // Intentar sentarse
            sentado = cine.verificacion_asiento(nombre_espectador, edad_espectador, dinero_espectador, pelicula_elegida, fila_index, col_index);
        }
        cine.mostrar_sala();
    }
}


