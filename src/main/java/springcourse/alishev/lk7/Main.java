package springcourse.alishev.lk7;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcourse.alishev.lk4.MusicPlayer;

/** Способы создания объектов  */

public class Main {
    public static void main(String[] args) {
        /* Для Singletone getBean возвращает ссылку на один и тот же объект */
        ClassPathXmlApplicationContext context4 = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        ); // скорее всего, в этот момент создаются объекты с scope: Singletone. Причем, при новом считывании XML создаются новые бины(а не привязывается к старым)
        MusicPlayer propertiesMusicPlayer4 = context4.getBean("propertiesMusicPlayer", MusicPlayer.class);
        MusicPlayer propertiesMusicPlayer41 = context4.getBean("propertiesMusicPlayer", MusicPlayer.class);
        context4.close(); // нужно закрыть работу с applicationContext.

        System.out.println("\nСсылки для Singletone равны?: " + (propertiesMusicPlayer4==propertiesMusicPlayer41));

        /* Для Prototype getBean возвращает ссылку на разные объекты */
    }
}
