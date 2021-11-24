package com.example.finalprojectdemo.controller;

import com.example.finalprojectdemo.service.ReserveService;
import com.example.finalprojectdemo.vo.ReserveVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
    @GetMapping("/detailReserve")
    public void showReserve(int reserveCode, Model model) {
        List<ReserveVO> detailreserve = reserveService.detailReserve(reserveCode);
        System.out.println("try");
//        ModelAndView mav = new ModelAndView("detailReserve");
//        mav.addObject("detailReserve", detailreserve);
        model.addAttribute("detailReserve", reserveService.detailReserve(reserveCode));
        System.out.println(detailreserve);

    }

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
