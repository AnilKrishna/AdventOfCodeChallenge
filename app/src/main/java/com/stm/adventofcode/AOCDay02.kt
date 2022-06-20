package com.stm.adventofcode

// Day 02 Challenge - https://adventofcode.com/2021/day/2
fun main() {

    // This is the input from - https://adventofcode.com/2021/day/2/input
    val input = mutableListOf("forward 9","down 9","down 6","up 2","down 5","forward 3","forward 6","forward 8","down 8","up 4","down 5","down 4","up 6","down 7","forward 5","forward 5","down 9","down 5","up 4","forward 1","forward 7","down 8","up 2","down 1","down 3","up 7","up 5","down 8","down 6","forward 9","up 8","down 4","forward 9","forward 4","forward 1","up 9","forward 5","forward 1","down 2","down 7","forward 5","up 8","forward 1","down 9","down 3","forward 6","up 6","down 4","forward 6","down 3","forward 5","forward 1","down 3","forward 3","down 8","down 2","forward 8","forward 1","up 4","forward 4","down 1","down 5","forward 2","forward 9","forward 5","down 2","up 9","forward 2","down 2","down 2","down 9","up 8","down 3","forward 8","down 4","up 3","down 1","forward 7","down 7","forward 9","down 2","up 9","up 3","down 2","up 2","forward 8","down 3","forward 2","forward 6","down 5","up 9","forward 6","forward 7","down 3","forward 1","down 2","forward 8","up 5","down 6","forward 1","down 8","down 5","forward 4","down 5","forward 3","forward 5","up 3","down 4","down 8","up 7","down 7","forward 3","down 2","forward 3","up 2","down 1","up 2","forward 4","forward 2","down 1","up 9","forward 5","forward 7","down 6","down 3","down 5","down 4","up 4","forward 8","down 6","forward 1","forward 6","down 8","down 2","down 3","up 8","forward 9","down 5","down 6","forward 7","down 2","forward 6","up 3","up 6","forward 2","up 8","up 2","up 4","forward 3","forward 4","down 7","up 1","forward 5","forward 1","forward 9","forward 8","up 6","forward 4","forward 2","up 9","forward 8","down 2","forward 4","forward 4","forward 6","down 3","forward 8","forward 7","forward 6","forward 3","down 5","down 3","forward 4","forward 7","forward 4","forward 3","forward 1","forward 1","up 1","down 4","up 5","up 4","up 8","forward 7","forward 4","forward 3","up 6","up 4","down 4","up 4","down 6","forward 1","forward 5","up 3","forward 5","up 9","down 9","forward 1","down 3","forward 7","up 2","up 1","down 8","forward 9","forward 3","forward 2","forward 6","down 2","forward 4","up 9","forward 6","forward 8","down 5","down 6","forward 7","forward 5","forward 6","forward 9","forward 5","up 3","forward 2","forward 2","forward 8","down 5","forward 9","forward 7","forward 5","up 2","up 7","forward 7","forward 9","down 9","up 5","up 5","up 1","forward 8","forward 3","forward 2","forward 4","down 7","down 7","forward 7","down 2","forward 4","down 6","down 8","down 5","down 9","forward 1","forward 4","forward 1","forward 1","up 5","down 5","up 7","up 7","down 6","down 5","forward 9","up 7","down 2","down 9","down 9","forward 3","up 9","down 7","down 2","up 6","down 9","down 6","up 3","up 6","forward 4","forward 6","down 2","up 3","down 3","forward 8","up 1","forward 8","forward 5","forward 4","forward 9","forward 8","up 1","forward 2","down 8","up 9","forward 3","forward 9","down 3","down 8","down 5","up 5","up 3","down 5","down 4","down 2","forward 1","forward 8","down 3","down 1","down 5","down 1","up 1","down 4","forward 6","down 5","down 7","forward 4","down 2","down 2","up 1","forward 9","down 2","forward 7","up 4","down 8","down 5","up 2","down 7","forward 7","up 4","down 8","forward 9","up 3","down 9","forward 4","forward 5","up 6","forward 5","down 6","down 3","down 1","down 6","forward 7","forward 3","forward 4","up 8","forward 7","down 3","up 2","up 3","up 5","forward 4","forward 9","forward 1","down 2","forward 4","forward 1","forward 6","down 6","forward 8","down 2","forward 7","down 5","forward 6","down 4","down 8","down 6","forward 9","forward 2","forward 4","forward 9","down 1","down 9","forward 2","down 3","forward 2","down 4","down 6","up 5","forward 9","forward 1","down 1","forward 8","forward 7","forward 2","forward 4","forward 3","up 8","down 4","forward 5","up 5","forward 4","up 5","forward 7","up 7","forward 5","down 3","up 9","up 2","forward 9","forward 8","forward 7","down 8","forward 8","down 2","forward 7","forward 4","down 7","up 4","forward 2","forward 1","up 5","forward 5","down 5","down 1","down 7","up 6","down 5","down 6","forward 2","forward 2","forward 8","down 9","down 4","down 3","forward 7","forward 6","forward 5","up 9","forward 8","forward 9","forward 4","down 9","down 6","down 2","down 7","up 3","forward 3","forward 5","up 6","down 7","down 3","forward 3","down 5","down 2","down 4","up 4","down 5","forward 3","forward 1","forward 7","down 7","forward 8","up 7","forward 3","forward 8","down 9","down 1","forward 4","forward 4","forward 5","forward 6","down 5","down 6","forward 6","down 5","down 7","forward 2","down 1","down 8","down 3","down 4","forward 9","forward 4","down 4","up 4","down 3","forward 5","down 4","forward 3","forward 9","up 7","down 5","down 1","forward 8","down 2","forward 9","forward 6","forward 3","down 7","forward 2","forward 5","down 6","forward 1","forward 7","up 1","forward 3","forward 7","forward 3","forward 5","down 5","forward 6","forward 9","up 4","forward 6","forward 3","down 9","up 4","up 6","down 5","down 8","down 2","down 9","forward 8","up 8","forward 3","forward 8","up 8","down 5","down 9","down 1","down 3","forward 3","forward 9","up 9","down 5","down 6","down 1","forward 9","up 3","forward 3","forward 9","down 7","down 4","down 5","up 5","forward 2","down 5","up 5","up 4","up 5","forward 1","down 2","forward 7","down 9","forward 8","forward 7","forward 5","down 3","forward 5","forward 7","forward 1","up 5","forward 3","forward 1","down 1","up 1","down 7","up 4","forward 8","up 9","down 9","down 9","forward 8","forward 3","forward 3","up 4","down 3","forward 4","forward 6","forward 7","down 2","forward 5","down 3","down 9","down 4","down 4","forward 3","down 3","down 6","up 5","up 4","down 6","up 9","down 9","up 2","up 1","down 3","forward 6","up 6","forward 1","down 9","down 6","down 8","down 9","down 6","forward 4","up 6","down 2","forward 9","forward 2","down 4","up 3","forward 6","down 2","down 7","down 1","up 6","down 5","forward 1","forward 7","up 9","forward 2","up 8","down 4","forward 8","up 2","up 2","down 1","forward 6","down 3","forward 7","forward 2","down 5","down 6","up 8","forward 4","up 2","forward 7","forward 4","forward 2","down 1","forward 7","down 1","up 1","down 9","forward 5","forward 3","down 6","up 5","up 9","down 1","forward 2","forward 8","down 5","down 4","forward 6","forward 1","forward 4","forward 2","forward 4","up 7","forward 5","forward 2","down 2","forward 1","forward 4","down 4","forward 7","down 6","forward 9","forward 9","forward 3","up 5","up 5","down 6","forward 7","forward 8","down 5","forward 6","forward 5","forward 1","forward 7","forward 6","up 2","up 4","forward 6","down 4","down 9","forward 9","down 4","up 2","down 5","forward 9","down 7","forward 9","up 9","forward 9","up 7","up 2","up 6","forward 1","up 9","down 4","down 8","forward 8","forward 7","up 5","forward 4","down 3","down 5","up 9","up 5","forward 1","down 3","down 9","up 2","forward 5","down 8","down 3","forward 5","up 8","forward 1","forward 8","forward 6","down 2","down 8","down 8","down 8","forward 8","forward 9","up 2","up 9","up 8","forward 2","down 4","up 7","down 3","forward 1","forward 7","down 8","down 2","forward 6","forward 2","down 6","down 6","up 9","forward 9","down 7","forward 7","down 4","up 2","up 7","down 8","forward 6","up 2","forward 4","forward 9","down 7","forward 4","up 4","forward 8","down 4","forward 6","forward 8","down 2","down 6","up 4","forward 5","forward 1","down 2","up 6","down 6","down 3","up 2","up 4","forward 1","up 3","up 5","down 4","down 1","down 7","down 7","down 4","forward 7","down 9","down 4","down 2","down 7","forward 7","forward 8","forward 1","down 8","down 3","down 5","down 8","forward 7","forward 9","forward 3","up 8","forward 5","up 5","up 2","forward 4","forward 6","down 8","down 1","up 6","forward 5","forward 5","down 9","forward 3","up 1","down 1","forward 5","forward 5","up 5","down 4","up 6","forward 8","forward 6","up 5","forward 2","up 3","forward 9","forward 5","down 9","forward 3","forward 1","forward 4","up 5","forward 3","forward 3","up 9","down 2","down 3","down 1","forward 8","down 4","forward 8","forward 8","down 8","forward 9","forward 8","forward 7","down 6","forward 5","down 6","up 8","forward 6","down 8","forward 8","down 6","up 2","forward 5","forward 1","up 2","forward 4","down 5","up 8","up 3","forward 8","down 3","forward 4","up 5","forward 2","down 3","down 2","down 7","forward 5","down 5","forward 2","up 1","down 3","down 9","up 4","up 3","down 8","up 1","down 5","down 5","forward 7","up 2","down 3","up 3","forward 1","forward 4","forward 3","up 5","down 5","up 3","down 2","forward 6","down 6","up 3","forward 9","down 9","up 4","down 4","down 6","up 9","forward 3","forward 2","up 2","up 5","forward 2","up 5","forward 7","down 8","down 7","up 8","down 1","up 1","up 9","forward 7","forward 5","down 9","forward 8","down 8","forward 4","forward 1","forward 2","down 8","forward 3","forward 6","down 9","forward 2","forward 9","down 4","down 1","down 1","down 8","down 1","down 4","up 3","down 7","down 5","forward 1","forward 5","forward 8","forward 4","down 7","down 6","forward 2","down 3","down 3","down 3","forward 5","forward 7","down 4","forward 6","forward 9","down 1","forward 7","down 5","up 4","up 5","down 3","down 1","up 5","forward 4","down 9","down 7","up 1","up 9","up 4","forward 7","down 5","down 8","forward 5","forward 9","down 2","down 7","forward 8","forward 7","down 6","down 8","forward 3","forward 6","down 5","forward 7","up 7","down 8","forward 9","down 3","up 3","forward 4","up 4","forward 3","forward 4","forward 9","forward 5","down 3","down 6","forward 9","forward 4","forward 1","forward 7","forward 8","forward 2","forward 7","up 9","down 8","forward 4","forward 4","down 5","forward 2","forward 5","down 6","forward 4","forward 2","forward 7","down 6","down 2","down 5","down 1","forward 5")
    val commands = input.map { InputCommand.of(it) }
    // Solution 1.
    println("Solution to Part 1 - The final position of the Submarine is - "+commands.fold(Submarine(), Submarine::subFinalPositionWithTwoFactors).result())
    // Solution 2.
    println("Solution to Part 2 - The final position of the Submarine is - "+commands.fold(Submarine(), Submarine::subFinalPositionWithThreeFactors).result())
}

/**
 * Segregate input commands into name and values respectively
 */
private class InputCommand(val commandName: String, val commandValue: Int) {
    companion object {
        fun of(input: String) = input.split(" ").let { InputCommand(it.first(), it.last().toInt()) }
    }
}

private data class Submarine(val depth: Int = 0, val position: Int = 0, val aim: Int = 0) {

    /**
     * Final position of the submarine
     */
    fun result() = depth * position

    /**
     * Finding submarine position with just depth and position factors
     * forward X increases the horizontal position by X units.
     * down X increases the depth by X units.
     * up X decreases the depth by X units.
     */
    fun subFinalPositionWithTwoFactors(command: InputCommand): Submarine =
        when (command.commandName) {
            // recalculate only the position
            "forward" -> copy(position = position + command.commandValue)
            // recalculate only the depth
            "down" -> copy(depth = depth + command.commandValue)
            "up" -> copy(depth = depth - command.commandValue)
            else -> error("Invalid command")
        }

    /**
     * Finding submarine position with just depth, position and aim factors.
     * down X increases your aim by X units.
     * up X decreases your aim by X units.
     * forward X does two things:
     * It increases your horizontal position by X units.
     * It increases your depth by your aim multiplied by X.
     */
    fun subFinalPositionWithThreeFactors(command: InputCommand) =
        when (command.commandName) {
            // recalculate both position and depth with the aim factor
            "forward" -> copy(
                position = position + command.commandValue,
                depth = depth + (aim * command.commandValue)
            )
            // recalculate only the aim
            "down" -> copy(aim = aim + command.commandValue)
            "up" -> copy(aim = aim - command.commandValue)
            else -> error("Invalid command")
        }
}
