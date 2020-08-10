
package condicionais;

import javax.swing.JOptionPane;


public class campeonatoVolei {
 
    public static void main(String[] args) {
  double altura, idade;
   altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
    idade = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade: "));
    
     if ((altura>=1.75) && (idade>=18)) {
JOptionPane.showMessageDialog(null, "Pode competir no Campeonato de Vôlei!");
 }else{
     if ((altura<1.75) || (idade<18))  {
JOptionPane.showMessageDialog(null, "Não pode competir no Campeonato de Vôlei!");       
     } }
    }}
    

