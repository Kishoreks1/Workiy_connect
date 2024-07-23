//package com.wc.models;
////new add (8-7-24)
//import javax.persistence.*;
//
//@Entity
//@Table(name = "remarks")
//public class Remark {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private int id;
//
//    @ManyToOne
//    @JoinColumn(name = "manager_id", nullable = false)
//    private UserInfo manager;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private UserInfo user;
//
//    @Column(name = "remark")
//    private String remark;
//
//    // Getters and setters
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public UserInfo getManager() {
//        return manager;
//    }
//
//    public void setManager(UserInfo manager) {
//        this.manager = manager;
//    }
//
//    public UserInfo getUser() {
//        return user;
//    }
//
//    public void setUser(UserInfo user) {
//        this.user = user;
//    }
//
//    public String getRemark() {
//        return remark;
//    }
//
//    public void setRemark(String remark) {
//        this.remark = remark;
//    }
//}
