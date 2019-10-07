package com.church.church.Controller;

import com.church.church.Domain.Pastor;
import com.church.church.Service.ImplService.Leaders.PastorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/church/pastor")
public class PastorController {

    @Autowired
    PastorServiceImpl pastorService;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pastor create(@RequestBody Pastor pastor){
        return pastorService.create(pastor);
    }

    @GetMapping(value="/read")
    public Pastor read(@PathVariable String pastorId){
        return this.pastorService.read(pastorId);
    }

    @PutMapping(value = "/update")
    public Pastor update(@RequestBody Pastor pastor)
    {
        return this.pastorService.update(pastor);
    }
    @DeleteMapping(value = "/delete")
     public void delete(@PathVariable String pastorId)
    {
        this.pastorService.delete(pastorId);
    }

    @GetMapping(value = "/getall")
    public List<Pastor> getAll(){
        return this.pastorService.getAll();
}


}
