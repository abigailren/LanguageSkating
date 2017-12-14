package verlierer;
import acm.program.*;
import acm.graphics.*;

public class ParagraphApp extends GraphicsProgram {

    private static String TEXT1 = "Dark Souls is an action role-playing video game "
            + "developed by FromSoftware and published by Namco Bandai Games for "
            + "PlayStation 3, Xbox 360, and Microsoft Windows. A spiritual "
            + "successor to FromSoftware's Demon's Souls, it is the second installment"
            + " in the Souls series of games.";
    private static String TEXT2 = "According to all known laws of aviation, there "
            + "is no way that a bee should be able to fly. Its wings are too small "
            + "to get its fat little body off the ground. The bee, of course, flies"
            + " anyways. Because bees don't care what humans think is impossible.";
    
    public void run() {
        Paragraph paragraph1 = new Paragraph(40, TEXT1);
        paragraph1.move(100, 200);
        
        Paragraph paragraph2 = new Paragraph(40, TEXT2);
        paragraph2.move(400, 200);
        
        add(paragraph1);
        add(paragraph2);
    }
    
    public static void main(String[] args) {
        new ParagraphApp().start();
    }
    
}
