package com.czhhhb.model;

public class Book {
    private String numb;
    private String name;
    private String IBSN;
    public Book(String number, String name, String IBSN) {
        this.numb = number;
        this.name = name;
        this.IBSN = IBSN;
    }
    public Book() {
    }
    public String getNum() {
        return numb;
    }

    public void setNum(String number) {
        this.numb = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIBSN() {
        return IBSN;
    }

    public void setIBSN(String IBSN) {
        this.IBSN = IBSN;
    }
}
