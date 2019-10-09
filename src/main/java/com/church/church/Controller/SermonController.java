package com.church.church.Controller;

import com.church.church.Domain.Preaching.Sermon;
import com.church.church.Service.ImplService.Preaching.SermonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("church/sermon")
public class SermonController {
    @Autowired
    SermonServiceImpl sermonService;

    @PostMapping(value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Sermon create(@RequestBody Sermon sermon){
        return sermonService.create(sermon);
    }

    @GetMapping(value="/read")
    public Sermon read(@PathVariable String sermonId){
        return this.sermonService.read(sermonId);
    }

    @PutMapping(value = "update")
    public Sermon update(@RequestBody Sermon sermon)
    {
        return this.sermonService.update(sermon);
    }
    @DeleteMapping(value = "/delete")
    public void delete(@PathVariable String sermonId)
    {
        this.sermonService.delete(sermonId);
    }

    @GetMapping(value = "/getall")
    public List<Sermon> getAll(){
        return this.sermonService.getAll();
    }



}
