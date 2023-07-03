package day03;

public class OperDemo {
    public static void main(String[] args) {
        /*
        int a=5,b=5;
        int c=a--;
        int d=--b;
        System.out.println(a);//4
        System.out.println(b);//4
        System.out.println(c);//5
        System.out.println(d);//4
        */
        /*
        int a=5,b=6;
        int c=a++;b++;
        int d=++b;++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        int a=6;
        int b=9;
        a++;
        b--;
        int c=b++;a--;
        int d=++a;b--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);




        int a=5,b=6,c=5;
        boolean a1=b<=c;
        System.out.println(a1);
        System.out.println(a++>c);
        System.out.println(a);
        System.out.println(a++>c);
        System.out.println(a);
        */
        /*
        int a=6,b=40,c=9;
        boolean a1=b>c;
        System.out.println(a1);
        System.out.println(a*c>b);
        System.out.println(a++>=b);//a=7
        System.out.println(a--<c);//a=6
        System.out.println(b<c++);//c=10
        System.out.println(b++<=a*b);//b=41,a=6,c=10
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
       */
        /*
        int age=25;
        System.out.println(age>=18&&age<=50);
        int score=90;
        System.out.println(score>=0&&score<=100);
        System.out.println(score>0||score<100);
        System.out.println();
        int a=5,b=10,c=5;
        boolean a1=b>=a&&b<c;
        System.out.println(a1);
        System.out.println(b<=c&&b>a);
        System.out.println(a==b&&c>b);
        System.out.println(b!=c&&a<b);
        System.out.println(b>=a||b<c);
        System.out.println(b<=c||b>a);
        System.out.println(b!=c||a<b);
        System.out.println(a==b||c>b);
        boolean b2=!(a>b);
        System.out.println(b2);
        System.out.println(!(a>b));


         */
        /*
        int a=5,b=10,c=5;
        boolean b1=a>b&&c++>2;
        System.out.println(b1);
        System.out.println(c);
        boolean b2=a<b||c++>2;
        System.out.println(b2);
        System.out.println(c);


         */
    //赋值运算符
        int a=5;
        a+=10;
        System.out.println(a);
        a*=5;
        System.out.println(a);
        a/=5;
        System.out.println(a);
        short b=5;
        //b=b+5;   //编译错误，需要强制转换。改为 b= (short) (b+5);
        b= (short) (b+5);
        System.out.println(b);
        System.out.println("b="+b);

        int age=23;
        System.out.println("今年"+age);
        String name="刘承俊";
        System.out.println("大家好我叫"+name);
        System.out.println("我叫"+name+",今年"+age+"岁");
        System.out.println("--------------------------------------");
        System.out.println(10+20+""+30);
        System.out.println(""+10+20+30);
        System.out.println(10+20+30+"");
        System.out.println(10+""+20+30);
        //字符串链接运算符

        //条件运算符
        //符号：boolean？数1：数2
        int num=5;
        int flag=num>0?a:b;
        System.out.println(flag);

        int a1=5,b1=10;
        int max=a1<b1?a1:b1;
        System.out.println("max="+max);




    }

}
