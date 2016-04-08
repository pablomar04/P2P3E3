
public class empcomision extends empleado{
	
	public static int comision=5;
	public double fijo=1000;
	public int ventasRealizadas=0;
	
	public empcomision(String nombre, String apellido) {
		super(nombre, apellido);
		
	}
	
	public empcomision(String nombre, String apellido, double fijo, int ventas) {
		super(nombre, apellido);
		this.fijo=fijo;
		this.ventasRealizadas=ventas;
		
	}

	public double getFijo() {
		return fijo;
	}

	public void setFijo(double fijo) {
		this.fijo = fijo;
	}

	public int getVentasRealizadas() {
		return ventasRealizadas;
	}

	public void setVentasRealizadas(int ventasRealizadas) {
		this.ventasRealizadas = ventasRealizadas;
	}
	
	public void calcularSueldo(){
		
		this.sueldo=(this.fijo+(comision*this.ventasRealizadas));
	}
	
	
	

}
