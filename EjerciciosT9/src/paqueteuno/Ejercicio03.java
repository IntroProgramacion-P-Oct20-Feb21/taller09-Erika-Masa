/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int elementosArribaMedia = 0;
        int elementosAbajoMedia = 0;
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int length = arreglo.length;
        double suma = 0 ;
        double media ;
        for(int i = 0; i <arreglo.length;i++){
        suma= suma + arreglo [i];
        }
        media = suma /arreglo.length ;
        for(int i = 0; i <arreglo.length;i++){
            if (arreglo[i]>media){
                elementosArribaMedia  += 1;
              }else{
                elementosAbajoMedia += 1;
            }
            
    }
         System.out.printf("arriba de la media aritmética: %d\n"
         + "abajo de la media aritmetica: %d\n" + "media: %.4f\n",
                 +  elementosArribaMedia,
                   elementosAbajoMedia,
                   media);
      }       
        
   } 

