package bridge;

public class NewRemote implements Remote {
    @Override
    public void on(){
        System.out.println("On with New Remote");
    }
    @Override
    public void off(){
        System.out.println("Off with New Remote");
    }
}
