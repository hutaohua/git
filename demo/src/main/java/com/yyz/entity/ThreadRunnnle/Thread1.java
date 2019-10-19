package com.yyz.entity.ThreadRunnnle;


public class Thread1 extends Thread {

    public void thread(){
        System.out.println("第一次创建线程池");
    }

    public static void main(String[] args) {
        new Thread1().thread();
    }

}
