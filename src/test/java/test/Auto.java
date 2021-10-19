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
			if(this.asientos[i]!=null)
				cantidad ++;
		
		}
		return cantidad;
	}
	
	public String verificarIntegridad() {
		String mensaje = "";
		int asientos = this.asientos[0].registro;
		int motorAuto = 0;
		
		if (this.motor.registro == this.registro) {
			motorAuto = this.registro;
		}
	
		for (int i=0; i<this.asientos.length; i++) {
			if(this.asientos[i]==null)
				break;
			else {
				if(asientos != this.asientos[i].registro) {
					asientos = -1;
					break;
				}
			}			
		}
		
		if (asientos == motorAuto)
			mensaje = "Auto original";
		else
			mensaje = "Las piezas no son originales";
		
		return mensaje;
	}
	

}
