import java.util.ArrayList;

public class Enfermera extends Persona {

    public ArrayList<idEnfermera> idEnfermera = new ArrayList<>();
    public ArrayList<TurnoEnfermera> turnos = new ArrayList<>();

    public Enfermera() {}

    public Enfermera(int idPersona, String nombre, int edad) {
        super(idPersona, nombre, edad);
    }
}
