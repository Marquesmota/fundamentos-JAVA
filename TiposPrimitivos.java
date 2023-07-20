
	package fundamentos;

	public class TiposPrimitivos {
		
		public static void main(String[] args) {
			// Informacoes de um funcionario
			
			// Tipos numericos inteiros
			byte anosDeEmpresa =23;
			short numeroDeVoos = 542;
			int id = 56789;
			long pontosAcumulados = 3_234_845_223L; // USAR L MAISCULO que DESCREVE UM RENG de  NUmero LITERAL
			
			
			// Tipos numericos reais
			float salario = 11_445.45F; // literal de FLOAT F  JAVA nao analisa o valor, mas sim o TIPO
			double  vendasAcumuladas = 2_991_787_103.01;
			
			// TIPO BOOLEANO
			boolean estarDeFerias = false; // ou true VERDADEIRO OU FALSO
			
			// TIPO CARACTERE
			char status =  'A';  // ATIVO
			
			//  Dias da empresa
			System.out.println (anosDeEmpresa * 365);
			
			//  Numero de Viagens
			System.out.println(numeroDeVoos / 2);
			
			// Pontos por real
			System.out.println(pontosAcumulados / vendasAcumuladas);
			
			System.out.println(id +"ganha ->" + salario);
			System.out.println("Férias? " + estarDeFerias);
			System.out.println("Status: " + status);
			
			
		}


	}


