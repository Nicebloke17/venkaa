
class tab {
    int a;

    void get(int b) {
        for (a = 1; a <= 10; a++) {
            if(a==5){
                continue;
            }
            System.out.println(a * b);
        }
    }
}
public class tables {
    public static void main(String[] args) {
tab t = new tab();
t.get(8);
    }
}
