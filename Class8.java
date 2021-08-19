import java.util.Scanner;

public class Class8 {
    public   static  void binario () {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Número inteiro decimal:");
        int n = prompt.nextInt();
        int q = n;
        int ndigit = 0;
        int novarep[] = new int[n];
        int r;
        do {
            r = q % 2;
            novarep[ndigit] = r;
            ndigit++;
            q = (q / 2);
        }
        while (q != 0);
        System.out.println("Número " + n + " na base binária: ");

        for (var i = ndigit - 1; i >= 0; i--) {
            System.out.print(novarep[i]);

        }












    }
}
