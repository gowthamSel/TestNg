package org.Authentication.java;

import java.io.File;

import net.sourceforge.lept4j.util.LoadLibs;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class SampleReadImage {

	public static void main(String[] args) throws TesseractException, InterruptedException {
			SampleReadFromTheImage();
		//Image_To_Text();
	}

	public static  void SampleReadFromTheImage() throws TesseractException {
		String path="E:\\eclipse_work_space\\TestNg\\ScreenShots\\CaptchaImages\\wordScreen shot.png";
		File file=new File(path);

		ITesseract image=new Tesseract();

		try {
			String text=	image.doOCR(file);
			System.out.println(text);
		} catch (Exception e) {
			System.out.println("theexception is generated");
		}

	}

//	public static String Image_To_Text() throws InterruptedException{
//
//		String image_path="E:\\eclipse_work_space\\TestNg\\ScreenShots\\CaptchaImages\\wordScreen shot.png";
//		String result = "";
//
//		File imageFile = new File(image_path);
//		Thread.sleep(2000);
//		ITesseract image=new Tesseract();
//		//In case you don't have your own tessdata, let it also be extracted for you
//
//		File tessDataFolder = LoadLibs.extractNativeResources("E:\\eclipse_work_space\\TestNg\\tessData\\tessdata.traineddata");
//
//		//Set the tessdata path
//		image.setDatapath(tessDataFolder.getAbsolutePath());
//
//		try {
//			result = image.doOCR(imageFile);
//
//		} catch (Exception e) {
//			e.printStackTrace();            
//		}
//		System.out.println(result);
//		return result;
//	}

}
