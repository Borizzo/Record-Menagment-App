package com.boriz.MyApi.service;

import com.boriz.MyApi.model.Record;
import com.boriz.MyApi.repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecordServiceImpl implements  RecordService {
    @Autowired
    private RecordRepository recordRepository;

    @Override
    public Record saveRecord(Record record) {
        return recordRepository.save(record);
    }

    @Override
    public List<Record> getAllRecords() {
        return recordRepository.findAll();
    }

    public Record updateRecord(Record record) {
        Record existingRecord = recordRepository.findById(record.getId()).orElse(null);
        existingRecord.setTitle(record.getTitle());

        return recordRepository.save(existingRecord);
    }
    public void deleteRecord(Integer recordId) {
        recordRepository.deleteById(recordId);

    }
}
