package com.test.model;

import com.patch.org.h.valid.Numerical;
import com.patch.org.h.valid.Op;

import javax.persistence.Entity;

/**
 * Date 2020-03-23 15:59
 *
 * @author Administrator
 */
@Entity
public class Model extends BaseModel {

    public String name;

    @Numerical(ops = Op.GT, target = 0)
    public int age;

    public static class Dao extends BaseDao<Model> {

    }

}
