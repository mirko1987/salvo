package com.codeoftheweb.Salvo.controllers;


import com.codeoftheweb.Salvo.models.Player;
import com.codeoftheweb.Salvo.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*",allowedHeaders = "true")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @CrossOrigin
    @GetMapping("/players")
    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    }

