fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) //This will print [2, 4, 6, 8, 10] 

    // Trying to modify an immutable list will result in an error
    // list.add(6) // This will not compile

    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)
    mutableList.remove(2)
    println(mutableList) // This will print [1, 3, 4]
    
    //Demonstrate that list is immutable. 
    val newList = list + 6
    println(newList) //This will print [1, 2, 3, 4, 5, 6]
    println(list) //This will print [1, 2, 3, 4, 5]

} 