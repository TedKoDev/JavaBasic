public class D_Array {

    public static void main(String[] args) {

        int[] odds = {1, 3, 5, 7, 9};

        String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};


        //배열의 길이를 알아내는 방법
        System.out.println("배열 odds의 길이는 " + odds.length + "입니다.");
        System.out.println("배열 weeks의 길이는 " + weeks.length + "입니다.");

        //배열의 각 요소를 출력하는 방법
        System.out.println("배열 odds의 첫 번째 요소는 " + odds[0] + "입니다.");
//        System.out.println("배열 odds의 두 번째 요소는 " + odds[1] + "입니다.");
//        System.out.println("배열 odds의 세 번째 요소는 " + odds[2] + "입니다.");
//        System.out.println("배열 odds의 네 번째 요소는 " + odds[3] + "입니다.");
//        System.out.println("배열 odds의 다섯 번째 요소는 " + odds[4] + "입니다.");

//        System.out.println("배열 weeks의 첫 번째 요소는 " + weeks[0] + "요일입니다.");
//        System.out.println("배열 weeks의 두 번째 요소는 " + weeks[1] + "요일입니다.");
//        System.out.println("배열 weeks의 세 번째 요소는 " + weeks[2] + "요일입니다.");
//        System.out.println("배열 weeks의 네 번째 요소는 " + weeks[3] + "요일입니다.");
//        System.out.println("배열 weeks의 다섯 번째 요소는 " + weeks[4] + "요일입니다.");
//        System.out.println("배열 weeks의 여섯 번째 요소는 " + weeks[5] + "요일입니다.");
//        System.out.println("배열 weeks의 일곱 번째 요소는 " + weeks[6] + "요일입니다.");

        //배열의 각 요소를 반복문을 이용해서 출력하는 방법
        for (int i = 0; i < odds.length; i++) {
            System.out.println("배열 odds의 " + (i + 1) + "번째 요소는 " + odds[i] + "입니다.");
        }


    }
}
