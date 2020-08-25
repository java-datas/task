package cn.alibaba.task.service;

import cn.alibaba.task.bo.Student;
import cn.alibaba.task.factory.TaskFactory;

/**
 * @author zhangkun
 * @create 2020-08-25 11:20 AM
 * @desc 任务B
 **/

public class BTaskService  implements TaskFactory {



    @Override
    public Boolean executeTask(Student student) {
        System.out.println("学生" + student.getName() + "完成B任务");
        return true;
    }
}
