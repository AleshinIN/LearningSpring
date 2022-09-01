package springcourse.alishev.lk8;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcourse.alishev.lk4.MusicPlayer;

/** Методы бинов init, destroy, factory. Их различия в зависимости от scope */

/* бины с scope=Singletone инициализируются сразу псоле чтения xml
*  бины с scope=prototype  инициализируются при вызове getBean
*  бины с scope=prototype  не закрываются при завершении приложения(не вызывается destroy), это должны делать клиенты*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Старт приложения");
        ClassPathXmlApplicationContext context4 = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        System.out.println("Получаем ссылку на бин с scope=Singletone");
        MusicPlayer propertiesMusicPlayer = context4.getBean("musicPlayerInitSingletone", MusicPlayer.class);

        System.out.println("Получаем ссылку на бин с scope=prototype");
        MusicPlayer propertiesMusicPlayer1 = context4.getBean("musicPlayerInitPrototype", MusicPlayer.class);
        System.out.println("Ещё раз обращаемся за ссылкой к бину с scope=prototype");
        MusicPlayer propertiesMusicPlayer2 = context4.getBean("musicPlayerInitPrototype", MusicPlayer.class);
        context4.close(); // нужно закрыть работу с applicationContext.


        System.out.println("\nПроверка factory");
        /* Для Singletone getBean возвращает ссылку на один и тот же объект */
        ClassPathXmlApplicationContext context5 = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        ); // скорее всего, в этот момент создаются объекты с scope: Singletone. Причем, при новом считывании XML создаются новые бины(а не привязывается к старым)
        ClassicalMusic propertiesMusicPlayer4 = context5.getBean("musicPlayerFactory", ClassicalMusic.class);
        ClassicalMusic propertiesMusicPlayer41 = context5.getBean("musicPlayerFactory", ClassicalMusic.class);
        context5.close();

        System.out.println("Ссылки для Singletone равны?: " + (propertiesMusicPlayer4==propertiesMusicPlayer41));
    }
}
