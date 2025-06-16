/**
 * Test class to demonstrate the MVC Pattern.
 */
public class MVCPatternTest {
    public static void main(String[] args) {
        // Fetch student record from a "database" (we'll create a dummy one)
        Student model = retrieveStudentFromDatabase();

        // Create a view to write student details on console
        StudentView view = new StudentView();

        // Create a controller to manage the model and view
        StudentController controller = new StudentController(model, view);

        System.out.println("--- Displaying Initial Data ---");
        controller.updateView();

        // Update model data using the controller
        System.out.println("\n--- Updating student's grade ---");
        controller.setStudentGrade("A+");

        System.out.println("\n--- Displaying Updated Data ---");
        controller.updateView();
    }

    /**
     * A mock method to retrieve a student record.
     * In a real application, this would fetch data from a database.
     * @return A sample Student object.
     */
    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("John Doe");
        student.setId("S12345");
        student.setGrade("B-");
        return student;
    }
}
