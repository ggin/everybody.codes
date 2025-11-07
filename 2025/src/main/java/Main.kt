import common.FileLoader
import quest.Quest4

fun main() {
    println(Quest4().part1(FileLoader.loadFile("quest4-part1.txt")))
    println(Quest4().part2(FileLoader.loadFile("quest4-part2.txt")))
    println(Quest4().part3(FileLoader.loadFile("quest4-part3.txt")))
}