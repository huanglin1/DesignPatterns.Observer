package com.hl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/7/22
 * Time: 16:05
 * To change this template use File | Settings | File Templates.
 */
public class SleepSubject implements Subject{
    List<Observer> observers=new ArrayList<>();
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void notifySubject(){
        for(Observer ob:observers){
            ob.update(this.message);
        }
    }

    @Override
    public void addObserver(Observer ob){
        observers.add(ob);
    }

    @Override
    public void deleteObserver(Observer ob){
        observers.remove(ob);
    }
}
