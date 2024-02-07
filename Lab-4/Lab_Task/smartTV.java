//Ovverriding the TV interfaces methods


public class smartTV implements TV{
    private boolean poweron;
    private int vol;
    private int cha;

    @Override
    public boolean isEnabled(){
        return poweron;
    }
    @Override
    public void enable(){
        poweron=true;
        System.out.println("Smart TV is ON");
    }
    @Override
    public void disable(){
        poweron=false;
        System.out.println("Smart TV is OFF");
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
    public void setChannel(int cha) {
        this.cha=cha;
        System.out.println("Channel="+cha);
    }
    // Additional Method Youtube
    public void youTube(){
        System.out.println("Access YT with Smart TV");
    }
}
