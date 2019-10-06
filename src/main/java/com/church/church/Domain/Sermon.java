package com.church.church.Domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Sermon {
    @Id
    private String sermonId;
    @Column(name = "Sermon")
    @OneToMany()
    private String sermonTopic;


    public Sermon(Builder build)
    {
        this.sermonId = build.sermonId;
        this.sermonTopic = build.sermonTopic;
    }

    public String getSermonId() {
        return sermonId;
    }

    public String getSermonTopic() {
        return sermonTopic;
    }


    public static class Builder {
        private String sermonId;
        private String sermonTopic;

        public Builder sermonId(String sermonId)
        {
            this.sermonId = sermonId;
            return this;
        }
        public Builder sermonTopic(String sermonTopic)
        {
            this.sermonTopic = sermonTopic;
            return this;
        }

        public Sermon build(){
            return new Sermon(this);
        }



    }
    @Override
    public String toString() {
        return "Sermon{" +
                "Sermon_id='" + sermonId + '\'' +
                ", Sermon_Topic='" + sermonTopic + '\'' +
                '}';
    }

}
