package com.like.sun.dao;

import com.like.sun.model.ShoeVO;

import java.util.List;

public interface ShowDao {
    public List<ShoeVO> selectAll();

    public ShoeVO findById(long seq);

    public int insert(ShoeVO shoeVO);

    public int update(ShoeVO shoeVO);

    public int delete(long seq);
}
