
package joptionoptiondilag;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Joptionoptiondilag {

    public static void main(String[] args) {
             
            int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el primer numero entero:"));
            int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el segundo numero entero:"));
                    
             int  seleccion = JOptionPane.showOptionDialog(null,"Seleccione una Operación",
             "MINICALCULADORA",JOptionPane.YES_NO_CANCEL_OPTION, 
             JOptionPane.INFORMATION_MESSAGE,null,
             new Object []{"Sumar", "Restar","Multiplicar"},"Sumar");
        
            if(seleccion == 0){
                
                suma(valor1,valor2);
                
            
            }
    }
    public static void suma (int v1, int v2){
        int resultado = v1+v2;
        JOptionPane.showInputDialog(resultado);
      
    }
    
    
    
}
