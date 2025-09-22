package aagustini.poo;

public class App {
    public static void main(String[] args) {
        
        Imovel.setVR(10);

        // imovel é abstract não pode ser instanciada
        //Imovel i0 = new Imovel("alex", 
        //                            200, 
        //                            new Geo(10,20));

        Imovel i1 = new Residencial("alex", 
                                    200, 
                                    new Geo(10,20),
                                    1100);
        Imovel i2 = new Residencial("hugo", 
                                    310, 
                                    new Geo(10,20),
                                    700);
        Imovel i3 = new Comercial("zeca",    200, 
                                    new Geo(10,20));
        Imovel i4 = new Comercial("hugo",    200, 
                                    new Geo(10,20));                           

        CadastroImoveis cadastro = new CadastroImoveis();
        cadastro.cadastrar(i1);
        cadastro.cadastrar(i3);
        cadastro.cadastrar(i4);
        cadastro.cadastrar(i2);

        cadastro.listar();

        cadastro.listar("hugo");
        

    
    }
}
