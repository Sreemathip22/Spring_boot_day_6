package com.exersice.day6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.exersice.day6.model.Child;
import com.exersice.day6.repository.Childrepo;

@Service
public class Childservice {
@Autowired
private Childrepo childrepo;
public Page<Child> getProductsByField(String field, int pageNo, int pageSize) {
   Sort sort = Sort.by(field);
    Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
    return childrepo.findAll(pageable);
}
public Child saveProducts(Child c) {
	return childrepo.save(c);
	
	
	
}
public List<Child> savedetails(List<Child> child) {
	return (List<Child>) childrepo.saveAll(child);
}
public List<Child> showinfo() {
	return (List<Child>) childrepo.findAll();
}


}
