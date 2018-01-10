
public class Coche extends Vehiculo{
	

	private String marca;
	
	Coche(){
		
	}
	
	Coche (String marca){
		super();
		this.marca = marca;
	}
	
	Coche (boolean enMarcha, String marca){
		super();
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
