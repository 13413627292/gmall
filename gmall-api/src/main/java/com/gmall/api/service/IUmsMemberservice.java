package com.gmall.api.service;



import com.gmall.api.bean.UmsMember;
import com.gmall.api.bean.UmsMemberReceiveAddress;

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
