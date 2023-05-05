package com.example.watchstopdb;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/time")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StopWatchController {

    private final StopWatchService stopWatchService;

    public StopWatchController(StopWatchService stopWatchService) {this.stopWatchService = stopWatchService;}

    @CrossOrigin
    @PostMapping("/saveTime")
    public void saveTime(@RequestHeader("mill")  String milliSec, @RequestHeader("sec") String sec, @RequestHeader("min")  String minute) {
        stopWatchService.saveTime(milliSec, sec, minute);
    }

    @GetMapping
    public List<StopWatch> getTime(){return stopWatchService.getTime();}
}
