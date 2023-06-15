public class HotDrink extends Products implements Comparable<HotDrink> {

    private int temperature;

    @Override
    public String getName() {
        return super.name;
    }

    public HotDrink(String name, Long volume, int temperature) {
        super.name = name;
        super.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", volume=" + volume + '\'' +
                ", temperature=" + temperature +
                '}';
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public Long getVolume() {
        return super.volume;
    }

    @Override
    public void setVolume(Long volume) {
        super.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int compareTo(HotDrink o) {
        if (this.volume > o.volume)
            return 1;
        else if (this.volume < o.volume)
            return -1;
        else
            return 0;
    }

}