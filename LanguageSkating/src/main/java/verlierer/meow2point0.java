
package meow;


public class meow2point0 {
    
private String[] word;

public static String[] Words(String[] word){
    
    int size = word.length;
        for (int i=0; i<size; i++)
        {
            System.out.println(word[i]);
        }
        
    return word;
 }

private void populateStringArray()
{
    word = new String[3];
    word[0] = "Hello";
    word[1] = "Goodbye";
    word[2] = "Yes";

  
}
}