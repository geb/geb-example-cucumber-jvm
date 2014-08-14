package pages

import geb.Page

class GebHomePage extends Page {
	static url = "http://www.gebish.org/"
	static at = { title == "Geb - Very Groovy Browser Automation" }
	static content = {
		headings { $('#main h1') }
		firstHeading { headings[0] }
		crossBrowserLink(to: GebCrossBrowserPage) { $('li.crossbrowser a') }
	}
}
