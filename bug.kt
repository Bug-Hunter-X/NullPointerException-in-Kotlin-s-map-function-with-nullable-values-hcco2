fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    // Incorrect usage of map with null values
    val nullableList = listOf(1, 2, null, 4, 5)
    val nullableResult = nullableList.map { it * 2 }
    println(nullableResult) //This will throw NullPointerException
}