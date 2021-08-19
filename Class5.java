import java.util.Scanner;

public class Class5 {
public void serieInfinita (){
    Scanner prompt = new Scanner(System.in);
    System.out.println("Número de termos:");
    int n = prompt.nextInt();
    System.out.println("Valor de x:");
    float x = prompt.nextFloat();
    float termo = x;
    float s = x;
    int i = 1;
    float x2 = x * x;
    for (int j = 1; j < n; j++) {
        i = i + 2; // ou i += 2;
        termo = - termo * x2 / (i * (i - 1));
        s = s + termo; // ou s += termo;
    }
    System.out.println("S = " + s);

}

}
