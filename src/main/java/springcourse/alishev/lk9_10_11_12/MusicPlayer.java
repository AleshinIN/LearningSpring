package springcourse.alishev.lk9_10_11_12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired // под интерфейс Music подходит два бина
    @Qualifier("rockMusic") // указываем какой именно бин использовать
    private Music Music;

    public String playMusic() {
        return "Playing: " + Music.getSong();
    }
}