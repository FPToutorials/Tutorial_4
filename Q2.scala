import scala.io.StdIn.readInt
object Q2{
    def main(args: Array[String]): Unit = {
        var x = readInt();
        println(patternMatching(x));
    }

    def patternMatching(num:Int): String = num match{
        case x if (num < 0) => "negative Number."
        case x if (num == 0) => "Zero."
        case x if (num % 2 == 0) => "Even Number."
        case x if (num % 2 != 0) => "Odd Number." 
    }
}