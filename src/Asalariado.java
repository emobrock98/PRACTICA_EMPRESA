
public class Asalariado extends Trabajador {

    int pagas;

    public Asalariado(String nombre, String apellido, String dni, int sueldo, int pagas) {
        super(nombre, apellido, dni, sueldo);
        this.pagas = pagas;
        calcularSueldo();
    }

    @Override
    public void calcularSueldo() {
        this.sueldoMes = this.sueldo / this.pagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Pagas del mes %5.2f",pagas);
    }
}
