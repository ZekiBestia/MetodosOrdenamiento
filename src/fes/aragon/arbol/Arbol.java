package fes.aragon.arbol;

public class Arbol extends Node{
	Arbol(String val) {
		super(val);
		// TODO Auto-generated constructor stub
	}
	// Función de utilidad para verificar si un nodo dado es un nodo hoja
    public static boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }
//    public class Node {
//    	String val;
//        Node left, right;
//     
//        Node(String val)
//        {
//            this.val = val;
//            this.left = this.right = null;
//        }
//
//    }
    // Función para aplicar un operador 'op' a los valores 'x' e 'y' y devolver el resultado
    public static double proceso(String op, double x, double y)
    {
        if (op.equals("+")) { return x + y; }
        if (op.equals("-")) { return x - y; }
        if (op.equals("*")) { return x * y; }
        if (op.equals("/")) { return x / y; }
 
        return 0;
    }
 
    // Función recursivo para evaluar un árbol de expresión binaria
    public static double evaluar(Node root)
    {
        // caso base: entrada inválida
        if (root == null) {
            return 0;
        }
 
        // las hojas de un árbol de expresión binaria son operandos
        if (isLeaf(root)) {
            return Double.valueOf(root.val);
        }
 
        // evalúa recursivamentemente el subárbol izquierdo y derecho
        double x = evaluar(root.left);
        double y = evaluar(root.right);
 
        // aplicamos el operador en la raiz a los valores obtenidos en el paso anterior
        return proceso(root.val, x, y);
    }
    public static void arbolE(){
    	 Node root = new Node("+");
         root.left = new Node("*");
         root.right = new Node("/");
         root.left.left = new Node("-");
         root.left.right = new Node("9");
         root.right.left = new Node("21");
         root.right.right = new Node("7");
         root.left.left.left = new Node("12");
         root.left.left.right = new Node("6");
         System.out.println("La exprecion es "+"\n"+"+ * / - 9 21 7 12 6");
         System.out.println("El resultado es " + evaluar(root));
    }
 
    public static void main(String[] args)
    {
       arbolE();
    }
    
   }