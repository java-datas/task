package cn.alibaba.task;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import cn.alibaba.task.bo.Student;
import cn.alibaba.task.bo.StudentA;
import cn.alibaba.task.bo.StudentB;
import cn.alibaba.task.bo.StudentC;
import cn.alibaba.task.bo.StudentD;
import cn.alibaba.task.bo.StudentE;
import cn.alibaba.task.factory.TaskFactory;
import cn.alibaba.task.service.ATaskService;
import cn.alibaba.task.service.BTaskService;
import cn.alibaba.task.service.CTaskService;
import cn.alibaba.task.service.DTaskService;
import cn.alibaba.task.service.ETaskService;

/**
 * @author zhangkun
 * @create 2020-08-25 12:45 PM
 * @desc
 **/

public class Test {


    /**
     * 缓存已经处理过的学生
     */
    static Map<String, Object> map = new ConcurrentHashMap<>();


    public static void main(String[] args) {

        Student studentA = new StudentA("A");
        Student studentB = new StudentB("B");
        Student studentC = new StudentC("C");
        Student studentD = new StudentD("D");
        Student studentE = new StudentE("E");

        TaskFactory taskServerA = new ATaskService();
        TaskFactory taskServerB = new BTaskService();
        TaskFactory taskServerC = new CTaskService();
        TaskFactory taskServerD = new DTaskService();
        TaskFactory taskServerE = new ETaskService();
        /**
         * 学生与任务之间实现多种耦合组合
         */
        while (true) {
            ConstructorsStrategy constructorsStrategy1 = new ConstructorsStrategy(studentA, taskServerA);//优先选择学生A 组合
            Boolean flag = isCompleteTask(constructorsStrategy1);
            if (flag) break;
            constructorsStrategy1 = new ConstructorsStrategy(studentB, taskServerA);//选择学生B 组合
            flag = constructorsStrategy1.completeTask();
            if (flag) break;
            constructorsStrategy1 = new ConstructorsStrategy(studentC, taskServerA);//选择学生C 组合
            flag = constructorsStrategy1.completeTask();
            if (flag) break;
            constructorsStrategy1 = new ConstructorsStrategy(studentD, taskServerA);//选择学生D 组合
            flag = constructorsStrategy1.completeTask();
            if (flag) break;
            constructorsStrategy1 = new ConstructorsStrategy(studentE, taskServerA);//选择学生E 组合
            flag = constructorsStrategy1.completeTask();
            break;

        }


    }


    /**
     * 是否能完成任务
     */
    public static Boolean isCompleteTask(ConstructorsStrategy constructorsStrategy) {
        String name = constructorsStrategy.getStudent().getName();
        Object o = map.get(name);
        if (null != o) return false;
        Boolean flag = constructorsStrategy.completeTask();
        if (flag) map.put(name, name);
        return flag;
    }


}
