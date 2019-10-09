package com.church.church.Domain.Leaders;



import javax.persistence.*;


@Entity
public class Pastor {
   @Id
   //@GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "Pastor",columnDefinition = "VARCHAR(100)",nullable=false)
   private String pastorId;

   @Column(name = "Pastor",nullable=false,insertable = false,updatable = false)
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
