public class Main {

    static int[] reverse(int[] List) {
        int[] reverse = new int[List.length];
        for (int i = 0, j = List.length - 1; i < List.length;i++,i-- ) {
            reverse[i] = List[j];
        }
        return reverse;
    }

    static void printArray(int[] list) {
        for (int i =0; i < list.length; i++){
            System.out.print(list[i]);
        }
    }




    public static void main(String[] args) {

        int[]list = {10,20,30,40,50,60,70,80,90};
        int[] newListe = reverse(list);
        printArray(newListe);

    }
}