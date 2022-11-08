fun main (){
    val options = arrayOf("Rock", "Paper", "Scissors" )
    val gameChoise = getGameChoice(options)

    val userChoise = getUserCoise (options)
    printResult(userChoise, gameChoise)
}
fun getGameChoice (options : Array <String>):String{
    val random = (Math.random()*options.size).toInt()
    val gameChoise = options[random]
    return gameChoise
}

fun getUserCoise (options: Array<String>):String{
    var isValidChoise = false
    var userChoise = ""
    while (!isValidChoise) {
        print("Please enter one of the following: ")
        for (item in options) print(" $item")
        println(".")
        val userInput = readLine()
        if (userInput != null && userInput in options){
            isValidChoise = true
            userChoise = userInput
        }
        if (!isValidChoise) println("You must enter a valid choise.")
    }
    return userChoise

}

fun printResult(userChoise: String, gameChoise : String){
    val result:String
    if (userChoise == gameChoise) result = "Tie!"
    else if ((userChoise == "Rock" && gameChoise == "Scissors") ||
        (userChoise == "Paper" && gameChoise == "Rock") ||
        (userChoise == "Scissors" && gameChoise == "Paper"))
        result = "You win!"
    else result = "You lose!"
    println("You chose $userChoise. I chose $gameChoise . $result")
}