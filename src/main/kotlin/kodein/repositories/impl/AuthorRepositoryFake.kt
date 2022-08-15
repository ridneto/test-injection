package kodein.repositories.impl

import kodein.repositories.AuthorRepository

class AuthorRepositoryFake: AuthorRepository {
    private val authors = mutableListOf(
        "Fake author"
    )

    override fun add(name: String) {
        authors.add(name)
    }

    override fun remove(name: String) {
        authors.removeIf { it == name }
    }

    override fun getAll(): List<String> {
        return authors
    }
}