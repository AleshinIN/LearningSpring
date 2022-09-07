package springcourse.alishev.lk9_10_11_12.DZ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayerDZ {
    @Autowired // под интерфейс Music подходит два бина
    @Qualifier("rockMusicDZ") // указываем какой именно бин использовать
    private RockMusicDZ rockMusicDZ;

    @Autowired // под интерфейс Music подходит два бина
    @Qualifier("classicalMusicDZ") // указываем какой именно бин использовать
    private ClassicalMusicDZ classicalMusicDZ;

    @Value("${musicPlayer.volume}")
    private int volume;


    public String playMusic(EnumMusic enumMusic) {
        switch (enumMusic) {
            case ROCK: return "Playing: " + rockMusicDZ.getSong().get((int) (3 * Math.random())) + ", громкость: " + volume;
            case CLASSICAL: return "Playing: " + classicalMusicDZ.getSong().get((int) (3 * Math.random())) + ", громкость: " + volume;
            default: return "Playing: " + "Музыка не найдена";
        }

    }
}