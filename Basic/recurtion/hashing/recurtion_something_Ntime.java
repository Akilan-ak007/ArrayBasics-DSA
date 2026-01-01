package Basic.recurtion.hashing;

public class recurtion_something_Ntime {
    public static void main(String[] args) {
        Numfun(1);
    }

//static void fun(int i , int n){
//    if( i > n){
//        return;
//
//    }
//    System.out.println("akilan");
//    fun(i+1,n);
//}
    static void Numfun(int a){
        if(a > 3){
            return;
        }
        System.out.println(a);
        Numfun(a+1);
    }
}
