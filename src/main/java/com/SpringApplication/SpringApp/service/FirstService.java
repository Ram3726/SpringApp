package com.SpringApplication.SpringApp.service;
import com.SpringApplication.SpringApp.entity.FirstEntity;
import com.SpringApplication.SpringApp.model.FirstModel;
import com.SpringApplication.SpringApp.repository.FirstRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    @Autowired
   private FirstRepository firstRepository;
    public String saveData(FirstModel firstModel){
        FirstEntity firstEntity = new FirstEntity();
        firstEntity.setSName(firstModel.getName());

        try {
            firstRepository.save(firstEntity);
        }catch (Exception e){
            System.err.println("Error details "+ e.getMessage());

        }
        return "successful";
    }

}
