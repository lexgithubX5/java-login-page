package intro_to_programming;

import java.util.HashMap;

import javax.swing.JOptionPane;
/*public static void main(String[] args) {
	Frames newPassword = new Frames(JOptionPane.showInputDialog("First Name(user ID)"), JOptionPane.showInputDialog("Password"));
		System.out.println(newPassword.name);}*/
public class IDandPasswords {
	HashMap<String,String> logininfo = new HashMap<String, String>();
	
	IDandPasswords(){
		logininfo.put("bro", "pizza");
		logininfo.put("joe", "biden");
		logininfo.put("homer", "moes");
		logininfo.put("Jordan", "176423");
		logininfo.put("Joachim", "176425");
		logininfo.put("Bimal", "11111");
		//logininfo.put
	 
		
		
}
	protected HashMap<String, String> getLoginInfo(){
		return this.logininfo;
	}
	
	protected boolean setLoginInfo(HashMap <String, String> newLoginMap){
		this.logininfo = newLoginMap;
		return true;
	}
}

	
