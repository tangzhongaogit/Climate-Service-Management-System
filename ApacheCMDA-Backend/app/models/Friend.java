package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by yuanliu on 12/5/15.
 */
@Entity
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    String user1;
    String user2;

    public Friend(){

    }

    public Friend(String user1, String user2){
        this.user1 = user1;
        this.user2 = user2;
    }

    public void setUser1(String user1){
        this.user1 = user1;
    }

    public void setUser2(String user2){
        this.user2 = user2;
    }

    public String getUser1(){
        return user1;
    }

    public String getUser2(){
        return user2;
    }

}
