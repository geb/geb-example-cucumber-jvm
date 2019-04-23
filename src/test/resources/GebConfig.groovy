/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions

// Use firefox as the default
// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
driver = { return firefoxDriver(false) }

environments {

	// run as “./gradlew -Dgeb.env=chrome cucumber”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { return chromeDriver(false) }
	}

	// run as “./gradlew -Dgeb.env=chromeHeadless cucumber”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chromeHeadless {
		driver = { return chromeDriver(true) }
	}

	// run as “./gradlew -Dgeb.env=firefox cucumber”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	firefox {
		driver = { return firefoxDriver(false) }
	}

	// run as “./gradlew -Dgeb.env=firefoxHeadless cucumber”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	firefoxHeadless {
		driver = { return firefoxDriver(true) }
	}

}

def chromeDriver(boolean headless) {
	ChromeOptions chromeOptions = new ChromeOptions()
	if (headless) chromeOptions.addArguments("--headless")
	new ChromeDriver(chromeOptions)
}

def firefoxDriver(boolean headless) {
	FirefoxOptions firefoxOptions = new FirefoxOptions()
	if (headless) firefoxOptions.addArguments("--headless")
	return new FirefoxDriver(firefoxOptions)
}

baseUrl = "http://gebish.org"

baseNavigatorWaiting = true
atCheckWaiting = true