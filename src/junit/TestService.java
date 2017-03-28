package junit;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.elec.dao.IElecTextDao;
import com.itheima.elec.domain.ElecCommonMsg;
import com.itheima.elec.domain.ElecText;
import com.itheima.elec.service.IElecCommonMsgService;
import com.itheima.elec.service.IElecTextService;

public class TestService {
/**
 * 保存
 */
	@Test
	public void save(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IElecTextService elecTextService = (IElecTextService) ac.getBean(IElecTextService.SERVICE_NAME);
		
		ElecText et = new ElecText();
		et.setTextName("service name");
		et.setTextDate(new Date());
		et.setTextRemark("service Remark");
		elecTextService.saveElecText(et);
	}
	@Test
	public void save2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		IElecCommonMsgService commonMsgService = (IElecCommonMsgService) ac.getBean(IElecCommonMsgService.SERVICE_NAME);
		
		ElecCommonMsg commonMsg = new ElecCommonMsg();
		commonMsg.setStationRun("hello2");
		commonMsg.setDevRun("world2");
		commonMsg.setCreateDate(new Date());
		commonMsgService.saveElecCommonMsg(commonMsg);
	}
}
