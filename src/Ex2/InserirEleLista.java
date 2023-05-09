package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Escreva um programa para inserir um elemento (posição específica)
//em uma lista.
public class InserirEleLista {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> nomes = new ArrayList<>(4);
        System.out.println("Informe os nomes: ");
        for (int i = 0; i <5 ; i++) {
            nomes.add(entrada.next());
        }
        System.out.println("Sua lista de nomes é: ");
        for (int i = 0; i <nomes.size() ; i++) {
            System.out.println(nomes.get(i));
        }

        System.out.println("Informe o dado que quer adcionar: ");
        nomes.add(2,entrada.next());
        System.out.println("Lista Atualizada");
            System.out.println(nomes);

        }
    }


