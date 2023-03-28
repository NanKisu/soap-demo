package com.example.demo;

import com.example.demo.soap.CountryClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Mock
	private CountryClient countryClient;

	@ParameterizedTest
	@NullAndEmptySource
	@ValueSource(strings = {"", "spain"})
	@MethodSource()
	void contextLoads(String str) {
		countryClient.getCountry(str);

		verify()
	}

}
