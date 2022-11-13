package com.banana.bananaservice.biz.impl;

import com.banana.bananaservice.biz.NoteService;
import com.banana.bananaservice.domain.Note;
import com.banana.bananaservice.mapper.NoteMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteMapper noteMapper;

    @Override
    public Note queryByNoteId(Integer id) {
        Note note = noteMapper.selectByPrimaryKey(id);
        return note;
    }
}
