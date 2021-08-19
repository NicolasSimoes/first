import java.util.Scanner;

public class Class4 {

    public void fatorial(){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Valor de n:");
        int n = prompt.nextInt();
        double prod = 1;
        int i = 0;
        while (i < n) {
            i = i + 1; // ou i++
            prod = prod * i; // ou prod *= i;
        }
        System.out.println("Fatorial de " + n + " = " + prod);






    }




}
