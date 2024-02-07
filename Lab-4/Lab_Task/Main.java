public class Main{
    public static void main(String[] args){

        TV generalTV=new generalTV();
        remote basicRemote=new basicRemote(generalTV);
        basicRemote.togglePower();
        basicRemote.volumeUp();
        basicRemote.channelUp();
        basicRemote.channelDown();

        System.out.println();

        TV smartTV=new smartTV();
        smartRemote advancedRemote=new advanceRemote(smartTV);
        advancedRemote.togglePower();
        advancedRemote.volumeUp();
        advancedRemote.channelUp();
        advancedRemote.showYoutube();
    }
}
