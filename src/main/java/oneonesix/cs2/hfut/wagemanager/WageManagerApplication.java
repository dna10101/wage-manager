package oneonesix.cs2.hfut.wagemanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author FTC
 */
@SpringBootApplication
@MapperScan("oneonesix.cs2.hfut.wagemanager.mapper")
@EntityScan("onoonesix.cs2.hfut.wagemanager.entity")
public class WageManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WageManagerApplication.class, args);
    }
}
