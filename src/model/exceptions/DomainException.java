package model.exceptions;

/*
 * Pode-se utilizar a exten��o da classe RunTimeException ou da classe Exception
 * RunTimeException: n�o vai te obrigar a tratar a exce��o, n�o ser� necess�rio o catch
 * Exception: vai te obrigar a tratar a exce��o
 */
public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;
	
	/*
	 * este construtor utilizando a String com superclass garante que a exce��o vai 
	 * ser instanciada passando uma mensagem
	 */
	public DomainException(String msg) {
		super(msg);
	}
	
	
}
