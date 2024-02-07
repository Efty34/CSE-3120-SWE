public class basicRemote implements remote{
    private TV tv;

    /*
        Here we created an object of TV interface. TV and Remote are not same type interface, but we have to use remote to operate the tv.
        That's why here we used the ADAPTER design pattern. Now we can use the remote to access tv and operate it.
    */

    public basicRemote(TV tv){
        this.tv=tv;
    }
    @Override
    public void togglePower(){
        if (tv.isEnabled()){
            tv.disable();
        } else {
            tv.enable();
        }
    }
    @Override
    public void volumeUp(){
        int curVol=tv.getVolume();
        tv.setVolume(curVol+1);
        System.out.println("Volume increased="+(curVol+1));
    }
    @Override
    public void volumeDown(){
        int curVol = tv.getVolume();
        tv.setVolume(curVol-1);
        System.out.println("Volume decreased="+(curVol-1));
    }
    @Override
    public void channelUp(){
        int curCha=tv.getChannel();
        tv.setChannel(curCha+1);
        System.out.println("Channel increased="+(curCha+1));
    }
    @Override
    public void channelDown(){
        int curCha=tv.getChannel();
        tv.setChannel(curCha-1);
        System.out.println("Channel decreased="+(curCha-1));
    }

}
