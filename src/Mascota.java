public class Mascota {

    // Atributos
    private String nombre;
    private String especie;
    private int edad;

    // Métodos
    // Constructor
    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Equals
    public boolean equals(Mascota mascota) {

        if (mascota == null) {
            return false;
        }

        return nombre.equals(mascota.getNombre())
                && especie.equals(mascota.getEspecie())
                && edad == mascota.getEdad();
    }

    // ToString
    public String toString() {

        return "Mascota:"
                + "\nNombre: " + nombre
                + "\nEspecie: " + especie
                + "\nEdad: " + edad;
    }
}