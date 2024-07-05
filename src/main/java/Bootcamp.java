import java.util.ArrayList;
import java.util.List;

public class Bootcamp extends Content {
    private List<Course> courses;

    public Bootcamp(String title, int duration){
        super(title, duration);
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course){
        this.courses.add(course);
        this.setDuration(this.getDuration() + course.getDuration());
    }

    public void removeCourseByTitle(String title){
        this.courses.removeIf(course -> course.getTitle().equals(title));
    }

    @Override
    public String getDetails() {
        return "Title: ".concat(this.getTitle()) + " , Duration: " + this.getDuration();
    }

    @Override
    public int calculateTotalHours() {
        return this.courses.stream().map(Content::getDuration).reduce(0, Integer::sum);
    }

    @Override
    public void printSummary() {

        System.out.println("=== Bootcamp " + this.getTitle() + " courses ===");
        if(this.courses.isEmpty()){
            System.out.println("Boot camp have no courses");
        }else {
            this.courses.forEach(Course::printSummary);
        }
    }
}
