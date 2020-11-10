public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public int drink(){
        return this.volume = this.volume - 10;
    }

    public int all(){
        return this.volume = this.volume - 100;
    }

    public int fill(){
        return this.volume = this.volume + 100;
    }
}
