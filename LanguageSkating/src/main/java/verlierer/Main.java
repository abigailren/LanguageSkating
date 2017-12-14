package verlierer;
import acm.program.*;
import java.util.*;

public class Main extends GraphicsProgram{

    public static void main(String[] args){
        new Main().start(args);




    }

    public void run(){
        Language language = new German();
        ArrayList<String> wordList = language.genRandList();
        System.out.println(wordList.get(0));
        Opening open = new Opening();
        open.main(null);
    }
}
