package com.church.church.Service.ImplService.Leaders;

import com.church.church.Domain.Leaders.Pastor;
import com.church.church.Repository.PastorRepo;
import com.church.church.Service.ImplService.PastorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PastorServiceImpl implements PastorService {


    private static PastorService pastorService = null;
    @Autowired
    private PastorRepo pastorRepo;

    private PastorServiceImpl()
    {

    }

    public static PastorService getPastorService(){
        if(pastorService ==null) pastorService = new PastorServiceImpl();
        return pastorService;
    }



    @Override
    public Pastor displayBy(String pastorTitle) {
        List<Pastor> pastorList = getAll();
        for(Pastor pastor: pastorList)
        {
            if(pastor.getPastorTitle().equalsIgnoreCase(pastorTitle))
                return pastor;
        }
        return null;
    }

    @Override
    public List<Pastor> getAll() {

        return this.pastorRepo.findAll();
    }

    @Override
    public Pastor create(Pastor pastor) {

        return this.pastorRepo.save(pastor);
    }

    @Override
    public Pastor read(String s) {
        Optional<Pastor> pastorOptional = this.pastorRepo.findById(s);
        return pastorOptional.orElse(null);
    }

    @Override
    public Pastor update(Pastor pastor) {
        return this.pastorRepo.save(pastor);
    }

    @Override
    public void delete(String s) {

        this.pastorRepo.deleteById(s);

    }
}
