package ciudad;

public class Persona {

	protected String nombre;
	protected String dni;
	
	public Persona(){
		
	}
	
	public Persona(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public void comer(){
		System.out.println("Estoy comiendo");
	}
	
	public void mostrarInfo(){
		System.out.println(this.nombre + " : " + this.dni);
	}
	
	
}
