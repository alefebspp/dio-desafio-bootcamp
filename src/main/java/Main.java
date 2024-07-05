public class Main {

    public static void main(String[] args) {
        Syllabus reactClasses = new Syllabus();

        reactClasses.insertClass(new Course("OOP vs Functional components", 10));
        reactClasses.insertClass(new Course("Props and states", 10));
        reactClasses.insertClass(new Course("Context and conditional rendering", 10));
        reactClasses.insertClass(new Course("Tests", 10));

        Course reactFundamentals = new Course("React Fundamentals", 0);


        reactFundamentals.setSyllabus(reactClasses);
        reactFundamentals.removeSyllabusContent("Tests");
        reactFundamentals.setInstructorName("Diego Fernandes");

        Bootcamp reactBootcamp = new Bootcamp("React Bootcamp", 0);

        reactBootcamp.addCourse(reactFundamentals);
        reactBootcamp.printSummary();

        reactBootcamp.removeCourseByTitle("React Fundamentals");
        System.out.println("===    ====");
        reactBootcamp.printSummary();
    }
}
