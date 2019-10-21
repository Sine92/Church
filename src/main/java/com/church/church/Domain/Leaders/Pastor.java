package com.church.church.Domain.Leaders;



import javax.persistence.*;


@Entity
public class Pastor {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "Pastor_Id",length = 8)
   private Integer pastorId;
   private  String pastorTitle;

    public void setPastorId(Integer pastorId) {
        this.pastorId = pastorId;
    }

    public void setPastorTitle(String pastorTitle) {
        this.pastorTitle = pastorTitle;
    }

    public Pastor()
   {

   }
    public Integer getPastorId() {
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
        private Integer pastorId;
        private  String pastorTitle;


        public Builder pastorId(Integer pastorId)
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
