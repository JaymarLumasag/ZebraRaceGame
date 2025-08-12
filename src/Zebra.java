public class Zebra{
    private String zebraName;
    private int zebPosTrack;

    //Zebra Constructor
    public Zebra(String name,int positionTrack){
        setZebraName(name);
        setZebPosTrack(positionTrack);
    }

    public void moveForward(){
        ++this.zebPosTrack;
    }

    //setters
    public void setZebraName(String zebraName) {
        this.zebraName = zebraName;
    }

    public void setZebPosTrack(int zebPosTrack) {
        this.zebPosTrack = zebPosTrack;
    }

    //getters
    public String getZebraName() {
        return zebraName;
    }

    public int getZebPosTrack() {
        return zebPosTrack;
    }
}
