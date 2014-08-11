package pages

import geb.Page

class DuckDuckGoHomePage extends Page {
	static url = "https://duckduckgo.com/"
	static at = { title == "DuckDuckGo" }
	static content = {
		searchField(wait: true) { $("#search_form_input_homepage") }
		searchButton(wait: true, to: DuckDuckGoResultsPage) { $('#search_button_homepage')  }
	}
}
