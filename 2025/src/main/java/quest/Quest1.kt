package quest

import common.swap
import kotlin.math.max
import kotlin.math.min

class Quest1 {

    fun part1(input: String): String {
        val names = input.lines().first().split(",")
        val index = input.lines().last()
            .split(",")
            .map { (if (it.first() == 'R') 1 else -1) * it.substring(1).toInt() }
            .fold(0, { x, y -> min(max(0, x + y), names.size - 1) })
        return names[index]
    }

    fun part2(input: String): String {
        val names = input.lines().first().split(",")
        val index = input.lines().last()
            .split(",")
            .map { (if (it.first() == 'R') 1 else -1) * it.substring(1).toInt() }
            .fold(0, { x, y -> (x + y).mod(names.size) })
        return names[index]
    }

    fun part3(input: String): String {
        val names = input.lines().first().split(",")
        val swappedNames = input.lines().last()
            .split(",")
            .map { (if (it.first() == 'R') 1 else -1) * it.substring(1).toInt() }
            .fold(names, { newNames, offset -> newNames.swap(0, offset.mod(newNames.size)) })
        return swappedNames.first()
    }

}