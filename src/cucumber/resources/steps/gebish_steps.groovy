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

When(~/the link to documentation is clicked/) { ->
	page.documentationLink.click()
}

Then(~/I end up at The Book of Geb/) { ->
	at BookOfGebPage
}

