package springcourse.alishev.lk2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // ClassPathXmlApplicationContext - обращается к файлу applicationContext и считывает все бины
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // getBean - testBean это ID из applicationContext
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        context.close(); // нужно закрыть работу с applicationContext. Закрывает все бины
    }
}
