import java.util.Calendar;


public class Mensalidade {
	
	static int maxId=1;
	
	private int mensalidadeId;
	private Calendar dataEmissao;
	private float valor;
	private Calendar dataPagamento;
	
	public Mensalidade(Calendar dataEmissao, float valor, Calendar dataPagamento) {
		
		this.mensalidadeId = Mensalidade.getMaxId();
		this.dataEmissao = dataEmissao;
		this.valor = valor;
		this.dataPagamento = dataPagamento;
		
		Mensalidade.setMaxId(Mensalidade.getMaxId()+1);
	}

	private static void setMaxId(int max) {
		maxId = max;
		
	}

	private static int getMaxId() {
		
		return maxId;
	}
	
	
	
	

}
