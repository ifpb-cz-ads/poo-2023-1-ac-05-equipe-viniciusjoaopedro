## 5.03 Atividade colaborativa

Respostas das seguintes questões:

- Livro Chagas, Baruque & Baruque (2010): atividades práticas 4 e 5 (páginas 84 e 85);
- Livro Batista & Moraes (2013): questões 6 até 10 (página 44);

## 🤝 Alunos: Vinícius da Silva Ribeiro e Joao Pedro Oliveira Santos

## ✔️ Questão 5:  Localize e corrija o(s) erro(s) em cada um dos seguintes segmentos de código
### a)
`for (i = 100, i >= 1, i++)
    System.out.println(i);`

O erro está localizado no seguinte trecho: `i++`, já que o `i` do `for` começa com o valor 100 e a sua condição de parada é `i >= 1`, então esse loop nunca terá um fim já que o valor de `i` logo de início já é maior do que o valor pretendido, e após isso, seu valor só irá aumentar cada vez mais

### c) O código a seguir deve dar saída dos inteiros ímpares de 19 a 1:
`for(i = 19; i >= 1; i += 2) System.out.println(i);`
