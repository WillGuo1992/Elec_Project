package junit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
/**
 * 更新
 */
	@Test
	public void update(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IElecTextDao elecTextDao = (IElecTextDao) ac.getBean(IElecTextDao.SERVICE_NAME);
		
		ElecText et = new ElecText();
		et.setTextID("8a828abd5af12505015af12507ba0001");
		et.setTextName("update Name");
		et.setTextDate(new Date());
		et.setTextRemark("update Remark");
		elecTextDao.update(et);
	}
/**
 * 查询
 */
	@Test
	public void findObjectByID(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IElecTextDao elecTextDao = (IElecTextDao) ac.getBean(IElecTextDao.SERVICE_NAME);
		Serializable ID = "8a828abd5af12505015af12507ba0001";
		ElecText elecText = elecTextDao.findObjectByID(ID);
		System.out.println(elecText.toString());
	}

/**
 * 删除
 * 使用主键删除 可变参数
 */
	@Test
	public void deleteObjectByID(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IElecTextDao elecTextDao = (IElecTextDao) ac.getBean(IElecTextDao.SERVICE_NAME);
		
		Serializable [] ID = {"8a828abd5af12505015af12507ba0001"};
		elecTextDao.deleteObjectByID(ID);
	}
	
	
	/**
	 * 删除
	 * 使用集合删除
	 */
	@Test
	public void deleteObjectByCollection(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IElecTextDao elecTextDao = (IElecTextDao) ac.getBean(IElecTextDao.SERVICE_NAME);
		
		List<ElecText> list= new ArrayList<ElecText>();
		
		ElecText elecText1 = new ElecText();
		elecText1.setTextID("8a828abd5aefd790015aefd792b80001");
		
		ElecText elecText2 = new ElecText();
		elecText2.setTextID("8a828abd5aefdace015aefdad0d70001");
		
		ElecText elecText3 = new ElecText();
		elecText3.setTextID("8a828abd5aefdb5d015aefdb60180001");
		
		list.add(elecText1);
		list.add(elecText2);
		list.add(elecText3);
		
		
		elecTextDao.deleteObjectByCollection(list);
	}
	
}
