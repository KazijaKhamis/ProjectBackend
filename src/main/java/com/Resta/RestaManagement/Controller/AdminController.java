package com.Resta.RestaManagement.Controller;

import com.Resta.RestaManagement.Module.Admin;
import com.Resta.RestaManagement.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    public AdminRepository adminRepository;
    @GetMapping("/admin")
    private List<Admin>viewItems(){
        return adminRepository.findAll();
    }
    @PostMapping("admin")
    public Admin addAdmin(@RequestBody Admin admin){
        return adminRepository.save(admin);
    }


}




