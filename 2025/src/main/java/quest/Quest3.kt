package quest

class Quest3 {


    fun part1(input: String) = input.split(",").map { it.toInt() }.distinct().sum().toString()

    fun part2(input: String) = input.split(",").map { it.toInt() }.distinct().sorted().take(20).sum().toString()

    fun part3(input: String) = input.split(",").map { it.toInt() }.groupingBy { it }.eachCount().map { it.value }.max().toString()
}