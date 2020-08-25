package cn.alibaba.task.service;

import cn.alibaba.task.bo.Student;
import cn.alibaba.task.factory.TaskFactory;

/**
 * @author zhangkun
 * @create 2020-08-25 11:23 AM
 * @desc 任务E
 **/

public class ETaskService implements TaskFactory {


    @Override
    public Boolean executeTask(Student student) {
        System.out.println("学生" + student.getName() + "完成E任务");
        return false;
    }



}
