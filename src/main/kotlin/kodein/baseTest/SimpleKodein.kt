package kodein.baseTest

import org.kodein.di.*

class SimpleKodein(){
    private val container = DI {
        bind<InjectionClass> { provider { Impl() } }
        bind<InjectionClass>(tag = "mock") { provider { ImplClass() } }
    }

    private class ControllerClass(
        private val injectionClass: InjectionClass
    ){
        fun getValueClass(): String{
            return injectionClass.log()
        }
    }

    private interface InjectionClass{
        fun log(): String
    }

    private class Impl: InjectionClass {
        override fun log(): String {
            return "true value"
        }
    }

    private class ImplClass: InjectionClass {
        override fun log(): String {
            return "mock value"
        }
    }

    fun main(tagValue: String? = null): String {
        val controller by container.newInstance {
            ControllerClass(instance(tag=tagValue))
        }

        return controller.getValueClass()
    }
}