package com.bhanu.myfirstproject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/challeneges")
public class ChallengeController {
    private ChallengeService challengeService;
    public ChallengeController(ChallengeService challengeService)
    {
        this.challengeService=challengeService;
    }
    @GetMapping()
    public ResponseEntity<List<Challenge>> getAllChallenges()
    {
        return new ResponseEntity<>(challengeService.getAllChallenges(),HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<String> addChallenge(@RequestBody Challenge challenge )
    {
        if(challengeService.addChallenge(challenge)) return new ResponseEntity<>("Challenge added successfully",HttpStatus.CREATED);
        return new ResponseEntity<>( "Challenge not added ",HttpStatus.NOT_FOUND);
    }
    @GetMapping("/{month}")
    public ResponseEntity<Challenge> getAChallenge(@PathVariable String month)
    {
        Challenge challenge= challengeService.getChallenge(month);
        if(challenge!=null)return new ResponseEntity<>(challenge, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateChallenge(@PathVariable Long id,@RequestBody Challenge updatedChallenge)
    {
        boolean isUpdated=challengeService.updateChallenge(id, updatedChallenge);
        if(isUpdated)return new ResponseEntity<>("challenge updated sucessfully",HttpStatus.OK);
        return new ResponseEntity<>("Challenege not updated ",HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/challenges/{id}")
    public ResponseEntity<String> deleteChallenge(@PathVariable Long id)
    {
       boolean isDelelted= challengeService.removeChallenge(id);
       if(isDelelted)return new ResponseEntity<>("Challenge is sucessfully deleted",HttpStatus.OK);
       return new ResponseEntity<>("Challenege not deleted",HttpStatus.NOT_FOUND);
    }
}
