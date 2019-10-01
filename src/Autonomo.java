
public class Autonomo extends Trabajador {

    public Autonomo(String nombre, String apellido, String dni, int sueldo) {
        super(nombre, apellido, dni, sueldo);
        calcularSueldo();
    }

    @Override
    public void calcularSueldo() {
        sueldoMes = sueldo / 12;
    }
}
