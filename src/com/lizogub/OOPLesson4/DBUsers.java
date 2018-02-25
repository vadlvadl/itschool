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
    public StringBuilder getInfo() {
        StringBuilder info = new StringBuilder();

        for(User u : users)
            info.append(u.getName() + " (" + u.getUserID() + "):   " + u.getLogin() + " | " + u.getPassword());

        return info;
    }

    @Override
    public void clear() {
        for(int i = 0; i < size; i++){
            users[i] = null;
        }

    }

    private User[] extendDB(){
        users = new User[size + increment];
    }
}
