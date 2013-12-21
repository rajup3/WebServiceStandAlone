package rp3.service.mdm.messages;

import java.io.Serializable;


@javax.xml.bind.annotation.XmlType(name="GetUserDetailRequest" )

public class GetUserDetailRequest implements Serializable {

	private static final long serialVersionUID = 1L;
	int userId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
