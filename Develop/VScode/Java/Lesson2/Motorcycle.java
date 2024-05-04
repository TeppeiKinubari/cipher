public class Motorcycle extends Car {
    private String type;

    //コンストラクタ
    Motorcycle(String name, int number, String color, String type){
        //Carクラスのコンストラクタを継承している
        super(name, number, color);
        this.type = type;
    }    

    //CarクラスのprintDataメソッドをオーバーライドしてtypeを追加している
    @Override
    public void printData(){
        super.printData();
        System.out.println("バイクの種類は:" + this.type);
    }
}
