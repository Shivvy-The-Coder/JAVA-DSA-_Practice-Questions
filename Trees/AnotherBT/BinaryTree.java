package AnotherBT;

import java.util.Scanner;

public class BinaryTree {

    class Node 
    {
        int data;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);
    public BinaryTree()
        {
            root=createTree();
        }

    public void Display()
        {
            Display(root);
        }

    private void Display(Node root)
        {

                if(root==null)
                    return;
                
                String s = " <- " + root.data + " -> ";
                if(root.left!=null)
                    {
                        s=root.left.data+s;
                    }
                else
                    {
                        s=" NULL "+s;
                    }

                if(root.right!=null)
                    {
                        s=s+root.right.data;
                    }
                else
                    {
                        s+=" NULL ";
                    }
                System.out.println(s);
                Display(root.left);
                Display(root.right);
                
        }

    public void ReturnGreatest()
        {
            System.out.println(ReturnGreatest(this.root));
        }
    private int ReturnGreatest(Node root)
        {
            if(root==null)
                return Integer.MIN_VALUE;
            
            int leftMax= ReturnGreatest(root.left);
            int righttMax= ReturnGreatest(root.right);
            return Math.max(root.data,Math.max(leftMax,righttMax));
        }

        
        private int ReturnSmallest(Node root) {
            if (root == null)
                return Integer.MAX_VALUE;

            int leftMax = ReturnSmallest(root.left);
            int righttMax = ReturnSmallest(root.right);

            return Math.min(root.data, Math.min(leftMax, righttMax));
        }
        
        public void ReturnSmallest() {
            System.out.println(ReturnSmallest(this.root));
        }

    public Node createTree()
    {
        Node nn = new Node();
        int value=sc.nextInt();
        
        nn.data=value;

        Boolean hlc = sc.nextBoolean();
        if(hlc)
            nn.left=createTree();
        else    
            nn.left=null;
        
        Boolean hrc = sc.nextBoolean();
        if(hrc)
            nn.right=createTree();
        else    
            nn.right=null;

        return nn;
    }


    public boolean find(int item)
        {
            return find(root ,item);
        }
    private boolean find(Node root, int item)
        {
            if(root ==null)
                return false;
            
            if(root.data==item)
                return true;
           boolean l=find(root.left,item);
           boolean r=find(root.right,item);

           return l||r;

        }

    public void height() 
        {
            System.out.println(height(root,0));
        }
    private int height (Node root,int c)
        {
            if (root==null)
                {
                    return ;
                }
            int  Leftheight=height(root, c+1);
            int  rihtheight=height(root, c+1);
            return Math.max(Leftheight, rihtheight)+1;
        }
    }
