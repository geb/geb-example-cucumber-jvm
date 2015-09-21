package pages

import geb.Page

class GebCrossBrowserPage extends Page {
	static at = { firstHeadingText == "Cross Browser Automation" }
	static content = {
		headings { $('#main h1') }
		firstHeading { headings[0] }
		firstHeadingText(wait: true) { firstHeading.text() }
	}
}
