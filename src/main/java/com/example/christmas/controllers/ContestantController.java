package com.example.christmas.controllers;

import com.example.christmas.models.Contestant;
import com.example.christmas.services.ContestantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/contestant")
@RequiredArgsConstructor
@CrossOrigin
public class ContestantController {
    private final ContestantService contestantService;

    @GetMapping("/getContestant")
    @ResponseStatus(OK)
    public Contestant getContestant(@RequestParam("id") long id) {
        return contestantService.getContestant(id);
    }

    @GetMapping("/getContestants")
    @ResponseStatus(OK)
    public List<Contestant> getContestants() {
        return contestantService.getContestants();
    }

    @ResponseStatus(OK)
    @GetMapping("/removeContestant")
    public String deleteContestant(@RequestParam("id") long id) {
        return contestantService.deleteContestant(id);
    }

    @ResponseStatus(CREATED)
    @GetMapping("/createContestant")
    public Contestant createContestant(@RequestParam("name") String name) {
        return contestantService.createContestant(name);
    }
}
