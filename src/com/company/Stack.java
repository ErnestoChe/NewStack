package com.company;

import java.util.*;

public class Stack<T>
{
    private ArrayList<T> objList;
    public Stack()
    {
        objList = new ArrayList<T>();
        // инициализация внутреннего хранилища стека
    }

    public int size()
    {
        // размер текущего стека
        return objList.size();
    }

    public T pop()
    {
        // ваш код
        if(objList.size() == 0){
            return null;
        }else return objList.remove(objList.size()-1);
    }

    public void push(T val)
    {
        objList.add(val);
        // ваш код
    }

    public T peek()
    {
        if(objList.size() == 0){
            return null;
        }else return objList.get(objList.size()-1);
    }
    public void log(){
        System.out.print("[ ");
        while(size()>0){
            System.out.print(pop()+" ");
        }
        System.out.print("]");
        System.out.println();
    }
}
