package springcourse.alishev.lk9_10_11_12.DZ;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/** Использование аннотаций + XML для создания объекта и зависимостей  */

public class MainDZ {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContAnnotation.xml");

        ComputerDZ comp = context.getBean("computerDZ", ComputerDZ.class);
        System.out.println(comp);

        context.close();
    }
}