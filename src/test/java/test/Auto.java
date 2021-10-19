package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento asientos[];
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	
	public int cantidadAsientos() {
		int cantidad = 0;
		for (int i=0; i<this.asientos.length; i++) {
			if(this.asientos[i] instanceof Asiento)
				cantidad ++;
		
		}
		return cantidad;
	}
	
	public String verificarIntegridad() {
		String mensaje = "Auto original";
		
		if (this.motor.registro == this.registro) {
		
			for (int i=0; i<this.asientos.length; i++) {
				if(asientos[i] instanceof Asiento) {
					if (asientos[i].registro!=registro) 
						mensaje = "Las piezas no son originales";
				}
			}	
						
		}
		
		else
			mensaje = "Las piezas no son originales";
		
		return mensaje;
		
	}
	

}
