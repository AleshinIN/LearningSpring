package springcourse.alishev.lk13;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcourse.alishev.lk9_10_11_12.Computer;
import springcourse.alishev.lk9_10_11_12.DZ.ComputerDZ;

/** Использование аннотаций + java-класса для создания объекта и зависимостей  */

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigur.class);

        ComputerDZ comp = context.getBean("computerDZ", ComputerDZ.class);
        System.out.println(comp);

        context.close();
    }
}