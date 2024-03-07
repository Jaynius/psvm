package com.jaynius.psvm.service.serviceImpl;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.jaynius.psvm.model.Trackers;
import com.jaynius.psvm.service.TrackersService;

@Component
public class TrackersServiceImpl implements TrackersService{

    @Override
    public ResponseEntity<Trackers> addTracker(Trackers newTracker) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addTracker'");
    }

    @Override
    public ResponseEntity<Trackers> getTrackerById(String serialNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTrackerById'");
    }

    @Override
    public ResponseEntity<Trackers> updateTrackerById(Trackers tracker, String serialNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateTrackerById'");
    }

    @Override
    public ResponseEntity<List<Trackers>> getAllTrackers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllTrackers'");
    }

    @Override
    public ResponseEntity<Trackers> deleteTrackerById(String serialnumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteTrackerById'");
    }
    
}
