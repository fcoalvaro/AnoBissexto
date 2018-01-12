import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class VerificadorTeste {

	Verificador verificador;
	
	// Inicializando o objeto da classe Verificador antes de inicializar os testes
	@Before
	public void inicializar() {
		
		verificador =new Verificador(0);
	}
	
	// Tratando a exce��o se o ano inserido for menor que 1
	@Test(expected=RuntimeException.class)
	public void quandoAnoMenorQue1() {						
		verificador.verificaAno();
	}
	
	// Testando um ano divis�vel por 4
	@Test
	public void quandoAnoFor1004() {
				
		verificador.setAno(1004);		
		Assert.assertEquals("Ano " + verificador.getAno() + " � bissexto.", verificador.verificaAno());		
	}
	
	// Testando um ano divis�vel por 400 
	@Test
	public void quandoAnoFor800() {					
		verificador.setAno(800);		
		Assert.assertEquals("Ano " + verificador.getAno() + " � bissexto.", verificador.verificaAno());		
	}
	
	// Testando um ano divis�vel por 4 e 100
	@Test
	public void quandoAnoFor200() {					
		verificador.setAno(200);		
		Assert.assertEquals("Ano " + verificador.getAno() + " n�o � bissexto.", verificador.verificaAno());		
	}
	
	@Test
	public void quandoAnoFor1876() {					
		verificador.setAno(1876);	
		Assert.assertEquals("Ano " + verificador.getAno() + " � bissexto.", verificador.verificaAno());		
	}
	
	@Test
	public void quandoAnoFor1847() {				
		verificador.setAno(1847);		
		Assert.assertEquals("Ano " + verificador.getAno() + " n�o � bissexto.", verificador.verificaAno());		
	}
	
}