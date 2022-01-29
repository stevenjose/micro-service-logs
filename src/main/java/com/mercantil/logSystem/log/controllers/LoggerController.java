package com.mercantil.logSystem.log.controllers;

import com.mercantil.logSystem.log.models.LogSystem;

import com.mercantil.logSystem.log.repository.LogSystemRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class LoggerController {

    private final org.slf4j.Logger Log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private LogSystemRepository logSystemRepository;

    @PostMapping("/postLog")
    public void postLogin(@Valid @RequestBody LogSystem logSystem) {
        if(logSystem.getError().equals(true)) {
            Log.error("CodError: " + logSystem.getCode()+ " Application: " + logSystem.getApplication()
                    + " Message: " + logSystem.getMessage() + " Error: " + logSystem.getError());
            logSystemRepository.save(logSystem);
        }   else{
            Log.info("CodError: " + logSystem.getCode()+ " Application: " + logSystem.getApplication()
                    + " Message: " + logSystem.getMessage() + " Error: " + logSystem.getError());
        }

    }

}
