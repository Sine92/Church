package com.church.church.Domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Pastor {
   @Id
   @Column(name = "Pastor_Name")
   private String pastorId;
   @Column(name = "Pastor_Title")
   private  String pastorTitle;

    public String getPastorId() {
        return pastorId;
    }

    public String getPastorTitle() {
        return pastorTitle;
    }
    public Pastor(Builder build){
        this.pastorId = build.pastorId;
        this.pastorTitle = build.pastorTitle;
    }

    public static class Builder{
        private String pastorId;
        private  String pastorTitle;


        public Builder pastorId(String pastorId)
        {
            this.pastorId = pastorId;
            return this;
        }

        public Builder pastorTitle(String pastorTitle)
        {
            this.pastorTitle = pastorTitle;
            return this;
        }
        public Pastor build()
        {
           return new Pastor(this);
        }

    }
    @Override
    public String toString() {
        return "Pastor{" +
                "Pastor_id='" + pastorId + '\'' +
                ", Pastor_Title='" + pastorTitle + '\'' +
                '}';
    }

}
