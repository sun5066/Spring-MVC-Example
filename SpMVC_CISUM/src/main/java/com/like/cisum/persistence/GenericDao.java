package com.like.cisum.persistence;

import java.util.List;

public interface GenericDao<VO, PK> {
    public List<VO> selectAll();

    public VO findById(PK id);

    public int insert(VO vo);

    public int update(VO vo);

    public int delete(VO vo);
}
