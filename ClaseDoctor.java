import java.util.ArrayList;

public class Doctor extends Persona {

    private String especialidad;
    private int idDoctor;
    private int persona_id;

    public ArrayList<TurnoDoctor> turnos = new ArrayList<>();
    public ArrayList<Cita> citas = new ArrayList<>();

    public Doctor() {}

    public Doctor(int idPersona, String nombre, int edad, String especialidad) {
        super(idPersona, nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
}
