fun main() {
    val input = readInput("Day01")

    var lastIncreasedNumber = 0
    var count = 0

    for (number in input) {
        if (number.toInt() > lastIncreasedNumber) {
            count++
        }
        lastIncreasedNumber = number.toInt()
    }

    println("count = ${count-1}")
//    println(part1(input))
//    println(part2(input))
}
