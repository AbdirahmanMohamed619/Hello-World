
/**
 * Write a description of class RenameThisClass here.
 *
 * Abdirahman Mohamed
 * 9/29/22
 */
public class Arrays
{
    public static void main(String[] args) {
          String[] strArray = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        for (String i: strArray) {
            System.out.println(i);
        }
        for (int i = 0; i < strArray.length; i++) {
                System.out.print(strArray[i]);
        }
        System.out.println();
        for (int g = 0; g < strArray.length; g++) {
                System.out.print(strArray[g] + "-");
        }
    }
}