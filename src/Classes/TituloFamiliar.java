package Classes;

public class TituloFamiliar extends Titulo {

	private Socio dependentes[];
	private int qtdependentes;
	
	public TituloFamiliar(Socio titular,Socio[] dependentes,int qt) {
		super(titular);
		this.dependentes = dependentes;
		this.qtdependentes = qt;
	}

	
}
