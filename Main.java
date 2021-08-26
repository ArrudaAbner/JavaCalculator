package calculadora;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {

		Calculos calculos = new Calculos();
		UI ui = new UI();

		double num1;
		double num2;
		double aux;
		int choice;

		ui.inputChoice1();

		do {
			ui.inputNewLine();
			ui.inputTitle();
			choice = Console.readInt();

			switch (choice) {
			case 1:
				ui.inputChoice1();
				num1 = Console.readDouble();

				ui.inputChoice2();
				num2 = Console.readDouble();

				aux = calculos.calcSoma(num1, num2);
				ui.inputDouble(aux);
				break;
			case 2:
				ui.inputChoice1();
				num1 = Console.readDouble();

				ui.inputChoice2();
				num2 = Console.readDouble();

				aux = calculos.calcSub(num1, num2);
				ui.inputDouble(aux);
				break;
			case 3:
				ui.inputChoice1();
				num1 = Console.readDouble();

				ui.inputChoice2();
				num2 = Console.readDouble();

				aux = calculos.calcVezes(num1, num2);
				ui.inputDouble(aux);
				break;
			case 4:
				ui.inputChoice1();
				num1 = Console.readDouble();

				ui.inputChoice2();
				num2 = Console.readDouble();

				aux = calculos.calcDiv(num1, num2);
				ui.inputDouble(aux);
				break;
			case 5:
				int a;
				int b;
				int c;
				double x1 = 0;
				double x2 = 0;
				int delta;

				do {
					ui.inputText("Informe o valor de A: ");
					a = Console.readInt();

					if (a == 0) {
						ui.inputText("Valor inválido, tente novamente!");
					}
				} while (a == 0);

				ui.inputText("Informe o valor de B: ");
				b = Console.readInt();
				ui.inputText("Informe o valor de C: ");
				c = Console.readInt();

				delta = (b * b) - 4 * a * c;

				if (delta >= 0) {
					x1 = calculos.calcBhaskaraX1(a, b, delta, x1);
					x2 = calculos.calcBhaskaraX2(a, b, delta, x2);

					ui.inputText("x1 = " + x1);
					ui.inputText("x2 = " + x2);
				} else {
					ui.inputText("Delta não possui raíz");
				}
			}
		} while (choice > 0 && choice < 6);
		ui.inputNewLine();
		ui.inputText("----- Fim do código -----");
	}
}
