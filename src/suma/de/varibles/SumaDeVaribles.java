/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Ejemplo de Suma de Variables Simple en java*/
package suma.de.varibles;

import java.util.Scanner; //Con esta linea declaramos que utilizaremos la introduccion de datos (los numeros para la suma)por medio del comando "Scanner"




/**
 *
 * @author HP
 */
public class SumaDeVaribles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //En esta parte es donde escribiremos el codigo 
        //declaramos "leer" para que pida los numeros para la suma.
        Scanner leer= new Scanner(System.in);
        //Declaramos int a una varible de tipo entero "numeros"
        int numero1,numero2,resultado;
        //con system.out.println(""); crearemos un texto que se mostrara por consola
        System.out.println("+++++++++++++++++++++  Suma de dos numeros +++++++++++++++++++++ ");
        System.out.println("introduce un numero ");
       // numero1=leer.nextInt(); leera nuestro numero instroducido
        numero1=leer.nextInt();
        System.out.println("introduce un numero ");
        numero2=leer.nextInt();
        resultado=numero1+numero2;
        System.out.println("El Resultado de "+numero1+" + "+numero2+" = "+resultado);
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
