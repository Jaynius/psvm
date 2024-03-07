package com.jaynius.psvm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jaynius.psvm.model.Trackers;
import com.jaynius.psvm.service.TrackersService;

@RestController
public class TrackersController {
    @Autowired
    private final TrackersService service;

    public TrackersController(TrackersService service) {
        this.service = service;
    }
    
    @PostMapping("/trackers/addTracker")
    public ResponseEntity<Trackers> addTracker(@RequestBody Trackers tracker){
        return service.addTracker(tracker);
    }

    @GetMapping("/trackers/{serialNumber}")
    public ResponseEntity<Trackers> getTrackerbyId(@PathVariable String serialNumber){
        return service.getTrackerById(serialNumber);
    }
    
    @GetMapping("/trackers")
    public ResponseEntity<List<Trackers>> getAllTrackers(){
        return service.getAllTrackers();
    }

    @PostMapping("/trackers/update/{serialNumber}")
    public ResponseEntity<Trackers> updateTrackerById(@RequestBody Trackers tracker,@PathVariable String serialNumber){
        return service.updateTrackerById(tracker, serialNumber);
    }

    @DeleteMapping("/trackers/delete/{serialNumber}")
    public ResponseEntity<Trackers> deleteTrackerById(@PathVariable String serialNumber){
        return service.deleteTrackerById(serialNumber);
    }
}
