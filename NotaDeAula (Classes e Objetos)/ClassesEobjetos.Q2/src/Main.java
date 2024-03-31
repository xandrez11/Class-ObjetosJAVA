
import java.util.Scanner;

/*Elabore um programa em java que informe se um aluno está
aprovado, reprovado ou na final.

O sistema deve solicitar o nome e as notas do aluno.

Em seguida, realiza o cálculo da média e informa a situação acadêmica.

Se a média for >= 70 está aprovado, abaixo de 40 está reprovado,
senão, está na final.*/

public class Main {
    public static void main (String[] args) {
        Secretaria s = new Secretaria();
        Scanner ler = new Scanner(System.in);

        System.out.println("Olá, diga o nome do aluno por favor: ");
        String aluno = ler.next();

        System.out.println("Informe as notas (1/3): ");
        double nota1 = ler.nextInt();
        System.out.println("Informe as notas (2/3): ");
        double nota2 = ler.nextInt();
        System.out.println("Informe as notas (3/3): ");
        double nota3 = ler.nextInt();

        double media = s.media(nota1, nota2, nota3);
        System.out.println("A média das notas é: " +media);

        if (s.media(nota1, nota2, nota3) >= 70) {
            System.out.println("Portanto, você foi aprovado !");
        } else if (s.media(nota1, nota2, nota3) < 40) {
            System.out.println("Sinto muito, você foi reprovado.");
        }

    }
}
