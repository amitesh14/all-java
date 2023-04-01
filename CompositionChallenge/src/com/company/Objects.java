package com.company;

public class Objects {
    private table table;
    private tv tv;

    public com.company.table getTable() {
        return table;
    }

    public com.company.tv getTv() {
        return tv;
    }

    public Objects(com.company.table table, com.company.tv tv) {
        this.table = table;
        this.tv = tv;
    }
    public void draweropen(){
        System.out.println("drawer isopen");
        table.draweropen();
    }
}
