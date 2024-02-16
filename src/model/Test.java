package model;

public class Test {
    public static void main (String[]args){
        Cricket cricket=new Cricket(new Customer("Tom","7623476282","emia.com"),"09/01/1998",3,8000);
        cricket.amount(8000,"i want kit",true);

        System.out.println(cricket);

    }

}
