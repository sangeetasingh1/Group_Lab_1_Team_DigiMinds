package university.Business.UserAccounts;

import university.Person.Profiles.Profile;
import java.time.LocalDateTime;

/**
 *
 * @author sange
 */
public class UserAccount {

    Profile profile;
    String username;
    String password;
    String accountStatus;
    String lastActivity;
    LocalDateTime lastUpdated;

    public UserAccount(Profile profile, String un, String pw, String lastActivity) {
        this.username = un;
        this.password = pw;
        this.profile = profile;
        this.accountStatus = "Active";
        this.lastActivity = lastActivity;
        this.lastUpdated = LocalDateTime.now();

    }

    public String getPersonId() {
        return profile.getPerson().getPersonId();
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getUserLoginName() {
        return username;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public boolean IsValidUser(String un, String pw) {

        if (username.equalsIgnoreCase(un) && password.equals(pw)) {
            return true;
        } else {
            return false;
        }

    }

    public String getRole() {
        return profile.getRole();
    }

    public Profile getAssociatedPersonProfile() {
        return profile;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(String lastActivity) {
        this.lastActivity = lastActivity;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdate) {
        this.lastUpdated = lastUpdate;
    }

    @Override
    public String toString() {
        return getUserLoginName();
    }

}
