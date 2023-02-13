public class Report_1 {
    public static void main(String[] args) {
//    byte b = 256;    //byte는 -128 ~ 127까지가 저장 범위
//    char c = '';    // 빈 문자열은 올 수 있지만 빈 문자는x
//    char answer = 'no';    //문자는 하나만 올 수 있다
//    float f = 3.14          //3.14f가 와야 함 ;도 빠져있음
//    double d = 1.4e3f;     // 정답


//2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, '오류' 라고 적으세요.
        System.out.println("1" + "2");          //12
        System.out.println(true + "");            //"true"
        System.out.println('A' + 'B');          //"AB"
        System.out.println('1' + 2);            //"12"
        System.out.println('1' + '2');          //"12"
        System.out.println('J' + "ava");         //"JAVA"
        System.out.println(true + null);        // error


    }
    //2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.




    public class Exercise2_8{
        public static void main(String[] args){
            int x = 1;
            int y = 2;
            int z = 3;
            int temp;

       /*
          알맞은 코드를 넣어 완성하세요.
       */
            temp= x;
            x = y;
            y = z;
            z = temp;

            System.out.println("x="+x);
            System.out.println("y="+y);
            System.out.println("z="+z);
        }
    }
//예상 결과 : x=2, y=3, z=1
}

