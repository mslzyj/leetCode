package greedy;

/**
 * 860. 柠檬水找零
 */
public class LemonadeChange {
    public static void main(String[] args) {
        int [] a = {5,5,5,10,20};
        System.out.println(lemonadeChange(a));

    }
    
    public static boolean lemonadeChange(int[] bills) {
        int num5 = 0;
        int num10 = 0;
        for (int i = 0; i < bills.length; i++) {
            if(bills[i] == 20){
                if(num5 == 0){
                    return false;
                } else if(num10 == 0){
                    if(num5 > 2){
                        num5 -= 3;
                    }else{
                        return false;
                    }
                }else{
                    num5--;
                    num10--;
                }
            }
            if(bills[i] == 10){
                if(num5 > 0){
                    num5--;
                    num10++;
                }else{
                    return false;
                }

            }
            if(bills[i] == 5){
                num5 ++;
            }
        }
        return true;
                
    }
}
