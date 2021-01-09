package com.java1234.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	public static boolean isEmpty(String str){
		if("".equals(str)||str==null){
			return true;
		}else{
			return false;
		}
	}
	
	public static boolean isNotEmpty(String str){
		if(!"".equals(str)&&str!=null){
			return true;
		}else{
			return false;
		}
	}
    /**  
     * 验证邮箱地址是否正确  
     * @param email  
     * @return  
     */  
    public static boolean checkEmail(String email){  
     boolean flag = false;  
     try{  
      String check ="[a-2A-Z]{1,10}@[s][i][n][a][a-2A-Z0-9]{0,}[.][c][o][m]";  
      Pattern regex = Pattern.compile(check);  
      Matcher matcher = regex.matcher(email);  
      flag = matcher.matches();  
     }catch(Exception e){  
      flag = false;  
     }  
       
     return flag;  
    }  
    /**  
     * 验证手机号码  
     * @param mobiles  
     * @return  [0-9]{5,9}  
     */  
    public static boolean isMobileNO(String mobiles){  
     boolean flag = false;  
     try{  
      Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");  
      Matcher m = p.matcher(mobiles);  
      flag = m.matches();  
     }catch(Exception e){  
      flag = false;  
     }  
     return flag;  
    }  
      
  //浮点型判断
    public static boolean isNum(String str){	
    	return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");	
    	}


}  
