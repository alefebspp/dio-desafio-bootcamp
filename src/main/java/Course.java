import java.util.List;

public class Course extends Content{
    private Syllabus syllabus = null;
    private String instructorName = null;

    public Course(String title, int duration) {
        super(title, duration);
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void removeSyllabusContent(String title){
        if(this.syllabus != null){
            this.syllabus.removeClassByTitle(title);
        }
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Syllabus getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(Syllabus syllabus) {
        this.syllabus = syllabus;

        int totalHours = calculateTotalHours();
        this.setDuration(this.getDuration() + totalHours);
    }

    @Override
    public String getDetails() {
        return "Title: ".concat(this.getTitle()) + " , Duration: " + this.getDuration();
    }

    @Override
    public  int calculateTotalHours(){
        if(syllabus != null){
            List<Content> syllabusContent = this.syllabus.getClasses();
            int syllabusTotalHours = syllabusContent.stream().map(Content::getDuration).reduce(0,Integer::sum);
            return syllabusTotalHours;
        };

        return this.getDuration();
    };

    @Override
    public void printSummary() {
        System.out.println(this.getDetails());
        System.out.println("Total hours: " + this.calculateTotalHours());
        if(!this.instructorName.isEmpty()){
            System.out.println("Course instructor: " + this.instructorName);
        }
        if(this.syllabus != null){
            System.out.println("Course syllabus:");
            this.syllabus.getClasses().forEach(content -> {
                System.out.println(content.getDetails());
            });
        }
    }
}
