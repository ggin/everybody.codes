package quest

import common.FileLoader
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Quest1Test {

    @Test
    fun `part 1`() {
        val content = FileLoader.loadFile("quest1-part1.txt")
        val name = Quest1().part1(content)
        assertEquals("Fyrryn", name)
    }

    @Test
    fun `part 2`() {
        val content = FileLoader.loadFile("quest1-part2.txt")
        val name = Quest1().part2(content)
        assertEquals("Elarzris", name)
    }

    @Test
    fun `part 3`() {
        val content = FileLoader.loadFile("quest1-part3.txt")
        val name = Quest1().part3(content)
        assertEquals("Drakzyph", name)
    }
}