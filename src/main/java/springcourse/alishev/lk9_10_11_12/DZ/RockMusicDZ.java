package springcourse.alishev.lk9_10_11_12.DZ;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class RockMusicDZ implements MusicDZ {

    private List<String> arrRockMusic = new ArrayList<>();

    {
        arrRockMusic.add("Киш");
        arrRockMusic.add("Металлика");
        arrRockMusic.add("AC/DC");
    }



    @Override
    public List<String> getSong() {
        return arrRockMusic;
    }

    @Override
    @PostConstruct
    public void doMyInit() {
        System.out.println("Инициализация бина: " + this.getClass());
    }

    @Override
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Закрытие бина: " + this.getClass());
    }
}