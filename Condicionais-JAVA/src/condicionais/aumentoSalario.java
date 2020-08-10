
package condicionais;

import javax.swing.JOptionPane;

public class aumentoSalario {

    public static void main(String[] args) {
      double salario, result;
      
           salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do seu salário:"));
           
 if (salario<=1500) {
      result = salario * 1.20;
 }
 else if ((salario>1500) && (salario<=3000)) {
      result = salario * 1.15;
 }else{
 result = salario * 1.10;
 }
 JOptionPane.showMessageDialog(null, "Com o aumento, seu salário será: R$"+ result );
 
 }}
