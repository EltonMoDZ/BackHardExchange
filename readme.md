# Conversor de Moedas BackHardExchange

## Descrição
O Conversor de Moedas BackHardExchange é uma aplicação baseada em Java que permite aos usuários verificar taxas de câmbio e converter valores entre diferentes moedas. Este projeto demonstra o uso de princípios de programação orientada a objetos e integração com APIs externas para obter dados de moedas em tempo real.

## Funcionalidades
- Interface de linha de comando amigável
- Taxas de câmbio em tempo real
- Suporte para múltiplas moedas
- Capacidade de verificar taxas de câmbio atuais
- Funcionalidade de conversão de moedas

## Estrutura do Projeto
O projeto consiste em três classes principais:
1. `Menu`: Lida com a interação do usuário e o fluxo do programa
2. `Conversor`: Gerencia a lógica de conversão de moedas e a interação com a API
3. `Moedas`: Modelo de dados para armazenar as taxas de conversão de moedas

## Dependências
- Java 21
- Biblioteca Gson para análise de JSON (incluída no JAR)

## Como Executar
1. Certifique-se de ter o Java 21 instalado em seu sistema. Você pode verificar a versão do Java instalada executando o seguinte comando no terminal:
2. Baixe o arquivo JAR `BackHardExchange-1.0.jar`
3. Abra um terminal ou prompt de comando
4. Navegue até o diretório onde o arquivo JAR está localizado
5. Execute o programa com o seguinte comando: `java -jar BackHardExchange-1.0.jar`

## Uso
1. Quando solicitado, insira seu nome
2. Especifique a moeda de referência (ex: USD, EUR)
3. Especifique a moeda alvo para conversão ou verificação de taxa
4. Escolha entre verificar a taxa de câmbio atual ou converter um valor
5. Siga as instruções na tela para completar a ação desejada

## Integração com API
Este projeto utiliza uma API externa para buscar taxas de câmbio em tempo real. A classe `ApiRequestValues` é responsável por fazer requisições à API e retornar dados JSON.

## Melhorias Futuras
- Adicionar tratamento de erros para problemas de rede ou falhas da API
- Implementar uma interface gráfica de usuário (GUI)
- Suporte para taxas de câmbio históricas
- Adicionar mais opções de conversão de moedas

## Contribuindo
Contribuições para o Conversor de Moedas BackHardExchange são bem-vindas. Por favor, sinta-se à vontade para enviar um Pull Request.

## Autor
- Elton A. Costa

## Agradecimentos
- Obrigado a [nome do provedor da API] por fornecer dados de câmbio em tempo real
- Biblioteca Gson da Google para análise de JSON

## Requisitos do Sistema
- Java Development Kit (JDK) 21 ou superior
- Conexão com a internet para obter taxas de câmbio em tempo real

## Notas de Versão
- Versão atual: 1.0
- Última atualização: 10/10/2024