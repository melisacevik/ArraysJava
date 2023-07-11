public class Ortalama {
    public static void main(String[] args) {
        int[] list = { 23,24,55,66,-10,22,44,0};
        double sum = 0.0;

        for(int i = 0; i < list.length; i++){
            sum += list[i];
        }

        double avarage = sum / list.length;
        System.out.println(avarage);
    }
}
