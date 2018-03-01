package com.lizogub.OOPLesson4;

public class DBUsers implements InterfaceDBUsers{
    private User[] users = new User[3];
    private int size = 0;
    private int increment = 5; // amount of elements added in extenfDB() function

    @Override
    public void addUser(User user) {
        if(size >= users.length){
            this.extendDB();
        }
        users[size] = user;
        size++;
    }

    @Override
    public void removeUser(int userID) {
        for (int i = 0; i < size; i++){
            if(i > userID){
                users[i-1] = users[i];
            }
        }
        users[size] = null;
        size--;
    }

    @Override
    public String getInfo() {
        StringBuilder info = new StringBuilder();

        for(int i = 0; i < size; i++){
            info.append(users[i].getName() + " (" + users[i].getUserID() + "):\t" + users[i].getLogin() + "\t|\t" + users[i].getPassword() + "\n");
        }
        return info.toString();
    }

    @Override
    public void clear() {
        for(int i = 0; i < size; i++){
            users[i] = null;
        }

    }

    private void extendDB(){
        User[] newDB = new User[size + increment];
        for (int i = 0; i < size; i++){
            newDB[i] = users[i];
        }
        users = newDB;
    }
}
