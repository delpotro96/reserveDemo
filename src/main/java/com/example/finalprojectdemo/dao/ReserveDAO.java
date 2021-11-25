package com.example.finalprojectdemo.dao;

import com.example.finalprojectdemo.vo.ReserveVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ReserveDAO {
    public void setReserve(ReserveVO reserveVO);

    public List<ReserveVO> showReserve(String name);

    //예약 코드로 받아옴
    public ReserveVO detailReserve(int reserveCode) throws DataAccessException;

    public void deleteReserve(int reserveCode);
}
