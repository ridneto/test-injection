package kodein.repositories.impl

import kodein.repositories.BookRepository

class BookRepositoryKoala: BookRepository {
    private val books = mutableListOf(
        "True Book"
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