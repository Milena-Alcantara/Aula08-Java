package Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RemoverElLista {
//    1. Escreva um programa para remover um elemento específico de uma
//lista.
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> nomes = new ArrayList<>(5);
        System.out.println("Informe os nomes: ");
        for (int i = 0; i <5 ; i++) {
            nomes.add(entrada.next());
        }
        System.out.println("Sua lista de nomes é: ");
        for (int i = 0; i <nomes.size() ; i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println("Voce deseja remover algum item? \n Informe: \n 1 - SIM  ou  2 - NÃO");
        int opcao = entrada.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Informe o nome que vc quer remover: ");
                nomes.remove(entrada.next());
                System.out.println("Lista atualizada");
                for (int i = 0; i <nomes.size() ; i++) {
                    System.out.println(nomes.get(i));

                }
             case 2:
                 System.out.println("Programa Finalizado");
                 System.exit(0);
                    break;

    }
}
}