package kodein.services

import kodein.clients.BasketClient
import kodein.repositories.AuthorRepository
import kodein.repositories.BookRepository

class ExampleService(
    val authorRepository: AuthorRepository,
    val bookRepository: BookRepository,
    val basketClient: BasketClient
) {
    fun authorTest(): List<String> {
        return authorRepository.getAll()
    }

    fun bookTest(): List<String>{
        return bookRepository.getBooks()
    }

    fun basketTest(): String {
        return basketClient.findBasket(1L)
    }
}