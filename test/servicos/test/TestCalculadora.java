package servicos.test;

import static org.junit.Assert.*;

import org.junit.Test;

import servicos.logic.Calculadora;
import servicos.utils.MyException;

public class TestCalculadora {
	Calculadora calculadora = new Calculadora();

	@Test
	public void testSoma() {
		assertEquals(calculadora.Soma(1, 1), 2, 0);
	}
	
	@Test
	public void testSubtracao() {
		assertEquals(calculadora.Subtracao(3, 1), 2, 0);
	}
	
	@Test
	public void testMultiplicao() {
		assertEquals(calculadora.Multiplicao(2, 1), 2, 0);
	}

	@Test(expected = MyException.class)
	public void testDivisao() throws MyException {
		assertEquals(calculadora.Divisao(1, 0), 0, 0);	
	}
	
	@Test
	public void testRaiz() {
		assertEquals(calculadora.Raiz(49), 7, 0);
	}
	
	@Test
	public void testEquacao() {
		double r1 = calculadora.Equacao(1, 10, 24).get(0);
		double r2 = calculadora.Equacao(1, 10, 24).get(1);
		assertEquals(r1, 4, 0);
		assertEquals(r2, 6, 0);
	}
}











