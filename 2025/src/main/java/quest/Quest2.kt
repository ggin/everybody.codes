package quest

class Quest2 {

    data class ComplexNumber(var a: Long, var b: Long) {
        constructor(s: String) : this(s.substring(3).split(",")[0].toLong(), s.substring(3, s.length - 1).split(",")[1].toLong())

        operator fun plus(other: ComplexNumber) = ComplexNumber(a + other.a, b + other.b)
        operator fun times(other: ComplexNumber) = ComplexNumber(a * other.a - b * other.b, a * other.b + b * other.a)
        operator fun div(other: ComplexNumber) = ComplexNumber(a / other.a, b / other.b)

        override fun toString(): String {
            return "[$a,$b]"
        }
    }

    fun part1(input: String) = (1..3).fold(
        ComplexNumber(0, 0),
        { result, _ -> result * result / ComplexNumber(10, 10) + ComplexNumber(input) })
        .toString()

    fun part2(input: String) = compute(input, 10)

    fun part3(input: String) = compute(input, 1)

    private fun compute(input: String, step: Long): String = ComplexNumber(input).let { topLeft ->
        (topLeft.a..topLeft.a + 1000 step step).sumOf { x ->
            (topLeft.b..topLeft.b + 1000 step step).count { y: Long ->
                (1..100).fold(
                    ComplexNumber(0, 0),
                    { result, _ -> result * result / ComplexNumber(100000, 100000) + ComplexNumber(x, y) })
                    .let { it.a in -1000000..1000000 && it.b in -1000000..1000000 }
            }
        }.toString()
    }

    private fun display(input: String, step: Long): String = "P1\n${1001/step} ${1001/step}\n" + ComplexNumber(input).let { topLeft ->
        (topLeft.a..topLeft.a + 1000 step step).joinToString(System.lineSeparator()) { x ->
            (topLeft.b..topLeft.b + 1000 step step).joinToString("") { y ->
                (1..100).fold(
                    ComplexNumber(0, 0),
                    { result, _ -> result * result / ComplexNumber(100000, 100000) + ComplexNumber(x, y) })
                    .let { if (it.a in -1000000..1000000 && it.b in -1000000..1000000) "1" else "0" }
            }
        }
    }
}