import java.util.Scanner;

public class Class9 {
    public void caracNum (){
        Scanner prompt = new Scanner(System.in);
        System.out.println("String numérica:");
        String string = prompt.nextLine();
        String zero = "0";
        int n = string.length();
        long decimal = 0;
        long base = Character.codePointAt(zero,0);
        long digito;
        for (int i = 0; i < n; i++) {
            digito =string.codePointAt(i) - base;
            decimal = decimal * 10 + digito;
        }
        System.out.println("Formato decimal: " + decimal);










    }
}
