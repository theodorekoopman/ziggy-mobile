package com.investec.ziggy.models;

/**
 * Created by Tshepo.Lesejane on 2016/12/02.
 */

public class ChoreViewModel {
    public ChoreViewModel() {

    }

    public ChoreViewModel(String name, String value, String photo) {
        this.setName(name);
        this.setValue(value);
        this.setPhoto(photo);
    }
    private String name;
    private String value;
    private  String photo;

    public void setName(String name){this.name = name;}
    public void setValue(String value){this.value = value;}
    public void setPhoto(String photo){this.photo = photo;}

    public String getName(){ return name;}
    public String getValue(){return value;}
    public String getPhoto(){return photo;}
}
