package com.arraylist;


public class ArrayListString {

    private String[] content;
    private int length;

    public ArrayListString(){
        this.length=0;
        this.content=new String[4];
    }

    public String get(int n){
        if(n>=0 && n<this.content.length){
            return this.content[n];
        }
        return null;
    }

    public String[] createNewArray(){
        //Create An array with a siez greather than content;
        String[] newArray=this.copyData(this.content,new String[this.content.length+4]);
        //Index for new array
        return newArray;
    }

    private String[] copyData(String[] src, String[] target){
        int indexNewArray=0;
        for (String data : src){
            if(data!= null){
                target[indexNewArray]=data;
                //If I add a data to a position I go to the next position
                indexNewArray++;
            }
        }
        return target;
    }

    public void add(String data){
        int currentLength=this.content.length;
        for(int i=0;i<currentLength; i++){
            if(this.content[i]==null){
                this.content[i]=data;
                this.length++;
                return;
            }
        }
        this.content=this.createNewArray();
        this.content[currentLength]=data;
        this.length++;
    }

    public void remove(int n){
        if(n<0 || n>= this.length){
            return;
        }
        this.content[n]=null;
        this.length--;
        if(n!= this.length-1 ||this.length< this.content.length-4){
            int newSize=this.content.length;
            if(this.length< this.content.length-4){
                newSize=this.content.length-4;
            }
            this.content=this.copyData(this.content,new String[newSize]);
        }
    }
    public int length(){
        return this.length;
    }

    @Override
    public String toString(){
        String toPrint="[";
        for (String data : this.content){
            if(data == null){
                break;
            }
            toPrint+=data+",";

        }
        toPrint=toPrint.substring(0,toPrint.length()-1)+"]";
        return toPrint;
    }
}
