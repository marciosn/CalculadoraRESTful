package servicos.interfaces;

import java.util.List;

import servicos.utils.MyException;

public interface ICalculadora {
	
	double Soma(double n1, double n2);
	double Subtracao(double n1, double n2);
	double Multiplicao(double n1, double n2);
	double Divisao(double n1, double n2) throws MyException;
	double Raiz(double n);
	List<Double> Equacao(double a, double b, double c);

}
