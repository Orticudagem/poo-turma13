package aagustini.poo;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // instanciar motoristas e professores
        Professor p1 = new Professor("huginho", 111, 20, 50 );
        Professor p2 = new Professor("pedro", 222, 30, 60 );
        Salario p3 = new Professor("maria", 333, 40, 100 );

        MotoristaTaxi m1 = new MotoristaTaxi("zezinho",123,
                555,  "10/2020", 1234, 3000, 3);

        // erro, não posso dar new (instanciar) interfaces        
        //Salario sal = new Salario();

        // mas posso atribuir usando polimorfismo
        Salario m2 = new MotoristaTaxi("ana paula",456,
                666,  "10/2022", 4321,
                2500, 4);



        // colocar em uma lista de "funcionários"
        ArrayList<Salario> func = new ArrayList<>();

        func.add(p1);
        func.add(m1);
        func.add(m2);
        func.add(p2);
        func.add(p3);

        // mostrar o salário (líquido e nro de salarios minimos) de cada funcionário
        float total = 0;
        for (Salario s : func) {
            System.out.printf("\t%-20s %.2f \t nroSalarios: %.2f\n",
                    s.whoAmi(),    
                    s.getSalarioLiquido(), s.getQuantidadeSalariosMinimo());
            total += s.getSalarioLiquido();
        }

        System.out.println("\nValor total a pagar R$ " + total);

        // mostar o nome dos professsores <--
        System.out.println("\nProfessores:");
        for (Salario s : func) {
            if (s instanceof Professor) {
               //                    // só para os corajosos...     
              //  System.out.println(  ((Professor) s).getNome());
               Professor prof = (Professor) s;
               System.out.println(prof.getNome());
            }
        }

        System.out.println("\nTestando polimjorfismo de interface: prof x taxixta");

        Salario ref1;
        ref1 = new Professor("Beltrano", 22222, 20, (float)20.5);

        System.out.printf("\t%.2f \t nroSalarios: %.2f\n",
                ref1.getSalarioLiquido(), ref1.getQuantidadeSalariosMinimo());

        ref1 = new MotoristaTaxi("Fulano",123456,8745,"30/08/2008",
                3028, 2890, (float)0.5);

        System.out.printf("\t%.2f \t nroSalarios: %.2f\n",
                ref1.getSalarioLiquido(), ref1.getQuantidadeSalariosMinimo());


    }
}
