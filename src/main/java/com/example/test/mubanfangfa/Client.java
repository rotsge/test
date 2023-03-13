package com.example.test.mubanfangfa;

public class Client {
    public static void main(String[] args) {
        Hongdou hongdou = new Hongdou();
        System.out.println("制作红豆豆浆——————————");
        hongdou.make();

        Chundoujiang chundoujiang = new Chundoujiang();
        System.out.println("制作纯豆浆——————————");
        chundoujiang.make();

        char[] arr = {'\u6211','\u7231','\u4f60'};
        char brr[] = {'\u6211','\u7231','\u4f60'};
        char[] crr = new char[]{'\u6211','\u7231','\u4f60'};
        System.out.println(arr);
        System.out.println(brr);
        System.out.println(crr);
    }
}
