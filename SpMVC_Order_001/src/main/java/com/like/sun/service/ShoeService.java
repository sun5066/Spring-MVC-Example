package com.like.sun.service;

import com.like.sun.model.ShoeVO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ShoeService {
    public List<ShoeVO> selectAll();

    public ShoeVO findById(long seq);

    public int insert(ShoeVO shoeVO);

    public int update(ShoeVO shoeVO);

    public int delete(long seq);
}
