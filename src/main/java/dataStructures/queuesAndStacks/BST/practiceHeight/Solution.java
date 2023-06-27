package dataStructures.queuesAndStacks.BST.practiceHeight;

import java.util.Scanner;
/*
Problem: https://www.hackerrank.com/challenges/30-binary-search-trees
 */
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    public static int getHeight(Node root){
        int leftCount=searchL(root.left,1);
        int rightCount=searchR(root.right, 1 );
        return leftCount > rightCount? leftCount: rightCount;
    }
    public static int searchL(Node root, int count){
        if (root == null)
            return count;

        if (root.left !=null){
            count ++;
            count= searchL(root.left,count);
            return count;
        }
        return count;
    }

    public static int searchR(Node root, int count){
        if (root == null)
            return count;

        if (root.right !=null){
            count ++;
            count= searchR(root.right,count);
            return count;
        }
        return count;
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}