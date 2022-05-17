package problem.object;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * This is common LeetCode's TreeNode.
 **/
public class TreeNode<E>{

    public E val;
    public TreeNode<E> left;
    public TreeNode<E> right;

    public TreeNode() {}
    public TreeNode(E val) { this.val = val; }
    public TreeNode(E val, TreeNode<E> left, TreeNode<E> right) { this.val = val; this.left = left; this.right = right;}
    @SafeVarargs
    public TreeNode(E... val) {
        HashMap<Integer, TreeNode<E>> map = new HashMap<>();
        // root
        this.val = val[0];
        map.put(0, this);

        int rank = 0, pointer = 0, skeep = 0;
        int len = (int) Math.pow(2, rank);

        // append all child
        while (pointer+len-skeep < val.length){
            for(int i=0; i< len; i++){
                if(map.containsKey(pointer+i)){
                    TreeNode<E> root = map.get(pointer+i);

                    // left child
                    int leftIndex = pointer + len + 2*i - skeep;
                    if(leftIndex < val.length){
                        E value = val[leftIndex];
                        if(value != null){
                            root.left = new TreeNode<>(value);
                            map.put(leftIndex, root.left);
                        }
                    }else{break;}

                    // right child
                    int rightIndex = pointer + len + 2*i + 1 - skeep;
                    if(rightIndex < val.length){
                        E value = val[rightIndex];
                        if(value != null){
                            root.right = new TreeNode<>(value);
                            map.put(rightIndex, root.right);
                        }
                    }else{break;}
                }else{
                    // If don't have parents; The given will ignore his children.
                    skeep += 2;
                }
            }

            pointer += Math.pow(2,rank);

            rank++;
            len = (int) Math.pow(2, rank);
        }
    }

    public String toString(){
        return searchAll().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode<E> treeNode = (TreeNode<E>) o;

        return val == treeNode.val &&
                (left == null && treeNode.left == null) || ((left != null && treeNode.left != null && left.equals(treeNode.left))) &&
                (right == null && treeNode.right == null) || ((right != null && treeNode.right != null && right.equals(treeNode.right)));
    }

    @Override
    public int hashCode() {
        return searchAll().toString().hashCode();
    }

    public ArrayList<E> searchAll(){
        ArrayList<E> list = new ArrayList<>();
        search(this, list);
        return list;
    }

    private void search(TreeNode<E> root, ArrayList<E> list){
        if(root == null){
            return;
        }

        search(root.left, list);
        list.add(root.val);
        search(root.right, list);
    }
}
