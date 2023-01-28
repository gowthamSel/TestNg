package org.CssSelectors.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssValuesByAllPosibleWays extends CssByTagNameAndAttribute {

	public static void main(String[] args) throws InterruptedException {
//		withTagnameAndAttribute();
		withTagnameAndAttributeAndValue();
//		withTagnameAndAttributeWithWholeWord();
//		withTagnameAndAttributeWithPartialWholeWord();
//		withTagnameAndAttributeAndValueWithPartialText();
//		withTagnameAndAttributeAndValueWithStartsWithPartialText();
//		withTagnameAndAttributeAndValueWithEndsWithPartialWord();
	}

	/**this type of the css selector we have give the
	 *  total tagname and the attribute value of the  given element*/
	public static  void withTagnameAndAttribute() throws InterruptedException {
		setup();
		//   input[placeholder]
		List<WebElement> element=	driver.findElements(By.cssSelector("input[placeholder]"));
		System.err.println(element.size());

	}

	/**this type of the css selector have we give the tagname and attribute with whole word */
	public  static void withTagnameAndAttributeAndValue() throws InterruptedException {
		setup();

		//   input[placeholder='Enter your security question']
		List<WebElement> element=	driver.findElements(By.cssSelector("input[placeholder='Enter your security question']"));
		System.err.println(element.size());
	}

	//is also same as the attribute and value 
	public static  void withTagnameAndAttributeWithWholeWord() throws InterruptedException {
		setup();

		//   input[placeholder='Enter your security question']
		List<WebElement> element=	driver.findElements(By.cssSelector("input[placeholder='Enter your security question']"));
		System.err.println(element.size());
	}
	/**this type of the css have we give the total word with in the partial whole word but 
	 * we give the some symbole to the css selector i.e., ==~*/
	public  static void   withTagnameAndAttributeWithPartialWholeWord () throws InterruptedException {
		setup();
		// input[placeholder~='Enter']   
		List<WebElement> element=	driver.findElements(By.cssSelector("input[placeholder~='Enter']"));
		System.err.println(element.size());

	}

	/**this type is also same as the partial whole word but the symbol is different 
	 * i.e., ==*  the value is not starting we also give the moddle of the value also 
	 * the word is not importent in this type */
	public static  void withTagnameAndAttributeAndValueWithPartialText() throws InterruptedException {
		setup();
		//   input[placeholder *="Ente"]
		List<WebElement> element=	driver.findElements(By.cssSelector("input[placeholder *=\"Ente\"]"));
		System.err.println(element.size());
	}

	/**this type is use for the some symbols i.e., ==| pipe symbole and 
	 * it is find only the word hs split by the hypon symbol only
	 * like the-word-is-in-complete like this type of word has used */
	public  static void withTagnameAndAttributeAndValueWithStartsWithPartialWord() throws InterruptedException {
		setup();
		// p[class |=\"my\"]
		List<WebElement> element=	driver.findElements(By.cssSelector("p[class |=\"my\"]"));
		System.err.println(element.size());
	}

	  
	/**this method is used some symbol that is == ^ 
	 * @how to used @like p[class ^=\"myt\"] */
	public  static void withTagnameAndAttributeAndValueWithStartsWithPartialText() throws InterruptedException {
		setup();
		// p[class ^="myt"]
		List<WebElement> element=	driver.findElements(By.cssSelector("p[class ^=\"myt\"]"));
		System.err.println(element.size());
	}

	
	/**this method is used some symbol that is == $ dollar 
	 * @how to used @like input[placeholder $=\"tion\"] */
	public  static void withTagnameAndAttributeAndValueWithEndsWithPartialWord() throws InterruptedException {
		setup(); 
		// input[placeholder $="tion"]
		List<WebElement> element=	driver.findElements(By.cssSelector("input[placeholder $=\"tion\"]"));
		System.err.println(element.size());
	}
}
