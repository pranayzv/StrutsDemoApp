package actions;

import com.opensymphony.xwork2.ActionSupport;

public class AppAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() {
		System.out.println("AppAction execute. ");		
		return "success"; 
	}

}
