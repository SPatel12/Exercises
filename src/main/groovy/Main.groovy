import lesson2.AskInput
import lesson2.InputStr
import lesson47.api

import javax.script.ScriptEngine
import javax.script.ScriptEngineManager



class Main {

    public static void main(String[] args) {

        String confirmation
        String Program
        String ProgramString = AskInput.doStuff("What program or test would like?")
        InputStr p1 = new InputStr()
        def p2 = new api()


        switch (ProgramString) {
            case "Program 1" : Program = " Completed..."
                    p1.run("")
                break
            case "Program 2" : Program = " Completed..."
                p2.run()
                break

            default :   confirmation = "program not found, please try again...";
                break
            println("\n" + confirmation);
        }
    }
}

