
public class MainClass {

    public static void mySearch(String[] args) {
        int[] inputArray = {1, 4, 2, 67};
        int key = 2;

        System.out.println("The array is: " + inputArray.toString());
        System.out.println("The key is: " + key);

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == key) {
                return i;
            }
        }

        System.out.println("The key " + i + "was found in the array");
    }
}
