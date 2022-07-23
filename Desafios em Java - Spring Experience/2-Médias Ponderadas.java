/*Desafio
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um caso de teste com três valores com uma casa decimal cada valor.

Saída
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo.*/
// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.*;
 
public class Program
{

 public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
        int numero = entrada.nextInt();
        for (i = 1; i <= numero; i = i + 1) {
            float nota1 = entrada.nextFloat();
            float nota2 = entrada.nextFloat();
            float nota3 = entrada.nextFloat();
            float result = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
            System.out.printf("%.1f\n", result);

        }

    }

}