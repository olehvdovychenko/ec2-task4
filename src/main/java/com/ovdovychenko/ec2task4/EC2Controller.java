package com.ovdovychenko.ec2task4;

import com.amazonaws.util.EC2MetadataUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EC2Controller {

    @GetMapping("/instance")
    public String getEC2Info(){
        return "Region: " + EC2MetadataUtils.getEC2InstanceRegion() + System.lineSeparator()
                +  " Availability Zone: " + EC2MetadataUtils.getAvailabilityZone();
    }
}
