package lab3p1_diegomaradiaga;

import java.util.Scanner;

public class Lab3P1_DiegoMaradiaga {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int opcion;
        do {
            System.out.println("-----------------------------------------");
            System.out.println("              >>>> MENU <<<<             ");
            System.out.println(" ");
            System.out.println("1) Diptongo            ");
            System.out.println("2) Sumatoria           ");
            System.out.println("3) Time Clock          ");
            System.out.println("4) Salir               ");
            System.out.print("Ingrese su opcion: ");
            opcion = leer.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    String palabra;
                    System.out.println("Ingrese una cadena: ");
                    palabra = leer.next().toLowerCase();

                    int contador = 0;
                    for (int i = 0; i < palabra.length(); i++) {
                        char letra = palabra.charAt(i);
                        switch (letra) {
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                contador++;
                                break;
                            default:
                                contador = 0;
                                break;
                        }//Fin switch   
                        if (contador == 2) {
                            break;
                        }//Fin if
                    }//Fin for
                    if (contador == 2) {
                        System.out.println("La palabra es un diptongo");
                    } else {
                        System.out.println("La palabra no es un diptongo");
                    }//Fin else
                    break;
                case 2:
                    System.out.print("Ingrese un numero limite: ");
                    double K = leer.nextInt();
                    double exponente = 0.0,
                     suma = 0.0,
                     division = 0.0, acum = 0.0,
                     resultado = 0.0;
                    double base = 1;
                    double base2 = (base * -1);
                    while (K <= 0) {
                        System.out.println("Error: Numero negativo");
                        System.out.print("Ingrese un numero limite: ");
                        K = leer.nextInt();
                    }//Fin while de validacion                

                    for (int n = 0; n < K; n++) {
                        exponente = Math.pow(base2, n);
                        suma = (2 * n) + 1;
                        division = exponente / suma;
                        acum = acum + division;

                    }//Fin for
                    resultado = 4 * acum;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    System.out.println("Ingrese un tamaño IMPAR: ");
                    int tamano = leer.nextInt();
                    int Par;
                    Par = tamano%2;
                            
                    while (Par==0){
                        System.out.println("Error: Numero negativo");
                        System.out.println("Ingrese un tamaño IMPAR: ");
                        tamano = leer.nextInt();
                        Par = tamano%2; 
                    }
                    
                    int PP = (tamano/2)+1;
                    int SP = tamano - PP;
                    
                    for (int i = PP; i >= 0; i--) {
                        for (int j = 0; j < i; j++) {
                           
                            
                            System.out.print("* ");                                                                                    
                        }
                        System.out.printf("%n");
                    }
                    for (int k = 1; k <= SP; k++) {
                        for (int l = 0; l <= k; l++) {
                            
                            System.out.print("* ");                            
                        }
                       
                        System.out.println("");
                    }
                    break;
                default:

                    break;
            }//Fin switch
        } while (opcion != 4);
        
    }
    
}
