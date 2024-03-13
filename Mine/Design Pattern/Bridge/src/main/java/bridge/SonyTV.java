package bridge;

public class SonyTV extends TV {
    Remote remotetype;
    SonyTV(Remote remotetype){
        super(remotetype);
        this.remotetype=remotetype;
    }

    public void on(){
        System.out.println("Sony TV ON: ");
        remotetype.on();
    }

    public void off(){
        System.out.println("Sony TV OFF: ");
        remotetype.off();
    }
}
