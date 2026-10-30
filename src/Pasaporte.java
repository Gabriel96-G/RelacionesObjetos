import java.time.LocalDate;

public class Pasaporte {

    // Atributos
    private String numero;
    private String nacionalidad;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private boolean estaVigente;

    // Métodos
    // Constructor
    public Pasaporte(String numero,
                     String nacionalidad,
                     LocalDate fechaEmision,
                     LocalDate fechaVencimiento,
                     boolean estaVigente) {

        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.estaVigente = estaVigente;
    }

    // Getters
    public String getNumero() {
        return numero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public boolean isEstaVigente() {
        return estaVigente;
    }

    // Setters
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setEstaVigente(boolean estaVigente) {
        this.estaVigente = estaVigente;
    }

    // Equals
    public boolean equals(Pasaporte pasaporte) {

        if (pasaporte == null) {
            return false;
        }

        return numero.equals(pasaporte.getNumero())
                && nacionalidad.equals(pasaporte.getNacionalidad())
                && fechaEmision.equals(pasaporte.getFechaEmision())
                && fechaVencimiento.equals(pasaporte.getFechaVencimiento())
                && estaVigente == pasaporte.isEstaVigente();
    }

    // ToString
    public String toString() {

        return "Pasaporte:"
                + "\nNúmero: " + numero
                + "\nNacionalidad: " + nacionalidad
                + "\nFecha de emisión: " + fechaEmision
                + "\nFecha de vencimiento: " + fechaVencimiento
                + "\nEstá vigente: " + estaVigente;
    }
}