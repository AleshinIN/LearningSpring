package springcourse.alishev.lk6;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcourse.alishev.lk4.MusicPlayer;

/**
 * То же самое, что и 5лк, но теперь с использованием set
 * */

public class Main {
    public static void main(String[] args) {
        // ClassPathXmlApplicationContext - обращается к файлу applicationContext и считывает все бины
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        /* Создаем через сеттор */
        MusicPlayer musicPlayer = context.getBean("setMusicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();

        System.out.println("Имя из appCont: " + musicPlayer.getName());
        System.out.println("Громкость из appCont: " + musicPlayer.getVolume());

        context.close(); // нужно закрыть работу с applicationContext.

        /* Задаем свойства объектов через файл */
        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer propertiesMusicPlayer2 = context2.getBean("propertiesMusicPlayer", MusicPlayer.class);
        propertiesMusicPlayer2.playMusic();

        System.out.println("Имя из файла: " + propertiesMusicPlayer2.getName());
        System.out.println("Громкость из файла: " + propertiesMusicPlayer2.getVolume());
        context2.close(); // нужно закрыть работу с applicationContext.

    }
}
