package com.knor.searchroute.service;

import com.knor.searchroute.model.Bus;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class Separator {

    public List<String> dataToList(String path) throws IOException {
       return Files.lines(Paths.get(path)).toList();
    }

    public List<Bus> separate(List<String> inputData) {
        List<Bus> buses = new ArrayList<>();


        return buses;
    }

}
