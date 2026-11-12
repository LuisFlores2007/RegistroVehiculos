
import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    vehiculo[] vehiculos = new vehiculo[10];
    int cantidad = 0;
    int opcion = 0;

    while(opcion != 3) {
        IO.println("REGISTRO DE VEHICULOS");
        IO.println("1. Registrar vehiculo");
        IO.println("2. Mostrar vehiculos");
        IO.println("3. Salir");
        IO.println("Ingresar una opcion: ");

        if (sc.hasNextInt()) {
            IO.println("==INGRESE UNA OPCION VALIDA==");
            sc.nextLine();
            continue;
        }
        opcion = sc.nextInt();
        sc.nextLine();

    }


    
}
