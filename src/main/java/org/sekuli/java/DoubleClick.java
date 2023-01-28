package org.sekuli.java;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DoubleClick {

	public static void main(String[] args) throws FindFailed {
		doubleClickOfFolder();
	}
	public static  void doubleClickOfFolder() throws FindFailed {

		Screen screen=new Screen();

		Pattern ClickableFile=new Pattern("E:\\sikuli\\images\\pc.png");

		screen.doubleClick(ClickableFile);

	}
}
