package com.rj1814.service.impl;


import com.rj1814.dao.accountDao;
import com.rj1814.pojo.entity;
import com.rj1814.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
@Autowired
private accountDao accountDao;

    @Override
    public List<entity> findAll() {
        return accountDao.findAll();
    }

    @Override
    public void delete(int id) {
        accountDao.data(id);
    }

    @Override
    public void updata(entity entity) {
    accountDao.updata(entity);
    }

    @Override
    public void insert(entity entity) {
        accountDao.insert(entity);
    }


}

