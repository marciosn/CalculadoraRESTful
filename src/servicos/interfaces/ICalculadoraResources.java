package servicos.interfaces;

import java.util.List;

import servicos.utils.MyException;

public interface ICalculadoraResources {
	
	String calcularSoma(double n1, double n2);
	String calcularSubtracao(double n1, double n2);
	String calcularMultiplicao(double n1, double n2);
	String calcularDivisao(double n1, double n2) throws MyException;
	String calcularRaiz(double n);
	String calcularEquacao(double a, double b, double c);
	
	
	

}
