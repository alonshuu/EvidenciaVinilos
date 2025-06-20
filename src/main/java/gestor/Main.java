package gestor;

import modelo.Vinilo;
import vista.ColeccionVinilos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ColeccionVinilos coleccion = new ColeccionVinilos();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Colección de Vinilos ---");
            System.out.println("1. Agregar vinilo");
            System.out.println("2. Buscar vinilo");
            System.out.println("3. Ver cantidad de vinilos");
            System.out.println("4. Ver espacios disponibles");
            System.out.println("5. Listar colección");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Artista: ");
                    String artista = scanner.nextLine();
                    System.out.print("Disco: ");
                    String disco = scanner.nextLine();
                    System.out.print("Año: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    Vinilo nuevo = new Vinilo(artista, disco, anio);
                    if (coleccion.agregarVinilo(nuevo)) {
                        System.out.println("Vinilo agregado con éxito.");
                    } else {
                        System.out.println("No hay espacio en la colección.");
                    }
                    break;

                case 2:
                    System.out.print("Artista a buscar: ");
                    String aBuscar = scanner.nextLine();
                    System.out.print("Disco a buscar: ");
                    String dBuscar = scanner.nextLine();
                    if (coleccion.buscarVinilo(aBuscar, dBuscar)) {
                        System.out.println("El vinilo está en la colección.");
                    } else {
                        System.out.println("El vinilo NO está en la colección.");
                    }
                    break;

                case 3:
                    System.out.println("Total de vinilos: " + coleccion.contarVinilos());
                    break;

                case 4:
                    System.out.println("Espacios disponibles: " + coleccion.espaciosDisponibles());
                    break;

                case 5:
                    coleccion.listarColeccion();
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}
