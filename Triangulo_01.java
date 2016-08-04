import javax.swing.JOptionPane;
import java.util.Scanner;
class Triangulo_01 {
    
    public static void main(String args[]){
     
      Scanner entrada = new Scanner(System.in);
      int base ;
      int altura ;
      
      //primeira maneira de criar o calculo
      System.out.println("Calculando area do triangulo: ");
      System.out.print("Digite a Base: ");
      base = Integer.parseInt(entrada.nextLine());
      
      System.out.print("Digite a Altura: ");
      altura = Integer.parseInt(entrada.nextLine());
      
      double area = (base * altura)/2.0;
      
      System.out.printf("Resultado: %.2f\n",area);

    }
}