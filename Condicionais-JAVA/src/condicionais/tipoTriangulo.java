
package condicionais;

import javax.swing.JOptionPane;


public class tipoTriangulo {


    public static void main(String[] args) {
        double a,b,c; 
        //entrada
a= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado A do triângulo: "));

b= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado B do triângulo: "));

c= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado C do triângulo: "));
//processamento
if (((a<(b+c)) && (a>(Math.abs(b-c)))) && ((b<(a+c)) && (b>(Math.abs(a-c)))) && ((c<(b+a)) && (c>(Math.abs(b-a))))) {
    if(((a==b) && (b==c) && (a==c))){
       JOptionPane.showMessageDialog(null, "É um triângulo EQUILÁTERO!");
    
}
if(((a==b) && (b!=c))|| ((b==c) && (c!=a)) || ((a==c)&&(c!=b))){
JOptionPane.showMessageDialog(null, "É um triângulo ISÓSCELES!");
 }
 if ((a!=b) && (b!=c) && (a!=c)) {
JOptionPane.showMessageDialog(null, "É um triângulo ESCALENO!");
 }
 
   
}else{
     JOptionPane.showMessageDialog(null, "Não é um triângulo!");
    }
}}
