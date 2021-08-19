import java.util.Scanner;

public class Class3 {

    public void somaNumeros(){
        //int n = 10, num, soma = 0, 1=0;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Quantidade de números:");
        int n = prompt.nextInt();
        int num;
        int soma = 0;
        int i = 0;
        while (i < n) {
           i = i + 1; // ou i++
            System.out.println("Número:");
            num = prompt.nextInt();
            soma = soma + num; // ou soma += num
       }
        System.out.println("Soma dos " + n + " números: " + soma);








   }
}
