/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.familinsurance.familinsurance;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author BIBI
 */
 
@RestController
public class ServiceController {
    
    @GetMapping("/Services")
    List<Service> getServices(){
        List<Service> servicelist = new ArrayList<>();
        Service service1 = new Service();
        service1.id=1;
        service1.name= "Aseguradora";
        service1.description= "Control de seguros";
        service1.image= 
        return null; 
    }
   
@GetMapping("/")
String getHello(){
   return ("Hello world") ;

 } 
 }
    
    

