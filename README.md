# Kotlin's map() Function on Mutable Lists

This example demonstrates a common source of confusion when using the `map()` function in Kotlin with mutable lists.  Many developers expect `map()` to modify the original list directly, but this is not the case unless `mapTo` is used.

The `bug.kt` file showcases this behavior.  The solution, found in `bugSolution.kt`, illustrates how to properly modify a mutable list using `map()`.