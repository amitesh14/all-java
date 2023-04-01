package com.company;

import java.util.ArrayList;

public class mobilePhone {
    private int phonenumber;
    private ArrayList<Contacts> newcontact;

    public mobilePhone(int phonenumber) {
        this.phonenumber = phonenumber;
        this.newcontact=new ArrayList<>();

    }
    public void addcontact(Contacts contacts){
        if(findcontact(contacts.getName())>=0) {
            System.out.println("Contact alredy exists");
        }
        else
        {
            newcontact.add(contacts);
            System.out.println("new contact added" );

        }

    }
    public void updateContact(Contacts oldContacts,Contacts contacts){
        int p=findcontact(oldContacts.getName());
        if(p>=0) {
           newcontact.set(p,contacts);
            System.out.println(oldContacts.getName()+" has been updated");

        }
        else{
            System.out.println("contact does not exists");

        }

    }
    public void removeContact(Contacts contacts){
        int p=findcontact(contacts.getName());
        if(p>=0){

            newcontact.remove(p);
            System.out.println(contacts.getName()+" is removed successfully");


        }
        else{
            System.out.println("contact doesnot exists ");

        }
    }
    public void printContact(){
        for (int i=0;i<newcontact.size();i++){
            System.out.println(newcontact.get(i).getName()+"----->"+newcontact.get(i).getNumber());
        }
    }

    private void findcontact(Contacts contacts){
      int p=   newcontact.indexOf(contacts);
        System.out.println(contacts.getName()+"was fond at index"+(p+1));
    }
    public int findcontact(String name) {

        for (int i = 0; i < this.newcontact.size(); i++) {
            Contacts contacts1 = this.newcontact.get(i);
            if (contacts1.getName().equals(name)) {
                //System.out.println("contact found at"+(i+1));
                return i;

            }
        }
            return -1;


    }







}