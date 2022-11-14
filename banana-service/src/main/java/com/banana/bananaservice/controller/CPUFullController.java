package com.banana.bananaservice.controller;

import com.banana.bananaservice.biz.impl.NoteServiceImpl;
import com.banana.bananaservice.common.Result;
import com.banana.bananaservice.domain.Note;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CPUFullController {

    @Autowired
    private NoteServiceImpl noteService;

    @GetMapping("/cpu")
    public String cpuFull() {
        Double i = 1.0;
        Double pai = 3.1415926;
        Double chu = 3.1313;
        Double r = 0.0;
        Boolean flag = true;
        Integer count = 0;
        while (flag) {
            r = i * pai;
            r = r / chu;
            System.out.println();
            if (count % 1000 == 0) {
                log.info("当前结果为“{}", r);
            }
//            if (count %2000000000==0){
//                flag = false;
//            }
            count++;
        }
        return r.toString();
    }
}
