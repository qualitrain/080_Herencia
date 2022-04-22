package qtx.componentes;
/*
   Esta clase es usada por la clase 'PC'.
*/
public class DiscoDuro {
	private String marca;
	private String modelo;

	private String capacidad;

	public DiscoDuro(String marca, String modelo, String capacidad) {
		this.marca = marca;
		this.modelo = modelo;

		this.capacidad = capacidad;
	}

	public void desplegarCaracteristicas() {
		System.out.println("--------------------");
		System.out.println("DISCO DURO:");
		System.out.println("   Marca     : " + this.marca);
		System.out.println("   Modelo    : " + this.modelo);
		System.out.println("   Capacidad : " + this.capacidad);
		System.out.println("--------------------");
	}

	public String leerImagen(String nombreImagen) {
		String imagen = new String();

		System.out.println("Leyendo imagen [" + nombreImagen + "]");

		for (int i = 0; i < nombreImagen.length(); i++) {
			imagen = imagen + "*";
		}
		return imagen;
	}
}

