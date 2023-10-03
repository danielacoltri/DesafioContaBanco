# DIO - Trilha Java Básico
www.dio.me

**Autores**</br>
• [Gleyson Sampaio](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo/)


# Sintaxe - Desafio


Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

Crie o projeto *ContaBanco* que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:


1. Dentro do projeto, crie a classe *ContaTerminal.java* para realizar toda a codificação do nosso programa.


2. Revise sobre regras de declaração de variáveis
   
<table>
  <thead>
    <tr>
      <th>Atributo</th>
      <th>Tipo</th>
      <th>Exemplo</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>Número</td>
      <td>Inteiro</td>
      <td>1021</td>
    </tr>
    <tr>
      <td>Agência</td>
      <td>Texto</td>
      <td>067-8</td>
    </tr>
    <tr>
      <td>Nome Cliente</td>
      <td>Texto</td>
      <td>Mario Andrade</td>
    </tr>
    <tr>
      <td>Saldo</td>
      <td>Decimal</td>
      <td>37.48</td>
    </tr>
  </tbody>
</table>


3. Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:

• Programa: "Por favor, digite o número da Agência !"</br>
• Usuário: 1021 (depois ENTER para o próximo campo)

4. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:

*"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".*

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.
