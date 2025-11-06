package quest

import common.FileLoader
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Quest2Test {

    @Test
    fun `part 1`() {
        val content = FileLoader.loadFile("quest2-part1.txt")
        val name = Quest2().part1(content)
        assertEquals("[357,862]", name)
    }

    @Test
    fun `part 2`() {
        val content = FileLoader.loadFile("quest2-part2.txt")
        val name = Quest2().part2(content)
        assertEquals("4076", name)
    }

    @Test
    fun `part 3`() {
        val content = FileLoader.loadFile("quest2-part3.txt")
        val name = Quest2().part3(content)
        assertEquals("406954", name)
    }
}