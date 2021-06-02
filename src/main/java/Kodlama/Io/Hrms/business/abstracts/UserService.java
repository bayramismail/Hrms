package Kodlama.Io.Hrms.business.abstracts;

import Kodlama.Io.Hrms.core.utilities.result.Result;
import Kodlama.Io.Hrms.entities.concretes.User;

public interface UserService {
  Result add(User user);
}
