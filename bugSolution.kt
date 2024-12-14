fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    // To modify the original mutableList, use mapTo
    mutableList.mapTo(mutableList) { it * 2 }
    println(mutableList) // Output: [2, 4, 6, 8, 10]
    
    //Alternatively, you can use mapIndexedTo to modify based on index
    val anotherMutableList = mutableListOf(1, 2, 3, 4, 5)
    anotherMutableList.mapIndexedTo(anotherMutableList){index, value -> value + index}
    println(anotherMutableList) // Output: [1, 3, 5, 7, 9]
} 