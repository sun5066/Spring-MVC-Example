package com.like.sun.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.like.sun.dao.ShowDao;
import com.like.sun.model.ShoeVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoeServiceImplV1 implements ShoeService {

    @Autowired
    private SqlSession sqlSession;
    private ShowDao showDao;

    @Autowired
    public void getMapper() {
        this.showDao = sqlSession.getMapper(ShowDao.class);
    }

    @Override
    public List<ShoeVO> selectAll() {
        List<ShoeVO> shoeList = showDao.selectAll();
        System.out.println(shoeList.toString());
        return shoeList;
    }

    @Override
    public ShoeVO findById(long seq) {
        ShoeVO shoeVO = showDao.findById(seq);
        return shoeVO;
    }

    @Override
    public int insert(ShoeVO shoeVO) {
        int ret = showDao.insert(shoeVO);
        return ret;
    }

    @Override
    public int update(ShoeVO shoeVO) {
        int ret = showDao.update(shoeVO);
        return ret;
    }

    @Override
    public int delete(long seq) {
        int ret = showDao.delete(seq);
        return ret;
    }
}