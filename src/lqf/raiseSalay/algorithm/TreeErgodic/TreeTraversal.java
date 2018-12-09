package lqf.raiseSalay.algorithm.TreeErgodic;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode treeNode8 = new TreeNode(8,null,null);
        TreeNode treeNode7 = new TreeNode(7,null,null);
        TreeNode treeNode6 = new TreeNode(6,null,null);
        TreeNode treeNode5 = new TreeNode(5,null,null);
        TreeNode treeNode4 = new TreeNode(4,treeNode8,null);
        TreeNode treeNode3 = new TreeNode(3,treeNode6,treeNode7);
        TreeNode treeNode2 = new TreeNode(2,treeNode4,treeNode5);
        TreeNode treeNode1 = new TreeNode(1,treeNode2,treeNode3);
        ArrayList<Integer> arrayResult = breadthTraversal(treeNode1);
        System.out.println("广度遍历："+arrayResult.toString());
        ArrayList<Integer> arrayList = depthTraversal(treeNode1);
        System.out.println("深度遍历_非递归："+arrayList.toString());
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        depthTraversal2(treeNode1,arrayList2);
        System.out.println("深度遍历_递归："+arrayList2.toString());
    }
    //广度优先遍历，非递归
    private static ArrayList<Integer> breadthTraversal(TreeNode treeNode1) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        TreeNode treeNode = null;
        queue.add(treeNode1);
        while (null != queue && queue.size()>0) {
            treeNode = queue.poll();
            if( null!= treeNode.leftNode) {
                queue.add(treeNode.leftNode);
            }
            if( null != treeNode.rightNode) {
                queue.add(treeNode.rightNode);
            }
            arrayList.add(treeNode.value);
        }
        return arrayList;
    }
    //深度优先遍历，非递归
    private static ArrayList<Integer> depthTraversal(TreeNode treeNode1) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<TreeNode> depStack = new Stack<TreeNode>();
        depStack.push(treeNode1);
        TreeNode treeNode = null;
        while (null != depStack && depStack.size()>0) {
            treeNode = depStack.pop();
            if(null != treeNode.rightNode) {
                depStack.push(treeNode.rightNode);
            }
            if(null != treeNode.leftNode) {
                depStack.push(treeNode.leftNode);
            }
            arrayList.add(treeNode.value);
        }
        return arrayList;
    }
    //深度优先遍历  递归
    private static ArrayList<Integer> depthTraversal2(TreeNode treeNode1,ArrayList<Integer> arrayList) {
        if(null != treeNode1) {
            arrayList.add(treeNode1.value);
        }
        if(null != treeNode1.leftNode) {
            depthTraversal2(treeNode1.leftNode,arrayList);
        }
        if(null != treeNode1.rightNode) {
            depthTraversal2(treeNode1.rightNode,arrayList);
        }
        return arrayList;
    }
}
