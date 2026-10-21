/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.paqueteria.ordenamientoburbuja;

/**
 *
 * @author serna
 */
public class OrdenamientoBurbuja {

    public static void main(String[] args) {
        //aqui yo creo un objeto para llamar alos metodos de ordenamiento que estan adentro de la clase
        OrdenamientoBurbuja orden = new OrdenamientoBurbuja();
        // es un arreglo desaacomodado para el metodo borbuja normal
        int[] numeros = {5, 2, 4, 1, 3};
        // es un arreglo desaacomodado para el metodo de burbuja mejorado
        int [] numerosMejorado={5,2,4,1,3,7,6,};
        // es un arreglo con los valores ya acomodados
        int [] numerosacomodados={1,2,3,4,5,6,7,8,9,10};
                //es un arreglo parcialmente ordenado
        int[] numerosParcialmenteAcomodado={1,2,3,5,4,6,7,8};
        
        // muestro el arreglo origina
        System.out.println("Arreglo original: " + java.util.Arrays.toString(numeros));
        
        // ejecuto el metodo borbuja normal
        orden.ordenamientoBurbuja(numeros);
        
        // muestro el resulatdo del metodo borbuja normal
        System.out.println("arreglo acomodado"+ java.util.Arrays.toString(numeros) );
        
        //ejecuto el metodo de borbuja mejorado
        orden.ordenamientoBurbujaMejorado(numerosMejorado);
        
        // muestro el resultado del metodo de borbuja mejorado
        System.out.println("usando borbuja mejorada"+ java.util.Arrays.toString(numerosMejorado));
        
        //ejecuto el metodo de borbuja mejorado pero con valores acomodados
        orden.ordenamientoBurbujaMejorado(numerosacomodados);
        
        // muestro el resultado
        System.out.println("usando borbuja mejorada con datos acomodados"+ java.util.Arrays.toString(numerosacomodados));
        
        //muestro el arreglo antes que se acomden usando un arreglo parcialmente acomodado
        System.out.println("Arreglo parcialmente: " + java.util.Arrays.toString(numerosParcialmenteAcomodado));
        
        // ejecuto el metodo de borbuja mejorado con valores parcialmente comodados
        orden.ordenamientoBurbujaMejorado(numerosParcialmenteAcomodado);
        //aqui muestro el resultado 
        System.out.println("usando borbuja mejorada con datos acomodados parcial mente: "+ java.util.Arrays.toString(numerosParcialmenteAcomodado));
    }
    // aqui creo el metodo de borbuja normal 
    public static  void ordenamientoBurbuja(int[] numeros ){
        // creo una bariable temporal la cual me ayuda a aser los cambios de los numeros 
        int guardacambio;
        // creo el ciclo exterior es el que controla las veces que recorre el areglo
        for(int i= 0; i< numeros.length -1; i++){
            System.out.println("pasa "+(i+1));
            // aqui recorre todas las pociciones para compararlos
            for(int j=0 ; j< numeros.length -1; j++){
                //aqui los comparo los valores 
                if(numeros[j]>numeros[j+1]){
                    //aqui guardo el primer numero en la variable guardarcambio
                    guardacambio = numeros[j];
                    //aqui coloca el segundo numero el pocision del primero
                    numeros[j] = numeros[j+1];
                    //aqui coloca el numero que se agurdo en la pocision del segundo numero
                    numeros[j+1]= guardacambio;
                }
                
            }
        }
    }
    //creo el metodo ordenamientoBurbujaMejorado que puede detenerse antes si no ahi intercambios
    public static void ordenamientoBurbujaMejorado(int [] numeros){
        //creo una bandera que me indica si ubo un intercambio o no
        boolean cambioalgo;
        //aqui controlo las veceses que recorre el arreglo
        for(int i= 0; i< numeros.length -1; i++){
            System.out.println("pasa "+(i+1));
            // al inicio de cada pasada le doy un valor falso al boleano 
            cambioalgo = false ;
            // aqui recorre todas las pociciones para compararlos
            for(int j= 0; j<numeros.length -1; j++){
                //aqui los comparo los valores
                if(numeros[j]> numeros[j+1]){
                    //guardo temporalmente el numero actual
                    int guardacambio = numeros[j];
                    //aqui coloca el segundo numero el pocision del primero 
                    numeros[j]= numeros[j+1];
                    //aqui coloca el numero que se agurdo en la pocision del segundo numero
                    numeros[j+1]= guardacambio;
                   // aqui la variable boleana indica que si ubo cambios 
                    cambioalgo= true;
                }
            }
            // si no ubo ningun cambio entonces el arreglo ya esta ordenado
            if(!cambioalgo){
                //termina de repetir el cicloexterior por que ya esta ordenado
                break;
            }
        }
    }
}
