package serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import bean.Manager;
import dao.IManagerDao;


@Service("managerService")
public class ManagerServiceImpl implements IManagerDao{
	@Resource
	private IManagerDao managerMapper;
	@Override
	public Manager querymanager(Manager Manager) {
		// TODO Auto-generated method stub
		return managerMapper.querymanager(Manager);
	}


}
