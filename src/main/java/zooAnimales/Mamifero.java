package zooAnimales;
import java.util.*;

import gestion.Zona;


public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos = 0;
	public static int leones = 0;
	private boolean pelaje;
	private int patas;
	
	// constructores
	
	
	public Mamifero() {
		totalAnimales ++;
		listado.add(this);
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona,
			boolean pelaje, int patas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.pelaje = pelaje;
		this.patas = patas;
		Animal.totalAnimales ++;
		listado.add(this);
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		Animal.totalAnimales ++;
		listado.add(this);
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.pelaje = pelaje;
		this.patas = patas;
	}

	// Getters and Setter
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public Zona getZona() {
		return this.zona;
	}

	public boolean isPelaje() {
		return pelaje;
	}
	
	public boolean getPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public static ArrayList<Mamifero> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}

	public static int getCaballos() {
		return caballos;
	}

	public static void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}

	public static int getLeones() {
		return leones;
	}

	public static void setLeones(int leones) {
		Mamifero.leones = leones;
	}
	
	// mmetodos
	
	public static int cantidadMamiferos() {
		return Mamifero.listado.size();
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		Mamifero nuevoM = new Mamifero(nombre, edad, "pradera", genero, true, 4);
		caballos++;
		return nuevoM;
	}
	
	public static Mamifero crearLeon(String nombre, int edad, 
			String genero) {
		Mamifero nuevoM = new Mamifero(nombre, edad, "selva", genero, true, 4);
		leones++;
		return nuevoM;
	}
}
	
	
