package Testes;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class test {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> originalList = new ArrayList<>();
        List<Integer> multipliedList = new ArrayList<>();
        
        System.out.print("Digite uma sequência de números separados por espaços: ");
        String input = scanner.nextLine();
        
        String[] values = input.split("");
        for (String value : values) {
            int number = Integer.parseInt(value.trim()); // converte cada substring em um número inteiro
            originalList.add(number); // adiciona cada número inteiro na lista original
        }
        
        //System.out.print("Digite um valor para multiplicar os números da lista: ");
        int multiplier = 1;
        
        for (int i = originalList.size() - 1; i >= 0; i--) {
            int result = originalList.get(i) * (multiplier+1); // multiplica cada elemento pelo valor especifico
            multipliedList.add(result); // adiciona o resultado na lista multiplicada
        }

        int soma = 0;
        for (int i = 0; i < multipliedList.size(); i++) {
            soma += multipliedList.get(i);
        }
        
        System.out.println("Lista original: " + originalList);
        System.out.println("Lista multiplicada: " + multipliedList);
        System.out.println("Lista multiplicada com os valores somados: " + soma);
        scanner.close();
    }

}
