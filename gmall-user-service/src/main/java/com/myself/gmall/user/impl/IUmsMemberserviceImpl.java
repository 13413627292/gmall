package com.myself.gmall.user.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gmall.api.bean.UmsMember;
import com.gmall.api.bean.UmsMemberReceiveAddress;
import com.myself.gmall.user.mapper.IUmsMemberMapper;
import com.myself.gmall.user.mapper.MemberReceiveAddressMapper;

import com.gmall.api.service.IUmsMemberservice;

import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: le
 * @create: 2020-10-06 18:57
 **/
@Service
public class IUmsMemberserviceImpl implements IUmsMemberservice {
    @Resource
    IUmsMemberMapper userDao;
    @Resource
    MemberReceiveAddressMapper addressMapper;


    @Override
    public List<UmsMember> getAll() {
        List<UmsMember> allUser = userDao.selectAll();

        return allUser;
    }

    @Override
    public List<UmsMemberReceiveAddress> getAdressByMemberId(String memberId) {
        Example example=new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> addressList = addressMapper.selectByExample(example);
        return addressList;
    }
}