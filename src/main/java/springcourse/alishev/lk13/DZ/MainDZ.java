package springcourse.alishev.lk13.DZ;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcourse.alishev.lk13.SpringConfigur;

/** Задание, запустить без @Component и @Autowired  */
/** Как подгрузить значение из файла */

public class MainDZ {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigDZ.class);

        ComputerDZ comp = context.getBean("computerDZ", ComputerDZ.class);
        System.out.println(comp);

        context.close();
    }
}