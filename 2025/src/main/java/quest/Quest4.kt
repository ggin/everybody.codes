package quest

import kotlin.math.roundToLong

class Quest4 {

    fun part1(input: String) = input.lines().let { 2025 * it.first().toDouble() / it.last().toDouble() }.roundToLong().toString()

    fun part2(input: String) = input.lines().let { 10000000000000 * it.last().toDouble() / it.first().toDouble() }.roundToLong().toString()

    fun part3(input: String) = input.lines().windowed(2, 1).fold(100.0, { acc, l -> acc * l.first().split("|").last().toDouble() / l.last().split("|").first().toDouble() }).roundToLong().toString()
}