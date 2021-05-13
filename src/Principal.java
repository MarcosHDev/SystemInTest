import java.util.Scanner;

public class Principal {

    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome;

        nome = teclado.nextLine();
        Float nota;

        nota = Float.parseFloat(teclado.nextLine());

        System.out.println("Digite o nome do aluno e sua respectiva nota: " + nome +"\n" + nota +  "\n");


    }

}