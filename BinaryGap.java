public class Main {

    public static void main(String[] args) {
        System.out.println("Solution is " + solution(0));
        System.out.println("Solution is " + solution(1));
        System.out.println("Solution is " + solution(5));
        System.out.println("Solution is " + solution(6));
        System.out.println("Solution is " + solution(8));
        System.out.println("Solution is " + solution(9));
        System.out.println("Solution is " + solution(15));
        System.out.println("Solution is " + solution(16));
        System.out.println("Solution is " + solution(20));
        System.out.println("Solution is " + solution(30));
        System.out.println("Solution is " + solution(257));
        System.out.println("Solution is " + solution(320));
        System.out.println("Solution is " + solution(1024));
        System.out.println("Solution is " + solution(1041));
        System.out.println("Solution is " + solution(51712));
        System.out.println("Solution is " + solution(406287));
    }

    public static int solution(int N) {
        // write your code in Java SE 8
        String binary = Integer.toBinaryString(N);
        System.out.println();
        System.out.println();
        System.out.println(N + " in binary is " + binary);
        int length = 0;
        int index = 0;

        //for(int i = 0 ; i < binary.length() ; i = index) {
            int start = binary.indexOf('0', index);
            if(start < 0) return length; // stopping condition

            int end = binary.indexOf('1', start);
            if(end < 0) return length; // ignore trailing zeroes

            System.out.println("Start = " + start);
            System.out.println("End = " + end);
            System.out.println("Temp = " + (end - start));
            System.out.println("Length = " + length);

            int temp = end - start;
            if(temp > length) length = temp;
            index = end + 1;
        //}

        return length;
    }
