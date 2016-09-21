package lesson2

class AskInput {

    public static String doStuff(String doStuffstring) {

        Scanner scanner = new Scanner(System.in)
        String InString = ''

        while (InString.length() == 0) {
            print(doStuffstring)
            InString = scanner.nextLine()
        }
        return InString
    }

}



