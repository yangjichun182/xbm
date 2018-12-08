package com.xbm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.NamedThreadLocal;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class DebugInterceptor implements HandlerInterceptor {

	private NamedThreadLocal<Long> startTimeThreadLocal = new NamedThreadLocal<Long>("StopWatch-StartTime");

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

		long endTime = System.currentTimeMillis();// 1、开始时间
		long beginTime = startTimeThreadLocal.get();
		long time = endTime - beginTime;
		System.out.println("debug:requestURL（请求资源路径）:" + arg0.getRequestURL());
		if (time > 5000) {
			System.out.println("处理耗时（超过5s）:" + time + "ms");
		}
		if (arg2 instanceof HandlerMethod) {
			HandlerMethod hm = (HandlerMethod) arg2;
			System.out.println("debug:controller（控制器路径）:" + hm.getBean().getClass());
			System.out.println("debug:action(动作方法名):" + hm.getMethod().getName());
		}
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2) throws Exception {

		long beginTime = System.currentTimeMillis();// 1、开始时间
		startTimeThreadLocal.set(beginTime);// 线程绑定变量（该数据只有当前请求的线程可见）

		return true;
	}

}
