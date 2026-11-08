package com.example.Registrationsystem.model;

public class Student {
   private String firstName;
   private String lastName;
   private String email;
   private int id;
   private int age;
   public Student(){

   }

       public Student(String firstName, String lastName, String email, int id, int age){
           this.firstName = firstName;
           this.lastName = lastName;
           this.email = email;
           this.age = age;
           this.id = id;

       }

       public int getId() {
           return id;
       }
        public void setid(int id) {
       this.id = id;
   }

    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName(){
    return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

}
