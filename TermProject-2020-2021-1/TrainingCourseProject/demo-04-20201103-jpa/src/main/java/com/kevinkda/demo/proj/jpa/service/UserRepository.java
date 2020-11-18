package com.kevinkda.demo.proj.jpa.service;

import com.kevinkda.demo.proj.jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Kevin KDA on 2020/11/3 15:26
 * @version 1.0.0
 * @project TrainingCourseProject
 * @package com.kevinkda.demo.proj.jpa.service
 * @classname UserRepository
 * @apiNote
 * @implSpec
 * @implNote
 * @since 1.0.0
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
