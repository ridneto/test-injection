package kodein.clients

interface BasketClient {
    fun findBasket(id: Long): String
}