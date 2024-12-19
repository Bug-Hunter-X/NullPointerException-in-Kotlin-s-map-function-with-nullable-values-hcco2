fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    // Correct usage of map with null values using the let function
    val nullableList = listOf(1, 2, null, 4, 5)
    val nullableResult = nullableList.map { it?.let { it * 2 } ?: 0 }
    println(nullableResult) // Output: [2, 4, 0, 8, 10]

    //Alternative solution using the safe-call operator and elvis operator
    val nullableResult2 = nullableList.map { it * 2 ?: 0 }
    println(nullableResult2) // Output: [2, 4, 0, 8, 10]
} 