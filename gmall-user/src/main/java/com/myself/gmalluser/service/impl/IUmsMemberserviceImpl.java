package com.myself.gmalluser.service.impl;

import com.myself.gmalluser.mapper.IUmsMemberMapper;
import com.myself.gmalluser.mapper.MemberReceiveAddressMapper;
import com.myself.gmalluser.pojo.UmsMember;
import com.myself.gmalluser.pojo.UmsMemberReceiveAddress;
import com.myself.gmalluser.service.IUmsMemberservice;

import org.springframework.stereotype.Service;
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