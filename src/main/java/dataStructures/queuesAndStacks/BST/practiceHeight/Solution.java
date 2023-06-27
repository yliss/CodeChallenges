package dataStructures.queuesAndStacks.BST.practiceHeight;

import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
/*
7
3
5
2
1
4
6
7
**
9
20
50
35
44
9
15
62
11
13
 */
    public static int getHeight(Node root){
        int leftCount=search(root.left,0);
        int rightCount=search(root.right, 0 );
        return leftCount > rightCount? leftCount: rightCount;
    }
    public static int search(Node root, int count){
        if (root == null)
            return count;

        if (root.left !=null){
            count ++;
            count= search(root.left,count);
        }

        if (root.right !=null){
            count ++;
            count= search(root.right,count);
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