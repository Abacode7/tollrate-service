package com.pluralsight.tollrateservice;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TollRateController {

    List<TollRate> tollrates;
    List<TollRateV2> tollratesV2s;

    public TollRateController() {

        tollrates = new ArrayList<TollRate>();
        tollrates.add(new TollRate(1000, 0.55f, Instant.now().toString()));
        tollrates.add(new TollRate(1001, 1.05f, Instant.now().toString()));
        tollrates.add(new TollRate(1002, 0.60f, Instant.now().toString()));
        tollrates.add(new TollRate(1003, 1.00f, Instant.now().toString()));

        tollratesV2s = new ArrayList<TollRateV2>();
        tollratesV2s.add(new TollRateV2(1000, 0.55f, Instant.now().toString(), true));
        tollratesV2s.add(new TollRateV2(1001, 1.05f, Instant.now().toString(), true));
        tollratesV2s.add(new TollRateV2(1002, 0.60f, Instant.now().toString(), true));
        tollratesV2s.add(new TollRateV2(1003, 1.00f, Instant.now().toString(), true));
        
    }

    @RequestMapping("/tollrate/{stationId}")
    public TollRate GetTollRate(@PathVariable int stationId) {
        System.out.println("stationId: " + stationId);
        return tollrates.stream().filter(rate -> stationId == rate.getStationId()).findAny().orElse(new TollRate());
    }

    @RequestMapping("/tollrateslow/{stationId}")
    public TollRate GetTollRateSlow(@PathVariable int stationId) throws InterruptedException {
        System.out.println("stationId: " + stationId);
        Thread.sleep(3000);
        return tollrates.stream().filter(rate -> stationId == rate.getStationId()).findAny().orElse(new TollRate());
    }

    @RequestMapping("/tollrateV2/{stationId}")
    public TollRateV2 GetTollRateV2(@PathVariable int stationId) {
        System.out.println("stationId: " + stationId);
        return tollratesV2s.stream().filter(rate -> stationId == rate.getStationId()).findAny().orElse(new TollRateV2());
    }
    
}
