import java.util.Enumeration;
import java.util.Hashtable;

public class Empresa {
    Hashtable<String,Trabajador> listaTrabajadores;
    public Empresa(){
        listaTrabajadores = new Hashtable();
    }

    public void agregarTrabajador(Trabajador trabajador){
        listaTrabajadores.put(trabajador.getDni(),trabajador);
    }
    public void listarTrabajadores(){
        Enumeration<Trabajador> elementos = listaTrabajadores.elements();
        while (elementos.hasMoreElements()) {
            Trabajador t = elementos.nextElement();
            System.out.printf("- %s %s\n", t.getNombre(), t.getApellido());
        }
    }
    public boolean estaTrabajador(String dni) {
        return listaTrabajadores.containsKey(dni);
    }
    public void mostrarTrabajador() {
        Enumeration<Trabajador> datos = listaTrabajadores.elements();
        while (datos.hasMoreElements()) {
            Trabajador d = datos.nextElement();
            System.out.printf("NOMBRE: %s\n",d.getNombre());
            System.out.printf("APELLIDO: %s\n",d.getNombre());
            System.out.printf("DNI: %s\n",d.getDni());
            System.out.printf("SUELDO: %s\n",d.getSueldo());
            System.out.printf("Nº DE PAGAS: %s\n",d.getNombre());
        }
    }
    public Hashtable<String, Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }
}
