package cn.sakuraffy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler{
	
	private Object targe;
	
	public DynamicProxy(Object targe) {
		super();
		this.targe = targe;
	}

	/**
	 * 	@param proxy 代理类对象
	 * 	@param method 代理类的调用处理程序的方法对象
	 * 	@param args 代理类的调用处理程序的方法的参数
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("---dynamic proxy start---");
		Object result = method.invoke(targe, args);
		System.out.println("---dynamic proxy end---");
		return result;
	}
	
	public Object getProxy(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(),
				targe.getClass().getInterfaces(), this);
	}
}
