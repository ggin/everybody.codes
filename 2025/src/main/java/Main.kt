import common.FileLoader
import quest.Quest3

fun main() {
    println(Quest3().part1(FileLoader.loadFile("quest3-part1.txt")))
    println(Quest3().part2(FileLoader.loadFile("quest3-part2.txt")))
    println(Quest3().part3(FileLoader.loadFile("quest3-part3.txt")))
}