
import puce.edu.ec.registroVehiculos.vehiculo;

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

        if (!sc.hasNextInt()) {
            IO.println("==INGRESE UNA OPCION VALIDA==");
            sc.nextLine();
            continue;
        }
        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion){
            case 1:
                if (cantidad < 10) {
                    IO.println("Ingrese la marca del vehiculo:");
                    String marca = sc.nextLine();
                    IO.println("Ingrese la modelo del vehiculo:");
                    String modelo = sc.nextLine();
                    IO.println("Ingrese el año del vehiculo:");
                    int ano = sc.nextInt();
                    IO.println("Ingrese la placa del vehiculo:");
                    String placa = sc.nextLine();
                    vehiculo vehiculo1 = new vehiculo(marca, modelo, ano, placa);
                    vehiculos[cantidad] = vehiculo1;
                    cantidad++;
                    IO.println("Vehiculo registrado");
                }else {
                    IO.println("No hay mas espacio para registrar mas vehiculos");
                }
                break;
            case 2:
                    IO.println("LISTADO DE VEHICULOS");
                    if (cantidad == 0){
                        IO.println("=====No hay vehiculos registrados====");
                    }
                    for (int i = 0; i < cantidad; i++) {
                        IO.println("Vehiculo " + (i + 1));
                        IO.println("Marca: " + vehiculos[i].marca());
                        IO.println("Modelo: " + vehiculos[i].modelo());
                        IO.println("Año: " + vehiculos[i].ano());
                        IO.println("Placa: " + vehiculos[i].placa());
                    }
                break;
            default:
                IO.println("OPCION INCORRECTA ");
                break;

        }

    }


    
}
