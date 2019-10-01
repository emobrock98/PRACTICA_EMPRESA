import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("***************************");
            System.out.println("---       EMPRESA       ---");
            System.out.println("***************************");
            System.out.println("INTROCUCE LA OPCION DESEADA");
            System.out.println("1. Registrar trabajador");
            System.out.println("2. Listar trabajadores");
            System.out.println("3. Mostrar datos del trabajador");
            System.out.println("4. Salir");
            System.out.println("***************************");
            System.out.println("INTRODUCE LA OPCION DESEADA");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    String nombre, apellido, dni;
                    int sueldo, pagas, menutrab;
                    System.out.println("REGISTRA UN TRABAJADOR");
                    System.out.println("1.1. Registrar Asalariado: ");
                    System.out.println("1.2. Registrar Autónomo: ");
                    menutrab = sc.nextInt();
                    sc.nextLine();
                    switch (menutrab){
                        case 1:
                            System.out.println("OPCION ASALARIADO");
                            System.out.println("Intruduce el DNI: ");
                            dni = sc.next();
                            sc.nextLine();
                            if(!empresa.estaTrabajador(dni)){
                            System.out.println("Intruduce el NOMBRE: ");
                            nombre = sc.next();
                            sc.nextLine();
                            System.out.println("Intruduce APELLIDO: ");
                            apellido = sc.next();
                            sc.nextLine();
                            System.out.println("Intruduce el SUELDO: ");
                            sueldo = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Intruduce el Nº DE PAGAS: ");
                            pagas = sc.nextInt();
                            sc.nextLine();
                            Trabajador trabajador = new Asalariado(nombre, apellido, dni, sueldo, pagas);
                            empresa.agregarTrabajador(trabajador);
                                System.out.println("TRABAJADOR REGISTRADO CON EXITO");
                    } else {
                    System.out.println("Ya existe el trabajador");
                }
                            break;

                        case 2:
                            System.out.println("OPCION AUTONOMO");
                            System.out.println("Intruduce el DNI: ");
                            dni = sc.next();
                            sc.nextLine();
                            if(!empresa.estaTrabajador(dni)){
                                System.out.println("Intruduce el NOMBRE: ");
                                nombre = sc.next();
                                sc.nextLine();
                                System.out.println("Intruduce APELLIDO: ");
                                apellido = sc.next();
                                sc.nextLine();
                                System.out.println("Intruduce el SUELDO: ");
                                sueldo = sc.nextInt();
                                sc.nextLine();
                                Trabajador trabajador = new Autonomo(nombre,apellido,dni,sueldo);
                                empresa.agregarTrabajador(trabajador);
                                System.out.println("TRABAJADOR REGISTRADO CON EXITO");
                            } else {
                                System.out.println("Ya existe el trabajador");
                            }

                            break;
                        }
                    break;

                case 2:
                    int menulistar;
                    System.out.println("LISTAR TRABAJADORES");
                    System.out.println("2.1. Listar Asalariados: ");
                    System.out.println("2.2. Listar Autónomos: ");
                    menulistar = sc.nextInt();
                    sc.nextLine();
                    switch (menulistar){
                        case 1:
                            System.out.println("LISTA DE ASALARIADOS");
                            if (!empresa.getListaTrabajadores().isEmpty()) {
                                empresa.listarTrabajadores();
                            } else {
                                System.out.println("No hay Trabajadores asalariados");
                            }

                            break;
                        case 2:
                            System.out.println("LISTA DE AUTONOMOS");
                            if (!empresa.getListaTrabajadores().isEmpty()) {
                                empresa.listarTrabajadores();
                            } else {
                                System.out.println("No hay Trabajadores autonomos");
                            }

                            break;}
                    break;

                case 3:
                    System.out.println("MOSTRAR DATOS DE TRABAJADOR");
                    empresa.mostrarTrabajador();

                    break;

                case 4:
                    System.out.println("SALIENDO...");
                    break;

                default:
                    System.out.println("Vuelve a Intentarlo!");
                    break;
            }
        } while (opcion != 6);
    }
}

