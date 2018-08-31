package com.hl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: huanglin
 * Date: 2018/7/22
 * Time: 15:58
 * To change this template use File | Settings | File Templates.
 */
public class EatSubject implements Subject {
    private List<Observer> observers=new ArrayList<>();
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void notifySubject(){
        for(Observer ob:observers){
            ob.update(getMessage());
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
