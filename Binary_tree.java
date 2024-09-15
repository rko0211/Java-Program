import java.util.LinkedList;
import java.util.Queue;

class Binary_tree {
  // Node creation
  static class Node {
    int data;
    Node left;
    Node rigth;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.rigth = null;
    }
  }

  // Tree Formation

  static class ConstructBinaryTree {
    static int idx = -1;

    public static Node buildTree(int nodes[]) {
      idx++;
      if (nodes[idx] == -1) {
        return null;
      }
      Node newNode = new Node(nodes[idx]);
      newNode.left = buildTree(nodes);
      newNode.rigth = buildTree(nodes);

      return newNode;
    }
  }

  // Traversal Algorithm
  static class PreeOrderedTraversal {
    public static void PreeOrdered(Node root) {
      if (root == null) {
        return;
      }
      System.out.print(root.data + " ");
      PreeOrdered(root.left);
      PreeOrdered(root.rigth);
    }
  }

  static class InOrderedTraversal {
    public static void InOrdered(Node root) {
      if (root == null) {
        return;
      }
      InOrdered(root.left);
      System.out.print(root.data + " ");
      InOrdered(root.rigth);
    }
  }

  static class PostOrderedTraversal {
    public static void PostOrdered(Node root) {
      if (root == null) {
        return;
      }
      PostOrdered(root.left);
      PostOrdered(root.rigth);
      System.out.print(root.data + " ");
    }
  }

  static class LevelOrderedTraversal {
    public static void LevelOrdered(Node root) {
      if (root == null) {
        return;
      }
      // Queue is an interface we can not create object of interfaces
      Queue<Node> q = new LinkedList<>();
      q.add(root);

      while (!q.isEmpty()) {
        Node currNode = q.remove();
        if (currNode != null) {
          System.out.print(currNode.data + " ");
          q.add(currNode.left);
          q.add(currNode.rigth);
        }
      }
    }
  }

  public static void main(String[] args) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    ConstructBinaryTree tree = new ConstructBinaryTree();

    Node root = tree.buildTree(nodes);

    System.out.println("Preeordered Traversal Technique");
    PreeOrderedTraversal T1 = new PreeOrderedTraversal();
    T1.PreeOrdered(root);

    System.out.println();

    System.out.println("Inordered Traversal Technique");
    InOrderedTraversal T2 = new InOrderedTraversal();
    T2.InOrdered(root);

    System.out.println();

    System.out.println("Postordered Traversal Technique");
    PostOrderedTraversal T3 = new PostOrderedTraversal();
    T3.PostOrdered(root);

    System.out.println();

    System.out.println("LevelOrdered/BFS Traversal Technique");
    LevelOrderedTraversal T4 = new LevelOrderedTraversal();
    T4.LevelOrdered(root);

    System.out.println();

  }
}