# 13-prova-p1

Projeto Maven criado automaticamente com Java 21 e JUnit 5.

## Como compilar e rodar

```bash
mvn compile
mvn exec:java -Dexec.mainClass="aagustini.poo.App"
```

## Como rodar testes

```bash
mvn test
```

# Solução exemplo da prova P1 - 2025/2

Para todas as questões considere os trechos de código que seguem:
public enum SituacaoAluno {
     APROVADO,REPROVADO;
}

public abstract class Aluno{private String nome;
    private int n1;
    private int n2;

    public Aluno(String nome, int n1, int n2) {
        this.nome = nome;
        this.n1 = n1; this.n2 = n2;
    }

    public String getNome() { return nome; }
    public int getN1() { return n1; }
    public int getN2() { return n2; }

    public abstract double calculaNotaFinal();

    public SituacaoAluno situacaoAluno(){
        if (calculaNotaFinal() >= 7.0){
            return SituacaoAluno.APROVADO;
        }else{
            return SituacaoAluno.REPROVADO;
        }
    }
    @Override
    public String toString() {
        return “Aluno: “ + getNome();
}

1)	(4 pontos) Sabendo que a classe “AlunoGraduacao” é derivada da classe “Aluno”, apresente o código da classe “AlunoGraduacao”, sabendo que:
a.	O construtor da classe deve verificar se o nome fornecido – no caso de ser null gerar uma exceção do tipo IllegalArgumentException;  
b.	Ainda no construtor dessa classe deve ser gerado um novo número de aluno (matrícula) a cada novo aluno criado (os números iniciam a partir do número 1000). Não esqueça de declarar, na classe, os atributos necessários e acrescentar um seletor (getter) que retorna o próximo número de aluno que será gerado.
c.	Para alunos de graduação a nota do aluno (calculaNotaFinal) é a média aritmética das duas notas fornecidas;
d.	O método toString deve incluir o nome do aluno, número de matrícula e a informação se o aluno está aprovado ou reprovado.

2)	(4 pontos) Suponha a classe “CadastroAlunos”, contendo um atributo declarado da seguinte forma: “ArrayList<Aluno> alunos = new ArrayList<>()”
Suponha também que foram armazenados neste atributo dados de alunos correspondentes as subclasses da classe “Aluno” (AlunoEspecial, AlunoPos, AlunoGraduacao). Considerando esta situação escreva os métodos abaixo:
a.	Adicionar um novo aluno à lista de alunos;
b.	Retornar uma String contendo o nome e nota final de todos os alunos aprovados do cadastro;
c.	Retornar o percentual de alunos de graduação do cadastro (dado pelo número de alunos de graduação dividido pelo número de alunos do cadastro);
d.	Escreva um método de pesquisa que retorne os dados de um aluno a partir do seu nome, ou null caso o aluno não esteja no cadastro.

3)	(2 pontos) Escreva um trecho de código do método main, da classe App, que permita testar tudo que foi solicitado nas questões anteriores.

4)	(1 ponto) Responda suscintamente (explique/exemplifique suas respostas):
a)	neste problema pode ser observado polimorfismo?
b)	neste problema pode ser observado sobrecarga?
c)	neste problema pode ser observado sobrescrita? 
d)	qual a problema da classe “Aluno” ser abstract?
e)	qual a problema do método “calculaNotaFinal” ser abstract?

Obs. A prova possui 11 pontos, mas a nota máxima atribuída será 10,0.

