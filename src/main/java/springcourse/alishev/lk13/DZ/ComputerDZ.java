package springcourse.alishev.lk13.DZ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class ComputerDZ {
    private int id;
    private MusicPlayerDZ musicPlayerDZ;

    public ComputerDZ(MusicPlayerDZ musicPlayerDZ) {
        this.id = 1;
        this.musicPlayerDZ = musicPlayerDZ;
    }

    @Override
    public String toString() {
        return "Computer" + id + " " + musicPlayerDZ.playMusic();
    }
}