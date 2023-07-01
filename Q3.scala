object Q3{
    def main(args: Array[String]): Unit ={
        var str_arr : List[String] = List("Benny", "Niroshan", "Saman", "Kumara");
        println(formatNames(str_arr(0), toUpper));   
        println(formatNames(str_arr(1), mixString));    
        println(formatNames(str_arr(2), toLower));
        println(formatNames(str_arr(3), start_End_Caps));
    }


    //String Changing Functions
    def toUpper(str:String): String = {
        return str.toUpperCase();
    }

    def toLower(str:String): String = {
        return str.toLowerCase();
    }

    def mixString(str:String):String ={
        var len = str.length();
        if(len > 2){
            return (str.substring(0, 2).toUpperCase() + str.substring(2, len).toLowerCase());
        }
        else{
            return str.toUpperCase();
        }
    }

    def start_End_Caps(str:String): String ={
        var len = str.length();
        if(len > 2){
            return (str.substring(0, 1).toUpperCase() + str.substring(2, len-1).toLowerCase() + str.substring(len-1, len).toUpperCase());
        }
        else{
            return str.toUpperCase();
        }
    }


    //Function which gives a function as a parameter
    def formatNames(name:String, formatFunction: String => String): String = {
        return formatFunction(name);
    }

}