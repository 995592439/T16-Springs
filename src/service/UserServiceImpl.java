package service;

import dao.UserDao;

public class UserServiceImpl implements UserService {
   private UserDao userDao;
    @Override
    public boolean getUser(int id) {
        return userDao.getUser(id);
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
