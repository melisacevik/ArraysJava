public class HarmonikOrtalama {
    public static void main(String[] args) {

        int[] list = { 1,2,3,4,5,6,7,8};
        double harmonikSeri = 0.0;

        for( int i = 1; i < list.length; i++ ){
            harmonikSeri += 1.0 / list[i];
        }

        double harmonikOrtalama = list.length / harmonikSeri;
        System.out.println(harmonikOrtalama);

    }
}
