/**
 * @autor zyj
 * @date 2020/10/18 17:00
 */
public class Main {
    private String str;
    private int num;

    public Main(String str,int num){
        this.str = str;
        this.num = num;

    }


    public static void main(String[] args) {
        String str = "定义很度额就诶与68";
        System.out.println(str.getBytes().length);
        System.out.println(str.length());
    }
    public void splitIt(){
        String temp = null;

        //记录已经截取的字节
        StringBuffer sb = new StringBuffer();

        //记录已经截取的字节长度
        int len = 0;

        for(int i = 0;i<num&&len<num;i++){

            //获取单个字符
            temp = String.valueOf(str.charAt(i));
            //获取单个字符的字节数,累加
            len += temp.getBytes().length;
            //拼接到目标字符串上
            sb.append(temp);
        }

        System.out.println(sb.toString());

    }

}
