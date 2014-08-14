/**
 * Example of writing custom application-specific steps
 */

import pages.*

import static cucumber.api.groovy.EN.*

Given(~/I am on the Geb home page/) { ->
	to GebHomePage
}

Then(~/the first heading on the page is '(.*)'/) { String expectedHeading ->
	assert page.headings[0].text() == expectedHeading
}

When(~/the link to the cross browser page is clicked/) { ->
	page.crossBrowserLink.click()
}

