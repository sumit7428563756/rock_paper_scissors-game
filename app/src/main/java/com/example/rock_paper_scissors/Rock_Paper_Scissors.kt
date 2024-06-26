package com.example.rock_paper_scissors

 fun main() {

     var Computerchoice = ""
     var Playerchoice = ""

     println(" Choose one of them :  Rock , Paper , Scissors! , it's your choice")

     Playerchoice = readln()

     val randomNumber = (1..3).random()

     when (randomNumber) {
         1 -> {
            Computerchoice = "ROCK"
         }

         2 -> {
             Computerchoice = "PAPER"
         }

         else -> {
             Computerchoice = "SCISSORS"
         }
     }

     println(Computerchoice)

     val Winner = when {

         Playerchoice == Computerchoice -> "TIE"
         Playerchoice == "ROCK" && Computerchoice == "SCISSORS" -> "Player"
         Playerchoice == "PAPER" && Computerchoice == "ROCK" -> "Player"
         Playerchoice == "SCISSORS" && Computerchoice == "PAPER" -> "Player"
         else -> "COMPUETER WINS"
     }

     if (Winner == "TIE"){
         println("IT'S A TIE, LETS TRY AGAIN")
     }
     else if(Winner == "Player"){
         println("CONGRATS! YOU WIN")
     }
     else{
         println("LOOSER! COMPUTER WINS")
     }

 }