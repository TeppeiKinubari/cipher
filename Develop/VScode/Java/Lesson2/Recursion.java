public class Recursion {
    public static void main(String[] args) {
         //インスタンスを生成し、再帰を用いて繰り返し処理を行う
        Recursion main = new Recursion();
        main.hello(1);
 
    }

     //インスタンスを生成し、再帰を用いて繰り返し処理を行う
    private void hello(int num){
        System.out.println("Hello!");
        if(num < 10){
            hello(num + 1);
        }
    }

}
