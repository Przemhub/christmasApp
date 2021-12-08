package com.example.christmas.services;


import com.example.christmas.models.Contestant;
import com.example.christmas.repositories.ContestantsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
@RequiredArgsConstructor
public class ContestantService {
    private final ContestantsRepository contestantsRepository;

    public Contestant getContestant(long id) {
        return contestantsRepository.findById(id).orElseThrow();
    }

    public String deleteContestant(long id) {
        contestantsRepository.deleteById(id);
        return "Deleted succesfully";
    }

    public Contestant createContestant(String name) {
        Contestant contestant =  new Contestant();
        contestant.setName(name);
        return contestantsRepository.save(contestant);
    }

    public List<Contestant> getContestants() {
        return contestantsRepository.findAll();
    }
}
