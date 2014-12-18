package servicos.logic;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import servicos.interfaces.ICalculadora;
import servicos.utils.MyException;
public class Calculadora implements ICalculadora{

	@Override
	public double Soma(double n1, double n2) {
		return n1 + n2;
	}

	@Override
	public double Subtracao(double n1, double n2) {
		return n1 - n2;
	}

	@Override
	public double Multiplicao(double n1, double n2) {
		return n1 * n2;
	}

	@Override
	public double Divisao(double n1, double n2) throws MyException {
		if(n2 <= 0)
			throw new MyException("Não é possivel realizar divisão por 0");
		else
			return n1/n2;
	}

	@Override
	public double Raiz(double n) {
		return Math.sqrt(n);
	}

	@Override
	public List<Double> Equacao(double a, double b, double c) {
		return new CalculaEquacao().calculaEquação(a, b, c);
	}

}
