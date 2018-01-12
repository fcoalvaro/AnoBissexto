
/*
 * PROBLEMA DOJO CODING: ANO BISSEXTO
 * http://dojopuzzles.com/problemas/exibe/ano-bissexto/
 * 
 * A cada 4 anos, a diferen�a de horas entre o ano solar e o do calend�rio
 * convencional completa cerca de 24 horas (mais exatamente: 23 horas, 15
 * minutos e 864 mil�simos de segundo). Para compensar essa diferen�a e
 * evitar um descompasso em rela��o �s esta��es do ano, insere-se um dia
 * extra no calend�rio e o m�s de fevereiro fica com 29 dias.Essa corre��o �
 * especialmente importante para atividades atreladas �s esta��es, como a agricultura
 * e at� mesmo as festas religiosas.
 * 
 * Um determinado ano � bissexto se:
 * >>> O ano for divis�vel por 4, mas n�o divis�vel por 100,
 * >>> exceto se ele for tamb�m divis�vel por 400.
 */

public class Verificador {
	
	private int ano;
	
	public Verificador(int ano) {
		this.setAno(ano);
	}
	
	// M�todo para verifica��o de acordo com as condi��es de ano bissexto
	public String verificaAno() {		
		int anoRecebido = getAno();
		
		if(anoRecebido<=0)
			throw new RuntimeException("Ano Inv�lido"); //exce��o para anos inseridos menores que 1
		
		if((anoRecebido % 4 == 0 && anoRecebido % 100 != 0) || anoRecebido % 400 == 0)
			return "Ano " + anoRecebido + " � bissexto.";
		
		return "Ano " + anoRecebido + " n�o � bissexto.";
		
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}	

}