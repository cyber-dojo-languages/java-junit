// The test half of the workload the AOT caches are recorded from. It passes,
// because a JVM writes a cache when it exits of its own accord and a green run
// is the simplest way to be sure of that.
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GreeterTest {

    @Test
    public void answers_its_greeting() {
        assertEquals("hello", new Greeter().greeting());
    }
}
