package heap;

/**
 * 215. 数组中的第K个最大元素
 */
public class Topheap {

    public static void main(String[] args) {
        int [] nums = new int[]{3,5,6,7,8,9,10};
        int k = 4;
        int  a = findKLargest(nums,k);
        System.out.print( a );
    }

    public static int findKLargest(int [] nums ,int k){
        int length = nums.length;
        //构建大顶堆
        buildBigheap(nums,length);
        //删除根节点，末尾节点上移到根节点
        for (int i = nums.length - 1; i >= nums.length - k +1; --i) {
            //交换
            swaps(nums,0,length - 1);
            //删除
            --length;

            buildBigheap(nums,length);

        }
        return nums[0];
    }

    /**
     * 构建大顶堆
     * @param nums
     */
    public static void buildBigheap(int [] nums,int length){
        for (int i = length / 2 ; i >= 0; --i) {
            build(nums,length,i);
        }
    }

    public static void build(int [] nums,int length,int i){
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int max = i;

        if(l < length && nums[l] > nums[max]){
            max = l;
        }

        if(r < length && nums[r] > nums[max]){
            max = r;
        }

        if(max != i){
            swaps(nums,max,i);
            build(nums,length,max);
        }
    }

    public static void swaps(int [] nums,int max,int i){
        int temp = nums[max];
        nums[max] = nums[i];
        nums[i] = temp;
    }

}
