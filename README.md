## 5.03 Atividade colaborativa

## 🤝 Alunos: Vinícius da Silva Ribeiro e Joao Pedro Oliveira Santos

Respostas das seguintes questões:

- Livro Chagas, Baruque & Baruque (2010): atividades práticas 4 e 5 (páginas 84 e 85);
- Livro Batista & Moraes (2013): questões 6 até 10 (página 44);

### ✔️ Questão 1) Descreva os quatro elementos básicos de repetição controlada por contador.

Os quatro elementos básicos de repetição controlada por contador são:

- **Inicialização do contador**: é a etapa inicial, onde é definido o valor inicial do contador;
- **Teste da condição**: é responsável por verificar se a condição de repetição ainda é verdadeira; 
- **Incremento do contador**: é executado a cada iteração, atualizando o valor do contador; 
- **Corpo do loop**: é o conjunto de instruções que são executadas repetidamente até que a condição seja falsa.

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

### ✔️ Questão 3) Discuta uma situação em que seria mais adequado utilizar uma instrução do...while do que uma instrução while. Explique por quê.


### ✔️ Questão 4) Compare e contraste as instruções break e continue.
Tanto a instrução `break` quanto a instrução `continue` são usadas para controlar o fluxo de execução de um loop, como um `for` ou um `while`. A principal diferença entre as duas instruções é que o `break` encerra completamente o loop e o `continue` apenas interrompe a iteração atual e passa para a próxima iteração.

Exemplo de código usando `break`:
```
for (int i = 0; i < 10; i++) {
  if (i == 5) { // irá parar o "for" quando "i" for igual a 5
    break;
  }
  System.out.println(i);
}
```

Exemplo de código usando `continue`:
```
for (int i = 0; i < 10; i++) {
  // Quando "i" for par, o "for" irá ignorar o resto das instruções e irá pular para a próxima execução
  if (i % 2 == 0) {
    continue;
  }
  System.out.println(i);
}
```

### ✔️ Questão 5) Localize e corrija o(s) erro(s) em cada um dos seguintes segmentos de código:
#### a) 
``` 
for (i = 100; i >= 1; i++)
    System.out.println(i);
```

O erro está localizado no seguinte trecho: `i++`, já que o `i` do `for` começa com o valor 100 e a sua condição de parada é `i >= 1`, então esse loop nunca terá um fim já que o valor de `i` logo de início já é maior do que o valor pretendido, e após isso, seu valor só irá aumentar cada vez mais.

Solução:
``` 
for (i = 100; i >= 1; i--)
    System.out.println(i);
```

#### c) O código a seguir deve dar saída dos inteiros ímpares de 19 a 1:
```
for(i = 19; i >= 1; i += 2) System.out.println(i);
```

O erro está localizado no seguinte trecho: `i += 2`, já que o `i` do `for` começa com o valor 19 e a sua condição de parada é `i >= 1`, então esse loop nunca terá um fim já que o valor de `i` logo de início já é maior do que o valor pretendido, e após isso, seu valor só irá aumentar cada vez mais.

Solução:
```
for(i = 19; i >= 1; i -= 2) System.out.println(i);
```


### ✔️ Questão 6) O que o seguinte programa faz?
```
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

@@@@@<br>
@@@@@<br>
@@@@@<br>
@@@@@<br>
@@@@@<br>
@@@@@<br>
@@@@@<br>
@@@@@<br>
@@@@@<br>
@@@@@<br>
