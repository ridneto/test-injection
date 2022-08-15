package kodein.repositories

interface AuthorRepository {
    fun add(name: String)
    fun remove(name: String)
    fun getAll(): List<String>
}