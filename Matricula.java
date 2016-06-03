import java.util.Calendar;

public class Matricula {

	private int matriculaId;
	private Modalidade modalidade;
	private Calendar dataInicio;
	private Calendar dataTermino;
	private static int maxId = 0;
	
	public Matricula(Modalidade modalidade,Calendar dataInicio){
		this.matriculaId = ++maxId;
		this.modalidade = modalidade;
		this.dataInicio = dataInicio;
	}
	
}
