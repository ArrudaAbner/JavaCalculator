package calculadora;

public class Calculos {

	public double calcSoma(double num1, double num2) {
		return num1 + num2;
	}

	public double calcSub(double num1, double num2) {
		return num1 - num2;
	}

	public double calcVezes(double num1, double num2) {
		return num1 * num2;
	}

	public double calcDiv(double num1, double num2) {
		return num1 / num2;
	}
	
	public double calcBhaskaraX1(int a, int b, double delta, double result) {
		result = ((-(b) + Math.sqrt(delta)) / 2 * a);
		return result;
	}
	
	public double calcBhaskaraX2(int a, int b, double delta, double result) {
		result = ((-(b) - Math.sqrt(delta)) / 2 * a);
		return result;
	}
}
