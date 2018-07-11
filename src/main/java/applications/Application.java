package applications;

import org.apache.tomcat.util.http.fileupload.ThresholdingOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //标识该类开启springboot的配置

public class Application {
	 public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
