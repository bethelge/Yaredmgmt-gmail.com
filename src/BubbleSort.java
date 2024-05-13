//question 4
public class BubbleSort {
    public static void main(String[] args) {
        char[] characters = {'A','S','C','I','I'};
        int size = characters.length;
        char temp = 0;
        System.out.println("before sorting");
        for (char words : characters) {
            System.out.print(words+" ");
        }
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i- 1; j++) {
                if (characters[j] > characters[j + 1]) {
                    temp = characters[j];
                    characters[j] = characters[j + 1];
                    characters[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting");
        for (char words : characters) {
            System.out.print(words +" ");

        }
    }
}

