package servicos.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import servicos.interfaces.ICalculadoraResources;
import servicos.logic.Calculadora;
import servicos.utils.MyException;

@Path("/servicos/calculadora")
public class CalculadoraResource implements ICalculadoraResources{
	private static final String ESPACAMENTO = "\n\n\n\n\n\n\n\t\t\t\t\t\t\t\t\t";
	private Calculadora calcula;
	
	public CalculadoraResource() {
		calcula = new Calculadora();
	}
	
	@GET
	@Produces("application/json")
	public String Hello(){
		return " ( /servicos/calculadora/soma/n1/n2 )"
				+"\n"+" ( /servicos/calculadora/subtrai/n1/n2 )"
				+"\n"+" ( /servicos/calculadora/multiplica/n1/n2 )"
				+"\n"+" ( /servicos/calculadora/dividi/n1/n2 )"
				+"\n"+" ( /servicos/calculadora/raiz/n )"
				+"\n"+" ( /servicos/calculadora/equacao/a/b/c )";
	}

	@GET
	@Path("/soma/{n1}/{n2}")
	@Produces("application/json")
	@Override
	public String calcularSoma(@PathParam("n1") double n1,@PathParam("n2") double n2) {
		return ESPACAMENTO +"Soma: "+ String.valueOf(calcula.Soma(n1, n2));
	}

	@GET
	@Path("/subtrai/{n1}/{n2}")
	@Produces("application/json")
	@Override
	public String calcularSubtracao(@PathParam("n1") double n1,@PathParam("n2") double n2) {
		return ESPACAMENTO +"Subtracao: "+ String.valueOf(calcula.Subtracao(n1, n2));
	}

	@GET
	@Path("/multiplica/{n1}/{n2}")
	@Produces("application/json")
	@Override
	public String calcularMultiplicao(@PathParam("n1") double n1,@PathParam("n2") double n2) {
		return ESPACAMENTO +"Multiplicao: "+ String.valueOf(calcula.Multiplicao(n1, n2));
	}
	
	@GET
	@Path("/dividi/{n1}/{n2}")
	@Produces("application/json")
	@Override
	public String calcularDivisao(@PathParam("n1") double n1,@PathParam("n2") double n2) throws MyException {
		return ESPACAMENTO +"Divisao: "+ String.valueOf(calcula.Divisao(n1, n2));
	}

	@GET
	@Path("/raiz/{n}")
	@Produces("application/json")
	@Override
	public String calcularRaiz(@PathParam("n") double n) {
		return ESPACAMENTO +"Rais Quadrada: "+ String.valueOf(calcula.Raiz(n));
	}

	@GET
	@Path("/equacao/{a}/{b}/{c}")
	@Produces("application/json")
	@Override
	public String calcularEquacao(@PathParam("a") double a, @PathParam("b") double b, @PathParam("c") double c) {
		return ESPACAMENTO +"Raizes: "+ calcula.Equacao(a, b, c).toString();
	}

}
