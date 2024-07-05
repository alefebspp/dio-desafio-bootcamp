import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Syllabus {
    private List<Content> classes;

    public Syllabus(){
        this.classes = new ArrayList<>();
    }

    public List<Content> getClasses() {
        return classes;
    }

    public void insertClass(Content syllabusClass){
        this.classes.add(syllabusClass);
    }

    public void removeClassByTitle(String title){
       this.classes.removeIf(content -> content.getTitle().equals(title));
    }

    public void listClasses(){
        this.classes.forEach(content -> System.out.println(content.getDetails()));
    }
}
