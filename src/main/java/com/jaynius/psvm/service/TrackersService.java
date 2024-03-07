package com.jaynius.psvm.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jaynius.psvm.model.Trackers;

@Service
public interface TrackersService {
    public ResponseEntity<Trackers> addTracker(Trackers newTracker);
    public ResponseEntity<Trackers> getTrackerById(String serialNumber);
    public ResponseEntity<Trackers> updateTrackerById(Trackers tracker, String serialNumber );
    public ResponseEntity<List<Trackers>> getAllTrackers();
    public ResponseEntity<Trackers> deleteTrackerById(String serialnumber);
}
