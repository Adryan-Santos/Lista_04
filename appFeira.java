package Lista_04_Alysson;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class appFeira {

    private static Scanner sc = new Scanner(System.in);

    public static Livro criaLivro(String aut) {

        System.out.println();
        System.out.println("----- Cria Livro -----");

        System.out.print("Título do Livro: ");
        String  tit = sc.nextLine();

        System.out.print("Ano do Livro: ");
        int ano = sc.nextInt();

        Livro l1 = new Livro(tit, aut, ano);
        return l1;

    }

    public static void imprimir(TreeMap <String, TreeSet<Livro>> bib){
        System.out.println(bib);
    }

    public static void main(String[] args) {
        TreeMap <String, TreeSet<Livro>> biblioteca = new TreeMap<>();
        int op;
        do {
            System.out.println();
            System.out.print("Autor: ");
            String autor = sc.nextLine();

            Livro livro = criaLivro(autor);
            if (! biblioteca.containsKey(autor)){
                biblioteca.put(autor, new TreeSet<Livro>());
            }

            biblioteca.get(autor).add(livro);
            System.out.println();
            imprimir(biblioteca);

            System.out.println();
            System.out.print("Deseja inserir mais registros? (Digite '1' para SIM ou '0' para NÃO): ");
            op = sc.nextInt();
            sc.nextLine();
        }
        while(op==1);

    }
}
