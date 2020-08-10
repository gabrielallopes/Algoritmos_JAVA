package areaperimetroretangulo;

import java.util.Scanner;

public class Areaperimetroretangulo {

    public static void main(String[] args) {
      //definicao de variaveis
      double area,perimetro,base, altura;
      
      //entrada
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Digite a base do Retângulo:");
      base=entrada.nextDouble();
      
      System.out.println("Digite a altura do Retângulo:");
      altura=entrada.nextDouble();
      
      //processamento
      area= base*altura;
      perimetro=((base*2)+(altura*2));

              
      //saida
      System.out.println("A área do Retângulo é: " +area);       
      System.out.println("O perímetro do Retângulo é: " + perimetro);
    }
            
       
   
    

    

