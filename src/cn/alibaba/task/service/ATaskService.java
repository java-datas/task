package cn.alibaba.task.service;

import cn.alibaba.task.bo.Student;
import cn.alibaba.task.factory.TaskFactory;

/**
 * @author zhangkun
 * @create 2020-08-25 11:18 AM
 * @desc 任务A服务
 **/

public class ATaskService implements TaskFactory {

    @Override
    public Boolean executeTask(Student student) {
        System.out.println("学生" + student.getName() + "完成A任务");
        return true;
    }
}
