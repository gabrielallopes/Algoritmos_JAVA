package juroscompostos;

import java.util.Scanner;

public class Juroscompostos {

   
    public static void main(String[] args) {
     double emp,taxa,result;
     int temp;
     Scanner entrada = new Scanner(System.in);
     
     System.out.println("Solicite o valor do empréstimo: ");
     emp= entrada.nextDouble();
     System.out.println("Em quantos meses pagará o empréstimo?");
     temp= entrada.nextInt();
     
     taxa=0.02;
     //processamento
     Math.pow(emp, emp);
     
     result=emp*(Math.pow((1+taxa),temp));
     
     //saida
     System.out.println("Ao final de "+temp+" meses, você pagará: R$"+result);
     
    }
    
}
