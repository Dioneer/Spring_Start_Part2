package Pegas.seminar6.exapmle6_2.controller;

import Pegas.seminar6.exapmle6_2.entity.Reader;
import Pegas.seminar6.exapmle6_2.repository.ReaderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reader")
@RequiredArgsConstructor
public class ReaderController {

    private final ReaderRepo readerRepo;

    @GetMapping
    public List<Reader> getAll(){
        return readerRepo.findAll();
    }

    @PostMapping
    public Reader createReader(@RequestBody Reader reader){
        return readerRepo.save(reader);
    }
}