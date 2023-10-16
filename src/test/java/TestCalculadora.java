
import com.mycompany.ejcalculadora.Entidad.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculadora {

    public TestCalculadora() {
    }
    Calculadora c;

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        c = new Calculadora();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void sumar() {
        assertEquals(15, c.sumar(10, 5));
    }
    
    @Test
    public void restar() {
        assertEquals(7, c.restar(12, 5));
    }
    
    @Test
    public void multiplicar() {
        assertEquals(15, c.multiplicar(3, 5));
    }
    
    @Test
    public void dividir() {
        assertEquals(5, c.dividir(10, 2));
    }
}
