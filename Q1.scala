import scala.io.StdIn.readInt

object Q1{
    def main(args: Array[String]) :Unit = {
        var deposit = readInt();
        println("Interest Gain: " + interest(deposit));
    }

    def interest(deposit: Int): Double = deposit match{
        case x if deposit <= 20000 => deposit * 0.02;
        case x if deposit <= 200000 => deposit * 0.04;
        case x if deposit <= 2000000 => deposit * 0.035;
        case _ => deposit* 0.065
    }


}