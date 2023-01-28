package org.Authentication.java;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QrCodeValidation {

	//this method will give the text inside the Qr code 

	public static void main(String[] args) throws NotFoundException, IOException {
		Create();
	}

	public static  void Create() throws IOException, NotFoundException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

				
		//give the path of the Qr code 
		driver.get("file:///C:/Users/gowth/Downloads/gmr.png");

		
		// get the src attribute value of the Qr code and stored in the form form of string 
		String QrcodeURl=driver.findElement(By.xpath("//img[@class=\"shrinkToFit transparent\"]")).getAttribute("src");
		System.out.println(QrcodeURl);

		//give the string src value in into the url object
		URL urlofimage=new URL(QrcodeURl);
		
		//convert thet url into buffered image
		BufferedImage bufferedeImage=ImageIO.read(urlofimage);

		//again convert the buffered into the lumanence source 
		LuminanceSource lumenancesource=new BufferedImageLuminanceSource(bufferedeImage);
		
		//again convert the lumanence source into the  BinaryBitmap 
		BinaryBitmap binarybitmap=new BinaryBitmap(new HybridBinarizer(lumenancesource));

		//decode that binary bitmap into result 
		Result result =new MultiFormatReader().decode(binarybitmap);

		// get the text of the Qr code by the getText method 
		String textinQrCode=result.getText();
		System.out.println("the text in Qr code :"+textinQrCode);
	}
}
