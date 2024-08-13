import scala.io.StdIn.readLine

object QuestionTwo {

    val isMultipleofThree = (n: Int) => n%3 == 0
    val isMultipleofFive = (n: Int) => n%5 == 0

    def main(args: Array[String]): Unit = {

        println("Enter an integer : ")
        val input = readLine().toInt

        val message = (isMultipleofThree(input), isMultipleofFive(input)) match {
            case (true, true) => "Multiple of both Three and Five"
            case (true, false) => "Multiple of Three"
            case (false, true) => "Multiple of Five"
            case (false, false) => "Not a Multiple of Three or Five"
        }

        println(message)
    }
}