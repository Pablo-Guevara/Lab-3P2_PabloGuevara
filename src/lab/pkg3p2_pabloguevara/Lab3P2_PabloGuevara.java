package lab.pkg3p2_pabloguevara;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_PabloGuevara {

    public static void main(String[] args) {
        ArrayList<Tienda> ListaTiendas = new ArrayList();
        Scanner leer = new Scanner(System.in);
        int opcion = -1, opcionMenu;
        String usuario = "admin", contraseña = "1234";

        if (usuario.equals("admin") && contraseña.equals("1234")) {
            opcion = 1;
        }

        while (opcion != 5) {
            if (opcion == 1) {
                System.out.println("1.Crear tienda");
                System.out.println("2.Manejar personas");
                System.out.println("Elija su opcion: ");
                opcionMenu = leer.nextInt();
                if (opcionMenu == 1) {
                    String identificador="";
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
                                    i=ListaTiendas.size();
                                    System.out.println("El verificador ya existe, ingrese uno nuevo");
                                }else{
                                    if (i==ListaTiendas.size()-1) {
                                        verificadorCiclo=1;
                                    }
                                }
                                
                            }
                        }
                    }///

                    System.out.println("Ingrese ubicación de la tienda: ");
                    ubicacion = leer.next();
                    
                    System.out.println("Ingrese cantidad máxima de empleados: ");
                    cantMaxEmpleados=leer.nextInt();
                    
                    System.out.println("Ingrese cantidad de cajas en la tienda: ");
                    cantCajas=leer.nextInt();
                    
                    System.out.println("Ingrese articulo más vendido");///
                    productoMasVendido=leer.next();
                    
                    System.out.println("Ingrese cantidad máxima de articulos en la tienda: ");
                    cantMaxArticulos=leer.nextInt();
                    
                    ListaTiendas.add(new Tienda(identificador, ubicacion, cantMaxEmpleados, cantCajas, productoMasVendido, cantMaxArticulos));
                }
                
            }
        }

    }

}
