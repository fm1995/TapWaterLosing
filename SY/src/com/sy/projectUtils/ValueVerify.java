package com.sy.projectUtils;

import java.math.BigDecimal;

//值校验
public class ValueVerify {
	//空值校验
	public static <T> T isnull(Class<T> c,Object obj){
		if(c==double.class||c==Double.class||c==BigDecimal.class){
			return (T) (obj==null?0.0:obj);
		}else if (c==Integer.class||c==int.class) {
			return (T) (obj==null?0:obj);
		}else{
			return (T) (obj==null?"":obj);
		}
	 } 
}
