package aagustini.poo;

public class App {
    public static void main(String[] args) {
        CadastroAlunos cad = new CadastroAlunos();

        cad.inserir(new AlunoGraduacao("Hugo", 7, 8));
        cad.inserir(new AlunoGraduacao("Mika", 3, 9));
        cad.inserir(new AlunoPos("Rosa", 9, 8));
        cad.inserir(new AlunoGraduacao("Zeca", 9, 8));
        cad.inserir(new AlunoGraduacao("Kiko", 5, 10));
        cad.inserir(new AlunoEspecial("Juca", 6, 7));
        cad.inserir(new AlunoGraduacao("Luis", 7, 6));

        System.out.println();
        System.out.println(cad.toString());
        System.out.println();

        System.out.println("Pesquisa Zeca => "+ cad.find("Zeca"));
        System.out.println("\nPesquisa Lucas => "+ cad.find("Lucas"));
        System.out.println();

        System.out.println(cad.aprovados());
        System.out.println();

        System.out.println(String.format("Alunos de graduação aprovados: %.1f%%", cad.graduacaoAprovados()*100));
        System.out.println();

        try {
            Aluno aluErro = new AlunoGraduacao("", 10, 10);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: "+e.getMessage());
        }

        System.out.println();
    }
}
