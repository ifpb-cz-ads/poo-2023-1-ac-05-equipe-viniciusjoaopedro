## 5.03 Atividade colaborativa

## 🤝 Alunos: Vinícius da Silva Ribeiro e Joao Pedro Oliveira Santos

Respostas das seguintes questões:

- Livro Chagas, Baruque & Baruque (2010): atividades práticas 4 e 5 (páginas 84 e 85);
- Livro Batista & Moraes (2013): questões 6 até 10 (página 44);

---
### ✔️ Questão 1) Descreva os quatro elementos básicos de repetição controlada por contador.

Os quatro elementos básicos de repetição controlada por contador são:

- **Inicialização do contador**: é a etapa inicial, onde é definido o valor inicial do contador;
- **Teste da condição**: é responsável por verificar se a condição de repetição ainda é verdadeira; 
- **Incremento do contador**: é executado a cada iteração, atualizando o valor do contador; 
- **Corpo do loop**: é o conjunto de instruções que são executadas repetidamente até que a condição seja falsa.

---
### ✔️ Questão 2) Compare e contraste as instruções de repetição while e for.

Tanto o while quanto o for são usados para repetir um bloco de código várias vezes em programação. A principal diferença entre eles é como eles controlam a repetição.
A sintaxe geral da instrução while é a seguinte:
```
while (condição) {
    // bloco de código
}
```
Já a sintaxe geral da instrução for é:
```
for (inicialização; condição; atualização) {
    // bloco de código
}
```
O while é usado quando não se sabe quantas vezes o bloco de código será repetido, enquanto o for é usado quando se sabe. O while verifica uma condição antes de cada iteração e o for usa um contador para controlar o número de iterações. Em resumo, o while é mais flexível e o for é mais conveniente para loops com um número fixo de iterações.

---
### ✔️ Questão 3) Discuta uma situação em que seria mais adequado utilizar uma instrução do...while do que uma instrução while. Explique por quê.

O `do...while` é uma instrução de loop que é mais adequada usarmos quando quando se precisa garantir que um bloco de código seja executado pelo menos uma vez, independentemente da condição que está sendo verificada. Pode ser útil quando a primeira execução do loop é especial e precisa ser tratada de forma diferente das demais execuções. Além disso, o `do...while` é útil em situações de processamento de entrada de dados do usuário, onde é importante garantir que o usuário insira informações válidas antes de continuar com a execução do programa. 

Por exemplo, suponha que estejamos escrevendo um programa que solicita ao usuário que insira um número inteiro positivo e, em seguida, imprima o fatorial desse número. Como o usuário pode inserir um número inválido, precisamos ler a entrada do usuário pelo menos uma vez, independentemente da validade da entrada.

Usando `do...while`, podemos garantir que a entrada do usuário seja lida pelo menos uma vez e que a entrada seja validada posteriormente no loop:
```java
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = scanner.nextInt();
        } while (numero <= 0);

        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
```
Observe que o loop `do...while` lê a entrada do usuário e verifica se o número inserido é positivo. Se o número for negativo ou zero, o loop será executado novamente e o usuário será solicitado a inserir um novo número. Se o número for válido, o loop termina e o programa continua com o cálculo do fatorial.

Usando apenas um `while`, seria necessário inicializar a variável `numero` com um valor inválido e, em seguida, verificar a validade do valor dentro do loop, como no exemplo abaixo:
```java
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        while (numero <= 0) {
            System.out.print("Digite um número inteiro positivo: ");
            numero = scanner.nextInt();
        }

        int fatorial = 1;
        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
```
Apesar de também funcionar, a inicialização da variável `numero` com um valor inválido pode tornar o código menos legível e mais propenso a erros.

---
### ✔️ Questão 4) Compare e contraste as instruções break e continue.

Embora as instruções `break` e `continue` sejam usadas para alterar o comportamento padrão de um loop, elas têm finalidades diferentes. 

A instrução `break` é usada para interromper a execução de um loop, independentemente da condição que está sendo verificada. Quando o `break` é executado, o loop é interrompido imediatamente e a execução do programa continua na próxima instrução após o loop. O `break` é comumente usado quando é necessário sair de um loop antes que ele seja concluído por completo, por exemplo, quando uma determinada condição é atendida.

Por exemplo, considere o seguinte loop for que itera sobre os números de 1 a 10 e para quando encontrar o número 5:

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```
Nesse exemplo, o loop for será interrompido quando i for igual a 5 e a execução do programa continuará na próxima instrução após o loop.

Por outro lado, a instrução `continue` é usada para pular a execução de uma iteração específica do loop, mas sem interromper a execução do loop por completo. Quando o `continue` é executado, o loop passa para a próxima iteração sem executar o código abaixo da instrução continue na iteração atual. O `continue` é comumente usado quando uma iteração específica do loop não precisa ser executada por alguma razão, por exemplo, quando uma determinada condição é atendida.

Por exemplo, considere o seguinte loop while que itera sobre os números de 1 a 10 e pula a iteração quando o número é ímpar:

```java
int i = 1;
while (i <= 10) {
    if (i % 2 == 1) {
        i++;
        continue;
    }
    System.out.println(i);
    i++;
}
```
Nesse exemplo, quando i for ímpar, a instrução continue será executada, pulando a execução do println e passando para a próxima iteração do loop. Quando i for par, o código abaixo da instrução continue será executado normalmente.

---
### ✔️ Questão 5) Localize e corrija o(s) erro(s) em cada um dos seguintes segmentos de código:
#### a) 
```java
For (i = 100, i >= 1, i++)
    System.out.println(i); 
```
O código apresenta alguns erros. Um deles é um erro de sintaxe pois o `For` está iniciando com maiúscula, o correto seria `for`. outro ponto é que a inicialização do loop está correta (i = 100), mas a condição e a iteração não estão. A condição deve ser i >= 1 para garantir que o loop continue executando enquanto i for maior ou igual a 1, e a iteração deve ser i-- para garantir que i seja decrementado a cada iteração do loop.

o código correto seria:
```java
for (int i = 100; i >= 1; i--) {
    System.out.println(i);
}
```
#### b) O seguinte código deve imprimir se o inteiro value for par ou ímpar:
```java
switch (value % 2) {
    case 0:
    System.out.println("Inteiro par");
        case 1:
    System.out.println("Inteiro ímpar");
}
```
O código está correto em termos de sintaxe, mas possui um problema de lógica.No código apresentado, o switch testa se value % 2 é igual a 0 (ou seja, se value é par) e, em seguida, imprime "Inteiro par". No entanto, em seguida, ele continua a executar o código sem sair do switch e imprime também "Inteiro ímpar". Isso acontece porque o case 1 está sem o break para interromper a execução do switch.

Para corrigir o problema, é necessário adicionar o comando break ao final de cada case, como no exemplo abaixo:
```java
switch (value % 2) {
    case 0:
        System.out.println("Inteiro par");
        break;
    case 1:
        System.out.println("Inteiro ímpar");
        break;
}
```
Dessa forma, ao encontrar o primeiro caso que satisfaça a condição, o switch sairá imediatamente e não executará o código dos outros casos.

O erro está localizado no seguinte trecho: `i++`, já que o `i` do `for` começa com o valor 100 e a sua condição de parada é `i >= 1`, então esse loop nunca terá um fim já que o valor de `i` logo de início já é maior do que o valor pretendido, e após isso, seu valor só irá aumentar cada vez mais

#### c) O código a seguir deve dar saída dos inteiros ímpares de 19 a 1:

```java
for(i = 19; i >= 1; i += 2) System.out.println(i);
```

O código apresentado em Java está correto. Ele utiliza a instrução for para iniciar a variável i com o valor 19, testar se i é maior ou igual a 1 e incrementar i em 2 a cada iteração do loop. Dentro do loop, a instrução System.out.println(i) é usada para imprimir o valor atual de i.

O resultado esperado do código é a impressão dos números ímpares de 19 a 1, em ordem decrescente. Portanto, o código deve imprimir na saída:
```java
19
17
15
13
11
9
7
5
3
1
```
Sendo assim, não há erros de sintaxe no código apresentado.

#### d) O código seguinte deve dar saída dos inteiros pares de 2 a 100:

```java
    counter = 2;
    do {
        System.out.println(counter);
        counter += 2;
    } while (counter < 100);
```
O código apresentado em Java está correto. Ele utiliza a instrução do...while para imprimir na saída os números pares de 2 a 98. A variável counter é inicializada com o valor 2, e dentro do laço de repetição, a instrução System.out.println(counter) é usada para imprimir o valor atual de counter. Em seguida, counter é incrementado em 2 a cada iteração do loop. A condição do while testa se counter é menor que 100. Quando counter atinge o valor 100, o loop é interrompido e o programa continua a execução após o bloco do do...while. Portanto, não há erros de sintaxe no código apresentado em Java.

---
### ✔️ Questão 6) O que o seguinte programa faz?

```java
public class Printing {
    public class void main (String[] args) {
        for (int i=1; i<=10; i++){
            for(int j=1; j<=5, j++){
                System.out.print('@');
            }
            System.out.println();
        }
    }
}
```
O programa usa loops `for` para imrimir 5 caracteres `@` em cada linha, em um total de 10 linhas. A saída do programa será a seguinte:
```java
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
@@@@@
```
