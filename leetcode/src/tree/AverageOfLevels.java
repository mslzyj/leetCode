package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 637. 二叉树的层平均值
 */
public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averageList = new ArrayList<>();
        if(root == null){
            return averageList;
        }
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        List<List<Double>> lists = new ArrayList<>();
        while(list.size() > 0){
            List<TreeNode> tempList = new ArrayList<>();
            List<Double> valList = new ArrayList<>();
            for (TreeNode node : list) {
                if(node.left != null){
                    tempList.add(node.left);
                }
                if(node.right != null){
                    tempList.add(node.right);
                }
                valList.add(Double.valueOf(String.valueOf(node.val)));
            }
            list.clear();
            list = tempList;
            lists.add(valList);
        }
        for (int i = 0; i < lists.size(); i++) {
            int count = 0;
            double sum = 0;
            for (int j = 0; j < lists.get(i).size(); j++) {
                sum += lists.get(i).get(j);
                count++;
            }
            averageList.add(sum / count);
        }
        return averageList;
    }
}
