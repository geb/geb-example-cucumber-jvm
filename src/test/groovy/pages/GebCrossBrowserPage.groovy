package pages

import geb.Page

class GebCrossBrowserPage extends Page {
	static url = "http://www.gebish.org/crossbrowser"
	static at = { headings[0].text() == "Cross Browser Automation" }
	static content = {
		headings { $('#main h1') }
		firstHeading { headings[0] }
	}
}
