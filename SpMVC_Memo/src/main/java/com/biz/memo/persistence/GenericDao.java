package com.biz.memo.persistence;

import java.util.List;

public interface GenericDao<VO, Key> {
    public List<VO> selectAll();

    public VO findById(Key id);

    public int insert(VO vo);

    public int update(VO vo);

    public int delete(VO vo);
}
