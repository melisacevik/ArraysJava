import java.util.Arrays;

public class ArraysClasses {
    public static void main(String[] args) {

        //toString()
        /*
        int[] list = { 0, 1, 2, 3, 4, 5,6,7};
        System.out.println(Arrays.toString(list));

         */

        //fill()
        /*
        int[] list = { 1,2,3,4,5,6,7};
        Arrays.fill(list, 10);
        System.out.println(Arrays.toString(list));

         */

        //sort()
        /*
        int[] list = {1,2,4,535,23,-42,-34,18383};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

         */

        //binarySearch()
        /*
        int[] list = {1,2,23,43,11,-10,-23};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.binarySearch(list, -10));

         */

        //copyOf()
        int[] list = { 1,23,23,11,22,342,53,55};
        int[] copy = Arrays.copyOf(list, list.length);
        int[] copy2 = Arrays.copyOf(list, 3);
        System.out.println(Arrays.toString(copy2 ));
    }
}
