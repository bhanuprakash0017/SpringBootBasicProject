package com.bhanu.myfirstproject;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

@Service
public class ChallengeService {
    private List<Challenge> challenges=new ArrayList<>();
    private Long id=1l;
    public ChallengeService()
    {

    }
    public List<Challenge> getAllChallenges()
    {
        return challenges;
    }
    public boolean addChallenge( Challenge challenge )
    {
        if(challenge==null)return false;
        challenge.setId(id++);
        challenges.add(challenge);
        return true;
    }

    public Challenge getChallenge(String month) {
        for(Challenge challenge:challenges)
        {
            if(challenge.getMonth().equalsIgnoreCase(month))return challenge;
        }
        return null;
    }

    public boolean updateChallenge(Long id, Challenge updatedChallenge) {
        for(Challenge challenge:challenges)
        {
            if(challenge.getId().equals(id))
            {
                challenge.setDescription(updatedChallenge.getDescription());
                challenge.setMonth(updatedChallenge.getMonth());
                return true;
            }
        }
        return false;
    }

    public boolean removeChallenge(Long id) {
        for(Challenge challenge:challenges)
        {
            if(challenge.getId().equals(id))
            {
                challenges.remove(challenge);
                return true;
            }

        }
        return false;
    }
}
