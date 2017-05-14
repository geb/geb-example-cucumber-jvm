package pages

import geb.Page

class GebHomePage extends Page {
	static at = { title == "Geb - Very Groovy Browser Automation" }
	static content = {
		headings { $('h1') }
		firstHeading { headings[0] }
		documentationLink(to: BookOfGebPage) { $('.huge.buttons a', text: 'Documentation') }
	}
}
