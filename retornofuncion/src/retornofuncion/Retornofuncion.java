
package retornofuncion;

public class Retornofuncion {

   
    public static void main(String[] args) {
       
        int[] numeros = {1,2,3,4,5,6,7,8};
        System.out.println(buscarnumero(numeros,9));
                      
    }
    public static boolean buscarnumero(int [] v1, int numero){
         boolean encontrar = false;
            for (int num : v1){
                if(num==numero){
                encontrar = true ;
                }
                
            }
          return encontrar;
    }
    
    
}
