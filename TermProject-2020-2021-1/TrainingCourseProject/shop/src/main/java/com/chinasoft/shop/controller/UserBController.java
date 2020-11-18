package com.chinasoft.shop.controller;

import com.chinasoft.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class UserBController {
    @Autowired
    private IUserService userService;

    @PostMapping("addressInsert")
    public String addressInsert(String userAddressPeople, String userPhone, String userEmail, String userAddress, int userAddressStatus) {
        return String.valueOf(userService.addressInsert(userAddressPeople, userPhone, userEmail, userAddress, userAddressStatus));
    }
}
