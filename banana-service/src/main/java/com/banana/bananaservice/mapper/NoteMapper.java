package com.banana.bananaservice.mapper;

import com.banana.bananaservice.domain.Note;
import com.banana.bananaservice.domain.NoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoteMapper {
    long countByExample(NoteExample example);

    int deleteByExample(NoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Note row);

    int insertSelective(Note row);

    List<Note> selectByExampleWithBLOBs(NoteExample example);

    List<Note> selectByExample(NoteExample example);

    Note selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Note row, @Param("example") NoteExample example);

    int updateByExampleWithBLOBs(@Param("row") Note row, @Param("example") NoteExample example);

    int updateByExample(@Param("row") Note row, @Param("example") NoteExample example);

    int updateByPrimaryKeySelective(Note row);

    int updateByPrimaryKeyWithBLOBs(Note row);

    int updateByPrimaryKey(Note row);
}