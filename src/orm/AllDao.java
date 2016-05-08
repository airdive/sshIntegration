package orm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AllDao {
	@Autowired
	private UserinfoDao userinfDao;

	public UserinfoDao getUserinfDao() {
		return userinfDao;
	}

	public void setUserinfDao(UserinfoDao userinfDao) {
		this.userinfDao = userinfDao;
	}

}
