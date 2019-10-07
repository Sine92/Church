package com.church.church.Domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Sermon {
    @Id
    @Column(name = "SermonID")
    private String sermonId;
    @Column(name = "SermonTopic")
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
