# Kotlin map function and NullPointerException

This repository demonstrates a common error encountered when using the `map` function in Kotlin with lists containing nullable values.  The `map` function, when applied to a list with null elements, throws a `NullPointerException` if the lambda expression doesn't handle nulls gracefully. This example shows the problem and the solution.

The `bug.kt` file contains code that causes this exception.  The `bugSolution.kt` demonstrates how to handle the issue using the `let` function or the safe call operator.  Consider the context of your application and the appropriate null handling approach for best results.