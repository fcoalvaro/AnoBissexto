
/*
 * PROBLEMA DOJO CODING: ANO BISSEXTO
 * http://dojopuzzles.com/problemas/exibe/ano-bissexto/
 * 
 * A cada 4 anos, a diferença de horas entre o ano solar e o do calendário
 * convencional completa cerca de 24 horas (mais exatamente: 23 horas, 15
 * minutos e 864 milésimos de segundo). Para compensar essa diferença e
 * evitar um descompasso em relação às estações do ano, insere-se um dia
 * extra no calendário e o mês de fevereiro fica com 29 dias.Essa correção é
 * especialmente importante para atividades atreladas às estações, como a agricultura
 * e até mesmo as festas religiosas.
 * 
 * Um determinado ano é bissexto se:
 * >>> O ano for divisível por 4, mas não divisível por 100,
 * >>> exceto se ele for também divisível por 400.
 */

public class Verificador {
	
	private int ano;
	
	public Verificador(int ano) {
		this.setAno(ano);
	}
	
	// Método para verificação de acordo com as condições de ano bissexto
	public String verificaAno() {		
		int anoRecebido = getAno();
		
		if(anoRecebido<=0)
			throw new RuntimeException("Ano Inválido"); //exceção para anos inseridos menores que 1
		
		if((anoRecebido % 4 == 0 && anoRecebido % 100 != 0) || anoRecebido % 400 == 0)
			return "Ano " + anoRecebido + " é bissexto.";
		
		return "Ano " + anoRecebido + " não é bissexto.";
		
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}	

}