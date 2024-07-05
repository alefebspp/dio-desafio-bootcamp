public interface IContent {

    String getTitle();
    int getDuration();
    String getDetails();
    int calculateTotalHours();
    void printSummary();
}
