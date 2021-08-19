import java.util.Scanner;

    public class Class7 {
    public void inversaoNum(){

        Scanner prompt = new Scanner(System.in);
        System.out.println("Número inteiro positivo:");
        int n = prompt.nextInt();
        int inverso = 0;
        int digito;
        while (n > 0) {
            digito = n % 10;
            inverso = inverso * 10 + digito;
            n = (n / 10);
        }
        System.out.println("Número inverso: " + inverso);



    }
}
