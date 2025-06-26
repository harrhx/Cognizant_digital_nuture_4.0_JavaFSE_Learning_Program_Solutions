package demo; // Assuming your package is 'demo' based on your groupId and artifactId

// Import the correct JUnit 5 Test annotation
import org.junit.jupiter.api.Test;
// Import JUnit 5 assertions
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test // This is the JUnit 5 annotation
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testApp() {
        App app = new App(); // Assuming you have an App class in src/main/java/demo/App.java
        String message = app.getGreeting(); // Assuming App has a method like getGreeting()
        assertEquals("Hello World!", message);
    }
}

// Example App.java (if you don't have one, create it in src/main/java/demo/App.java)
/*
package demo;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
*/
