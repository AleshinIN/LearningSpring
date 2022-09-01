package springcourse.alishev.lk5;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcourse.alishev.lk4.Music;
import springcourse.alishev.lk4.MusicPlayer;

/**
 * То же самое, что и 4лк, но теперь с использованием Dependency Injection
 * */

public class Main {
    public static void main(String[] args) {
        // ClassPathXmlApplicationContext - обращается к файлу applicationContext и считывает все бины
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        context.close(); // нужно закрыть работу с applicationContext.

    }
}
