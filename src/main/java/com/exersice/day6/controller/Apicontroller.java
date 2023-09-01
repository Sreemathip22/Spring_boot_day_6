package com.exersice.day6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exersice.day6.model.Child;
import com.exersice.day6.service.Childservice;


@RestController
public class Apicontroller {
@Autowired
private Childservice childservice;
	
	@PostMapping("save")
	public Child saveProducts(@RequestBody Child c) {
		
		return childservice.saveProducts(c);
	}
	@PostMapping("addnitems")
	public List<Child> addndetails(@RequestBody List<Child> category){
		return childservice.savedetails(category);
	}
	@GetMapping("showdetails")
	public List<Child> show(){
		return childservice.showinfo();
		
	}
	 @GetMapping("add")
	    public ResponseEntity<Page<Child>> getProductsByField(
	            @RequestParam String field,     // Field for sorting
	            @RequestParam int pageNo,       // Page number (starting from 0)
	            @RequestParam int pageSize) {   // Page size
	        Page<Child> products = childservice.getProductsByField(field, pageNo, pageSize);
	        return ResponseEntity.ok(products);
	    }
	 @GetMapping("request")
	 public String requestParam(@RequestParam String name) {
		 return name;
	 }
}
