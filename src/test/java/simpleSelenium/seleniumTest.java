package simpleSelenium;

import static com.codeborne.selenide.Selenide.*;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;

public class seleniumTest {
	
	@Test
	public void automationTest()
	{
		open("http://explorecalifornia.org/contact.htm");
		
		$("#name").should(appear);
		$("#comments").should(appear);
		$("#name").setValue("John Brian");
		$("#state").selectOptionContainingText("Texas");
		$("#backpack").click();
		
		$(By.name("newsletter")).selectRadio("yes");
		$("#name").shouldHave(value("John Valridp"));
		
		String state=$("#state").getSelectedText();
		assert(state).equals("Texas");
		
		
	}

}
