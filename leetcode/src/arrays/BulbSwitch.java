package arrays;

public class BulbSwitch {
    public static void main(String[] args) {

        System.out.println(bulbSwitch(99999999));

    }
    public static  int bulbSwitch(int n) {
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        //0表示开，1表示关
        for (int i =1; i < n; i++) {
            int j =  i + 1;
            while (j <=  n  ){
                arr[j -1] = - arr[j -1];
                j += i + 1 ;
            }
        }
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                num++;
            }
        }
        return  num;
    }
}
