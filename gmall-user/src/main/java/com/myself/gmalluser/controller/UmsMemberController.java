package com.myself.gmalluser.controller;

import com.myself.gmalluser.pojo.UmsMember;
import com.myself.gmalluser.pojo.UmsMemberReceiveAddress;
import com.myself.gmalluser.service.IUmsMemberservice;
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
    @Autowired
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
    public Object getAddressByMemberId(@RequestBody String memberId){
        List<UmsMemberReceiveAddress> addressList = umsMemberservice.getAdressByMemberId(memberId);
        return addressList;
    }
}