package springcourse.alishev.lk13.DZ;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration // указываем, что этот файл является конфигурационным для Spring
@PropertySource("classpath:musicCase.properties") // указываем файл с полями ключ-значение, тоже самое что <context:property-placeholder location="classpath:musicCase.properties"/>
public class SpringConfigDZ {

    @Bean // создаем бины вручную(без Component и Autowired), тоже самое что и <bean ...> </bean>
    @Scope("singleton")
    public RockMusicDZ rockMusicDZ(){
        return new RockMusicDZ();
    }

    @Bean // создаем бины вручную(без Component и Autowired), тоже самое что и <bean ...> </bean>
    @Scope("singleton")
    public ClassicalMusicDZ classicalMusicDZ(){
        return new ClassicalMusicDZ();
    }

    @Bean // создаем бины вручную(без Component и Autowired), тоже самое что и <bean ...> </bean>
    @Scope("singleton")
    public List<MusicDZ> musicDZList(){
        List<MusicDZ> musicDZList = new ArrayList<>();
        musicDZList.add(rockMusicDZ());
        musicDZList.add(classicalMusicDZ());
        return musicDZList;
    }

    @Bean // создаем бины вручную(без Component и Autowired), тоже самое что и <bean ...> </bean>
    @Scope("singleton")
    public MusicPlayerDZ musicPlayerDZ(){
//        List<MusicDZ> musicDZList = new ArrayList<>();
//        musicDZList.add(rockMusicDZ());
//        musicDZList.add(classicalMusicDZ());
//        return new MusicPlayerDZ(musicDZList);
        return new MusicPlayerDZ(musicDZList());
    }

    @Bean // создаем бины вручную(без Component и Autowired), тоже самое что и <bean ...> </bean>
    @Scope("singleton")
    public ComputerDZ computerDZ(){
        MusicPlayerDZ musicPlayerDZ = musicPlayerDZ();
//        musicPlayerDZ.setVolume();  // todo как сюда впихнуть значение из musicCase.properties?
        return new ComputerDZ(musicPlayerDZ);
    }
}
