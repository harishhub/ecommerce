package com.harishhub.ecommerceapp.app.web;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/vehicles")
@RequiredArgsConstructor
public class VehicleController {

    @GetMapping("/get")
    public ResponseEntity<String> getAllVehicles(){
        return ResponseEntity.ok("No Vehicles");
    }
}
