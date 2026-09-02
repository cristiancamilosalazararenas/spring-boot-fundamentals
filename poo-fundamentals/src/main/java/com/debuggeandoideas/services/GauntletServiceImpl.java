package com.debuggeandoideas.services;

import com.debuggeandoideas.models.RealityStone;
import com.debuggeandoideas.models.Stone;
import lombok.extern.java.Log;

// @Service -> For Spring Boot projects.
@Log
public class GauntletServiceImpl implements GauntletService {

    private Stone realityStone = new RealityStone();

    @Override
    public void useGauntlet(String stoneName) {
        log.info("Use stone: " + realityStone);
    }
}
