package pages

import geb.Module
import geb.Page

class DuckDuckGoResultsPage extends Page {
	static at = { waitForResults() }
	static content = {
		results(required: false) { $("#links .result").collect { module DuckDuckGoResult, it } }
		result { results[it] }
		resultLink { result(it).link }
	}

	def waitForResults() {
		// content is added dynamically after load so may not be available when
		// we look for it, which is why we wait for it to become available
		waitFor { results }
	}
}

class DuckDuckGoResult extends Module {
	static content = {
		link {
			$('a.result__a')
		}
	}
}
