package springcourse.alishev.lk13.DZ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayerDZ {

    private List<MusicDZ> musicDZList = new ArrayList<>();

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayerDZ(List<MusicDZ> musicDZList) {
        this.musicDZList = musicDZList;
    }

    public String playMusic() {
        List<String> listPesen = musicDZList.get((int) (musicDZList.size() * Math.random())).getSong();
        return "Playing: " + listPesen.get(new Random().nextInt(listPesen.size())) + ", громкость: " + volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}