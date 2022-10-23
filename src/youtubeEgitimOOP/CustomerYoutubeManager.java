package youtubeEgitimOOP;

public class CustomerYoutubeManager {
    private CustomerYoutube cm;
    public CustomerYoutubeManager(CustomerYoutube cm){
        this.cm = cm;
    }
    public void add( ) {
        System.out.println(cm.getFirstName()+" added");
    }
}
