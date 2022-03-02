package com.ug4.soal1;

public class Passenger {
    String name;
    Double balance;
    String email;
    String destiny;

    String getName(){
        return name;
    }

    void setName(String newName){
        name = newName;
    }
    void getBalance(double newBalance){
        balance = newBalance;
    }

    String getEmail(){
        return email;
    }

    void setEmail(String newEmail){
        email = newEmail;
    }

    String getDestiny() {
        return destiny;
    }

    void setDestiny(String newDestiny){
        destiny = newDestiny;
    }
}

