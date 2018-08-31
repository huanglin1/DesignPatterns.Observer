package com.hl;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/7/22
 * Time: 16:20
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){

        Observer work=new WorkObserver();
        Observer play=new PlayObserver();
        Observer code=new CodeObserver();
        EatSubject eat=new EatSubject();
        eat.setMessage("吃饭啦");

        eat.addObserver(work);
        eat.addObserver(play);
        eat.addObserver(code);
        eat.notifySubject();
        System.out.println();
        System.out.println("不想提醒玩游戏的人吃饭了");

        eat.deleteObserver(play);
        eat.notifySubject();


    }
}
