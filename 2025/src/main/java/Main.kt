import common.FileLoader
import quest.Quest2

fun main() {
    println(Quest2().part1(FileLoader.loadFile("quest2-part1.txt")))
    println(Quest2().part2(FileLoader.loadFile("quest2-part2.txt")))
    println(Quest2().part3(FileLoader.loadFile("quest2-part3.txt")))
}