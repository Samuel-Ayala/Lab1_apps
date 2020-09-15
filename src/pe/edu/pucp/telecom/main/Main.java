package pe.edu.pucp.telecom.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("--- Bienvenido ---");
        boolean end = false;
        while(end)
        {
            System.out.println("Seleccione la accion que desee realizar: ");
            System.out.println("1. Leer Datos");
            System.out.println("2. Agregar Usuario");
            System.out.println("3. Buscar Usuario");
            System.out.println("4. Escribir Directorio");
            System.out.println("Digite su opcion: ");
            int a=sc.nextInt();

            try{
                float b = a/2;
            }catch (Exception e){
                System.out.println("Por favor, ingrese un numero");
                break;
            }

            switch(a)
            {
                case 1:
                {
                    break;
                }
                case 2:
                {
                    break;
                }
                case 3:
                {
                    break;

                }
                case 4:
                {
                    break;
                }

                default:
                {
                    System.out.println("Opcion erronea");
                    break;
                }
            }

        }
    }
}
