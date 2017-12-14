package verlierer;
import acm.graphics.*;
import java.util.*;

public class Paragraph extends GCompound {
    
    protected int MAX_CHARS;
    protected String text;
    protected GLabel[] lines;
    
    public Paragraph(int chars, String text) {
        this.MAX_CHARS = chars;
        this.text = text;
        int estimatedLines = text.length() / chars;
        this.lines = new GLabel[estimatedLines];
        createLabels();
        adjustPositions();
        addLabels();
    }
    
    public void createLabels() {
        StringTokenizer tokenizer = new StringTokenizer(text);
        String line = null;
        int lineCount = 0;
        while (tokenizer.hasMoreElements()) {
            String current = tokenizer.nextToken();
            if(line==null) {
                line = current+" ";
            }
            else if (line.length()+current.length()<=MAX_CHARS) {
                line += current+" ";
            }
            else {
                GLabel label = new GLabel(line);
                line = current+" ";
                if (lineCount<lines.length) { lines[lineCount] = label;}
                else {
                    increaseSize();
                    lines[lineCount] = label;
                }
                lineCount++;
            }
        }
        GLabel label = new GLabel(line);
        if (lineCount<lines.length) { lines[lineCount] = label;}
        else {
            increaseSize();
            lines[lineCount] = label;
        }
    }
    
    private void increaseSize() {
        GLabel[] temp = new GLabel[lines.length+1];
        for (int i=0; i<lines.length; i++) {
            temp[i] = lines[i];
        }
        lines = temp;
    }
    
    private void adjustPositions() {
        for (int i=0; i<lines.length; i++) {
            GLabel label = lines[i];
            label.move(0, 15*i);
            lines[i] = label;
        }
    }
    
    public void addLabels() {
        for (int i=0; i<lines.length; i++) {
            GLabel label = lines[i];
            if (label!=null) add(label);
        }
    }
    
}
