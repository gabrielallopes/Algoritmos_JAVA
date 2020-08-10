
package quadradodosnumeros;

import java.util.Scanner;


public class Quadradodosnumeros {

 
    public static void main(String[] args) {
        double a,b,c,d,a1,b2,c3,d4,result;
       
       
     //entrada
      Scanner entrada = new Scanner(System.in);
     
     System.out.println("Solicite o primeiro número:");
     a= entrada.nextDouble();
     System.out.println("Solicite o segundo número:");
     b= entrada.nextDouble();
     System.out.println("Solicite o terceiro número:");
     c= entrada.nextDouble();
     System.out.println("Solicite o quarto número:");
     d= entrada.nextDouble();
             
             
     //processamento
    a1=a*a;
    b2=b*b;
    c3=c*c;
    d4=d*d;
    result=a1+b2+c3+d4;
     //saida
     System.out.println("O quadrado dos números somados é igual a: "+result);
  
    

    }
    
}
