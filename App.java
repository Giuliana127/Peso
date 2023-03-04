
import java.util.Scanner;

public class App {


    public static void main(String[] args)  {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuál es su peso en kg?");
        double p = sc.nextDouble();
        System.out.println("Cuál es su altura en mts?");
        double a = sc.nextDouble();

        double imc = p/(a*a);

        System.out.println("Su imc es de:" + imc);

        if (imc <= 18.5) {
            System.out.println("Está delgado");
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Está normal");
        }
        else if (imc >= 25 && imc <= 30) {
            System.out.println("Está con sobrepeso");
        }
        else if (imc > 30) {
            System.out.println("Está obeso");
        }
    

    }
}
