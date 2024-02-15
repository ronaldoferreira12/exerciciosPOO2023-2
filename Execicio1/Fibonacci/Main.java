package Execicio1.Fibonacci;

public class Main {
    public static void main(String[] args) {
        System.out.println("fib1:");
        for (int i = 0; i <= 20; i++) {
            System.out.print(fib1(i) + " ");
        }
        System.out.println();

        System.out.println("fib2:");
        for (int i = 0; i <= 20; i++) {
            System.out.print(fib2(i) + " ");
        }
        System.out.println();

        System.out.println("fib3:");
        for (int i = 0; i <= 20; i++) {
            System.out.print(fib3(i) + " ");
        }
        System.out.println();
    }
    public static int fib1(Integer numero){
        if(numero <= 1){
            return numero;
        } else{
            return fib1(numero - 1) + fib1(numero - 2);
        }
    }
    public static int fib2(Integer numero){
        if(numero <= 1){
            return numero;
        }
        int f0 = 0;
        int f1 = 1;
        int resultado = 0;
        for (int i = 2; i <= numero; i++) {
            resultado = f0 + f1;
            f0 = f1;
            f1 = resultado;
        }
        return resultado;
    }
    public static int fib3(Integer numero){
        if(numero <= 1){
            return numero;
        }
        int f0 = 0;
        int f1 = 1;
        int resultado = 0;
        int cont = 2;
        while (cont <= numero){
            resultado = f0 + f1;
            f0 = f1;
            f1 = resultado;
            cont++;
        }
        return resultado;
    }

}
