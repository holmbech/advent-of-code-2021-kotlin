fun main() {

    val input = readInput("Day01")

    var count = 0

    for ((index, number) in input.withIndex()) {
        println("index = ${index}")
        println (input[index].toInt() + input[index+1].toInt() + input[index+2].toInt())
        if(index+4 > input.size) {
            break
        }
        if (input[index].toInt() + input[index+1].toInt() + input[index+2].toInt()
            < input[index+1].toInt() + input[index+2].toInt() + input[index+3].toInt()) {
            count++
        }
    }

    println("count = ${count}")
}
