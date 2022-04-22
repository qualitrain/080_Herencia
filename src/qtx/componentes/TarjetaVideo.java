package qtx.componentes;
/*
   Esta clase es usada por la clase 'PC'.
*/

public class TarjetaVideo {

	private String marca;
	private String modelo;
	private String memoria;

	public TarjetaVideo(String marca, String modelo, String memoria) {
		this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
	}

	public void desplegarCaracteristicas() {
		System.out.println("--------------------");
		System.out.println("TARJETA DE VIDEO:");
		System.out.println("   Marca     : " + this.marca);
		System.out.println("   Modelo    : " + this.modelo);
		System.out.println("   Memoria   : " + this.memoria);
		System.out.println("--------------------");
	}

	public void procesarImagen(String imagen, Monitor monitor) {
		System.out.println("Procesando imagen...");
		monitor.desplegar("imagen" + imagen + "imagen");
	}
}
