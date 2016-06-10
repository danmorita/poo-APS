package Teste;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import Classes.Endereco;
import Classes.Matricula;
import Classes.Modalidade;
import Classes.Socio;
public class Testes {

	@Test
	public void testCriarEndereco() {
		Endereco endereco = new Endereco("Av. parana",69,"000000000","NY", "NY");
		String esperado = "Rua: Av. parana N: 69 CEP: 000000000\nCidade: NY Estado: NY";
		assertEquals(esperado,endereco.toString());
	}

	@Test
	public void testCriarModalidade(){
		Modalidade modalidade = new Modalidade("Natacao",50.0,3);
		assertEquals("Natacao",modalidade.getNome());
		assertEquals(50.0,modalidade.getPreco(),0);
		assertEquals(3,modalidade.getFrequenciaSemanal());
		assertEquals("Modalidade: Natacao Preco: 50.0 Freq Semanal: 3",modalidade.toString());
	}
	@Test
	public void testMatricula(){
		Calendar calendario = Calendar.getInstance();
		Modalidade modalidade = new Modalidade("Natacao",50.0,3);
		calendario.set(2014, 02, 22);
		Matricula matricula = new Matricula(modalidade,calendario);
		assertEquals(modalidade,matricula.getModalidade());
		assertEquals(calendario,matricula.getDataInicio());
		assertEquals(null,matricula.getDataTermino());
	}
	
	@Test
	public void testCriarSocio(){
		Calendar calendario = Calendar.getInstance();
		calendario.set(1990, 10, 20);
		
		Socio socio = new Socio("129","jose",calendario);
		assertEquals("129",socio.getCpf());
		assertEquals("jose",socio.getNome());
		assertEquals(calendario,socio.getDataNasc());
		
	}
	
	@Test
	public void testMatricular(){
		Calendar calendario = Calendar.getInstance();
		calendario.set(1990, 10, 20);
		
		Socio socio = new Socio("129","jose",calendario);
		
		Modalidade modalidade = new Modalidade("Natacao",50.0,3);
		Modalidade[] modalidades = new Modalidade[10];
		modalidades[0] = modalidade;
		assertTrue(socio.matricular(modalidade.getModalidadeId(), modalidades));
		assertEquals(modalidade,socio.getMatriculas()[0].getModalidade());
		assertEquals(1,socio.getMatriculas()[0].getMatriculaId());
	}
	
	@Test
	public void testMatricular2Modalidades(){
		Calendar calendario = Calendar.getInstance();
		calendario.set(1990, 10, 20);
		
		Socio socio = new Socio("129","jose",calendario);
		
		Modalidade modalidade = new Modalidade("Natacao",50.0,3);
		Modalidade modalidade1 = new Modalidade("volei",80.0,2);
		Modalidade[] modalidades = new Modalidade[10];
		modalidades[0] = modalidade;
		modalidades[1] = modalidade1;
		
		assertTrue(socio.matricular(modalidade.getModalidadeId(), modalidades));
		assertEquals(modalidade,socio.getMatriculas()[0].getModalidade());
		assertEquals(1,socio.getMatriculas()[0].getMatriculaId());
		
		assertTrue(socio.matricular(modalidade1.getModalidadeId(), modalidades));
		assertEquals(modalidade1,socio.getMatriculas()[1].getModalidade());
		assertEquals(2,socio.getMatriculas()[1].getMatriculaId());

	}
}
