package com.myself.gmalluser.service;

import com.myself.gmalluser.pojo.UmsMember;
import com.myself.gmalluser.pojo.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @description:
 * @author: le
 * @create: 2020-10-06 18:56
 **/
public interface IUmsMemberservice {

    List<UmsMember> getAll();

    List<UmsMemberReceiveAddress> getAdressByMemberId(String memberId);
}
