package com.example.finalprojectdemo.controller;

import com.example.finalprojectdemo.service.ReserveService;
import com.example.finalprojectdemo.vo.ReserveVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ReserveController {

    @Autowired
    ReserveService reserveService;

    @PostMapping("reserve")
    public void reserve(ReserveVO reserveVO) {
        System.out.println("try reserve");
        System.out.println(reserveVO);
        reserveService.setReserve(reserveVO);
    }

//    우선 id로 받아옴 나중에는 로그인 한 사람 거 받아올거
//    일단 reserve.xml에 where name = "java" 로 해놓음
    @RequestMapping("/showReserve")
    // get 으로 /reserve
    public void listReserve(String name, Model model){
        System.out.println("list 페이지");
        model.addAttribute("list", reserveService.showReserve(name));
        System.out.println(reserveService.showReserve(name));
    }


    //예약 번호 받아서 예약 상세페이지(detailReserve.jsp)로 보냄냄
    @GetMapping("/detailReserve")
    //get 으로 /reserve/reserveCOde
    public void detailReserve(@PathVariable int reserveCode, Model model) {
        System.out.println("detail page");
        model.addAttribute("detailReserve", reserveService.detailReserve(reserveCode));
        System.out.println(reserveService.detailReserve(reserveCode));

    }

    //수정 put reserve/reserveCode

    @PostMapping("deleteReserve")
    @ResponseBody
    public void deleteReserve(int reserveCode) {
        System.out.println(reserveCode);
        reserveService.deleteReserve(reserveCode);
    }


    @RequestMapping("/temp")
    public String temp(){
        return "temp";
    }
}
