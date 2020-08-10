
package condicionais;

import javax.swing.JOptionPane;


public class imc {


    public static void main(String[] args) {
double altura, peso, imc;

altura= Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura?"));

peso= Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso?"));

imc = (peso/(altura*altura));
//processamento
 if (imc <= 18.5) {
JOptionPane.showMessageDialog(null, "Abaixo do peso! Com IMC de: "+ imc);
 }
  if ((imc > 18.5) && (imc <= 24.9)) {
JOptionPane.showMessageDialog(null, "Peso Ideal/Normal! Com IMC de: "+ imc);
 }
 if ((imc >= 25) && (imc <= 29.9)) {
JOptionPane.showMessageDialog(null, "Acima do peso/Sobrepeso! Com IMC de: "+ imc);
 }
 if ((imc >= 30) && (imc <= 34.9)) {
JOptionPane.showMessageDialog(null, "Obesidade Grau 1! Com IMC de: "+ imc);
 }
  if ((imc >= 35) && (imc <= 39.9)) {
JOptionPane.showMessageDialog(null, "Obesidade Grau 2! Com IMC de: "+ imc);
 }
    if (imc >= 40) {
JOptionPane.showMessageDialog(null, "Obesidade Grau 3! Com IMC de: "+ imc);
 }
    }
    
}
