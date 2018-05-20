package org.itstep;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationRunner 
{
	
	@Autowired
	SpringTest sTest;
	
    public static void main( String[] args )
    {
    	
    	SpringApplication app = new SpringApplication(ApplicationRunner.class);
    	app.run(args);
    }
    
    public void run(String... args) throws Exception {
    	sTest.testMethodRun();
    }
}
