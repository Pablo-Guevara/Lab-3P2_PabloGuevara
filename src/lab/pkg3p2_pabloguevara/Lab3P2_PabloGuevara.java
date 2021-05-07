package lab.pkg3p2_pabloguevara;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_PabloGuevara {

    public static void main(String[] args) {
        ArrayList<Tienda> ListaTiendas = new ArrayList();
        ArrayList<Personas> ListaPersonas = new ArrayList();
        //ArrayList<Clientes> ListaClientes = new ArrayList();
        Scanner leer = new Scanner(System.in);
        int opcion = -1, opcionMenu, opcionLogin = 0, opcionTipoPersona, opcionAdmin = 0;
        String usuario, contraseña;

        while (opcionLogin != 3) {
            System.out.println("1.Crear cuenta");
            System.out.println("2.Entrar al sistema");
            System.out.println("3.Salir");
            opcionLogin = leer.nextInt();

            if (opcionLogin == 1) {
                System.out.println("Ingrese nombre de usuario: ");
                usuario = leer.next();

                System.out.println("Ingrese contraseña: ");
                contraseña = leer.next();
                if (usuario.equals("admin") && contraseña.equals("1234")) {
                    ListaPersonas.add(new Personas(usuario, contraseña));
                    System.out.println("Administrador creado");
                } else {
                    System.out.println("1.Empleado");
                    System.out.println("2.Cliente");
                    System.out.println("Ingrese su opcion: ");
                    opcionTipoPersona = leer.nextInt();

                    if (opcionTipoPersona == 1) {
                        System.out.println("1.Cajero");
                        System.out.println("2.Supervisor");
                        System.out.println("3.Asesor financiero");
                        System.out.println("Elija su opcion: ");
                        opcionTipoPersona = leer.nextInt();

                        if (opcionTipoPersona == 1) {
                            String rango = "Cajero";
                            String nombre;
                            String apellido;
                            float salario;
                            String nacionalidad;
                            int cantAñosLab;
                            String horarioTrajado;
                            String horaAlmuerzo;
                            int metaVenderMes;
                            int cantAtendidos;

                            System.out.println("Ingrese su nombre: ");
                            nombre = leer.next();
                            System.out.println("Ingrese apellido: ");
                            apellido = leer.next();
                            System.out.println("Ingrese su salario: ");
                            salario = leer.nextFloat();
                            System.out.println("Ingrese su nacionalidad: ");
                            nacionalidad = leer.next();
                            System.out.println("Ingrese cantidad de años laborados: ");
                            cantAñosLab = leer.nextInt();
                            System.out.println("Ingrese su horario de trabajo: ");
                            horarioTrajado = leer.next();
                            System.out.println("Ingrese hora de almuerzo: ");
                            horaAlmuerzo = leer.next();
                            System.out.println("Ingrese meta a vender en el mes: ");
                            metaVenderMes = leer.nextInt();
                            System.out.println("Ingrese cantidad de personas atendidas: ");
                            cantAtendidos = leer.nextInt();

                            ListaPersonas.add(new Cajero(nombre, apellido, salario, nacionalidad, cantAñosLab, horarioTrajado, horaAlmuerzo, metaVenderMes, cantAtendidos, rango, usuario, contraseña));
                            System.out.println("USUARIO CAJERO CREADO EXITOSAMENTE");
                        }

                        if (opcionTipoPersona == 2) {
                            String rango = "Supervisor";
                            String nombre;
                            String apellido;
                            float salario;
                            String nacionalidad;
                            //ArrayList<Cajero> cajerosSupervisa = new ArrayList();

                            System.out.println("Ingrese su nombre: ");
                            nombre = leer.next();
                            System.out.println("Ingrese apellido: ");
                            apellido = leer.next();
                            System.out.println("Ingrese su salario: ");
                            salario = leer.nextFloat();
                            System.out.println("Ingrese su nacionalidad: ");
                            nacionalidad = leer.next();

                            ListaPersonas.add(new Supervisor(nombre, apellido, salario, nacionalidad, rango, usuario, contraseña));
                            System.out.println("USUARIO SUPERVISOR CREADO EXITOSAMENTE");
                        }

                        if (opcionTipoPersona == 3) {
                            String rango = "Asesor financiero";
                            String nombre;
                            String apellido;
                            float salario;
                            String nacionalidad;
                            //ArrayList<Cajero> cajerosSupervisa = new ArrayList();

                            System.out.println("Ingrese su nombre: ");
                            nombre = leer.next();
                            System.out.println("Ingrese apellido: ");
                            apellido = leer.next();
                            System.out.println("Ingrese su salario: ");
                            salario = leer.nextFloat();
                            System.out.println("Ingrese su nacionalidad: ");
                            nacionalidad = leer.next();

                            ListaPersonas.add(new AsesorFinanciero(nombre, apellido, salario, nacionalidad, rango, usuario, contraseña));
                            System.out.println("USUARIO ASESOR FINANCIERO CREADO EXITOSAMENTE");
                        }
                    } else {
                        if (opcionTipoPersona == 2) {
                            String nombre;
                            String apellido;
                            float salario;
                            String nacionalidad;
                            String direcDomicilio;

                            System.out.println("Ingrese su nombre: ");
                            nombre = leer.next();
                            System.out.println("Ingrese apellido: ");
                            apellido = leer.next();
                            System.out.println("Ingrese su salario: ");
                            salario = leer.nextFloat();
                            System.out.println("Ingrese su nacionalidad: ");
                            nacionalidad = leer.next();
                            System.out.println("Ingrese dirección de domicilio: ");
                            direcDomicilio = leer.next();

                            ListaPersonas.add(new Clientes(nombre, apellido, salario, nacionalidad, direcDomicilio, usuario, contraseña));
                            System.out.println("USUARIO CLIENTE CREADO EXITOSAMENTE");
                        }
                    }
                }
            }
            int ingreso=0;
            
            if (opcionLogin == 2) {//INGRESO AL SISTEMA
                while(ingreso==0){
                 ingreso=0;
                System.out.println("Ingrese nombre de usuario: ");
                usuario = leer.next();

                System.out.println("Ingrese contraseña: ");
                contraseña = leer.next();
                if (usuario.equals("admin") && contraseña.equals("1234")) {
                    System.out.println("Administrador ingresó al sistema");
                    while (opcionAdmin != 5) {
                        if (opcionAdmin == 1) {
                            System.out.println("1.Crear tienda");
                            System.out.println("2.Manejar personas");
                            System.out.println("Elija su opcion: ");
                            opcionMenu = leer.nextInt();
                            if (opcionMenu == 1) {
                                String identificador = "";
                                String ubicacion;
                                int cantMaxEmpleados;
                                int cantCajas;
                                String productoMasVendido;
                                int cantMaxArticulos;

                                int verificadorCiclo = 0;

                                while (verificadorCiclo == 0) {///

                                    System.out.println("Ingrese identificador de la tienda: ");
                                    identificador = leer.next();

                                    if (ListaTiendas.isEmpty()) {
                                        verificadorCiclo = 1;
                                    } else {
                                        for (int i = 0; i < ListaTiendas.size(); i++) {
                                            if (ListaTiendas.get(i).getIdentificador().equals(identificador)) {
                                                verificadorCiclo = 0;
                                                i = ListaTiendas.size();
                                                System.out.println("El verificador ya existe, ingrese uno nuevo");
                                            } else {
                                                if (i == ListaTiendas.size() - 1) {
                                                    verificadorCiclo = 1;
                                                }
                                            }

                                        }
                                    }
                                }///

                                System.out.println("Ingrese ubicación de la tienda: ");
                                ubicacion = leer.next();

                                System.out.println("Ingrese cantidad máxima de empleados: ");
                                cantMaxEmpleados = leer.nextInt();

                                System.out.println("Ingrese cantidad de cajas en la tienda: ");
                                cantCajas = leer.nextInt();

                                System.out.println("Ingrese artículo más vendido");///
                                productoMasVendido = leer.next();

                                System.out.println("Ingrese cantidad máxima de articulos en la tienda: ");
                                cantMaxArticulos = leer.nextInt();

                                ListaTiendas.add(new Tienda(identificador, ubicacion, cantMaxEmpleados, cantCajas, productoMasVendido, cantMaxArticulos));
                            }

                        }
                    }
                }else{
                    for (int i = 0; i < ListaPersonas.size(); i++) {
                        if (usuario.equals(ListaPersonas.get(i).getNomUsuario()) && contraseña.equals(ListaPersonas.get(i).getContraseña())) {
                            ingreso=1;
                            if (ListaPersonas.get(i).getClass().getSimpleName().equals("Clientes")) {
                                System.out.println("Bienvenido al sistema: "+ListaPersonas.get(i).getClass().getSimpleName());
                            }
                            
                            if (ListaPersonas.get(i).getClass().getSimpleName().equals("Cajero")) {
                                System.out.println("Bienvenido al sistema: "+ListaPersonas.get(i).getClass().getSimpleName());
                            }
                            
                            if (ListaPersonas.get(i).getClass().getSimpleName().equals("Supervisor")) {
                                System.out.println("Bienvenido al sistema: "+ListaPersonas.get(i).getClass().getSimpleName());
                            }
                            
                            if (ListaPersonas.get(i).getClass().getSimpleName().equals("AsesorFinanciero")) {
                                System.out.println("Bienvenido al sistema: "+ListaPersonas.get(i).getClass().getSimpleName());
                            }
                            
                        }
                        
                    }
                    if (ingreso==0) {
                        System.out.println("Usuario o contraseña no válidos");
                    }
                    
                    
                }
            }
        }
        }

    }

}
