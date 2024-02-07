//Ovverriding the TV interfaces methods


public class generalTV implements TV{
    private boolean powerOn;
    private int vol;
    private int cha;

    @Override
    public boolean isEnabled(){
        return powerOn;
    }
    @Override
    public void enable(){
        powerOn=true;
        System.out.println("General TV is ON");
    }
    @Override
    public void disable(){
        powerOn=false;
        System.out.println("General TV is OFF");
    }
    @Override
    public int getVolume(){
        return vol;
    }
    @Override
    public int getChannel(){
        return cha;
    }
    @Override
    public void setVolume(int vol){
        this.vol=vol;
        System.out.println("Volume="+vol);
    }
    @Override
    public void setChannel(int cha){
        this.cha=cha;
        System.out.println("Channel="+cha);
    }
}
