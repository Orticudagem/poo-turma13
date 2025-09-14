package aagustini.poo;

import java.nio.file.Path;
import java.nio.file.Paths;

public class App {

    public static void main(String[] args) {
        CadastroFuncionarios cad;

        cad = CadastroFuncionarios.getInstance();

        /* 
        cad.add(new Funcionario(100,"Zezinho",1000));

        cad.add(new Funcionario(200,"Huginho",2000));
        cad.add(new Funcionario(300,"Luizinho",3000));

        cad.saveFile("funcionarios.txt");
        */

        cad.cleanAll();
        cad.readFile("funcionarios.txt");

        System.out.println(cad.toString());
        System.out.println("\n");
        System.out.println(cad.relatorio());
        System.out.println("\n");
        //teste();
    }

 
    public static void teste() {

        Path path1 = Paths.get("/workspaces/poo-turma13/08-Arquivos/funcionarios.txt");

        System.out.println("toString: "     + path1.toString());     // /home/user2/statusReport
        System.out.println("getFileName: "  + path1.getFileName());  // statusReport
        System.out.println("getName(0): "   + path1.getName(0));     // home
        System.out.println("getNameCount: " + path1.getNameCount()); // 3
        System.out.println("subpath(0,2): " + path1.subpath(0,2));   // /home/user2
        System.out.println("getParent: "    + path1.getParent());    // /home/user2
        System.out.println("getRoot: "      + path1.getRoot());      // / ou C:\
    }   
}
