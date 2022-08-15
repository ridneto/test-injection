package kodein.container

import kodein.clients.ClientsContainer
import kodein.repositories.RepositoriesContainer
import org.kodein.di.DI

object MainContainer {
    val resolver = DI {
        import(RepositoriesContainer.container)
        import(ClientsContainer.container)
    }
}