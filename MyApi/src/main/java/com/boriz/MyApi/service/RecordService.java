package com.boriz.MyApi.service;

import  com.boriz.MyApi.model.Record;

import java.util.List;

public interface RecordService {
    public Record saveRecord(Record record);
    public List<Record> getAllRecords();
    public Record updateRecord(Record record);
    public void deleteRecord(Integer recordId);
}
