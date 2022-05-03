package zooAnimales;
import java.util.*;
import gestion.Zona;

public class Pez extends Animal {
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones = 0;
	public static int bacalaos = 0;
	private String colorEscamas;
	private int cantidadAletas;
	
	// Contructores
	
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas, int cantidadAletas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		totalAnimales ++;
		listado.add(this);
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		totalAnimales ++;
		listado.add(this);
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	public Pez() {
		totalAnimales ++;
		listado.add(this);
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	
	// Getters y Setters
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public Zona getZona() {
		return this.zona;
	}

	public static ArrayList<Pez> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}

	public static int getSalmones() {
		return salmones;
	}

	public static void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}

	public static int getBacalaos() {
		return bacalaos;
	}

	public static void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	// 	Metodos
	
	public static int cantidadPeces() {
		return Pez.listado.size();
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		Pez nuevoP = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
		salmones++;
		return nuevoP;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		Pez nuevoP = new Pez(nombre, edad, "oceano", genero, "gris", 6);
		bacalaos++;
		return nuevoP;
	}
	
	public String movimiento() {
		return "nadar";
	}
	
}
