package 实验一;
import javax.swing.*;
class PasswordException extends Exception  //定义异常
{
	 PasswordException(String s)
	 {
		 super(s);
	    JOptionPane.showMessageDialog(null,s);
	 }	
}
public class User
{
	private String password;
	
	public static String create() throws PasswordException  //抛出异常
	{
		String password=JOptionPane.showInputDialog(null,"输入密码:");
		if(password.length()<4||password.length()>6)
		{
			throw new PasswordException("密码长度错误，应为4到6位！");
		}
		if(!password.matches("\\d+"))
		{
			throw new PasswordException("密码中不能含有非数字字符！");
		}
		return password;
	}
	
    public static void main(String args[])
    {
         try 
         { 
        	 String password = create();
        	 JOptionPane.showMessageDialog(null,"密码创建成功，密码是：" + password);
         }catch(Exception e){
             
         } 
    }
}


