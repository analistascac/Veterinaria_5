package datos;

import java.util.ArrayList;

public final class Especies {

	// Los siguientes arraylist establecen las especies
	private ArrayList<String> especies;
	private ArrayList<String> nombresVulgares;

	public Especies() {

		especies = new ArrayList<String>();
		nombresVulgares = new ArrayList<String>();

		// El siguiente orden del arraylisto no debe ser modificado
		// el id de cada especie es la posicion del arreglo, por lo tanto
		// el orden de los items establece el id de cada especie

		especies.add("Canis familiaris");
		especies.add("Felis silvestris catus");
		especies.add("Oryctolagus cuniculus");
		especies.add("Mus musculus");
		especies.add("Pisces");

		// El siguiente orden del arraylisto no debe ser modificado
		// el id de cada especie es la posicion del arreglo

		nombresVulgares.add("Perro");
		nombresVulgares.add("Gato");
		nombresVulgares.add("Conejo");
		nombresVulgares.add("Raton");
		nombresVulgares.add("Pez");
	}

	public ArrayList<String> getEspecies() {
		return especies;
	}

	public ArrayList<String> getNombresVulgares() {
		return nombresVulgares;
	}

}
