

import static org.junit.Assert.*;

import org.junit.Test;

public class Teste {

	@Test
	public void testPesquisarModalidades() {
		Modalidade modalidades[] = new Modalidade[10];
		
		Modalidade volei = new Modalidade("volei",50.0,3);
		Modalidade futsal = new Modalidade("futsal",50.0,3);
		
		modalidades[1] = volei;
		modalidades[2] = futsal;
		
	
		Modalidade recebida = Modalidade.pesquisarModalidade(5, modalidades);
		assertEquals(null,recebida);
	}

}
