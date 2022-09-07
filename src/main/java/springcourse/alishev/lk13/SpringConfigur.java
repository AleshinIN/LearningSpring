package springcourse.alishev.lk13;

import org.springframework.context.annotation.*;

/** Используем java-класс для конфигурации вместо XML-файла. */

@Configuration // указываем, что этот файл является конфигурационным для Spring
@ComponentScan("springcourse.alishev.lk9_10_11_12") // Ищем бины, тоже самое что и <context:component-scan...
@PropertySource("classpath:musicCase.properties") // указываем файл с полями ключ-значение, тоже самое что <context:property-placeholder location="classpath:musicCase.properties"/>
public class SpringConfigur {

    @Bean // создаем бины вручную(без Component и Autowired), тоже самое что и <bean ...> </bean>
    @Scope("singleton")
    public Object musicBean(){ // musicBean - это id бина. Каждый раз, обращаясь к musicBean() будет вызваться getBean() с учётом scope.
        return new Object();
    }

}

