package vb.tran;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//https://ken.io/note/springboot-course-basic-mybatis-multidatasource-xml
@ImportResource("classpath:app-config.xml")
public class ZzvbtranApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZzvbtranApplication.class, args);
	}
}
