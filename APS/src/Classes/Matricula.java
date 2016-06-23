package Classes;
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
	public int getMatriculaId(){
		return this.matriculaId;
	}
	public Modalidade getModalidade(){
		return this.modalidade;
	}
	public Calendar getDataInicio(){
		return this.dataInicio;
	}
	public Calendar getDataTermino(){
		return this.dataTermino;
	}
	public String toString(){
		return " Id: "+this.matriculaId+" Modalidade: "+this.modalidade.getNome()+
				" Data Inicio: "+this.dataInicio+" Data Termino: "+this.dataTermino;
	}
	public void setDataTermino(Calendar data) {
		this.dataTermino = data;
	}
		
}
