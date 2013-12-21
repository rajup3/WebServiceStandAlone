package rp3.service.mdm.messages;

import java.io.Serializable;

@javax.xml.bind.annotation.XmlType(name="UserListResponse")

public class GetUserListResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	String sysUserList;

	public String getSysUserList() {
		return sysUserList;
	}

	public void setSysUserList(String sysUserList) {
		this.sysUserList = sysUserList;
	}
}
