package com.example.finalprojectdemo.service;

import com.example.finalprojectdemo.dao.ReserveDAO;
import com.example.finalprojectdemo.vo.ReserveVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveService {

    @Autowired
    ReserveDAO reserveDAO;

    public void setReserve(ReserveVO reserveVO) {
        reserveDAO.setReserve(reserveVO);
        System.out.println(reserveVO);
    }

    public ReserveVO detailReserve(int reserveCode) {
        return reserveDAO.detailReserve(reserveCode);
    }

    public void deleteReserve(int reserveCode) {
        System.out.println(reserveCode);
        //reserveDAO.deleteReserve(reserveCode);
    }
}
