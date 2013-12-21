package rp3;

import rp3.client.MDMName;
import rp3.client.MDMServiceName;
import rp3.client.UserListRequest;
import rp3.client.UserListResponse;



public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		System.out.println(" Client starts ... ");
		
		MDMServiceName mdmService = new MDMServiceName();
		MDMName port = mdmService.getMDMPortName();

		UserListRequest request = new UserListRequest();
		request.setSysId(222);
		UserListResponse response =	port.getUserList(request);
		
		System.out.println(" Request: SYS ID - "+request.getSysId()+"  Response: Sys User List - "+ response.getSysUserList());
		
		System.out.println(" Client ends ... ");
	}
}
