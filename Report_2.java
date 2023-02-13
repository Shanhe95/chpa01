public class Report_2 {
    byte b = 10;
    char ch = 'A';
    int i = 100;
    long l = 1000L;
//3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
    b = (byte)i;
    ch = (char)b;            //가능
    short s = (short)ch;     //가능
    float f = (float)l;
    i = (int)ch;



    //3-2. 다음 연산의 결과와 그 이유를 적으세요.
    class Exercise3_2{
        public static void main(String[] args){
            int x = 2;
            int y = 5;
            char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);              //결과: false.  왼쪽부터 계산하기에  ||연산자의 값은 true였지만, &&연산에서 x>2가 false임으로 결과는 false
        System.out.println(y += 10 - x++);                         //결과: 13.    10+y= 15, 15-x++=13 (x++은 다음 문장부터 실행 된다.)
        System.out.println(x += 2);                                //결과: 4.       (x+=2)는  풀어 쓰면 x=x+2
        System.out.println(!('A' <= c && c <= 'Z'));               //결과: false.     괄호 안에식이 먼저 계산된다.  &&의 값은 둘다 true임으로 true. 앞에 ! 가 붙었기 때문에 결과값은 false
        System.out.println('C' - c);                               //결과: 2.     아스키코드 'C'는 67, 변수c는 65     67-65=2
        System.out.println('5' - '0');                             //결과: 5.     '5'==53    '0'==48   53-48=5
        System.out.println(c + 1);                                 //결과:66.      65+1=66
        System.out.println(++c);                                   //결과:66.      ++이 앞에 붙으면 이번 문장에서 실행, ++이 뒤에 붙으면 다음 문장부터 실행
        System.out.println(c++);                                   //결과:65.		++이 앞에 붙으면 이번 문장에서 실행, ++이 뒤에 붙으면 다음 문장부터 실행
        System.out.println(c);                                     //결과:66
        }
    }



    //3-3. 아래는 변수의 num 값 중에서 백의 자리 이하를 버리는 코드이다.
//만일 변수 num의 값이 '456'이라면 '400'이 되고, '111'이라면 '100'이 된다.
//알맞은 코드를 넣으시오.
    class Exercise3_3 {
        public static void main(String[] args){
            int num = 456;
            int num2 = 111;
            System.out.println((Math.round(num)/100)*100);              //400
            System.out.println((Math.round(num2)/100)*100);             //100
        }
    }
//예상 결과 -> 400


    //3-4. 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
//만일 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니가 필요할 것이다.
//알맞은 코드를 넣으시오.
    class Exercise3_4{
        public static void main(String[] args){
            int numOfApples = 123; // 사과의 개수
            int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
            int numOfBucket = numOfApples/sizeOfBucket + (numOfApples  %  sizeOfBucket   > 0 ? 1:0); // 모든 사과를 담는데 필요한 바구니의 수
                                                                                                     //  numOfApples / sizeOfBucket ==12,   numOfApples  %  sizeOfBucket  > 0 ? 1:0  한개 이상일 때 +1되게 함
            System.out.println("필요한 바구니의 수 :"+numOfBucket);
        }
    }
//예상 결과 -> 필요한 바구니의 수 :13



    //3-5. 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다.
//삼항연산자를 이용해서 빈칸에 알맞은 코드를 넣으시오.
//Hint : 삼항 연산자를 두 번 사용할 것!
    class Exercise3_5{
        public static void main(String[] args){
            int num = 10;
            System.out.println(num > 0 ? "양수" : ( num == 0   ?  "0" : "음수"));
        }
    }
//예상 결과 : 양수



    //3-6. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
//변환 공식이 'C = 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오.
// 단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것!
    class Exercise3_6{
        public static void main(String[] args){
            int fahrenheit = 100;
            float celcius = 5f/9f*(fahrenheit-32f);

            System.out.println("Fahrenheit:"+fahrenheit);
            System.out.println("Celcius:".format("%.2f",celcius ));                     //"%.2f" 소수점 둘째자리 까지 검색된다는 의미, 검색했음..
        }
    }
//예상 결과 : Fahrenheit:100, Celcius:37.78
}
