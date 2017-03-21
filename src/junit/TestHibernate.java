package junit;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.itheima.elec.domain.ElecText;

public class TestHibernate {
	@Test
	public void save(){
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		ElecText et = new ElecText();
		et.setTextName("this is name");
		et.setTextDate(new Date());
		et.setTextRemark("this is Remark");
		s.save(et);
		
		tr.commit();
		s.close();
		
	}
}
