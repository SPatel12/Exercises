package lesson2

class InputStr {


    public static void run(String text) {

        String InString

        if (text == "") {
            InString = AskInput.doStuff("Enter String")
        } else {
            InString = text
        }
        int Innum = InString.length()

        print(InString + " has " + Innum)

    }

}


//
//    public static void main(String[] args) {
//
//        InputStr sj = new InputStr();
//        sj.run("")
//
//
//    }
//}
