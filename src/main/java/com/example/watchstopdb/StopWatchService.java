package com.example.watchstopdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StopWatchService {
    private final StopWatchRepository stopWatchRepository;


    @Autowired
    public StopWatchService(StopWatchRepository stopWatchRepository){
        this.stopWatchRepository = stopWatchRepository;
    }


    public StopWatch saveTime(String milliSec, String sec, String min) {
        StopWatch newStopWatch = new StopWatch(UUID.randomUUID().toString(), min, sec, milliSec);
        stopWatchRepository.save(newStopWatch);
        return newStopWatch;
    }

    public List<StopWatch> getTime(){return stopWatchRepository.findAll();}
}
