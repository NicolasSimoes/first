import java.sql.SQLOutput;

public class Class1 {

public void trocaVariaveis(int a, int b) {
    System.out.println("Valor de a: "+a);
    System.out.println("Valor de b: "+b);
    int aux;
    aux = a;
    a = b;
    b = aux;
    System.out.println("Valor de a: "+a);
    System.out.println("Valor de b: "+b);

}

}