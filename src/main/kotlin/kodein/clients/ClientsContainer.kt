package kodein.clients

import kodein.clients.impl.BasketClientFake
import kodein.clients.impl.BasketClientHttp
import org.kodein.di.DI
import org.kodein.di.bind
import org.kodein.di.provider

object ClientsContainer {
    val container = DI.Module(name="Clients") {
        bind<BasketClient>("koala") { provider { BasketClientHttp() } }
        bind<BasketClient>("fake") { provider { BasketClientFake() } }
    }
}