package com.test.service.base;

import act.inject.DefaultValue;
import com.test.model.BaseModel;
import org.joda.time.DateTime;
import org.osgl.aaa.NoAuthentication;
import org.osgl.mvc.annotation.GetAction;
import org.osgl.mvc.annotation.PostAction;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Date 2020-03-23 16:04
 *
 * @author Administrator
 */
@NoAuthentication
public abstract class BaseService<MODEL extends BaseModel, DAO extends BaseModel.BaseDao<MODEL>> {

    @Inject
    private DAO dao;

    @GetAction("hello")
    public String hello(@DefaultValue("World") String who) {
        return "Hello " + who;
    }

    @GetAction("date")
    public DateTime date() {
        return DateTime.parse("2016-03-09");
    }

    @PostAction("hello")
    public MODEL create(@Valid @NotNull MODEL model) {
        return model;
    }
}
