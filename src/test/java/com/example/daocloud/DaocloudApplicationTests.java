package com.example.daocloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class DaocloudApplicationTests {

	@Autowired
	MyService myService;

	@Test
	void contextLoads() {
	}

	@Test
	public void addTest(){

		int res = myService.add(133, 44);
		assert res == 177;

	}

	@Test
	public void addTest2(){

		int res = myService.add(325, 342);
		assert res == 667;

	}

}
