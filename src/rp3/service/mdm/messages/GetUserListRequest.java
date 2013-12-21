package rp3.service.mdm.messages;

import java.io.Serializable;


@javax.xml.bind.annotation.XmlType(name="UserListRequest" )

public class GetUserListRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	int sysId;

	public int getSysId() {
		return sysId;
	}

	public void setSysId(int sysId) {
		this.sysId = sysId;
	}
}
