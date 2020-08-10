
package condicionais;

import javax.swing.JOptionPane;

public class impostoRenda {

    
    public static void main(String[] args) {
   double salario, resp = 0;
   salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do seu salário:"));
   
    if (salario<=1903.98) {
      resp = 0;
 }
    if ((salario>=1903.99) && (salario<=2826.65))  {
        resp = salario * 0.075;
 }
      if ((salario>=2826.66) && (salario<=3751.05))  {
        resp = salario * 0.15;
 }
           if ((salario>=3751.06) && (salario<=4664.68))   {
           resp = salario * 0.225;
 }
           if (salario>4664.68) {
       resp = salario * 0.275;
 }
 JOptionPane.showMessageDialog(null, "O desconto na sua folha de pagamento será de: R$"+ resp);
     
 
    }}
    

