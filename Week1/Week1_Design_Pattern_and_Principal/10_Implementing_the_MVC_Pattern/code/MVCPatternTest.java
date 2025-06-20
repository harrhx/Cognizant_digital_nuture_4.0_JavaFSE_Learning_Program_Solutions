
public class MVCPatternTest {
    public static void main(String[] args) {

        Student model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();


        StudentController controller = new StudentController(model, view);

        System.out.println("--- Displaying Initial Data ---");
        controller.updateView();


        System.out.println("\n--- Updating student's grade ---");
        controller.setStudentGrade("A+");

        System.out.println("\n--- Displaying Updated Data ---");
        controller.updateView();
    }


    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("John Doe");
        student.setId("S12345");
        student.setGrade("B-");
        return student;
    }
}
