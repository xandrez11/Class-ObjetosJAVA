
import java.util.Scanner;

class CalculadoraMain {
    public CalculadoraMain() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Soma s = new Soma();
        Subtrair sub = new Subtrair();
        Multiplicacao m = new Multiplicacao();
        divisao d = new divisao();

        int r;
        do {
            System.out.println("Digite 1 para Somar; 2 para Subtrair; 3 para Multiplicação; 4 para Divisão:");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Número 1: ");
                    s.n1 = sc.nextInt();
                    System.out.println("Número 2: ");
                    s.n2 = sc.nextInt();
                    s.somar();
                    break;
                case 2:
                    System.out.println("Número 1: ");
                    sub.n1 = sc.nextInt();
                    System.out.println("Número 2: ");
                    sub.n2 = sc.nextInt();
                    sub.sub();
                    break;
                case 3:
                    System.out.println("Número 1:");
                    m.n1 = sc.nextInt();
                    System.out.println("Número 2");
                    m.n2 = sc.nextInt();
                    m.multi();
                    break;
                case 4:
                    System.out.println("Número 1");
                    d.n1 = sc.nextInt();
                    System.out.println("Numero 2");
                    d.n2 = sc.nextInt();
                    d.divi();
            }

            System.out.println("Para repetir digite 0");
            r = sc.nextInt();
        } while(r == 0);

    }
}
