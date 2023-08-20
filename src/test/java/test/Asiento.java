package test;

public class Asiento {
	public String color;
    public int precio;
    public int registro;
   
    public void cambiarColor(String color){
        switch(color){
            case "rojo" -> this.color=color;
            case "verde" -> this.color=color;
            case "amarillo" -> this.color=color;
            case "negro" -> this.color=color;
            case "blanco" -> this.color=color;
                     
            
        }
    }
}
