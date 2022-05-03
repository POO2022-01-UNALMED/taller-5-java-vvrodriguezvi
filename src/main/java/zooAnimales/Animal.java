package zooAnimales;

import gestion.*;

public class Animal {
	protected static int totalAnimales  = 0;
	protected String nombre;
	protected int edad;
	protected String habitat;
	protected String genero;
	protected Zona zona;
	
	// Constructores
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		Animal.totalAnimales ++;
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}


	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona zona) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		Animal.totalAnimales ++;
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}

	public Animal() {
		Animal.totalAnimales ++;
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	
//getters and Setters

	public static int getTotalAnimales() {
		return totalAnimales;
	}


	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
		}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getHabitat() {
		return habitat;
	}


	public void setHabitad(String habitat) {
		this.habitat = habitat;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Zona getZona() {
		return zona;
	}


	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
// Metodos
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
				"Aves: " + Ave.cantidadAves() + "\n" +
				"Reptiles: " + Reptil.cantidadReptiles() + "\n" +
				"Peces: " + Pez.cantidadPeces() + "\n" +
				"Anfibios: " + Anfibio.cantidadAnfibios();
	}
	
	public String toString() {
		if(this.zona != null) {
			return "Mi nombre es "+ this.nombre +", tengo una edad de "+ this.edad +", habito en "
					+ this.habitat +" y mi genero es "+ this.genero +", la zona en la que me ubico es "
					+ this.zona.getNombre() +", en el "+ this.zona.getZoo().getNombre();
		}
		else {
			return "Mi nombre es "+ this.nombre +", tengo una edad de "+ this.edad +", habito en "
					+ this.habitat +" y mi genero es "+ this.genero;
		}
	}

	
	
}
