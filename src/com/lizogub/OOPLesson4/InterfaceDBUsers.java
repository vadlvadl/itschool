package com.lizogub.OOPLesson4;

interface InterfaceDBUsers {
    void addUser(User user);
    void removeUser(int userID);
    StringBuilder getInfo();
    void clear();
}
