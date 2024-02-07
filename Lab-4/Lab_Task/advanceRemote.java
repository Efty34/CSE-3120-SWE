public class advanceRemote implements smartRemote{
    private TV tv;

    /*
        Adapter Design Pattern is used 
    */

    public advanceRemote(TV tv){
        this.tv=tv;
    }
    @Override
    public void togglePower(){
        if (tv.isEnabled()){
            tv.disable();
        } else{
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
        int curVol=tv.getVolume();
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
    @Override
    public void showYoutube(){
        if(tv instanceof smartTV){
            ((smartTV) tv).youTube();
        } else{
            System.out.println("Youtube not supported");
        }
    }
    
}
