public class ScratchPadRecursion{
    public static void recurse(int a){
        System.out.println(a);
        if(a == 0) return;
        recurse(--a);
    }
    public static void main(String args[]){
        recurse(5);
    }
}