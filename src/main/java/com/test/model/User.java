package com.test.model;

import act.aaa.model.UserBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Date 2020-03-23 16:35
 *
 * @author Administrator
 */
@Entity
public class User extends UserBase<User> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
}
