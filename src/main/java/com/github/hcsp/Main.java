package com.github.hcsp;

public class Main {
    public static void main(String[] args) {
        System.out.println(getMessage());
    }

    // Create a getMessage() method here to return string "Hello"
    // 在这里编写一个getMessage()方法，返回字符串"Hello"
    // 由于getMessage()方法是在main方法种调用的，而main方法本身就是静态的。所以创建getMessage方法时也需要是静态的。
    public static String getMessage(){
        return "Hello";
    }

}
