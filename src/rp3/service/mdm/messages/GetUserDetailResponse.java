package rp3.service.mdm.messages;

import java.io.Serializable;

@javax.xml.bind.annotation.XmlType(name="GetUserDetailResponse")

public class GetUserDetailResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	String userDetail;
	public String getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(String userDetail) {
		this.userDetail = userDetail;
	}

}
