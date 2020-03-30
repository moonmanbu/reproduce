package com.test.service;

import act.controller.annotation.UrlContext;
import com.test.model.Model;
import com.test.service.base.BaseService;

@UrlContext("test")
public class Service extends BaseService<Model, Model.Dao> {

}
