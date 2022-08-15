package kodein.repositories

interface BookRepository {
    fun addBook(title: String)
    fun removeBook(title: String)
    fun getBooks(): List<String>
}