package com.rj1814.service;

import com.rj1814.pojo.entity;

import java.util.List;

public interface AccountService {

    public List<entity> findAll();

    public void delete(int id);

    public void updata(entity entity);

    public void insert(entity entity);
}
