package Classes;

public class Embalagem_Pizza {
	private String codigoPizza;
	private double alturaPizza;
	private double ladoPizza;
    private double volumePizza;
	public Embalagem_Pizza(String codigoPizza, double alturaPizza, double ladoPizza, double volumePizza) {
		this.codigoPizza = codigoPizza;
		this.alturaPizza = alturaPizza;
		this.ladoPizza = ladoPizza;
		this.volumePizza = volumePizza;
	}
	public String getCodigoPizza() {
		return codigoPizza;
	}
	public void setCodigoPizza(String codigoPizza) {
		this.codigoPizza = codigoPizza;
	}
	public double getAlturaPizza() {
		return alturaPizza;
	}
	public void setAlturaPizza(double alturaPizza) {
		this.alturaPizza = alturaPizza;
	}
	public double getLadoPizza() {
		return ladoPizza;
	}
	public void setLadoPizza(double ladoPizza) {
		this.ladoPizza = ladoPizza;
	}
	public double getVolumePizza() {
		return volumePizza;
	}
	public void setVolumePizza(double volumePizza) {
		this.volumePizza = volumePizza;
	}
    

}
