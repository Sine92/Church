package com.church.church.Domain.Preaching;



import javax.persistence.*;


@Entity
public class Sermon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SermonID")
    private Integer sermonId;

    public void setSermonId(Integer sermonId) {
        this.sermonId = sermonId;
    }

    public void setSermonTopic(String sermonTopic) {
        this.sermonTopic = sermonTopic;
    }

    private String sermonTopic;


    public Sermon(Builder build)
    {
        this.sermonId = build.sermonId;
        this.sermonTopic = build.sermonTopic;
    }

    public Integer getSermonId() {
        return sermonId;
    }

    public String getSermonTopic() {
        return sermonTopic;
    }


    public static class Builder {
        private Integer sermonId;
        private String sermonTopic;

        public Builder sermonId(Integer sermonId)
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
