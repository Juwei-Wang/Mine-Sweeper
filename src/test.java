public class test {
    public static void main(String[] args) {
        System.out.println(power2(10));
    }

    public static int power2(int n){
        if (n == 1){
            n = 2;
        }
        if(n%2 == 0){
            return power2(n/2) * power2(n/2);
        }else {
            return power2(n/2) * power2(n/2) * 2;
        }

    }
}
