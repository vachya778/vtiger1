package testscript;

import java.util.Random;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibraries.baseClass;

@Listeners(genericLibraries.ListenersImplimation.class)

public class Tc8Test extends baseClass {
	@Test
	public void newEvent() throws InterruptedException {
		
		home.getQuickCreateDropdown().click();
		Thread.sleep(3000);
		web.handlingDropDown(home.getQuickCreateDropdown(), "New Event");
		Thread.sleep(2000);
       
		home.getSubjecttextfield().sendKeys("demo");
        
        web.enteringDataintoElement("2023-07-30",home.getDatestartTF());
		//Thread.sleep(2000);
		
		web.enteringDataintoElement("2023-07-31",home.getEnddateTF());
		//Thread.sleep(2000);
		
		home.getSavebutton().click();

	}

}
