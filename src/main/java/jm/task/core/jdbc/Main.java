package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Dmitriy", "Sidorov", (byte) 20);
        userService.saveUser("Ivan", "Ivanov", (byte) 10);
        userService.saveUser("Edward", "Norton", (byte) 54);
        userService.saveUser("Tyler", "Derden", (byte) 100);


        System.out.println(userService.getAllUsers());
        userService.getAllUsers();
        userService.dropUsersTable();
    }
}
