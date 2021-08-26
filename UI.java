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
		System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Bhaskara\n6 - Sair");
		System.out.println();
		System.out.print("Selecione uma opção: ");
	}
	
	public void inputChoice1() {
		System.out.println("Digite o número 1: ");
	}
	
	public void inputChoice2() {
		System.out.println("Digite o número 2: ");
	}
}
