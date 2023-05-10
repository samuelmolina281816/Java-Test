package pruebas;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Empleado {
	// Props
	private String nombre;
	private String apellido;
	private int edad;
	private double sueldo;
	// methods
	public Empleado(String nombre, String apellido, int edad, double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	
	public void imprimirInfo() {
		out.println(this.nombre + " " + this.apellido+ " "+ this.edad+ " "+this.sueldo);
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}
	
	public static void main(String[] args) {
		//creamos  una lista de Empleados
		List<Empleado> Empleados = new ArrayList<>();
		//scanner input funciona como entrada de datos;
		Scanner input = new Scanner(System.in);
		Empleado Jorge = new Empleado("Jorgito","Valenzuela",25,1500);
		Jorge.imprimirInfo();
		Empleados.add(new Empleado("Juanito","alimaña",35,2500));
		Empleados.add(new Empleado("Hanna","Perez",52,2500));
		Empleados.add(new Empleado("Yesibelle","Pantoja",36,2500));
		Empleados.add(new Empleado("Marilyn","Berru",24,2500));
		for (Empleado empleado : Empleados) {
			empleado.imprimirInfo();
		}
		
		out.println("Ingrese un nombre: ");
		String nombre = input.nextLine();
		Jorge.setNombre(nombre);
		out.println("Ingrese un apellido: ");
		String apellido = input.nextLine();
		Jorge.setApellido(apellido);
		out.println("Ingrese una Edad: ");
		int edad = input.nextInt();
		Jorge.setEdad(edad);		
		out.println("Ingrese una Sueldo: ");
		double sueldo = input.nextDouble();
		Jorge.setSueldo(sueldo);
		
		
		input.close();
		Jorge.imprimirInfo();
	}
}


