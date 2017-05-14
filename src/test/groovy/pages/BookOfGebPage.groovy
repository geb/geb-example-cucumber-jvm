package pages

import geb.Page

class BookOfGebPage extends Page {

    static at = { title.startsWith("The Book Of Geb") }
}
