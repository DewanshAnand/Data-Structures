package com.company;
import com.sun.source.tree.Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static TreeNode<Integer> takeInput(Scanner s){
        System.out.println("Enter node data : ");
        TreeNode<Integer> root = new TreeNode<>(s.nextInt());
        System.out.println("Enter Number of Children: ");
        int childCount = s.nextInt();
        for(int i=0; i<childCount; i++){
            TreeNode<Integer> child = takeInput(s);
            root.children.add(child);
        }
        return root;
    }

    public static int numNodes(TreeNode<Integer> root){
        int count = 1;
        for(int i=0; i<root.children.size(); i++){
            count += numNodes(root.children.get(i));
        }
        return count;
    }

    public static int largest(TreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for(int i=0; i<root.children.size(); i++){
            int childLargest = largest(root.children.get(i));
            if(childLargest>ans){
                ans = childLargest;
            }
        }return ans;
    }

    public static int heightNode(TreeNode<Integer> root){
        //int height = 1;
        if(root==null){
            return 0;
        }
        int max = 0;
        for(int i=0; i<root.children.size(); i++){
            if(max<heightNode(root.children.get(i))){
                max = heightNode(root.children.get(i));
            }
            //height = height + heightNode(root.children.get(i));
        }
        return (max+1);
    }

    public static void printAtK(TreeNode<Integer> root, int k){
        if(k<0){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }
        for(int i=0; i<root.children.size(); i++){
            printAtK(root.children.get(i), k-1 );
        }
    }

    public static int countLeafNode(TreeNode<Integer> root){
        int count = 1;
        if(root.children.size() == 0){
            return 1;
        }
        for(int i=0; i<root.children.size(); i++){
            count = count + countLeafNode(root.children.get(i));
        }
        return count;
    }

    public static void printNode(TreeNode<Integer> root){
        System.out.print(root.data + " : ");
        for(int i=0; i<root.children.size(); i++){
            System.out.print(root.children.get(i).data + " , ");
        }
        System.out.println();
        for(int j=0; j< root.children.size(); j++){
            printNode(root.children.get(j));
        }
    }

    public static TreeNode<Integer> takeInputLevelWise(Scanner scn){
        //Scanner scn = new Scanner(System.in);
        System.out.println("Enter Root data: ");
        int rootData = scn.nextInt();
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        TreeNode<Integer> root = new TreeNode<Integer>(rootData);
        pendingNodes.offer(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode = pendingNodes.poll();
            System.out.println("Enter Number of Children of" + frontNode.data);
            int numChildren = scn.nextInt();
            for(int i=0; i<numChildren; i++){
                System.out.println("Enter " + (i+1) + "th child of" + frontNode.data);
                int child = scn.nextInt();
                TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                frontNode.children.add(childNode);
                pendingNodes.offer(childNode);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //TreeNode<Integer> root = takeInput(scn);
        // printNode(root);
        TreeNode<Integer> root = takeInputLevelWise(scn);
        printNode(root);
        System.out.println(heightNode(root));
    }
}
