package lab.pkg3p2_pabloguevara;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_PabloGuevara {

    public static void main(String[] args) {
        ArrayList<Tienda> ListaTiendas = new ArrayList();
        ArrayList<Personas> ListaPersonas = new ArrayList();
        ArrayList<Articulos> ListaArticulos = new ArrayList();
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
            int ingreso = 0;

            if (opcionLogin == 2) {//INGRESO AL SISTEMA
                while (ingreso == 0) {
                    ingreso = 0;
                    System.out.println("Ingrese nombre de usuario: ");
                    usuario = leer.next();

                    System.out.println("Ingrese contraseña: ");
                    contraseña = leer.next();
                    if (usuario.equals("admin") && contraseña.equals("1234")) {
                        System.out.println("Administrador ingresó al sistema");
                        while (opcionAdmin != 5) {
                            if (opcionAdmin == 1) {
                                System.out.println("1.Crear tienda");
                                System.out.println("2.Crear productos");
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

                                if (opcionAdmin == 2) {
                                    int opcCrearArticulo;
                                    System.out.println("1.Televisor");
                                    System.out.println("2.Consola");
                                    System.out.println("3.Equipo de sonido");
                                    System.out.println("4.Teatro en casa");
                                    System.out.println("Ingrese su opcion: ");
                                    opcCrearArticulo = leer.nextInt();

                                    if (opcCrearArticulo == 1) {
                                        int numSerie;
                                        float precio;
                                        Color color;
                                        String color2;
                                        String informacionGarantia;
                                        float tamañoPantalla;
                                        int smartTV;
                                        boolean smart = false;
                                        String Marca;
                                        int cantConexiones;
                                        float grosor;

                                        System.out.println("Ingrese numero de serie");
                                        numSerie = leer.nextInt();

                                        System.out.println("Ingrese precio: ");
                                        precio = leer.nextFloat();

                                        System.out.println("Ingrese color: ");
                                        color2 = leer.next();
                                        color = Color.getColor(color2);

                                        System.out.println("Ingrese informacion de garantia: ");
                                        informacionGarantia = leer.next();

                                        System.out.println("Ingrese tamaño de pantalla: ");
                                        tamañoPantalla = leer.nextFloat();
                                        System.out.println("¿El televisor es SmartTV?");
                                        System.out.println("1.Si");
                                        System.out.println("2.No");
                                        smartTV = leer.nextInt();
                                        if (smartTV == 1) {
                                            smart = true;
                                        }
                                        if (smartTV == 2) {
                                            smart = false;
                                        }

                                        System.out.println("Ingrese marca del televisor: ");
                                        Marca = leer.next();

                                        System.out.println("Ingrese cantidad de conexiones: ");
                                        cantConexiones = leer.nextInt();

                                        System.out.println("Ingrese grosor del televisor: ");
                                        grosor = leer.nextFloat();

                                        ListaArticulos.add(new Televisores(tamañoPantalla, smart, Marca, cantConexiones, grosor, numSerie, precio, color, informacionGarantia));
                                    }

                                    if (opcCrearArticulo == 2) {
                                        int numSerie;
                                        float precio;
                                        Color color;
                                        String color2;
                                        String informacionGarantia;
                                        String marca;
                                        int cantAlmacenamiento;
                                        int cantControles;
                                        int numAccesorios;
                                        String infoTarjetaVideo;

                                        System.out.println("Ingrese numero de serie");
                                        numSerie = leer.nextInt();

                                        System.out.println("Ingrese precio: ");
                                        precio = leer.nextFloat();

                                        System.out.println("Ingrese color: ");
                                        color2 = leer.next();
                                        color = Color.getColor(color2);

                                        System.out.println("Ingrese informacion de garantia: ");
                                        informacionGarantia = leer.next();

                                        System.out.println("Ingrese marca del televisor: ");
                                        marca = leer.next();

                                        System.out.println("Ingrese cantidad de almacenamiento: ");
                                        cantAlmacenamiento = leer.nextInt();

                                        System.out.println("Ingrese cantidad de controles: ");
                                        cantControles = leer.nextInt();

                                        System.out.println("Ingrese numero de accesorios: ");
                                        numAccesorios = leer.nextInt();

                                        System.out.println("Ingrese informacion de la tarjeta de video: ");
                                        infoTarjetaVideo = leer.next();

                                        ListaArticulos.add(new Consolas(marca, cantAlmacenamiento, cantControles, numAccesorios, infoTarjetaVideo, numSerie, precio, color, informacionGarantia));
                                    }

                                    if (opcCrearArticulo == 3) {
                                        int numSerie;
                                        float precio;
                                        Color color;
                                        String color2;
                                        String informacionGarantia;
                                        int cantAltavoces;
                                        float potenciaMax;
                                        int cantPuertosAux;
                                        int cantDiscosSopor;
                                        int cantPuertosUSB;

                                        System.out.println("Ingrese numero de serie");
                                        numSerie = leer.nextInt();

                                        System.out.println("Ingrese precio: ");
                                        precio = leer.nextFloat();

                                        System.out.println("Ingrese color: ");
                                        color2 = leer.next();
                                        color = Color.getColor(color2);

                                        System.out.println("Ingrese informacion de garantia: ");
                                        informacionGarantia = leer.next();

                                        System.out.println("Ingrese cantidad de altavoces: ");
                                        cantAltavoces = leer.nextInt();

                                        System.out.println("Ingrese potencia máxima: ");
                                        potenciaMax = leer.nextFloat();

                                        System.out.println("Ingrese cantidad de puertos auxiliares: ");
                                        cantPuertosAux = leer.nextInt();

                                        System.out.println("Ingrese cantidad de discos que soporta: ");
                                        cantDiscosSopor = leer.nextInt();

                                        System.out.println("Ingrese cantidad de puertos usb: ");
                                        cantPuertosUSB = leer.nextInt();

                                        ListaArticulos.add(new EquiposSonido(cantAltavoces, potenciaMax, cantPuertosAux, cantDiscosSopor, cantPuertosUSB, numSerie, precio, color, informacionGarantia));

                                    }

                                    if (opcCrearArticulo == 4) {
                                        int numSerie;
                                        float precio;
                                        Color color;
                                        String color2;
                                        String informacionGarantia;
                                        int cantAltavoces;
                                        int cantDiscBR;
                                        String infoLimpieza;
                                        String infoLectorDisco;
                                        
                                        
                                        System.out.println("Ingrese numero de serie");
                                        numSerie = leer.nextInt();

                                        System.out.println("Ingrese precio: ");
                                        precio = leer.nextFloat();

                                        System.out.println("Ingrese color: ");
                                        color2 = leer.next();
                                        color = Color.getColor(color2);

                                        System.out.println("Ingrese información de garantia: ");
                                        informacionGarantia = leer.next();
                                        
                                        System.out.println("Ingrese cantidad de altavoces: ");
                                        cantAltavoces = leer.nextInt();
                                        
                                         System.out.println("Ingrese cantidad de Discos Blue Ray: ");
                                        cantDiscBR = leer.nextInt();

                                        System.out.println("Ingrese información de limpieza: ");
                                        infoLimpieza = leer.next();
                                        
                                        System.out.println("Ingrese información del lector del disco duro: ");
                                        infoLectorDisco = leer.next();
                                        
                                        ListaArticulos.add(new TeatrosEnCasa(cantAltavoces, cantDiscBR, infoLimpieza, infoLectorDisco, numSerie, precio, color, informacionGarantia));
                                    }
                                }

                            }
                        }
                    } else {
                        for (int i = 0; i < ListaPersonas.size(); i++) {
                            if (usuario.equals(ListaPersonas.get(i).getNomUsuario()) && contraseña.equals(ListaPersonas.get(i).getContraseña())) {
                                ingreso = 1;
                                if (ListaPersonas.get(i).getClass().getSimpleName().equals("Clientes")) {
                                    System.out.println("Bienvenido al sistema: " + ListaPersonas.get(i).getClass().getSimpleName());
                                }

                                if (ListaPersonas.get(i).getClass().getSimpleName().equals("Cajero")) {
                                    System.out.println("Bienvenido al sistema: " + ListaPersonas.get(i).getClass().getSimpleName());
                                }

                                if (ListaPersonas.get(i).getClass().getSimpleName().equals("Supervisor")) {
                                    System.out.println("Bienvenido al sistema: " + ListaPersonas.get(i).getClass().getSimpleName());
                                }

                                if (ListaPersonas.get(i).getClass().getSimpleName().equals("AsesorFinanciero")) {
                                    System.out.println("Bienvenido al sistema: " + ListaPersonas.get(i).getClass().getSimpleName());
                                }

                            }

                        }
                        if (ingreso == 0) {
                            System.out.println("Usuario o contraseña no válidos");
                        }

                    }
                }
            }
        }

    }

}
