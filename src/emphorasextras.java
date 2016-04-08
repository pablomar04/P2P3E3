
public class emphorasextras extends empleado{
	
	private static final int valorHora = 68;
	public double fijo=1000;
	public int horastrabajadas=0;
	
	
	public emphorasextras(String nombre, String apellido) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
	}
	
	public emphorasextras(String nombre, String apellido, double fijo, int horas) {
		super(nombre, apellido);
		this.horastrabajadas=horas;
		this.fijo=fijo;
		// TODO Auto-generated constructor stub
	}
	
	public double getFijo() {
		return fijo;
	}

	public void setFijo(double fijo) {
		this.fijo = fijo;
	}

	public int getHorastrabajadas() {
		return horastrabajadas;
	}

	public void setHorastrabajadas(int horastrabajadas) {
		this.horastrabajadas = horastrabajadas;
	}

	public void calcularSueldo(){
		
		
		this.sueldo= (this.fijo+(this.horastrabajadas*valorHora));
		
	}
	
	

}
