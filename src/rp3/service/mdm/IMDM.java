package rp3.service.mdm;

import javax.jws.WebMethod;
import javax.jws.WebService;

import rp3.service.mdm.messages.GetUserDetailRequest;
import rp3.service.mdm.messages.GetUserDetailResponse;
import rp3.service.mdm.messages.GetUserListRequest;
import rp3.service.mdm.messages.GetUserListResponse;

@WebService
public interface IMDM {

	@WebMethod
	public GetUserListResponse getUserList(GetUserListRequest request);
	@WebMethod
	public GetUserDetailResponse getUserDetail(GetUserDetailRequest request);
	
}
