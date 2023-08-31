package Classes;


public class Embalagem_Bebida {
	private String codigoBebida;
	private double alturaBebida;
	private double diametroBebida;
    private double volumeBebida;
    
	public Embalagem_Bebida(String codigoBebida, double alturaBebida, double diametroBebida, double volumeBebida) {
		this.codigoBebida = codigoBebida;
		this.alturaBebida = alturaBebida;
		this.diametroBebida = diametroBebida;
		setVolumeBebida(volumeBebida);
	}
	public String getCodigoBebida() {
		return codigoBebida;
	}
	public void setCodigoBebida(String codigoBebida) {
		this.codigoBebida = codigoBebida;
	}
	public double getAlturaBebida() {
		return alturaBebida;
	}
	public void setAlturaBebida(double alturaBebida) {
		this.alturaBebida = alturaBebida;
	}
	
	public double getDiametroBebida() {
		return diametroBebida;
	}
	public void setDiametroBebida(double diametroBebida) {
		this.diametroBebida = diametroBebida;
	}
	public double getVolumeBebida() {
		return volumeBebida;
	}
	
	
	public void setVolumeBebida(double volumeBebida) {
		this.volumeBebida = volumeBebida;
	}
    
    
}
