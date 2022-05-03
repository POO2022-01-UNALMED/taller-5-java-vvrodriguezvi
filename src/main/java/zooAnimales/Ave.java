package zooAnimales;
import java.util.*;
import gestion.Zona;

public class Ave extends Animal {
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones = 0;
	public static int aguilas = 0;
	private String colorPlumas;
	
	// Contructores 
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		this.colorPlumas = colorPlumas;
		Animal.totalAnimales ++;
		listado.add(this);
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.colorPlumas = colorPlumas;
		Animal.totalAnimales ++;
		listado.add(this);
		if(this.zona != null) {
			this.zona.agregarAnimales(this);
		}
	}
	public Ave() {
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

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	public static ArrayList<Ave> getListado() {
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado) {
		Ave.listado = listado;
	}

	public static int getHalcones() {
		return halcones;
	}

	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}

	public static int getAguilas() {
		return aguilas;
	}

	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}
	

	// Metodos
	
	public static int cantidadAves() {
		return Ave.listado.size();
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave nuevaA = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
		halcones++;
		return nuevaA;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave nuevaA = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
		aguilas++;
		return nuevaA;
	}
	
	public String movimiento() {
		return "volar";
	}
	
}