package common

fun <T> List<T>.swap(i: Int, j: Int) = this.mapIndexed { index, value ->
    when (index) {
        i -> this[j]
        j -> this[i]
        else -> value
    }
}