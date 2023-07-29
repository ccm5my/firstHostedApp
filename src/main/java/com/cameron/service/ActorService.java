package com.cameron.service;

import com.cameron.interfaces.IActorService;
import com.cameron.model.Actor;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Service
public class ActorService implements IActorService {
    @Override
    public String getRates() {
        return "here is a rate";
    }
}
