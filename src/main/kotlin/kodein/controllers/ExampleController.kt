package kodein.controllers

import kodein.container.MainContainer
import kodein.services.ExampleService
import org.kodein.di.instance
import org.kodein.di.newInstance

class ExampleController {
    private val exampleService by MainContainer.resolver.newInstance {
        ExampleService(instance(), instance(), instance())
    }
}