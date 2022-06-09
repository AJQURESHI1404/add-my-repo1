package com.zira.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zira.restaurant.model.Staff;
import com.zira.restaurant.repository.StaffRepository;

@Service
public class StaffService {
 
 @Autowired
 private StaffRepository staffRepository;
 
 public Staff registerStaff(Staff staff) {
  return staffRepository.save(staff);
 }
 
 public List<Staff> getStaff(){
	 return (List<Staff>) staffRepository.findAll();
 }

}