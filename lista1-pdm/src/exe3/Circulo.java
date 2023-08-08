package exe3;

public class Circulo extends Forma {

	private double raio;
	
	public Circulo(double raio) {
        this.raio = raio;
    }
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(raio, 2);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * raio;
	}

}
