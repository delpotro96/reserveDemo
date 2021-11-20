package com.example.finalprojectdemo.dao;

import com.example.finalprojectdemo.vo.ReserveVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ReserveDAO {
    public void setReserve(ReserveVO reserveVO);

    //예약 코드로 받아옴
    public ReserveVO detailReserve(int reserveCode);

    public void deleteReserve(int reserveCode);
}
