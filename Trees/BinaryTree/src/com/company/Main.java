package com.company;
import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        int rootData;
        System.out.print("Enter node data: ");
        rootData = s.nextInt();
        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }

    public static void print(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data + ":");
        if(root.left!=null){
            System.out.print(" L-" + root.left.data);
        }
        if(root.right!=null){
            System.out.print(" R-" + root.right.data);
        }
        System.out.println();
        print(root.left);
        print(root.right);

    }

    public static BinaryTreeNode<Integer> takeInputLevelWise(Scanner s ){
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data: ");
        int rootData = s.nextInt();
        if(rootData == -1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.offer(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> currentNode = pendingNodes.poll();
            System.out.println("Enter left child of " + currentNode.data + " : ");
            int leftChild = s.nextInt();
            if(leftChild != -1){
                //root.left = null;
                BinaryTreeNode<Integer> leftRoot = new BinaryTreeNode<>(leftChild);
                currentNode.left = leftRoot;
                pendingNodes.offer(leftRoot);
            }
            System.out.println("Enter right child of " + currentNode.data + " : " );
            int rightChild = s.nextInt();
            if(rightChild != -1){
                //root.right = null;
                BinaryTreeNode<Integer> rightRoot = new BinaryTreeNode<>(rightChild);
                currentNode.right = rightRoot;
                pendingNodes.offer(rightRoot);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInputLevelWise(scn);
        print(root);

    }
}
