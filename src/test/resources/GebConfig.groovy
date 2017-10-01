/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/


import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver

// Use firefox as the default
// See: http://code.google.com/p/selenium/wiki/FirefoxDriver
driver = { new FirefoxDriver() }

environments {

	// run as “gradle -Dgeb.env=chrome cucumber”
	// See: http://code.google.com/p/selenium/wiki/ChromeDriver
	chrome {
		driver = { new ChromeDriver() }
	}

}

baseUrl = "http://gebish.org"

baseNavigatorWaiting = true
atCheckWaiting = true