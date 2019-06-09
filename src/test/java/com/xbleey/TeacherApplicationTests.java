package com.xbleey;

import com.xbleey.dao.GradeDao;
import com.xbleey.dao.StudentDao;
import com.xbleey.entity.Grade;
import com.xbleey.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

;import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherApplicationTests {

    @Autowired
    GradeDao gradeDao;
    @Autowired
    StudentDao studentDao;

    Logger logger = LoggerFactory.getLogger(TeacherApplicationTests.class);

    @Test
    public void gradeTest() {
        List<Grade> grades =gradeDao.findAll();
        logger.info(grades.get(0).toString());
    }

    @Test
    public void studentTest() {
        List<Student> students =studentDao.findAll();
        logger.info(students.get(0).toString());
    }
}
