public class BST {
    class Node{
        private int val;
        private Node left;
        private Node right;
        private int height;

        public Node(int val){
            this.val=val;
        }

        public int getvalue(){
            return val;
        }
    }

    private Node root;

    public int height(Node node){
        if(node==null){
            return -1;
        }

        return node.height;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void display(){
        display(root,"Root Node: ");
    }

    private void display(Node node, String details){
        if(node==null){
            return;
        }

        System.out.println(details+node.getvalue());
        display(node.left, "Left child of "+node.getvalue()+" : ");
        display(node.right, "Right child of "+node.getvalue()+" : ");
    }

    public void insert(int val){
        root=insert(val,root);
    }

    private Node insert(int val, Node node){
        if(node==null){
            node=new Node(val);
            return node;
        }
        if(val<node.val){
            node.left=insert(val, node.left);
        }
        if(val>node.val){
            node.right=insert(val, node.right);
        }

        node.height=Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end){
        if(start>=end){
            return;
        }

        int mid=(start+end)/2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid);
        populateSorted(nums, mid+1, end);
    }

    public void preOrder(){
      preOrder(root);
    }
    private void preOrder(Node node){
          if(node==null){
            return;
        }

        System.out.println(node.val);
        preOrder(node.left);
        preOrder(node.right);
    }
    
    public void postOrder(){
      postOrder(root);
    }
    private void postOrder(Node node){
          if(node==null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.val);
    }
    public void InOrder(){
      InOrder(root);
    }
    private void InOrder(Node node){
          if(node==null){
            return;
        }

        InOrder(node.left);
        System.out.println(node.val);
        InOrder(node.right);
    }
    
    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node node){
        if(node==null) return true;

        return (height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }
    
}
