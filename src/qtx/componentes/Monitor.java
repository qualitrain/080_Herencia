package qtx.componentes;
/*
   Esta clase es usada por la clase 'PC'.
*/

public class Monitor {
	private String marca;
	private String modelo;

	public Monitor(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public void desplegarCaracteristicas() {
		System.out.println("--------------------");
		System.out.println("MONITOR:");
		System.out.println("   Marca     : " + this.marca);
		System.out.println("   Modelo    : " + this.modelo);
		System.out.println("--------------------");
	}

	public void desplegar(String imagen) {
		System.out.println("Desplegando imagen...\n");
		System.out.println(imagen);
		System.out.println("");
	}
}
