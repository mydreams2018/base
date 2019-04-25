package com.landary.base.web.aop;

import com.landary.DynamicDataSource;
import com.landary.base.web.annotation.PermissionDataSource;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

@Aspect
@Component
public class DataSourceAop {

    @Pointcut("execution(* com.landary.base.service.impl..*.*(..))")
    public void pointCut(){}

    @Before("pointCut()")
	public void init(JoinPoint jt) {
        Annotation[] annotations = jt.getTarget().getClass().getAnnotations();
        for(int x=0;x<annotations.length;x++){
            if(annotations[x].toString().contains("PermissionDataSource")){
                DynamicDataSource.currentThread.set("dataSourceOTwo");
            }
        }
    }
}