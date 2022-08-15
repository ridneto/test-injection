package kodein

import kotlin.test.Test
import kotlin.test.assertEquals

class SimpleTest {
    @Test
    fun run(){
        val mockValue = SimpleKodein().main("mock")
        assertEquals("mock value", mockValue)

        val trueValue = SimpleKodein().main()
        assertEquals("true value", trueValue)
    }
}