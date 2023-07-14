



fun main() {


 }





































/// Unit is equivalent to void in java

//    val (v1,v2) = twoValues()
//    println("$v1 $v2")
//    //
//    val (t1,t2,t3) = threeValues()
//    println("$t1 $v2")


//fun twoValues () : Pair<Int, String> =  Pair(10,"two") //20 to ""
//
//fun threeValues () : Triple<Int, String, Double> = Triple(1,"three",2.0)
//
//fun double (n: Int) = n*2

//fun greet (name : String, age : Int  = -1 ) {
//    if (age ==-1)
//    println("Hello $name")
//    println("age $age")
//    println(double(2))
//    foo { println("bar") }
//}
//
//fun foo (bar : ()-> Unit ){
//    println("Foo")
//    bar()
//}


//    var number = 1
//
//    do {
//        println(number)
//        number++
//    }while (number<=5)



//    val brand = "KvRae"
//    for (c in brand) {
//        println(c)
//    }
//    brand.forEach { val c= it.uppercase()
//    println(c)
//    }
//}


//    for (i in 1 ..  5 ) println(i)
//    for (i in 1 ..  5 step 2) println(i)
//
//
//    for (i in 5 downTo  1) println(i)
//    for (i in 5 downTo  1 step 2) println(i)

//val letters = charArrayOf('A', 'B', 'C', 'E')
//    for (letter in letters.indices)
//        println(letter)
//
//    println("Reversed")
//    for (letter in letters.indices.reversed())
//        println(letter)


//val names = listOf<String>("jamila","saleh", "ali", "alex")
//val numbers = intArrayOf(1,2,3,4)
//
//for (name in names) {
//    val n =name.replaceFirstChar { it.uppercase() }
//    println(n)
//}
//println(names)
////for (number in numbers) println(number)


//val names = listOf<String>("Jamila", "Jamas", "Saleh", "Peter")
//
//val (one, two,_, four) = names
//println("$one, $two,$four")

//
//val ingredients = listOf("Tomato", "Potato", "Cucumber", "Lemon")
//val ojja = listOf("Tomato1", "Onio1")
//val ojjaMerguez = listOf("Tomato", "Potato")
//val harisa = listOf("Cucumber", "Spice")
//val okla = listOf("Potato", "Cucumber")
//
//val recipes = arrayOf(ojja,harisa,okla,ojjaMerguez)
//val recipeFullIngredients = mutableListOf<List<String>>()
//val  recipePartIngredients = mutableListOf<List<String>>()
//for (recipe in recipes) {
//    for (ingredinet in ingredients) {
//        if (recipe.contains(ingredinet) && !recipePartIngredients.contains(recipe)) recipePartIngredients.add(recipe)
//    }
//    if (ingredients.containsAll(recipe) && !recipeFullIngredients.contains(recipe)) recipeFullIngredients.add(recipe)
//}
//
//println("Recipes contains all your Ingredients")
//if (recipeFullIngredients.size>0) println(recipeFullIngredients) else println("There is not recipes contains all ingredients")
//
//println("Recipes contains parts your Ingredients")
//if (recipePartIngredients.size>0) println(recipePartIngredients) else println("There is not recipes contains some of ingredients")
//





//    val names = arrayOf("Jamila",
////        "Jamas", "Sami"
////    )
////
////    println(names[0])
////    println(names[1])
////    println(names[2])
////    if ("Jamas" in names) println("Found") else println("Not Found")
////    println(names.contentToString())
////
////
////
////
////    val nulls = arrayOfNulls<String>(5)
////    nulls[4] = "Hello"
////    println(nulls.contentToString())



//    var value : Int
//    value = readln().toInt()
//
//    var f =when(value) {
//        1 -> "1"
//        2 -> "2"
//        3 -> "3"
//        4 -> "4"
//        else ->{
//            "wtf"
//        }
//    }
//    println(f)
//    val age = 18
//    when(age){
//        in 18..20 -> println("teenange")
//        !in 12 downTo 10 -> println("teenange2")
//
//    }
//
//    val  isAdult : Boolean? = null
//
//    if (isAdult == true) println("true ") else println("not true")
//    var n1 = 10
//    var n2 = 20
//    n1 = 20
//    n2 = 20
//
////    var result = n1 > n2 ? "happy face" : ""
////    var result = if (n1 > n2) "happy face" else ""
//    val isAdult = true
//    val isFenmale = false
//    println(isFenmale && isAdult)
//    println(isFenmale || isAdult)
//
////
//val name1 = "Ahmed"
//val name2 = String("Ahmed".toCharArray())
//
//println(name1 == name2) // value
//println(name1 === name2) // reference
//val name ="AHMED"
//val name2= "AHMED"
//
//val msg = "Name $name, Name2 $name2"
//print(msg)

//    println(name.subSequence(0,3))
//    println(name.hashCode() == name2.hashCode())
//    println(name.equals(name2))

//fun getI(){
//
//}

//const val Pi = 3.41 //static final
//val î = getI()

//    var brand:  String? = "null string"
//    println(brand?.uppercase())


// val multiLinemsg = """
//     hello %s
//     how we doing
// """.trimIndent()
//
//    print(multiLinemsg.format("karam"))