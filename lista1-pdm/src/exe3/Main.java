package exe3;

public class Main {

	public static void main(String[] args) {
		
		Forma ret = new Retangulo(5, 10);
		Forma forma2 = new Quadrado(7);
		Forma forma3 = new Circulo(4);

		System.out.println("Área do Retângulo: " + ret.area());
		System.out.println("Perímetro do Retângulo: " + ret.perimetro());

		System.out.println("Área do Quadrado: " + forma2.area());
		System.out.println("Perímetro do Quadrado: " + forma2.perimetro());

		System.out.println("Área do Círculo: " + forma3.area());
		System.out.println("Perímetro do Círculo: " + forma3.perimetro());
	}

}
