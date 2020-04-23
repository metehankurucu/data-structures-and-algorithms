
public class DisjointSet {
    //Store parents and its ranks 
    //(if its root store -1 * item number below, else store parent)
    int[] parent;
    int size;

    public DisjointSet(int size){
        this.size = size;
        this.parent = new int[size];
        makeSet();
    }

    public void makeSet(){
        for(int i  = 0;i < size; i++){
            //Every item in their own set
            parent[i] = -1;
        }
    }

    public int rank(int x){
        if(parent[x] < 0){
            //If root, returns rank
            return -1 * parent[x];
        }
        return 1;
    }


    public int find(int x){
        if(parent[x] < 0){
            //Root found
            return x;
        }
        return find(parent[x]);
    }

    //Union by rank
    public void union(int x, int y){
        int xRoot = find(x);
        int yRoot = find(y);

        //Same set
        if(xRoot == yRoot) return;

        if(rank(xRoot) > rank(yRoot)){
            //update rank of xRoot
            parent[xRoot] = parent[xRoot] + -1 * rank(yRoot);
            //update root of yRoot
            parent[yRoot] = xRoot;
        }
        else{
            parent[yRoot] = parent[yRoot] + -1 * rank(xRoot); 
            parent[xRoot] = yRoot;
        }
    }

    //See changes
    private void printParents(){
        for (int i = 0; i < parent.length; i++) {
            System.out.print("(" + i + ")" + parent[i] + " , ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        //Example operations
        DisjointSet ds = new DisjointSet(10);

        ds.union(2, 3);
        ds.union(5,6);

        System.out.println(ds.find(2));
        
        ds.union(5,7);
        ds.printParents();     
        
        ds.union(8,5);
        ds.union(2,8);
        ds.printParents();     

    }
}