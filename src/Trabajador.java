
public abstract class Trabajador {
    String nombre, apellido, dni;
    int sueldo, sueldoMes;

    public Trabajador(String nombre, String apellido, String dni, int sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldo = sueldo;
    }

    public abstract void calcularSueldo();

    public void mostrarDatos(){
        System.out.printf("Nombre: %s\n", nombre);
        System.out.printf("Apellido: %s\n", apellido);
        System.out.printf("Dni: %s\n", dni);
        System.out.printf("Sueldo: %d\n", sueldo);
        System.out.printf("Sueldo Mes: %d\n",sueldoMes);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getSueldoMes() {
        return sueldoMes;
    }

    public void setSueldoMes(int sueldoMes) {
        this.sueldoMes = sueldoMes;
    }
}
