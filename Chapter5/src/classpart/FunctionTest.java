package classpart;

public class FunctionTest {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 30;

        int sum = addNum(num1, num2);
        System.out.println(sum);
    }

        public static int addNum (int n1, int n2) {
            int result = n1 + n2;
            return result;
        }
    }


// 메서드
// : 함수의 일종
//   객체의 기능을 제공하기 위해 클래스 내부에 구현되는 함수

// 함수란 ?
// 하나의 기능을 수행하는 일련의 코드 중복되는 기능은 함수로 구현하여 함수를 호출하여 사용함
// 함수 이름에 따른 하나의 기능만 구현하는게 이상적인다.


