package springcourse.alishev.lk13.DZ;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class ClassicalMusicDZ implements MusicDZ {

    private List<String> arrClassicalMusic = new ArrayList<>();

    {
        arrClassicalMusic.add("Бах");
        arrClassicalMusic.add("Моцарт");
        arrClassicalMusic.add("Бетховин");
    }

    @Override
    public List<String> getSong() {
        return arrClassicalMusic;
    }

    @Override
    public void doMyInit() { // метод не может быть privet из-за Override
        System.out.println("Инициализация бина: " + this.getClass());
    }

    @Override
    public void doMyDestroy() {
        System.out.println("Закрытие бина: " + this.getClass());
    }
}
