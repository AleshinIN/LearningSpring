package springcourse.alishev.lk4;

public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public MusicPlayer(){}

    public MusicPlayer(Music music){ // IoC - инверсия управления(объекты создаются вне класса MusicPlayer)
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Играет музыка: " + music.getSong());
    }

    public void initMethod(){
        System.out.println("Инициализация бина: " + this);
    }

    public void destroyMethod(){
        System.out.println("Закрытие бина: " + this);
    }

    public void setMusic1F(Music music) {
        this.music = music;
    }

    public Music getMusic1F() {
        return music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void printInt(int a) {
        System.out.println(a);
    }
}
