package rp3.service.mdm;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import rp3.service.mdm.messages.GetUserDetailRequest;
import rp3.service.mdm.messages.GetUserDetailResponse;
import rp3.service.mdm.messages.GetUserListRequest;
import rp3.service.mdm.messages.GetUserListResponse;

@WebService(
		serviceName = "MDMServiceName",
		name = "MDMName",
		portName = "MDMPortName"
)

public class MDMImpl extends MDMBase implements IMDM{

	@WebMethod
	@WebResult(name="GetUserListResponse") 
	public GetUserListResponse getUserList(@WebParam(name="GetUserListRequest") GetUserListRequest request){
		
		GetUserListResponse response = new GetUserListResponse();
		StringBuffer sysUserList = new StringBuffer("");  
		switch (request.getSysId()) {
		case 111:
			System.out.println(" System Name: Android ");
			sysUserList.append("Android: ");
			sysUserList.append("Jim, Ram");
			break;
		case 222:
			System.out.println(" System Name: Apple ");
			sysUserList.append("Apple: ");
			sysUserList.append("Tim, Jobs");
		default:
			break;
		}
		response.setSysUserList(sysUserList.toString());
		return response;
	}
	
	@WebMethod(exclude=true)
	@WebResult(name="GetUserDetailResponse") 
	public GetUserDetailResponse getUserDetail(@WebParam(name="GetUserDetailRequest") GetUserDetailRequest request){
		
		GetUserDetailResponse response = new GetUserDetailResponse();
		StringBuffer userDetail = new StringBuffer("");  
		switch (request.getUserId()) {
		case 111:
			System.out.println(" User Name: Tim ");
			userDetail.append("User Name: ");
			userDetail.append("Tim");
			break;
		case 222:
			System.out.println(" User Name: Jim ");
			userDetail.append("User Name: ");
			userDetail.append("Jim");
		default:
			break;
		}
		response.setUserDetail(userDetail.toString());
		return response;
	}

	@WebMethod(exclude=true)
	@Override
	public void getUserName(int userId) {
		
		
	}
	
}
