package kodein.clients.impl

import kodein.clients.BasketClient

class BasketClientHttp: BasketClient {
    override fun findBasket(id: Long): String {
        return "http"
    }
}