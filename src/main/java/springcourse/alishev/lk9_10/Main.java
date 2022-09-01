package springcourse.alishev.lk9_10;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/** Использование аннотаций для создания объекта и зависимостей  */

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContAnnotation.xml");

        Computer comp = context.getBean("computer", Computer.class);
        System.out.println(comp);

        context.close();
    }
}