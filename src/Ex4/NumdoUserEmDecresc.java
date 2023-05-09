package Ex4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//Peça ao usuário dois números e exiba em ordem decrescente
//(suponha números diferentes).
public class NumdoUserEmDecresc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>(2);
        System.out.println("Informe os números");
        for (int i = 0; i <2 ; i++) {
            numeros.add(entrada.nextInt());
        }
            if(numeros.get(0) < numeros.get(1)){
                System.out.println(numeros.get(1) + " " + numeros.get(0));
            } else if (numeros.get(1) < numeros.get(0)) {
                System.out.println(numeros.get(0) + " " + numeros.get(1));
                
            }else {
                System.out.println("Numeros iguais.");
            }

        }


        }



