package poo.aagustini;

import java.util.ArrayList;

public class GerenciadorCias {
	private ArrayList<CiaAerea> empresas;
	
	public GerenciadorCias() {
		empresas = new ArrayList<>();
	}

    public void cadastrar(CiaAerea cia) {
        empresas.add(cia);
    }

    public CiaAerea pesquisar(String codigo) {

        for (CiaAerea cia : empresas) {
            if (cia.getCodigo().equals( codigo )) {
                return cia;
            } 
        }   
		return null;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("\nCompanias aéreas\n");
       
		for (CiaAerea cia : empresas ) {
        	res.append(cia.toString()); 
            res.append("\n");
        }
        return res.toString();
    }

}
