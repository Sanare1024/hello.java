package cond;

public class Switch2 {

    public static void main(String[] args) {
        int grade = 3;
        int coupon = 0;

        switch (grade){
            case 1:
                coupon = 1000;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰은 " + coupon + "원");

        int a = 0; // primitive 타입 (기본형 타입)
        String s = "02"; // 훨씬더 고도화된 class (자료형) -한번 선언하면 변경안됨
        switch (s){
            case "00" :
                System.out.println("마즘");
                break;
            case "01" :
                System.out.println("노노");
                break;
            case "02" :
                System.out.println("느앵");
                break;
        }
         System.out.println(s.equals("00"));







    }
}
