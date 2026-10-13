import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //LLAMAMOS A LAS CLASES//

        Cinema cinema = new Cinema();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su nombre");
        String viewer_name = sc.nextLine();

        System.out.println("Introduzca su edad");
        int viewer_age = sc.nextInt();
        sc.nextLine(); // limpiar buffer. Si antes llamaste a nextInt() o nextDouble(), el enter que el usuario presiona
        // queda en el buffer. Entonces, al llamar a nextLine() justo después, lee esa línea vacía y no lo que escribió el usuario.

        System.out.println("¿Cuanto dinero tiene?");
        double viewer_money = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        System.out.println("¿Qué película desea ver?:\n Spiderman, El señor de los Anillos, Harry Potter, Los Vengadores");
        String chosen_movie = sc.nextLine();
        boolean exists = cinema.selectMovie(chosen_movie);
        if (!exists) {
            System.out.println("Fin del programa. Escoja una película válida.");
            return;
        }
        cinema.cinemaHall_generate();
        // Elegir asiento
        boolean seated = false;
        while (!seated) {
            System.out.println("Seleccione fila (1-8):");
            int row_index = sc.nextInt() - 1; // Se convierte a indices fila 1 -> índice 0
            System.out.println("Seleccione columna (A-J):");
            char column = Character.toUpperCase(sc.next().charAt(0));
            int col_index = column - 'A'; //Se convierte a indices columna 'A' -> índice 0
            if (row_index < 0 || row_index >= 8 ||
                    col_index < 0 || col_index >= 10) {
                System.out.println("Asiento fuera de rango. Intenta de nuevo.");
                continue;
            }
            // Intentar sentarse
            seated = cinema.seat_verification(viewer_name, viewer_age, viewer_money, chosen_movie, row_index, col_index);
        }
        cinema.show_cinemaHall();
    }
}


