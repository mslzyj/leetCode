package arrays;

/**
 * 1491. 去掉最低工资和最高工资后的工资平均值
 */
public class Average {
    public static void main(String[] args) {
       int [] a = {4000,3000,1000,2000};
        System.out.println(average(a));
    }

    public static double average(int[] salary) {
      double sum = 0d;
      int max = salary[0];
      int min = salary[0];
      for (int i = 0; i < salary.length; i++) {
          if(salary[i] > max ){
              max = salary[i];
          }
          if(salary[i] < min){
              min = salary[i];
          }
          sum += salary[i];
      }
      sum = (sum - max - min) / (salary.length - 2);
      return sum;
    }
}
