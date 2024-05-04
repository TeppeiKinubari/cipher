public class Car  {
    private String name;
    private int number;
    private String color;

    //コンストラクタ
    Car(String name, int number, String color){
        this.name = name;
        this.number = number;
        this.color = color;
    }

    public void printData(){
        System.out.println("車の名前は：" + this.name);
        System.out.println("車のnumberは:" + this.number);
        System.out.println("車の色は：" + this.color);
    }
}
