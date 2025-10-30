package org.example.cp05javaadv.domain;

import lombok.Getter;
import lombok.Setter;

public class User {

    private @Getter @Setter String username;
    private @Getter @Setter String password;
    public User() {}
}
