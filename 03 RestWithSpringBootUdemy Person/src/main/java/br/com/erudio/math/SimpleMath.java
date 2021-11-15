package br.com.erudio.math;

public class SimpleMath {

	public static Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}

	public static Double subtraction(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}

	public static Double multiplication(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}

	public static Double division(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;
	}

	public static Double mean(Double firstNumber, Double secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}

	public static Double squareRoot(Double number) {
		return (Double) Math.sqrt(number);
	}
}