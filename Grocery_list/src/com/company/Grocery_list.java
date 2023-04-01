package com.company;

import java.util.ArrayList;

public class Grocery_list {
    ArrayList<String> grocery=new ArrayList<>();
    public void additem(String item){
        grocery.add(item);
    }
    public void removeItem(String item){
        if(indexof(item)<0){
            System.out.println("item is not on file");
        }
        else{
        grocery.remove(item);
            System.out.println(item+"has been removed");
        }
    }
    public int indexof(String item){
        return grocery.indexOf(item);
    }
    public void modifyItem(String oldItem,String Newitem){
        int index=indexof(oldItem);
        if(index<0){
            System.out.println("element not found on file ");

        }
        else
            grocery.set(index,Newitem);
        System.out.println(oldItem+"has been modified");

    }
    public void print(){
        System.out.println("the items are:\n");
        for (int i=0;i<grocery.size();i++){
            System.out.println((i+1) +". "+grocery.get(i));
        }

    }
    public void search(String item){
       int t= indexof(item);
       if(t<0){
           System.out.println("element not found");
       }
       else
           System.out.println("element found at index"+(t+1));

    }









}



