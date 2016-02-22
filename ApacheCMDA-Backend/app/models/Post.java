package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
//    private long postId;

    private String comment;
    private Long postTime;
    private String user;
    private String climateService;
    private long climateServiceID;

    private String atUser;
    private String atClimateService;

    private double grade;

    public Post(){
    }

    public Post(String comment, Long postTime, String user, double grade, String climateService, long climateServiceID){
        super();
//        this.postId = postId;
        this.comment = comment;
        this.postTime = postTime;
        this.user = user;
        this.grade = grade;
        this.climateService = climateService;
        this.climateServiceID = climateServiceID;
    }

    public String getAtUser(){
        return atUser;
    }

    public String getAtClimateService(){
        return  atClimateService;
    }

    public void setAtUser( String atUser ){
        this.atUser = atUser;
    }

    public void setAtClimateService( String atClimateService ){
        this.atClimateService = atClimateService;
    }

//    public long getPostId(){
//        return id;
//    }

    public String getComment(){
        return comment;
    }

    public long getclimateServiceID(){
        return climateServiceID;
    }

    public Long getDate(){
        return postTime;
    }

    public String getUser(){
        return user;
    }

    public double getGrade(){
        return grade;
    }

    public String getClimateService(){
        return climateService;
    }

//    public void setPostId(long postId){
//        this.postId = postId;
//    }

    public void setComment(){
        this.comment = comment;
    }

    public void setClimateServiceID(long climateServiceID) {this.climateServiceID = climateServiceID;}

    public void setDate(Long postTime){
        this.postTime = postTime;
    }

    public void setUser(String user){
        this.user = user;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }

    public void setClimateService(String climateService){
        this.climateService = climateService;
    }

    @Override
    public String toString(){
        return "ClimateService [id=" + id /*+ ", postId=" + postId*/
                + ", user=" + user + ", comment=" + comment + ", grade=" + grade
                +", postTime=" + postTime +", climateService="
                +climateService+", atUser="
                +atUser+", atClimateService="
                +atClimateService+"]";
    }

}
