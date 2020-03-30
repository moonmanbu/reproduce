package com.test.model;

import act.db.jpa.JPADao;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Date 2020-03-23 16:26
 *
 * @author Administrator
 */
@MappedSuperclass
public class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;

    public static class BaseDao<MODEL extends BaseModel> extends JPADao<Long, MODEL> {

    }
}
