import javax.swing.JOptionPane;
//import java.util.Scanner;
class Triangulo {

  public static void main(String args[]) {
  
    //Scanner entrada = new Scanner(System.in);
    float base = Float.parseFloat(JOptionPane.showInputDialog(" Digite o dimensao da base : "));
    float altura = Float.parseFloat(JOptionPane.showInputDialog(" Digite a altura : "));
    
    System.out.println(" A area do triangulo e : " + ((base * altura)/2));
  }
}