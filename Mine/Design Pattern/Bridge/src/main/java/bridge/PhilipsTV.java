package bridge;

public class PhilipsTV extends TV {

    Remote remotetype;
    PhilipsTV(Remote remotetype){
        super(remotetype);
        this.remotetype=remotetype;
    }

    public void on(){
        System.out.println("Philips TV ON: ");
        remotetype.on();
    }

    public void off(){
        System.out.println("Philips TV OFF: ");
        remotetype.off();
    }
}
