package ʵ��һ;
import javax.swing.*;
class PasswordException extends Exception  //�����쳣
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
	
	public static String create() throws PasswordException  //�׳��쳣
	{
		String password=JOptionPane.showInputDialog(null,"��������:");
		if(password.length()<4||password.length()>6)
		{
			throw new PasswordException("���볤�ȴ���ӦΪ4��6λ��");
		}
		if(!password.matches("\\d+"))
		{
			throw new PasswordException("�����в��ܺ��з������ַ���");
		}
		return password;
	}
	
    public static void main(String args[])
    {
         try 
         { 
        	 String password = create();
        	 JOptionPane.showMessageDialog(null,"���봴���ɹ��������ǣ�" + password);
         }catch(Exception e){
             
         } 
    }
}


