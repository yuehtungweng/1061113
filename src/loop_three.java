public class loop_three {
    public static void main(String[] args) {

    java.util.Scanner sc = new java.util.Scanner(System.in);
    Integer i;
    int num;
    Integer sum=0;
    double avg;
     i =1;
        System.out.println("請輸入第" + i + "個數字");
        num = sc.nextInt();
        while (num !=9999){

        sum=sum+num;
        i++;
        System.out.println("請輸入第" + i + "個數字");
            num = sc.nextInt();
    }
    avg= sum/(i-1);
        System.out.println(sum);
        System.out.println(avg);
}
}


