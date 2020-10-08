package com.myself.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.api.bean.UmsMember;
import com.gmall.api.bean.UmsMemberReceiveAddress;
import com.gmall.api.service.IUmsMemberservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @description:
 * @author: le
 * @create: 2020-10-06 18:53
 **/
@Controller
public class UmsMemberController {
    @Reference
    IUmsMemberservice umsMemberservice;

   @RequestMapping("/index")
    @ResponseBody
    public String index(){
       return "欢迎";
   }

    @RequestMapping("/getAll")
    @ResponseBody
    public Object getAll(){
        List<UmsMember> all = umsMemberservice.getAll();
        return all;
    }

    @RequestMapping("/getAddressByMemberId")
    @ResponseBody
    public Object getAddressByMemberId( String memberId){
        List<UmsMemberReceiveAddress> addressList = umsMemberservice.getAdressByMemberId(memberId);
        return addressList;
    }
}