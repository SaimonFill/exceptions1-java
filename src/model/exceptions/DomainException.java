package model.exceptions;

/*
 * Pode-se utilizar a extenção da classe RunTimeException ou da classe Exception
 * RunTimeException: não vai te obrigar a tratar a exceção, não será necessário o catch
 * Exception: vai te obrigar a tratar a exceção
 */
public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;
	
	/*
	 * este construtor utilizando a String com superclass garante que a exceção vai 
	 * ser instanciada passando uma mensagem
	 */
	public DomainException(String msg) {
		super(msg);
	}
	
	
}
