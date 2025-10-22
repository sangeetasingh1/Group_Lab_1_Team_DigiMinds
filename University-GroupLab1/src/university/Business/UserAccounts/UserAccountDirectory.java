package university.Business.UserAccounts;

import university.Person.Profiles.Profile;

import java.util.ArrayList;

/**
 *
 * @author sange
 */
public class UserAccountDirectory {

    ArrayList<UserAccount> useraccountlist;

    public UserAccountDirectory() {

        useraccountlist = new ArrayList();

    }

    public UserAccount newUserAccount(Profile p, String un, String pw, String lastActivity) {

        UserAccount ua = new UserAccount(p, un, pw, lastActivity);
        useraccountlist.add(ua);
        return ua;
    }

    public UserAccount findUserAccount(String id) {

        for (UserAccount ua : useraccountlist) {

            if (ua.isMatch(id)) {
                return ua;
            }
        }
        return null; //not found after going through the whole list
    }

    public UserAccount AuthenticateUser(String un, String pw) {

        for (UserAccount ua : useraccountlist) {

            if (ua.IsValidUser(un, pw)) {
                return ua;
            }
        }
        return null; //not found after going through the whole list
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return useraccountlist;
    }

    public void removeAccount(UserAccount userAccount) {
        useraccountlist.remove(userAccount);
    }
}
