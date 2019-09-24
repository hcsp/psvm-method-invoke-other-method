package com.github.hcsp;

public class Main {
//    public static void main(String[] args) {
//        System.out.println(getMessage());
//    }
public static void main(String[] args) {
    System.out.println(getMessage());
}


    // Create a getMessage() method here to return string "Hello"
    // 在这里编写一个getMessage()方法，返回字符串"Hello"
    //在main之外写getMessage()方法，因为main是一定要执行的，必须简洁
    //public static 返回值类型 方法名(参数类型 参数名,...){ 方法体 return 返回值}
    //返回值类型是基本数据类型或引用数据类型
    //void，不需要返回值，但是必须return来结束方法调用!!!
    public static String getMessage()
    {
        return "Hello";
    }
}
