package br.com.eltonodev.Util;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public Menu() {
        cabecario();
        menu();
        System.out.println("Programa Finalizado");
    }

    private void cabecario(){
        System.out.print(
                """
                        Bem vindo ao Conversor de Moedas da BackHardExchange
                        Nosso trabalho é facilitar a sua vida nos minimos detalhes
                        Obrigado por escolher nosso serviço. \
                        
                        Clique Enter para continuar""");
        sc.nextLine();
    }
    private void menu(){
        System.out.println("Olá, para seguir com o programa qual o seu nome? ");
        String nome = sc.next();
        System.out.println("Ótimo nome, " + nome + ", Vamos começar.");
        System.out.println("Me diga, qual a sigla da moeda de referencia que você quer converter? (Ex: BRL , USD ...)");
        String referencia = sc.next().toUpperCase();
        System.out.println("Ótimo, agora qual a moeda que vai ser de seu interesse a Cotação ou Conversão? ");
        String interesse = sc.next().toUpperCase();
        Conversor conversor = new Conversor(referencia, interesse);
        System.out.println("Legal, agora qual é seu interesse?");
        System.out.println("1 - Cotação atual.");
        System.out.println("2 - Converter alguma valor da moeda de referencia para de interesse.");
        System.out.println("Digite o numero de sua escolha: ");
        int escolha = sc.nextInt();
        while (true) {
            if(escolha == 1){
                conversor.getCotacao();
                break;
            } else if(escolha == 2){
                System.out.println("Qual o valor para converter? ");
                double valor = sc.nextDouble();
                conversor.valorConvertido(BigDecimal.valueOf(valor));
                break;
            } else {
                System.out.println("Escolha apenas 1 ou 2, para encerrar o programa aperte CTRL + C.");
            }
        }
    }
}
