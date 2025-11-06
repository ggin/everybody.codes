package quest

import common.FileLoader
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Quest3Test {

    @Test
    fun `part 1`() {
        val content = FileLoader.loadFile("quest3-part1.txt")
        val name = Quest3().part1(content)
        assertEquals("29", name)
    }

    @Test
    fun `part 2`() {
        val content = FileLoader.loadFile("quest3-part2.txt")
        val name = Quest3().part2(content)
        assertEquals("781", name)
    }

    @Test
    fun `part 3`() {
        val content = FileLoader.loadFile("quest3-part3.txt")
        val name = Quest3().part3(content)
        assertEquals("3", name)
    }
}