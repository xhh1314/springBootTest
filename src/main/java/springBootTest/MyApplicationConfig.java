package springBootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class MyApplicationConfig {
	
	public static void main(String[] args) {
        SpringApplication.run(MyApplicationConfig.class, args);
        System.out.println("启动成功！");
    }

}
