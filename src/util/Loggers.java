package util;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

//日志增强类
public class Loggers {
    Logger log = Logger.getLogger(Loggers.class);

    /*前置增强*/
    public void before(JoinPoint jp) {
        //getTarger()获取类名，getSignature()获取方法名，getA如果是()获取参数列表
        log.info("调用" + jp.getTarget() + "的" + jp.getSignature()
                + "方法，方法参数为" + Arrays.toString(jp.getArgs()));

    }

    /*后置增强*/
    public void afterReturning(JoinPoint jp, Object result) {
        log.info("调用" + jp.getTarget() + "的" + jp.getSignature()
                + "方法，返回值为：" + result);
    }
}