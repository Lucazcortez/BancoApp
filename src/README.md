# AppBank - Lucas Cortez
______
## Inicializando
____
### Você deve iniciar o projeto executando bankApp para que possas visualizar o seguinte menu:
````
        ("========= Menu Banco Digital ========");
    System.out.println("========= 1. Criar conta Corrente ========");
    System.out.println("========= 2. Criar Conta Poupanca ========");
    System.out.println("=========       3. Ver Saldo      ========");
    System.out.println("=========       4. Depositar      ========");
    System.out.println("=========       5. Sacar          ========");
    System.out.println("=========       6. Transferir     ========");
    System.out.println("=========       7. Sair           ========");
    System.out.print("            Escolha uma opção: "); 
  ````

```1. Criar Conta Corrente: ``` Criar uma Conta Corrente

```2. Criar Conta Poupanca: ``` Criar uma Conta Poupanca

```3. ver saldo: ``` Visualizar Saldo

```4. Depositar: ``` Depositar 

```5. Sacar: ``` Sacar 

```6. Transferir: ``` Transferência de contas

```7. Sair: ``` Sair 

_________________

# Criando um Banco Digital com Java e Orientação a Objetos
________________________________________________________________
## 02/08/2021 - [Mentoria #1: Tire Suas Dúvidas Sobre Orientação a Objetos](https://www.youtube.com/watch?v=YS6ouOhkyNI)
Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário: “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

### Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

### Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

### Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

### Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.