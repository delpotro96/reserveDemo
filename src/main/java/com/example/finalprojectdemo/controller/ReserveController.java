package com.example.finalprojectdemo.controller;

import com.example.finalprojectdemo.service.ReserveService;
import com.example.finalprojectdemo.vo.ReserveVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReserveController {

    @Autowired
    ReserveService reserveService;

    @PostMapping("reserve")
    @ResponseBody
    public void reserve(ReserveVO reserveVO) {
        System.out.println("try reserve");
        System.out.println(reserveVO);
        reserveService.setReserve(reserveVO);
    }

    //예약 번호 받아서 예약 상세페이지(showReserve.jsp)로 보냄냄
    @PostMapping("detailReserve")
    public String showReserve(int reserveCode) {
        reserveService.detailReserve(reserveCode);
        System.out.println("try");
        return "detailReserve";
    }

    @PostMapping("deleteReserve")
    @ResponseBody
    public void deleteReserve(int reserveCode) {
        System.out.println(reserveCode);
        reserveService.deleteReserve(reserveCode);
    }
}
