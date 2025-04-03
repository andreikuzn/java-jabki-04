import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MainTest {

    @Test
    void hello() {
        String name = "Котик";
        Assertions.assertEquals("Hello " + name, Main.hello(name));
    }

    @Test
    void multiply() {
        int a = 2, b = 3;
        Assertions.assertEquals(a * b, Main.multiply(a, b));
    }
}