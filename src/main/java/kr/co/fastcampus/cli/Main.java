package kr.co.fastcampus.cli;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.sql.Connection;
import java.sql.SQLException;

@Slf4j
@Configuration
@ComponentScan(basePackageClasses = Main.class)
//@ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE, classes = B.class))
//, excludeFilters = @ComponentScan.Filter(type= FilterType.REGEX, pattern = "kr.co.fastcampus.cli.B")
class Main {
	public static void main(String[] args) throws SQLException {

//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("dao.xml" );
		ConfigurableApplicationContext an = new AnnotationConfigApplicationContext(Main.class);

		B b = an.getBean(B.class);

		log.info(""+b);


		an.close();
//		C a2 = context.getBean("C", C.class);
//		C a1 = context.getBean("C", C.class);
//		log.info("result = " + (a1 == a2));

//		ConnectionFactory factory = context.getBean(ConnectionFactory.class);
//		Connection connection = factory.getConnection();
//		if(connection!=null)
//		log.info("connection not null");

//		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("dao.xml" );
//
//		Lifecycle lifecycle = context.getBean(Lifecycle.class);
//
//		log.info(">> 1 : " +  lifecycle.isRunning());
//		context.close();
//		log.info(">> 2 : " +  lifecycle.isRunning());


	}
}