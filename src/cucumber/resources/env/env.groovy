import org.openqa.selenium.OutputType
import org.openqa.selenium.WebDriverException

import static cucumber.api.groovy.Hooks.*

import geb.Browser
import geb.binding.BindingUpdater

// NOTE: if you are using the steps in the geb-cucumber library, binding and unbinding
// will already be taken care of for you

def bindingUpdater
def theBrowser

Before { scenario ->
	if(!binding.hasVariable('browser')) {
		theBrowser = new Browser()
		bindingUpdater = new BindingUpdater(binding, theBrowser)
		bindingUpdater.initialize()
	} else {
		// save for later screenshot taking
		theBrowser = browser
	}
}

After { scenario ->
	bindingUpdater?.remove()

	// embed screenshot into cucumber report
	if(scenario.failed) {
		try {
			scenario.embed(theBrowser.driver.getScreenshotAs(OutputType.BYTES), "image/png")
		} catch(WebDriverException e) {
			// sometime firefox runs out of memory trying to take a screenshot, not a big deal so ignore
		} catch(MissingMethodException e) {
			// HTMLUnit doesn't support screenshots
		}
	}

}