import java.util.ArrayList;

public class Paciente extends Persona {

    public ArrayList<Cita> citas = new ArrayList<>();
    public ArrayList<Prescripcion> prescripciones = new ArrayList<>();
    public ArrayList<PacienteHabitacion> habitacionesAsignadas = new ArrayList<>();
    public ArrayList<HistoriaClinica> historial = new ArrayList<>();

    public Paciente() {}

    public Paciente(int idPersona, String nombre, int edad) {
        super(idPersona, nombre, edad);
    }
}
