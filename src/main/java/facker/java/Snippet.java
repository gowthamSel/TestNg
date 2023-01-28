package facker.java;

import static org.testng.Assert.assertTrue;

import java.util.Locale;
import java.util.regex.Pattern;

//import org.apache.xmlbeans.impl.store.Locale;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import ch.qos.logback.core.boolex.Matcher;

public class Snippet {

	@Test
	public void whenBothifyCalled_checkPatternMatches() throws Exception {

		FakeValuesService fakeValuesService = new FakeValuesService(
				new Locale("en-GB"), new RandomService());

		String email = fakeValuesService.bothify("????##@gmail.com");
		java.util.regex.Matcher emailMatcher = Pattern.compile("\\w{4}\\d{2}@gmail.com").matcher(email);
//		System.out.println(emailMatcher);
//		System.out.println(emailMatcher.find());
		assertTrue(emailMatcher.find());
	}

	@Test
	public void givenValidService_whenRegexifyCalled_checkPattern() throws Exception {

		FakeValuesService fakeValuesService = new FakeValuesService(
				new Locale("en-GB"), new RandomService());

		String alphaNumericString = fakeValuesService.regexify("[a-z1-9]{10}");
		java.util.regex.Matcher alphaNumericMatcher = Pattern.compile("[a-z1-9]{10}").matcher(alphaNumericString);
		System.out.println(alphaNumericMatcher);
		assertTrue(alphaNumericMatcher.find());
	}

}

