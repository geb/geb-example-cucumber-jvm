/**
 * Example of writing custom application-specific steps
 */

import pages.*

import static cucumber.api.groovy.EN.*

Given(~/I am on the DuckDuckGo search page/) { ->
	to DuckDuckGoHomePage
	waitFor { at(DuckDuckGoHomePage) }
}

When(~/I search for "(.*)"/) { String query ->
	page.search.value(query)
	page.searchButton.click()
}

Then(~/I can see some results/) { ->
	assert at(DuckDuckGoResultsPage)
}

Then(~/the first link should be "(.*)"/) { String text ->
	waitFor { page.results }
	assert page.resultLink(0).text()?.contains(text)
}