package springcourse.alishev.lk9_10_11_12.DZ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComputerDZ {
    private int id;
    private MusicPlayerDZ musicPlayerDZ;

    @Autowired
    public ComputerDZ(MusicPlayerDZ musicPlayerDZ) {
        this.id = 1;
        this.musicPlayerDZ = musicPlayerDZ;
    }

    @Override
    public String toString() {
        return "Computer" + id + " " + musicPlayerDZ.playMusic(EnumMusic.CLASSICAL);
    }
}