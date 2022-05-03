package gestion;
import java.util.*;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	
	public Zona(String nombre, Zoologico zoo, ArrayList<Animal> animales) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}

	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}

	public Zona() {
	}
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Zoologico getZoo() {
		return zoo;
	}

	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}

	public ArrayList<Animal> getAnimales() {
		return animales;
	}
	
	public ArrayList<Animal> getAnimal() {
		return animales;
	}

	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
// Los  dos metodos que estan en el uml
	
	public void agregarAnimales(Animal nuevoAnimal) {
		animales.add(nuevoAnimal);
		nuevoAnimal.setZona(this);
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
}
