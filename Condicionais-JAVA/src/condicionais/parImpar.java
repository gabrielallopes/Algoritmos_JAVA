
package condicionais;

import javax.swing.JOptionPane;

public class parImpar {


    public static void main(String[] args) {
   double num;
    num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número/valor:"));
    
        if ((num %= 2) == 0){
          JOptionPane.showMessageDialog(null, "Esse número/valor é PAR!");
          
    }else{
 JOptionPane.showMessageDialog(null, "Esse número/valor é ÍMPAR!");
   
         
     }
    }}