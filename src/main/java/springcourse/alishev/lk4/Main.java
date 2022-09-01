package springcourse.alishev.lk4;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // ClassPathXmlApplicationContext - обращается к файлу applicationContext и считывает все бины
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // getBean - music это ID из applicationContext
        Music music = context.getBean("musicRock", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        context.close(); // нужно закрыть работу с applicationContext.
    }
}
