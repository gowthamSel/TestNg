package facker.java;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FackerGenerateNewData {

	
	@Test
	public void DuplicateData() {
		
		Faker faker = new Faker();
		String streetName = faker.address().streetName();
		String number = faker.address().buildingNumber();
		String city = faker.address().city();
		String country = faker.address().country();

		System.out.println(String.format("%s\n%s\n%s\n%s",number,streetName,city,country));	
	}
}
