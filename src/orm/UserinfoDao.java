package orm;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserinfoDao {
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Userinfo> getAllUserinfo() {
		return sessionFactory.getCurrentSession().createQuery("from Userinfo")
				.list();
	}

	public void save(Userinfo userinfo) {
		sessionFactory.getCurrentSession().save(userinfo);
	}

}
