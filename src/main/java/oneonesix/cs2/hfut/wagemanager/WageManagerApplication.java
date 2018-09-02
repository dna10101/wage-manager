package oneonesix.cs2.hfut.wagemanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author FTC
 */
@SpringBootApplication
@MapperScan("oneonesix.cs2.hfut.wagemanager.mapper")
public class WageManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WageManagerApplication.class, args);
    }
}
