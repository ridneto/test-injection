package kodein.clients.impl

import kodein.clients.BasketClient

class BasketClientFake: BasketClient {
    override fun findBasket(id: Long): String {
        return "fake"
    }
}