import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    public static CalculadoraV3 calculadora;

    @BeforeAll
    public static void conﬁguracionInicial() {
        calculadora = new CalculadoraV3();
    }

    @Test
    void sumar() {
        calculadora.suma(4,2);
    }

}