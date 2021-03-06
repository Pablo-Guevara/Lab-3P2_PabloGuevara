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
                        while (opcionAdmin != 7) {

                            System.out.println("1.Crear tienda");
                            System.out.println("2.Crear productos");
                            System.out.println("3.Modificar personas");
                            System.out.println("4.Eliminar personas");
                            System.out.println("5.Modificar producto");
                            System.out.println("6.Eliminar producto");
                            System.out.println("Elija su opcion: ");
                            opcionAdmin = leer.nextInt();
                            if (opcionAdmin == 1) {
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

                            //MODIFICAR PERSONAS
                            if (opcionAdmin == 3) {
                                for (int i = 0; i < ListaPersonas.size(); i++) {
                                    System.out.println(i + " " + ListaPersonas.get(i));
                                }
                                System.out.println("Ingrese posición a modificar: ");
                                int posicionMod = leer.nextInt();

                                if (ListaPersonas.get(posicionMod).getNomUsuario().equals("admin") && ListaPersonas.get(posicionMod).getContraseña().equals("1234")) {
                                    System.out.println("Ingrese nuevo usuario: ");
                                    String nuevoUser = leer.next();
                                    System.out.println("Ingrese nueva contraseña: ");
                                    String nuevacontra = leer.next();

                                    ListaPersonas.add(posicionMod, new Personas(nuevoUser, nuevacontra));
                                } else {
                                    if (ListaPersonas.get(posicionMod).getClass().getSimpleName().equals("Clientes")) {//Modificar clientes
                                        String nombre;
                                        String apellido;
                                        float salario;
                                        String nacionalidad;
                                        String direcDomicilio;

                                        System.out.println("Ingrese nuevo nombre de usuario: ");
                                        usuario = leer.next();

                                        System.out.println("Ingrese nueva contraseña: ");
                                        contraseña = leer.next();

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

                                        ListaPersonas.add(posicionMod, new Clientes(nombre, apellido, salario, nacionalidad, direcDomicilio, usuario, contraseña));
                                        System.out.println("USUARIO CLIENTE MODIFICADO EXITOSAMENTE");
                                    }//Fin modificar clientes

                                    if (ListaPersonas.get(posicionMod).getClass().getSimpleName().equals("Cajero")) {
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

                                        System.out.println("Ingrese nuevo nombre de usuario: ");
                                        usuario = leer.next();

                                        System.out.println("Ingrese nueva contraseña: ");
                                        contraseña = leer.next();

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

                                        ListaPersonas.add(posicionMod, new Cajero(nombre, apellido, salario, nacionalidad, cantAñosLab, horarioTrajado, horaAlmuerzo, metaVenderMes, cantAtendidos, rango, usuario, contraseña));
                                        System.out.println("USUARIO CAJERO MODIFICADO EXITOSAMENTE");
                                    }
                                }

                                if (ListaPersonas.get(posicionMod).getClass().getSimpleName().equals("Supervisor")) {
                                    String rango = "Supervisor";
                                    String nombre;
                                    String apellido;
                                    float salario;
                                    String nacionalidad;
                                    System.out.println("Ingrese nuevo nombre de usuario: ");
                                    usuario = leer.next();

                                    System.out.println("Ingrese nueva contraseña: ");
                                    contraseña = leer.next();
                                    //ArrayList<Cajero> cajerosSupervisa = new ArrayList();

                                    System.out.println("Ingrese su nombre: ");
                                    nombre = leer.next();
                                    System.out.println("Ingrese apellido: ");
                                    apellido = leer.next();
                                    System.out.println("Ingrese su salario: ");
                                    salario = leer.nextFloat();
                                    System.out.println("Ingrese su nacionalidad: ");
                                    nacionalidad = leer.next();

                                    ListaPersonas.add(posicionMod, new Supervisor(nombre, apellido, salario, nacionalidad, rango, usuario, contraseña));
                                    System.out.println("USUARIO SUPERVISOR Modificado EXITOSAMENTE");
                                }

                                if (ListaPersonas.get(posicionMod).getClass().getSimpleName().equals("AsesorFinanciero")) {
                                    String rango = "Asesor financiero";
                                    String nombre;
                                    String apellido;
                                    float salario;
                                    String nacionalidad;

                                    //ArrayList<Cajero> cajerosSupervisa = new ArrayList();
                                    System.out.println("Ingrese nuevo nombre de usuario: ");
                                    usuario = leer.next();

                                    System.out.println("Ingrese nueva contraseña: ");
                                    contraseña = leer.next();
                                    System.out.println("Ingrese su nombre: ");
                                    nombre = leer.next();
                                    System.out.println("Ingrese apellido: ");
                                    apellido = leer.next();
                                    System.out.println("Ingrese su salario: ");
                                    salario = leer.nextFloat();
                                    System.out.println("Ingrese su nacionalidad: ");
                                    nacionalidad = leer.next();

                                    ListaPersonas.add(posicionMod, new AsesorFinanciero(nombre, apellido, salario, nacionalidad, rango, usuario, contraseña));
                                    System.out.println("USUARIO ASESOR FINANCIERO MODIFICADO EXITOSAMENTE");
                                }
                            }

                            if (opcionAdmin == 4) {
                                for (int i = 0; i < ListaPersonas.size(); i++) {
                                    System.out.println(i + " " + ListaPersonas.get(i));
                                }
                                System.out.println("Ingrese posición a eliminar: ");
                                int posicionEli = leer.nextInt();
                                ListaPersonas.remove(posicionEli);
                            }

                            if (opcionAdmin == 5) {
                                for (int i = 0; i < ListaArticulos.size(); i++) {
                                    System.out.println(i + " " + ListaArticulos.get(i));
                                }
                                System.out.println("Ingrese posición a modificar: ");
                                int posicionMod = leer.nextInt();
                                //MODIFICAR TELEVISORES
                                if (ListaArticulos.get(posicionMod).getClass().getSimpleName().equals("Televisores")) {
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

                                    ListaArticulos.add(posicionMod, new Televisores(tamañoPantalla, smart, Marca, cantConexiones, grosor, numSerie, precio, color, informacionGarantia));
                                }
                                //FIN MODIFICAR TELEVISORES

                                if (ListaArticulos.get(posicionMod).getClass().getSimpleName().equals("Consolas")) {
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

                                    ListaArticulos.add(posicionMod, new Consolas(marca, cantAlmacenamiento, cantControles, numAccesorios, infoTarjetaVideo, numSerie, precio, color, informacionGarantia));
                                }

                                if (ListaArticulos.get(posicionMod).getClass().getSimpleName().equals("EquiposSonido")) {
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

                                    ListaArticulos.add(posicionMod, new EquiposSonido(cantAltavoces, potenciaMax, cantPuertosAux, cantDiscosSopor, cantPuertosUSB, numSerie, precio, color, informacionGarantia));

                                }

                                if (ListaArticulos.get(posicionMod).getClass().getSimpleName().equals("TeatrosEnCasa")) {
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

                                    ListaArticulos.add(posicionMod, new TeatrosEnCasa(cantAltavoces, cantDiscBR, infoLimpieza, infoLectorDisco, numSerie, precio, color, informacionGarantia));
                                }
                            }

                            if (opcionAdmin == 6) {
                                for (int i = 0; i < ListaArticulos.size(); i++) {
                                    System.out.println(i + " " + ListaArticulos.get(i));
                                }
                                System.out.println("Ingrese posición a eliminar: ");
                                int posicionEli = leer.nextInt();
                                ListaArticulos.remove(posicionEli);
                            }
                        }
                    } else {
                        for (int i = 0; i < ListaPersonas.size(); i++) {
                            if (usuario.equals(ListaPersonas.get(i).getNomUsuario()) && contraseña.equals(ListaPersonas.get(i).getContraseña())) {
                                ingreso = 1;
                                if (ListaPersonas.get(i).getClass().getSimpleName().equals("Clientes")) {
                                    System.out.println("Bienvenido al sistema: " + ListaPersonas.get(i).getClass().getSimpleName());
                                    int cicloCli = 0;
                                    while (cicloCli != 3) {
                                        System.out.println("1.Listar mi información");
                                        System.out.println("2.elimar cuenta");
                                        System.out.println("3.Cerrar sesión");
                                        cicloCli = leer.nextInt();
                                        if (cicloCli == 1) {
                                            System.out.println(ListaPersonas.get(i));
                                        }

                                        if (cicloCli == 2) {
                                            ListaPersonas.remove(i);
                                        }
                                    }

                                    if (ListaPersonas.get(i).getClass().getSimpleName().equals("Cajero")) {
                                        System.out.println("Bienvenido al sistema: " + ListaPersonas.get(i).getClass().getSimpleName());
                                        int cicloCajero = 0;
                                        while (cicloCajero != 3) {
                                            System.out.println("1.Listar mi información");
                                            System.out.println("2.Mostrar articulos");
                                            System.out.println("3.Cerrar sesión");
                                            cicloCajero = leer.nextInt();

                                            if (cicloCajero == 1) {
                                                System.out.println("INFORMACION CAJERO");
                                                System.out.println(ListaPersonas.get(i));
                                            }

                                            if (cicloCajero == 2) {
                                                System.out.println("Lista Articulos");
                                                System.out.println(ListaArticulos);
                                            }
                                        }

                                    }

                                    if (ListaPersonas.get(i).getClass().getSimpleName().equals("Supervisor")) {
                                        System.out.println("Bienvenido al sistema: " + ListaPersonas.get(i).getClass().getSimpleName());

                                        int cicloSupervisor = 0;
                                        while (cicloSupervisor != 4) {
                                            System.out.println("1.Listar cajeros");
                                            System.out.println("2.Modificar mi informacion");
                                            System.out.println("3.Eliminar cajeros/asesor financiero");
                                            System.out.println("4.Cerrar sesión");
                                            cicloSupervisor = leer.nextInt();

                                            if (cicloSupervisor == 1) {
                                                System.out.println("Listar cajeros");
                                                for (int j = 0; j < ListaPersonas.size(); j++) {
                                                    if (ListaPersonas.get(i).getClass().getSimpleName().equals("Cajero")) {
                                                        System.out.println(ListaPersonas.get(i));
                                                    }
                                                }
                                            }

                                            if (cicloSupervisor == 2) {
                                                System.out.println("Listar asesores financieros");
                                                for (int j = 0; j < ListaPersonas.size(); j++) {
                                                    if (ListaPersonas.get(i).getClass().getSimpleName().equals("AsesorFinanciero")) {
                                                        System.out.println(ListaPersonas.get(i));
                                                    }
                                                }

                                                if (opcionAdmin == 4) {
                                                    for (int j = 0; j < ListaPersonas.size(); j++) {
                                                        System.out.println(j + " " + ListaPersonas.get(j));
                                                    }
                                                    System.out.println("Ingrese posición a eliminar: ");
                                                    int posicionEli = leer.nextInt();
                                                    ListaPersonas.remove(posicionEli);
                                                }
                                            }

                                        }

                                    }

                                    if (ListaPersonas.get(i).getClass().getSimpleName().equals("AsesorFinanciero")) {
                                        System.out.println("Bienvenido al sistema: " + ListaPersonas.get(i).getClass().getSimpleName());
                                        int cicloAF = 0;
                                        while (cicloAF != 5) {
                                            System.out.println("1.Listar mi información");
                                            System.out.println("2.Modificar mi informacion");
                                            System.out.println("3.Listar cajeros");
                                            System.out.println("4.Listar supervisores");
                                            System.out.println("5.Cerrar sesión");
                                            cicloAF = leer.nextInt();

                                            if (cicloAF == 1) {
                                                System.out.println("Informacion asesor financiero");
                                                System.out.println(ListaPersonas.get(i));
                                            }
                                            if (cicloAF == 2) {
                                                String rango = "Asesor financiero";
                                                String nombre;
                                                String apellido;
                                                float salario;
                                                String nacionalidad;

                                                //ArrayList<Cajero> cajerosSupervisa = new ArrayList();
                                                System.out.println("Ingrese nuevo nombre de usuario: ");
                                                usuario = leer.next();

                                                System.out.println("Ingrese nueva contraseña: ");
                                                contraseña = leer.next();
                                                System.out.println("Ingrese su nombre: ");
                                                nombre = leer.next();
                                                System.out.println("Ingrese apellido: ");
                                                apellido = leer.next();
                                                System.out.println("Ingrese su salario: ");
                                                salario = leer.nextFloat();
                                                System.out.println("Ingrese su nacionalidad: ");
                                                nacionalidad = leer.next();

                                                ListaPersonas.add(i, new AsesorFinanciero(nombre, apellido, salario, nacionalidad, rango, usuario, contraseña));
                                                System.out.println("USUARIO ASESOR FINANCIERO MODIFICADO EXITOSAMENTE");
                                            }

                                            if (cicloAF == 3) {
                                                System.out.println("Listar cajeros");
                                                for (int j = 0; j < ListaPersonas.size(); j++) {
                                                    if (ListaPersonas.get(i).getClass().getSimpleName().equals("Cajero")) {
                                                        System.out.println(ListaPersonas.get(i));
                                                    }
                                                }
                                            }

                                            if (cicloAF == 4) {
                                                System.out.println("Listar supervisores");
                                                for (int j = 0; j < ListaPersonas.size(); j++) {
                                                    if (ListaPersonas.get(i).getClass().getSimpleName().equals("Supervisor")) {
                                                        System.out.println(ListaPersonas.get(i));
                                                    }
                                                }
                                            }

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
    }
}
