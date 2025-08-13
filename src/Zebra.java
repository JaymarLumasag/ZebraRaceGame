public class Zebra{
    private String zebraName;
    private int zebPosTrack;

    // Zebra Constructor with name and position arguments
    public Zebra(String name,int positionTrack){
        setZebraName(name);
        setZebPosTrack(positionTrack);
    }

    // Method for the zebra to increment the current position
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
