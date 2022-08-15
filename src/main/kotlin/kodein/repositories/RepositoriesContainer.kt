package kodein.repositories

import kodein.repositories.AuthorRepository
import kodein.repositories.BookRepository
import kodein.repositories.impl.AuthorRepositoryFake
import kodein.repositories.impl.AuthorRepositoryKoala
import kodein.repositories.impl.BookRepositoryFake
import kodein.repositories.impl.BookRepositoryKoala
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.provider

object RepositoriesContainer {
    val container = DI.Module(name="Repository") {
        bind<BookRepository>("koala") { provider { BookRepositoryKoala() } }
        bind<BookRepository>("fake") { provider { BookRepositoryFake() } }

        bind<AuthorRepository>("koala") { provider { AuthorRepositoryKoala() } }
        bind<AuthorRepository>("fake") { provider { AuthorRepositoryFake() } }
    }
}