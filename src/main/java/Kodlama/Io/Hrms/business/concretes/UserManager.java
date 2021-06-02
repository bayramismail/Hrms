package Kodlama.Io.Hrms.business.concretes;

import Kodlama.Io.Hrms.business.abstracts.UserService;
import Kodlama.Io.Hrms.core.utilities.result.Result;
import Kodlama.Io.Hrms.core.utilities.result.SuccessResult;
import Kodlama.Io.Hrms.dataAccess.concretes.UserDao;
import Kodlama.Io.Hrms.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("User Eklendi");
	}

}
