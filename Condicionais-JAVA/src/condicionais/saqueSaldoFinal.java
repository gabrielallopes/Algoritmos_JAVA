
package condicionais;

import javax.swing.JOptionPane;

public class saqueSaldoFinal {

    public static void main(String[] args) {
     double saque, saldoatual, saldofinal, limite;
     saldoatual= 1000;
     limite= 2000;
     
     saque = Double.parseDouble(JOptionPane.showInputDialog("Quantos reais deseja sacar?"));
     saldofinal = saldoatual - saque;
     
     if(saldofinal>=0){
         JOptionPane.showMessageDialog(null, "Seu saldo final é POSITIVO com: R$"+saldofinal);
     }
     if ((saldofinal<0) && (saldofinal>=(-limite))){
          JOptionPane.showMessageDialog(null, "Seu saldo final é NEGATIVO com: R$"+saldofinal);
          
    }else{
 JOptionPane.showMessageDialog(null, "Você não tem limite o suficiente para fazer esse saque! Seu limite é de: R$"+ limite );
   
         
     }
}}
