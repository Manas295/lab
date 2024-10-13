import java.util.LinkedList;
import java.util.Queue;

public class TestClass {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
 
        StringBuilder sb = new StringBuilder();
        //String serializedTree = serialize(root);
        TestClass.serializeTree(root,sb);
        String sb1 = sb.toString();
        System.out.println("Serialized tree: " + sb1);
        
        Queue<String> qu = new LinkedList<String>();
		for(String s : sb1.split(",")) {
			qu.add(s);
		}
		
		TreeNode node = DeSerializeTree(qu);
		System.out.println(node);
	}
	static void serializeTree(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append("#,");
            return;
        }
        System.out.println(root.val);
        sb.append(root.val+",");
        serializeTree(root.left,sb);
        serializeTree(root.right,sb);
    }
	// 1,2,#,#,3,4,#,#,5,#,#,
	static TreeNode DeSerializeTree(Queue<String> qu){
		String sb = qu.poll();
		if(sb.equals("#")){
            System.out.print("#");
            return null;
        }
		TreeNode root = new TreeNode(Integer.valueOf(sb));
		System.out.println(root.val);
		root.left = DeSerializeTree(qu);
		root.right = DeSerializeTree(qu);
		
		return root;
    }
	
	
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
 
    TreeNode(int val) {
        this.val = val;
    }
    
}
