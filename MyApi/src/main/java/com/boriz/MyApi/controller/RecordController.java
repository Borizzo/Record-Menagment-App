package com.boriz.MyApi.controller;

import com.boriz.MyApi.model.Record;
import com.boriz.MyApi.service.RecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/record")
@CrossOrigin
public class RecordController {
    @Autowired
    private RecordService recordService;

    @PostMapping("/add")
    public String add(@RequestBody Record record){
        recordService.saveRecord(record);
        return "added sucessfully";
    }
    @GetMapping("/get")
    public List<Record> getAllRecords(){
        return recordService.getAllRecords();
    }
    @PutMapping("/put")
    public Record updateRecord(@RequestBody Record record){
    return recordService.updateRecord(record);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Record> deleteTodo(@PathVariable("recordId") Integer recordId) {
        recordService.deleteRecord(recordId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
