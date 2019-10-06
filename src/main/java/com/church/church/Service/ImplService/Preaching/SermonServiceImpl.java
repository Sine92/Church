package com.church.church.Service.ImplService.Preaching;

import com.church.church.Domain.Sermon;
import com.church.church.Repository.SermoRepo;
import com.church.church.Service.ImplService.SermonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class SermonServiceImpl implements SermonService {

    private static SermonService sermonService= null;

    @Autowired
    private SermoRepo sermoRepo;

    private SermonServiceImpl(){

    }
      public static SermonService getSermonService(){
        if(sermonService ==null) sermonService= new SermonServiceImpl();
        return sermonService;
      }
    @Override
    public Sermon displayBy(String sermonTopic) {
        List<Sermon> sermonList = getAll();
        for(Sermon sermon: sermonList){
            if(sermon.getSermonTopic().equalsIgnoreCase(sermonTopic))
                return sermon;
        }

        return null;
    }

    @Override
    public List<Sermon> getAll() {
        return this.sermoRepo.findAll();
    }

    @Override
    public Sermon create(Sermon sermon) {
        return this.sermoRepo.save(sermon);
    }

    @Override
    public Sermon read(String s) {
        Optional<Sermon> sermonOptional =this.sermoRepo.findById(s);
        return sermonOptional.orElse(null);
    }

    @Override
    public Sermon update(Sermon sermon) {
        return this.sermoRepo.save(sermon);

    }

    @Override
    public void delete(String s) {
        this.sermoRepo.deleteById(s);

    }
}
