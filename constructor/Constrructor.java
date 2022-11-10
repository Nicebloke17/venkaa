
class car {
    int year;
    String name ;

    public car(int year , String name){
        this.name= name;
        this.year = year;

    }

}


public class Constrructor {
    public static void main(String[] args) {
      car c = new car(1890, "audi")
        System.out.println("car : this.name = " + name + " this.year = " + year  );
    }
}
