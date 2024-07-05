import java.util.List;

public abstract class Content implements IContent {
    private String title;
    private int duration;

    public  Content(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String getTitle(){
        return this.title;
    };

    @Override
    public int getDuration(){
        return this.duration;
    };

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public abstract String getDetails();

    @Override
    public abstract int calculateTotalHours();

    @Override
    public abstract void printSummary();
}
