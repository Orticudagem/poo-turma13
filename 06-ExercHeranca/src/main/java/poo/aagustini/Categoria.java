package poo.aagustini;
 
    private Categoria catRisco;

    public enum Categoria { ELETRO, QUIMICO }

    public FuncionarioRisco(String matricula, 
                            String nome, 
                            double salarioBruto,
                            Categoria cat){
        super(matricula, nome, salarioBruto);
        catRisco = cat;
    }

    @Override
    public double getSalarioLiquido() {

        double liquido = super.getSalarioLiquido();
        return liquido + (liquido * 0.25);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nObs.: Adicional de 25% de risco "+
                this.catRisco +
                "\n-------------\n";
    }

}
