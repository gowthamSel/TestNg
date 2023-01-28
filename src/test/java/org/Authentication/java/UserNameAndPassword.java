package org.Authentication.java;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserNameAndPassword {


	public static void main(String[] args) {
		userNameandPas();
	}

	public static void userNameandPas() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://@the_internet.herokuapp.com/basicouth");
	
	}
	
}
