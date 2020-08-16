package com.driverhelp.Entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name="UserDetails")
public class UserDetails {
    @Id
    @GeneratedValue
    private Integer userId;
    @NotNull
    private String firstName;
    @NotNull
    private  String lastName;
    @NotNull
    @Column(unique = true)
    private String email;
    @NotNull
    private String deviceId;

}
