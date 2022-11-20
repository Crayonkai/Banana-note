package com.banana.bananaservice.controller;

import com.banana.bananaservice.biz.impl.NoteServiceImpl;
import com.banana.bananaservice.common.Result;
import com.banana.bananaservice.domain.Note;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class NoteController {

    @Autowired
    private NoteServiceImpl noteService;

    @GetMapping("/selectByNoteId")
    public Result selectByNoteId() {
        Integer id = 1;
        log.info("请求参数为：{}", id);
        Note note = noteService.queryByNoteId(id);
        return new Result().success("请求成功", note);
    }
}
