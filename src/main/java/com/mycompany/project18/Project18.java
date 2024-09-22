package com.mycompany.project18;
import java.util.Scanner;

public class Project18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = in.nextLine();
        System.out.println("Digite o preço do produto: ");
        Double preco = in.nextDouble();
        System.out.println("Informe a categoria do produto: " + "\n A\n B\n C\n D\n E");
        char categoria = in.next().charAt(0);
        switch(categoria){
            case 'A':
                Double desconto1 = 10.0;
                Double precofinal = preco - (preco * desconto1 / 100);
                System.out.println("O Preço do produto com o desconto informado ficou: " + precofinal);
                break;
            case 'B':
                Double desconto2 = 15.0;
                Double precofina2 = preco - (preco * desconto2 / 100);
                System.out.println("O Preço do produto com o desconto informado ficou: " + precofina2);
                break;
            case 'C':
                Double desconto3 = 20.0;
                Double precofina3 = preco - (preco * desconto3 / 100);
                System.out.println("O Preço do produto com o desconto informado ficou: " + precofina3);
                break;
            case 'D':
                Double desconto4 = 25.0;
                Double precofina4 = preco - (preco * desconto4 / 100);
                System.out.println("O Preço do produto com o desconto informado ficou: " + precofina4);
                break;
            case 'E':
                Double desconto5 = 50.0;
                Double precofina5 = preco - (preco * desconto5 / 100);
                System.out.println("O Preço do produto com o desconto informado ficou: " + precofina5);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
            
        }
        
    }
}
