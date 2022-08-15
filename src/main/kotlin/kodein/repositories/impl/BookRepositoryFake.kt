package kodein.repositories.impl

import kodein.repositories.BookRepository

class BookRepositoryFake: BookRepository {
    private val books = mutableListOf(
        "Fake Book"
    )

    override fun addBook(title: String) {
        books.add(title)
    }

    override fun removeBook(title: String) {
        books.removeIf { it == title }
    }

    override fun getBooks(): List<String> {
        return books
    }
}