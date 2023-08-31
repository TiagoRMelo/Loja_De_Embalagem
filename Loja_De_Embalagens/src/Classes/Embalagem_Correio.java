package Classes;

public class Embalagem_Correio {
	private String codigoCorreio;
	private double alturaCorreio;
	private double comprimentoCorreio;
	private double larguraCorreio;
    private double volumeCorreio;
	
   public Embalagem_Correio(String codigoCorreio, double alturaCorreio, double comprimentoCorreio,double larguraCorreio, double volumeCorreio) {
	
		this.codigoCorreio = codigoCorreio;
		this.alturaCorreio = alturaCorreio;
		this.comprimentoCorreio = comprimentoCorreio;
		this.larguraCorreio = larguraCorreio;
		this.volumeCorreio = volumeCorreio;
	}
	public String getCodigoCorreio() {
		return codigoCorreio;
	}
	public void setCodigoCorreio(String codigoCorreio) {
		this.codigoCorreio = codigoCorreio;
	}
	public double getAlturaCorreio() {
		return alturaCorreio;
	}
	public void setAlturaCorreio(double alturaCorreio) {
		this.alturaCorreio = alturaCorreio;
	}
	public double getComprimentoCorreio() {
		return comprimentoCorreio;
	}
	public void setComprimentoCorreio(double comprimentoCorreio) {
		this.comprimentoCorreio = comprimentoCorreio;
	}
	public double getLarguraCorreio() {
		return larguraCorreio;
	}
	public void setLarguraCorreio(double larguraCorreio) {
		this.larguraCorreio = larguraCorreio;
	}
	public double getVolumeCorreio() {
		return volumeCorreio;
	}
	public void setVolumeCorreio(double volumeCorreio) {
		this.volumeCorreio = volumeCorreio;
	}
    
    
}
