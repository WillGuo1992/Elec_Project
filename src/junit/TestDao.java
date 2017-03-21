package junit;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.elec.dao.IElecTextDao;
import com.itheima.elec.domain.ElecText;

public class TestDao {
/**
 * 保存
 */
	@Test
	public void save(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IElecTextDao elecTextDao = (IElecTextDao) ac.getBean(IElecTextDao.SERVICE_NAME);
		
		ElecText et = new ElecText();
		et.setTextName("Dao name");
		et.setTextDate(new Date());
		et.setTextRemark("Dao Remark");
		elecTextDao.save(et);
	}
}
