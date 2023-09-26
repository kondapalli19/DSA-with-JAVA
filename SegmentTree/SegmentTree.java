class SegmentTree {
    private static class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;
   
    public Node(int startInterval, int endInterval){
        this.startInterval=startInterval;
        this.endInterval=endInterval;
    }
      }
    Node root;
    public SegmentTree(int[] arr){
        this.root=constructTree(arr, 0, arr.length-1);
    }
    private Node constructTree(int[] arr, int start, int end){
        if(start==end){
            // base condition or leaf
            Node leaf=new Node(start, end);
            leaf.data=arr[start];
            return leaf;
        }
        Node node=new Node(start, end);
        int mid=start+(end-start)/2;
        node.left=constructTree(arr, start, mid);
        node.right=constructTree(arr, mid+1, end);
        node.data=node.left.data+node.right.data;
        return node;
        
    }
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str="";
        if(node.left!=null){
            str+="Left node in intervals [ "+node.left.startInterval+" - "+node.left.endInterval+" ] and data is "+node.left.data+" =>";
        }
        else{
            str+="No left Child =>";
        }
        str+=" Root node in intervals [ "+node.startInterval+" - "+node.endInterval+" ] and data is "+node.data;
        if(node.right!=null){
            str+=" <= Right node in intervals [ "+node.right.startInterval+" - "+node.right.endInterval+" ] and data is "+node.right.data;
        }
        else{
            str+=" <= No Right Child";
        }
        System.out.println(str+'\n');
         if(node.left!=null){
            display(node.left);
         }
         if(node.right!=null){
            display(node.right);
         }

    }
    public int query(int qst,int qei){
        return this.query(this.root, qst, qei);
    }
    private int query(Node node, int qst, int qei){
        // Check for no overlap
    if (node == null || node.endInterval < qst || node.startInterval > qei) {
        return 0; // No overlap, return 0 or an appropriate value
    }

    // Check for full overlap
    if (node.startInterval >= qst && node.endInterval <= qei) {
        return node.data;
    }

    // Partial overlap, continue the search in both left and right subtrees
    return query(node.left, qst, qei) + query(node.right, qst, qei);
    }
    public void update(int index, int value){
            this.root.data=update(this.root, index, value);
    }
    private int update(Node node, int index, int value){
        if(index>=node.startInterval && index<=node.endInterval){
            if(index==node.startInterval && index==node.endInterval){
                node.data=value;
                return node.data;
            }
        }
        else{
        int leftAns=update(node.left, index, value);
        int righttAns=update(node.right, index, value);
        node.data=leftAns+righttAns;
        return node.data;
        }
        return node.data;
    }
    
}
