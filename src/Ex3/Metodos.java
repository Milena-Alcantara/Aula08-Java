package Ex3;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Metodos {
//exercicio realizado junto com a correção da joy
    static Scanner entdados = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe a quantidade de números da sua operação: ");
       int capacidade = entdados.nextInt();
       List<Integer> listanumeros = tamanhodaLista(capacidade);
       adcionarValores(listanumeros, capacidade);
       mediaNumdaLista(listanumeros);
    }

    public static List<Integer> tamanhodaLista(int capacidade){
        List<Integer> listanumeros = new ArrayList<>(capacidade);
        return listanumeros;
    }
    public static boolean adcionarValores(List<Integer> listanumeros, int capacidade){

        for (int i = 0; i <capacidade ; i++) {
            System.out.println("Informe os números");
            listanumeros.add(entdados.nextInt());
        }
        return true;
    }
    public static double mediaNumdaLista(List<Integer> listanumeros){
        int  somaLista = 0;
        for (int i = 0; i <listanumeros.size(); i++) {
             somaLista += listanumeros.get(i);
        }
        double mediaLista;
        mediaLista =  somaLista /listanumeros.size();
        System.out.println("A média dos seus números é: " +mediaLista);
        return mediaLista;
    }
    }

