package com.church.church.Controller;

import com.church.church.Domain.Leaders.Pastor;
import com.church.church.Factory.PastorFactory;
import com.church.church.Service.ImplService.Leaders.PastorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/church/pastor")
public class PastorController {

    @Autowired
    PastorServiceImpl pastorService;

    @PostMapping(value = "/create/{pastorTitle}")
    public @ResponseBody Pastor create(@PathVariable String pastorTitle){
        return pastorService.create(PastorFactory.buildPastor(pastorTitle));
    }

    @GetMapping(value="/read/{pastorId}")
    public Pastor read(@PathVariable Integer pastorId){



        return this.pastorService.read(pastorId);
    }

    @PutMapping(value = "/update")
    public Pastor update(@RequestBody Pastor pastor)
    {
        return this.pastorService.update(pastor);
    }
    @DeleteMapping(value = "/delete/{pastorId}")
     public void delete(@PathVariable Integer pastorId)
    {
        this.pastorService.delete(pastorId);
    }

    @GetMapping(value = "/getall")
    public List<Pastor> getAll(){
        return this.pastorService.getAll();
}


}
