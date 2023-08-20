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
        return asientos.length;
    }

    public String verificarIntegridad() {
        if (this.registro == this.motor.registro) {
            for (Asiento asiento : asientos) {
                if (this.registro != asiento.registro) {
                    return ("Las piezas no son originales");
                }
            }
            return ("Auto original");
        } else {
            return ("Las piezas no son originales");
        }

    }
}
