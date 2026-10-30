import java.time.LocalDate;
import javax.management.AttributeNotFoundException;

public class Persona {

    private String nombre;
    private String apellido;
    private Pasaporte pasaporte;
    private Mascota mascota;

    public Persona(String nombre, String apellido, Pasaporte pasaporte, Mascota mascota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pasaporte = null;
        this.mascota = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public void setApellidos(String apellidos) {
        this.apellido = apellidos;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void sacarPasaporte(String numero,
                               String nacionalidad,
                               LocalDate fechaEmision,
                               LocalDate fechaVencimiento,
                               boolean estaVigente) {

        this.pasaporte = new Pasaporte(
                numero,
                nacionalidad,
                fechaEmision,
                fechaVencimiento,
                estaVigente
        );
    }

    public void tomarVuelo(String pais) {

        if (pasaporte != null && pasaporte.isEstaVigente()) {

            System.out.println(
                    nombre + " "
                            + apellido
                            + " toma un vuelo a "
                            + pais + "."
            );

        } else {

            System.out.println(
                    nombre + " "
                            + apellido
                            + " no puede tomar el vuelo, ya que su pasaporte no está vigente."
            );
        }
    }

    public void adoptarMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void jugar() {

        if (mascota != null) {

            System.out.println(
                    nombre + " "
                            + apellido
                            + " juega con "
                            + mascota.getNombre() + "."
            );

        } else {

            System.out.println(
                    nombre + " "
                            + apellido
                            + " no tiene una mascota con quien jugar."
            );
        }
    }

    public void soldar(MaquinaSoldar maquinaSoldar, String metal) {

        if (maquinaSoldar == null) {
            throw new IllegalArgumentException("La máquina de soldar es nula.");
        }

        System.out.println(nombre + " " + apellido + " hace una soldadura.");

        try {
            maquinaSoldar.soldar(metal);
        } catch (AttributeNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}