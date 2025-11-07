package quest

import common.FileLoader
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Quest4Test {

    @Test
    fun `part 1`() {
        val content = FileLoader.loadFile("quest4-part1.txt")
        val name = Quest4().part1(content)
        assertEquals("15888", name)
    }

    @Test
    fun `part 2`() {
        val content = FileLoader.loadFile("quest4-part2.txt")
        val name = Quest4().part2(content)
        assertEquals("1274509803922", name)
    }

    @Test
    fun `part 3`() {
        val content = FileLoader.loadFile("quest4-part3.txt")
        val name = Quest4().part3(content)
        assertEquals("6818", name)
    }
}