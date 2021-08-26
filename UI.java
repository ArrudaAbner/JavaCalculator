package calculadora;

public class UI {

	public void inputText(String text) {
		System.out.println(text);
	}
	
	public void inputDouble(Double i) {
		System.out.println(i);
	}

	public void inputTextNoNewLine(String text) {
		System.out.print(text);
	}

	public void inputNewLine() {
		System.out.println();
	}
	
	public void inputTitle() {
		System.out.println("1 - Soma\n2 - Subtra��o\n3 - Multiplica��o\n4 - Divis�o\n5 - Bhaskara\n6 - Sair");
		System.out.println();
		System.out.print("Selecione uma op��o: ");
	}
	
	public void inputChoice1() {
		System.out.println("Digite o n�mero 1: ");
	}
	
	public void inputChoice2() {
		System.out.println("Digite o n�mero 2: ");
	}
}
