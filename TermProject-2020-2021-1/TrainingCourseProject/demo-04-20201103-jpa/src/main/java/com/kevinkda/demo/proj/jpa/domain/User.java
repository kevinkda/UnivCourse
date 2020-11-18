package com.kevinkda.demo.proj.jpa.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Kevin KDA on 2020/11/3 15:19
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.jpa.domain
 * @classname User
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;
    @Column(name = "user_name")
    private String name;
    @Column(name = "user_pass")
    private String pass;
    @Column(name = "reg_time")
    private Date date;

    public User(String name, String pass) {
        this.name = name;
        this.pass = pass;
        this.date = new Date();
    }
}