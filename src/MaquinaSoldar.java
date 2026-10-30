import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.management.AttributeNotFoundException;

public class MaquinaSoldar {

    private String marca;
    private String modelo;
    private int potencia;
    private String[] metales;

    // Para leer desde consola
    private BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    // Constructor usando arreglo ya definido
    public MaquinaSoldar(String marca, String modelo, int potencia, String[] metales) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metales = metales;
    }

    // Constructor usando cantidad de metales
    public MaquinaSoldar(String marca, String modelo, int potencia, int cantidadMetales) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metales = new String[cantidadMetales];
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String[] getMetales() {
        return metales;
    }

    public void setMetales(String[] metales) {
        this.metales = metales;
    }

    public void definirMetales() throws IOException {
        for (int i = 0; i < metales.length; i++) {
            System.out.print("Ingrese el metal " + (i + 1) + ": ");
            metales[i] = entrada.readLine();
        }
    }

    public void soldar(String metal) throws AttributeNotFoundException {

        if (metal == null) {
            throw new IllegalArgumentException("Argumento nulo.");
        }

        if (metales == null) {
            throw new AttributeNotFoundException("No se ha definido los metales.");
        }

        for (int i = 0; i < metales.length; i++) {
            if (metales[i] != null && metales[i].equalsIgnoreCase(metal)) {
                System.out.println("La " + marca + " " + modelo + " solda el " + metal + ".\n");
                return;
            }
        }

        System.out.println("La " + marca + " " + modelo + " no puede soldar " + metal + ".\n");
    }
}