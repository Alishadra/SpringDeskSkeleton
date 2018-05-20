package org.itstep;

import org.springframework.stereotype.Component;

@Component
public class SpringTestImpl implements SpringTest {
	
	public void testMethodRun() {
		System.out.println("CONGRATULATIONS! YOU ARE SO SMART TO RUN SPRING APP!!!");
	}

}
