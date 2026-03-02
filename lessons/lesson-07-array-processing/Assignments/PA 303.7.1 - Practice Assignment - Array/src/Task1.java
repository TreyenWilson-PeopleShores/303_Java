public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        for(int x = 1; x<array.length+1; x++){
            if(x>3){
                break;
            }
            array[x-1] = x;
            System.out.println(array[x-1]);

        }
    }
}