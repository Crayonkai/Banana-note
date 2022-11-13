package com.banana.bananaservice.biz;

import com.banana.bananaservice.domain.Note;

public interface NoteService {

    Note queryByNoteId(Integer id);

}
