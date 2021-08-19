import java.util.Scanner;

public class Class6 {
    public void fibonacci(){
        Scanner prompt = new Scanner(System.in);
        System.out.println("Número de termos:");
        int n = prompt.nextInt();
        int a = 0;
        int b = 1;
        int i = 2;
        while (i < n) {
            System.out.print(a + ", " + b + ", ");

            a = a + b; // ou a += b;
            b = a + b; // ou b += a;
            i = i + 2; // ou i += 2;
        }
        if (i == n)
            System.out.print(a + ", " + b); // sem o ln fica todo mundo na msm linha

        else
            System.out.print(a);






    }
}

