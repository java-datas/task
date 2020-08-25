package cn.alibaba.task.service;

import cn.alibaba.task.bo.Student;
import cn.alibaba.task.bo.StudentC;
import cn.alibaba.task.factory.TaskFactory;

/**
 * @author zhangkun
 * @create 2020-08-25 11:22 AM
 * @desc 任务D
 **/

public class DTaskService implements TaskFactory {


    @Override
    public Boolean executeTask(Student student) {
        System.out.println("学生" + student.getName() + "完成D任务");
        return false;
    }
}
