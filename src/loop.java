public class loop {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        Integer i;
        Integer num;
        Integer sum=0;
        double avg;
        for (i = 1; i <= 10; i++) {
            System.out.println("請輸入第" + i + "個數字");
         num = sc.nextInt();
            sum=sum+num;

        }
        avg= sum/10;
        System.out.println(sum);
        System.out.println(avg);
    }
}
