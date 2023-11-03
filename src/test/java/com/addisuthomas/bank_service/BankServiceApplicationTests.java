package com.addisuthomas.bank_service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.addisuthomas.bank_service.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
class BankServiceApplicationTests {

	@Autowired
	AccountService accountService;

	@Test
	void contextLoads() {
		Assert.assertNotNull(accountService);
	}

}
