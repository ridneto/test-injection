package kodein.repositories.impl

import kodein.repositories.AuthorRepository

class AuthorRepositoryKoala: AuthorRepository {
    private val authors = mutableListOf(
        "True author"
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