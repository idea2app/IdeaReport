package app.idea2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.bstek.ureport.console.UReportServlet;

@SpringBootApplication
public class IdeaReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdeaReportApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean<UReportServlet> buildUreportServlet() {
		return new ServletRegistrationBean<UReportServlet>(new UReportServlet(), "/ureport/*");
	}

}
