package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        stackSizeTest();

        stackPushTest();

        stackPopTest();

        stackPeekTest();

        stack2PushTest();

        stack2PopTest();

        stack2PeekTest();

        //Test.bracketsTest();

        //Test.postfixCalcTest();
    }
    public static void stackSizeTest(){

        int testSize = 5;

        Stack s = new Stack<Integer>();

        for(int i = 0; i<testSize; i++){

            s.push(i);

        }

        if(s.size() == testSize){

            System.out.println("size test passed");

        }else System.out.println("size test failed");

    }

    public static void stackPushTest(){

        Stack s = new Stack<Integer>();

        int i;

        for(i = 0;i<5; i++){

            s.push(i);

        }

        if(s.size() == i){

            System.out.println("push test passed");

        }else System.out.println("push test failed");

    }

    public static void stackPopTest(){

        Stack s = new Stack<Integer>();

        int i;

        for(i = 0;i<5; i++){

            s.push(1);

        }

        Object t = "a";

        s.push(t);

        int s1 = s.size();

        Object p = s.pop();

        System.out.println(p);

        int s2 = s.size();

        if((t == p)&&(s1-1 == s2)){

            System.out.println("pop test passed");

        }else System.out.println("pop test failed");


        Stack test = new Stack<Integer>();

        if(test.pop() == null){

            System.out.println("Null pop test passed");

        }else System.out.println("Null pop test failed");

    }

    public static void stackPeekTest(){

        Stack s = new Stack<Integer>();

        int i;

        for(i = 0;i<5; i++){

            s.push(1);

        }

        Object t = "a";

        s.push(t);

        int s1 = s.size();

        Object p = s.peek();

        int s2 = s.size();

        if((t == p)&&(s1 == s2)){

            System.out.println("peek test passed");

        }else System.out.println("peek test failed");

        Stack test = new Stack<Integer>();

        if(test.peek() == null){

            System.out.println("null peek test passed");

        }else System.out.println("null peek test failed");

        System.out.println();

    }

    public static void stack2PushTest(){

        Stack q = new Stack<Integer>();

        int i;

        for(i = 0;i<5; i++){

            q.push(i);

        }

        if(q.size() == i){

            System.out.println("push2 test passed");

        }else System.out.println("push2 test failed");

    }

    public static void stack2PopTest(){

        Object w = "a";

        Object w1 = "b";

        Stack s = new Stack<Object>();

        int i;

        s.push(w);

        for(i = 0;i<5; i++){

            s.push(1);

        }

        s.push(w1);

        int size = s.size();

        if((w == s.pop())&&(size-1 == s.size())){

            System.out.println("pop2 test passed");

        }else System.out.println("pop2 test failed");

        Stack test = new Stack<Integer>();

        if(test.pop() == null){

            System.out.println("null pop2 test passed");

        }else System.out.println("null pop2 test failed");

        System.out.println();

    }

    public static void stack2PeekTest(){

        Object w = "a";

        Object w1 = "b";

        Stack s = new Stack<Integer>();

        int i;

        s.push(w);

        for(i = 0;i<5; i++){

            s.push(1);

        }

        s.push(w1);

        int size = s.size();

        if((w == s.peek())&&(size == s.size())){

            System.out.println("peek2 test passed");

        }else System.out.println("peek2 test failed");

        Stack test = new Stack<Integer>();

        if(test.peek() == null){

            System.out.println("null peek2 test passed");

        }else System.out.println("null peek2 test failed");

    }

    public static void bracketsTest(){

        String test1 = "(()((())()))";  //must be true

        String test2 = "(()()(()";      //must be false

        String test3 = "(";             //must be false

        String test4 = ")";             //must be false

        String test5 = "()()()";        //must be true

        String test6 = ")()()())(";     //must be false

        String test7 = "()()()))(((()"; //must be false

        /*if(Main.skobochki(test1) == true){ System.out.println("test 1 passsed");}else System.out.println("test 1 failed");

        if(Main.skobochki(test2) == false){ System.out.println("test 2 passsed");}else System.out.println("test 2 failed");

        if(Main.skobochki(test3) == false){ System.out.println("test 3 passsed");}else System.out.println("test 3 failed");

        if(Main.skobochki(test4) == false){ System.out.println("test 4 passsed");}else System.out.println("test 4 failed");

        if(Main.skobochki(test5) == true){ System.out.println("test 5 passsed");}else System.out.println("test 5 failed");

        if(Main.skobochki(test6) == false){ System.out.println("test 6 passsed");}else System.out.println("test 6 failed");

        if(Main.skobochki(test7) == false){ System.out.println("test 7 passsed");}else System.out.println("test 7 failed");*/

        System.out.println();



    }

    public static void postfixCalcTest(){

        String test1 = "34+5*"; //35

        String test2 = "82+5*9+";//59

        String test3 = "23+5*"; //25

        String test4 = "12+3*"; //9

        /*int t1 = Main.calc(test1);  if(t1 == 35){System.out.println("test1 calcilator passed");}

        int t2 = Main.calc(test2);  if(t2 == 59){System.out.println("test2 calcilator passed");}

        int t3 = Main.calc(test3);  if(t3 == 25){System.out.println("test3 calcilator passed");}

        int t4 = Main.calc(test4);  if(t4 == 9){System.out.println("test4 calcilator passed");}
*/


    }
}
