package cn.alibaba.task.service;

import cn.alibaba.task.bo.Student;
import cn.alibaba.task.factory.TaskFactory;

/**
 * @author zhangkun
 * @create 2020-08-25 11:22 AM
 * @desc 任务C
 **/

public class CTaskService  implements TaskFactory {


    @Override
    public Boolean executeTask(Student student) {
        System.out.println("学生" + student.getName() + "完成C任务");
        return true;
    }
}
