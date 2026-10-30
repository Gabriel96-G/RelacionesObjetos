
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Persona persona = new Persona(
                "Romario",
                "Salas Cerdas",
                null,
                null
        );

        MaquinaSoldar maquinaSoldar = new MaquinaSoldar(
                "EAC",
                "EAC-X1045",
                450,
                3
        );

        maquinaSoldar.definirMetales();

        persona.soldar(maquinaSoldar, null);
    }
}
